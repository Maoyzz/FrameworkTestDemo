package com.myz.frameworktestdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.myz.frameworktestdemo.mvc.BaseListener;
import com.myz.frameworktestdemo.mvc.TestBean;

/**
 * @author myz
 * @date 2019/02/13
 * des:
 */
public class MainActivity extends AppCompatActivity implements BaseListener<TestBean> {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onSuccess(TestBean data) {

    }

    @Override
    public void onError() {

    }
}
