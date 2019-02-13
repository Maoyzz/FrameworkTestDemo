package com.myz.frameworktestdemo.mvc;


/**
 * @author myz
 * @date 2019/2/13
 * desc:
 */
public class MVCModelTeml implements MVCModel {

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
