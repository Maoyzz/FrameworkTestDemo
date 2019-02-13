package com.myz.frameworktestdemo.mvc;

/**
 * @author myz
 * @date 2019/2/13
 * desc:
 */
public interface MVCModel {
    void loadData(String query,BaseListener<TestBean> listener);
}
