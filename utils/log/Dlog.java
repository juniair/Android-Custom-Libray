package com.mimo.indiemoa.classes.utils.log;

import android.support.annotation.NonNull;
import android.util.Log;

import com.mimo.indiemoa.classes.app.IndiemoaApplication;

/**
 * Created by mimoPC on 2016-12-21.
 * @version 1.0.0
 * @see Dlog 기존 안드로이드에서 제공하는 Log 클래스의 개량 버전
 * 마켓에 배포시 Log를 지우기 않으면 배포된 앱에 로그가 남는다.
 * 만약 민감함 정보가 Log에 기록되어 지우지 않을시 일반 사용자가 볼수 있는 우려가 있다.
 * 그래도 다행히 안드로이드 내부에 'BuildConfig.DEBUG'를 통해 해결이 된다.
 * 그러나 가끔 배포버전에 디버그 모드로 인식하는 경우가 있다.
 * 그렇다고 Log를 완벽히 지우는 것은 어렵다.
 * 그래서 배포할 때 Log를 남기지 않는 Dlog를 개발을 하였다.
 * @see Dlog#buildLogMsg(String)
 * @see Dlog#e(String)
 * @see Dlog#w(String)
 * @see Dlog#i(String)
 * @see Dlog#d(String)
 */
public class Dlog {

    private static final String TAG = "Indiemoa";

    /** Log Level Error **/
    public static final void e(String message) {
        if (IndiemoaApplication.DEBUG) {
            Log.e(TAG, buildLogMsg(message));
        }
    }
    /** Log Level Warning **/
    public static final void w(String message) {
        if (IndiemoaApplication.DEBUG) {
            Log.w(TAG, buildLogMsg(message));
        }
    }
    /** Log Level Information **/
    public static final void i(String message) {
        if (IndiemoaApplication.DEBUG) {
            Log.i(TAG, buildLogMsg(message));
        }
    }
    /** Log Level Debug **/
    public static final void d(String message) {
        if (IndiemoaApplication.DEBUG) {
            Log.d(TAG, buildLogMsg(message));
        }
    }
    /** Log Level Verbose **/
    public static final void v(String message) {
        if (IndiemoaApplication.DEBUG) {
            Log.v(TAG, buildLogMsg(message));
        }
    }



    /***
     *
     * @param message
     * @return [Class Name:: MethodName(line : LineNumber)] message
     */
    @NonNull
    public static String buildLogMsg(String message) {

        StackTraceElement traceElement = Thread.currentThread().getStackTrace()[4];

        StringBuilder builder = new StringBuilder();

        builder.append("[");
        builder.append(traceElement.getFileName().replace(".java", ""));
        builder.append("::");
        builder.append(traceElement.getMethodName());
        builder.append("(line : ");
        builder.append(traceElement.getLineNumber());
        builder.append(")]");
        builder.append(message);

        return builder.toString();

    }

}
