package com.img.sdkapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.img.helloutil.HelloDebug;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HelloDebug.d("okk");
        HelloDebug.ToastShow(this, "Now Okk");

    }

    public void showToast(){

        HelloDebug.ToastShow(this, "Now Okk");

    }
}