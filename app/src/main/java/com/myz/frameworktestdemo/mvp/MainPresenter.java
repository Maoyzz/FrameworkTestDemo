package com.myz.frameworktestdemo.mvp;

import com.myz.frameworktestdemo.mvc.BaseListener;
import com.myz.frameworktestdemo.mvc.TestBean;

/**
 * @author myz
 * @date 2019/2/13
 * desc:Presenter
 */
public class MainPresenter extends BasePresenter<MVPMainActivity> {

    private MVPModel model = new MVPModelTeml();

    public MainPresenter(MVPMainActivity mvpMainActivity){
        attach(mvpMainActivity);
    }

    public void loadData(){
        model.loadData("", new BaseListener<TestBean>() {
            @Override
            public void onSuccess(TestBean data) {
                mView.onSuccess(data);
            }

            @Override
            public void onError() {
                mView.onError();
            }
        });
    }

}
