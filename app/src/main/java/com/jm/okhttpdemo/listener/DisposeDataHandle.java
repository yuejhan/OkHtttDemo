package com.jm.okhttpdemo.listener;

/**
 * Created by cody on 2017/11/20.
 */

public class DisposeDataHandle {

    /**
     * 回调方法
     */
    public DisposeDataListener mListener = null;

    /**
     * 返回数据，要解析成为的对象
     */
    public Class<?> mClass = null;

    public DisposeDataHandle(DisposeDataListener mListener){
        this.mListener = mListener;
    }

    public DisposeDataHandle(DisposeDataListener mListener,Class<?> mClass){
        this.mListener = mListener;
        this.mClass = mClass;
    }

}
