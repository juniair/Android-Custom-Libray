package com.mimo.indiemoa.classes.utils.volley.request;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.mimo.indiemoa.classes.utils.log.Dlog;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * Created by mimoPC on 2016-12-20.
 * @see GsonRequest GSON 처리 요청에 대한 클래스
 *
 */
public class GsonRequest<T> extends Request<T> {


    private final Gson _gson = new Gson();
    private final Class<T> _modelType;

    private final Map<String, String> _headers;
    private final Response.Listener<T> _listener;
    private final Response.ErrorListener _errorListener;

    /**
     * @param method HTTP transmission method
     * @param url URL information to communicate
     * @param header Information to send to the URL
     * @param listener Interface for successful response
     * @param errorListener Interface for response failure
     * */
    public GsonRequest(int method, String url, Map<String, String> header, Class<T> modelType, Response.Listener<T> listener, Response.ErrorListener errorListener) {
        super(method, url, errorListener);
        this._modelType = modelType;
        this._headers = header;
        this._listener = listener;
        this._errorListener = errorListener;
    }

    public GsonRequest(int method, String url, Class<T> modelType, Response.Listener<T> listener, Response.ErrorListener errorListener) {
        this(method, url, null, modelType, listener, errorListener);
    }


    @Override
    public Map<String, String> getHeaders() throws AuthFailureError {
        return this._headers != null ? _headers : super.getHeaders();
    }

    @Override
    protected Response<T> parseNetworkResponse(NetworkResponse response) {
        try {

            String json = new String(response.data, HttpHeaderParser.parseCharset(response.headers));
            Dlog.d(json);
            return Response.success(_gson.fromJson(json, _modelType), HttpHeaderParser.parseCacheHeaders(response));

        } catch (UnsupportedEncodingException e) {
            return Response.error(new ParseError(e));
        } catch (JsonSyntaxException e) {
            return Response.error(new ParseError(e));
        }
    }

    @Override
    protected VolleyError parseNetworkError(VolleyError volleyError) {
        return super.parseNetworkError(volleyError);
    }

    @Override
    protected void deliverResponse(T response) {
        this._listener.onResponse(response);
    }

    @Override
    public void deliverError(VolleyError error) {
        _errorListener.onErrorResponse(error);
    }

}
