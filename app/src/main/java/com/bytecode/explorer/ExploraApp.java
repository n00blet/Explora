package com.bytecode.explorer;

import android.app.Application;
import android.content.Context;

/**
 * Created by Rakshith on 25-07-2015.
 */
public class ExploraApp extends Application {

    public static ExploraApp instance;
    public static Context applicationContext;

    public ExploraApp(){
        super();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        applicationContext = getApplicationContext();
    }

    public static Context getInstance()
    {
        if (instance == null) instance = new ExploraApp();
        return instance;
    }
}
