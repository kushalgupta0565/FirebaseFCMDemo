package com.kushal.firebasefcmdemo;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * This will work when the App is in foreground.
 */

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService
{
    public static final String TAG = "MyFirebaseInstanceIdService";
    public static final String REG_TOKEN = "REG_TOKEN";

    @Override
    public void onTokenRefresh()
    {
        Log.d(REG_TOKEN, FirebaseInstanceId.getInstance().getToken());
    }
}
