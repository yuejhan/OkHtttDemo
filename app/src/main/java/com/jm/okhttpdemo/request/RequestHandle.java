package com.jm.okhttpdemo.request;

import java.util.Map;

import okhttp3.FormBody;
import okhttp3.Request;

/**
 * Created by cody on 2017/11/20.
 */

public class RequestHandle {

    public static Request createPostRequest(String url, RequestParams params){
        FormBody.Builder mFormBodyBuilder = new FormBody.Builder();
        if(params != null){
            for (Map.Entry<String,String> entry : params.urlParams.entrySet()){
                mFormBodyBuilder.add(entry.getKey(),entry.getValue());
            }
        }
        FormBody mFormBody = mFormBodyBuilder.build();
        return new Request.Builder().url(url).post(mFormBody).build();
    }

    public static Request createGetRequest(String url,RequestParams params){
        StringBuilder builder = new StringBuilder(url).append("?");
        //https://github.com/qndroid/CommonLibrary/blob/master/CommonHttpLibrary/src/com/okhttp/request/CommonRequest.java
    }
}
