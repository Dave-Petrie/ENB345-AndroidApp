package com.nordicsemi.nrfUARTv2;

import android.app.Application;

/**
 * Created by David-Laptop on 23/10/2016.
 */

public class globalVariableControl extends Application{

    //add this variable declaration:
    private static String itemArray;

    private static globalVariableControl singleton;

    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;
    }
}
