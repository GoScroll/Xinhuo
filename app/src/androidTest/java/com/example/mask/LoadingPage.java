package com.example.mask;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

import cn.bmob.v3.Bmob;

/**
 * Created by ‘。；op on 2018/12/1.
 */

public class LoadingPage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bmob.initialize(this,"5397552e87a1b470c8d5cec858c08d99");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        },2000);
    }
}
