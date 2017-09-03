package com.slide.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.slide.fragment.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class DuiwuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duiwu);
        ButterKnife.inject(this);
    }
    @OnClick(R.id.bt_duiwu_chaxun)
    public void chaxun(){
        Intent intent = new Intent(this, KaoheJieguoActivity.class);
        startActivity(intent);
    }
}
