package com.jm.okhttpdemo.exception;

/**
 * Created by cody on 2017/11/20.
 */

public class OkHttpException extends Exception {

    /**
     * return code
     */
    private int code;

    /**
     * return msg
     */
    private String msg;

    public OkHttpException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }

}
