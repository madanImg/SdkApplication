package com.img.helloutil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HelloWordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hellow);
        HelloDebug.d("okk");
        HelloDebug.ToastShow(this, "Now Okk");
    }
}