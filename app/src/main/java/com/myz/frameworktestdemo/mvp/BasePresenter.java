package com.myz.frameworktestdemo.mvp;

/**
 * @author myz
 * @date 2019/2/13
 * desc:Presenter基类
 */
public abstract class BasePresenter<T>{
    public T mView;
    public void attach(T view){
        this.mView = view;
    }
    public void detach(){
        mView = null;
    }
}