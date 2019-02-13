package com.myz.frameworktestdemo.mvp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.myz.frameworktestdemo.R;
import com.myz.frameworktestdemo.mvc.TestBean;

/**
 * des:Activity
 */

public class MVPMainActivity extends BaseActivity implements BaseIView<TestBean>{

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvpmain);
        presenter = new MainPresenter(this);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.loadData();
            }
        });
    }

    @Override
    public void onSuccess(TestBean data) {
        Log.e("mao", "onSuccess: " );
    }

    @Override
    public void onError() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(presenter != null){
            presenter.detach();
            presenter = null;
        }
    }
}
