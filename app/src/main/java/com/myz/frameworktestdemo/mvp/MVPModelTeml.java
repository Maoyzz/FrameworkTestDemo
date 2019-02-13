package com.myz.frameworktestdemo.mvp;


import com.myz.frameworktestdemo.mvc.BaseListener;
import com.myz.frameworktestdemo.mvc.TestBean;

/**
 * @author myz
 * @date 2019/2/13
 * desc:model实现类，数据调用
 */
public class MVPModelTeml implements MVPModel {

    @Override
    public void loadData(String query, final BaseListener<TestBean> listener) {
        new Thread()
        {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException  e) {
                    e.printStackTrace();
                }
                listener.onSuccess(new TestBean());

            }
        }.start();
    }
}
