package com.heqinuc.broadcasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyBroadCast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("MyBroadCast", "onReceive: MyBroadCast");
        Toast.makeText(context, "received in MyBroadCast",Toast.LENGTH_SHORT).show();
    }
}
