package com.nordicsemi.nrfUARTv2;

import android.app.Application;

/**
 * Created by David-Laptop on 23/10/2016.
 */


public class globalVariableControl extends Application{

    //add this variable declaration:
    private static String itemArray;
//
//    public globalVariableControl(){
//        itemArray = new String[20];
//    }
//
    private static globalVariableControl singleton;
//    public globalVariableControl getInstance() {
//    //public static globalVariableControl getInstance() {
//        singleton = itemArray;
//        return singleton;
//        //return itemArray;
//    }
//
//    public void setInstance(String s, int d){
//        this.itemArray[d]=s;
//    }

    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;
    }
}

/*
public class globalVariableControl extends Application{
    private static globalVariableControl instance;

    // Global variable
    private int data;

    // Restrict the constructor from being instantiated
    private globalVariableControl(){}

    public void setData(int d){
        this.data=d;
    }
    public int getData(){
        return this.data;
    }

    public static synchronized globalVariableControl getInstance(){
        if(instance==null){
            instance=new globalVariableControl();
        }
        return instance;
    }
}
*/
