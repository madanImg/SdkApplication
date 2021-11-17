package com.img.sdkapplication;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public  class HelloDebug {
    public static final String TAG = "SUPER_AWESOME_APP";

    public static void d(String message){
        Log.d( TAG, message);
    }
    public static void ToastShow(Context context,String message){
        Log.d( TAG, message);
        Toast.makeText(context, message+"", Toast.LENGTH_SHORT).show();
    }

}
