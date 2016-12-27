package com.mimo.indiemoa.classes.utils.volley.request;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;

import java.io.UnsupportedEncodingException;

/**
 * Created by mimoPC on 2016-12-20.
 */
public class BooleanRequset extends Request<Boolean> {

    private final Response.Listener<Boolean> _listener;
    private final Response.ErrorListener _errorListener;
    private final String _requsetBody;

    private final static String PROTOCOL_CHARSET = "utf-8";
    private final static String PROTOCOL_CONTENT_TYPE = String.format("application/json; charset=%s", PROTOCOL_CHARSET);


    public BooleanRequset(int method, String url, String requsetBody, Response.Listener<Boolean> listener, Response.ErrorListener errorListener) {
        super(method, url, errorListener);
        this._listener = listener;
        this._errorListener = errorListener;
        this._requsetBody = requsetBody;
    }

    @Override
    protected Response<Boolean> parseNetworkResponse(NetworkResponse response) {
        Boolean parsed;
        try {
            parsed = Boolean.valueOf(new String(response.data, HttpHeaderParser.parseCharset(response.headers)));
        } catch (UnsupportedEncodingException e) {
            parsed = Boolean.valueOf(new String(response.data));
        }

        return Response.success(parsed, HttpHeaderParser.parseCacheHeaders(response));
    }

    @Override
    protected VolleyError parseNetworkError(VolleyError volleyError) {
        return super.parseNetworkError(volleyError);
    }

    @Override
    protected void deliverResponse(Boolean response) {
        _listener.onResponse(response);
    }

    @Override
    public void deliverError(VolleyError error) {
        _errorListener.onErrorResponse(error);
    }

    @Override
    public String getBodyContentType() {
        return PROTOCOL_CONTENT_TYPE;
    }

    @Override
    public byte[] getBody() throws AuthFailureError {
        try {
            return _requsetBody == null ? null : _requsetBody.getBytes(PROTOCOL_CHARSET);
        } catch (UnsupportedEncodingException e) {
            VolleyLog.wtf("Unsupported Encoding while trying to get the bytes of %s using %s", _requsetBody, PROTOCOL_CHARSET);
            return null;
        }
    }
}
