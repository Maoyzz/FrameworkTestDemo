package com.myz.frameworktestdemo.mvc;

/**
 * @author myz
 * @date 2019/2/13
 * desc:
 */
public interface BaseListener<T> {

    void onSuccess(T data);

    void onError();
}
