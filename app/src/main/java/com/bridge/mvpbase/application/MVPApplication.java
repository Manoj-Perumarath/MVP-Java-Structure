package com.bridge.mvpbase.application;

import android.app.Application;

import com.bridge.mvpbase.constants.AppConstants;
import com.bridge.mvpbase.data.db.AppDatabase;
import com.google.firebase.FirebaseApp;

public class MVPApplication extends Application {


    private AppDatabase appDatabase;


    @Override
    public void onCreate() {
        super.onCreate();
      setAppDatabase(this);
        FirebaseApp.initializeApp(this);
    }

    public AppDatabase getAppDatabase() {
        return appDatabase;
    }

    public void setAppDatabase(Application application) {
        this.appDatabase = new AppDatabase(application, AppConstants.DATABASE_NAME, null, AppConstants.DATABASE_VERSION);
    }
}
