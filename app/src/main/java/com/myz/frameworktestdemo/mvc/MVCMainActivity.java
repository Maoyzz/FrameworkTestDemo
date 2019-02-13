package com.myz.frameworktestdemo.mvc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.myz.frameworktestdemo.R;

public class MVCMainActivity extends AppCompatActivity implements BaseListener<TestBean> {

    private MVCModel model = new MVCModelTeml();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvcmain);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model.loadData("1",MVCMainActivity.this);
            }
        });
    }

    @Override
    public void onSuccess(TestBean data) {
        Toast.makeText(MVCMainActivity.this,"111",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError() {

    }
}
