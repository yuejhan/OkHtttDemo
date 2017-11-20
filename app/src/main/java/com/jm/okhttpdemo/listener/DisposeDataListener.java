package com.jm.okhttpdemo.listener;

/**
 * Created by cody on 2017/11/20.
 */

public interface DisposeDataListener {

    void onSuccess(Object response);

    void onFailure(Object reason);

}
