package org.esiea.navaratnam_nirosan_ramrami_lamya.myapp;

/**
 * Created by nnava on 30/12/2015.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


public class AirplaneReceiver extends  BroadcastReceiver {

    public void onReceive(Context context,Intent intent) {
        Toast.makeText(context,"Voyagez utile: Bon voyage", Toast.LENGTH_SHORT).show();

    }



}
