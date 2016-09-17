package com.lonelybox.simplebase;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Logger;

/**
 * Created by adinugroho
 */
public class SimpleBaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseDatabase.getInstance().setLogLevel(Logger.Level.DEBUG);
    }
}
