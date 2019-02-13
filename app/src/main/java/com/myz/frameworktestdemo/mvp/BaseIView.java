package com.myz.frameworktestdemo.mvp;

/**
 * @author myz
 * @date 2019/2/13
 * desc:连接Activity和Presenter
 */
public interface BaseIView<T> {
    void onSuccess(T data);
    void onError();
}
