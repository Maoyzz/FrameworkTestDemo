package com.myz.frameworktestdemo.mvp;

import com.myz.frameworktestdemo.mvc.BaseListener;
import com.myz.frameworktestdemo.mvc.TestBean;

/**
 * @author myz
 * @date 2019/2/13
 * desc:model
 */
public interface MVPModel {
    void loadData(String query, BaseListener<TestBean> listener);
}
