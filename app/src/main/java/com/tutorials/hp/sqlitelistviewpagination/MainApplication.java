package com.tutorials.hp.sqlitelistviewpagination;

import android.app.Application;

import co.uk.rushorm.android.AndroidInitializeConfig;
import co.uk.rushorm.core.RushCore;

/**
 *Created by Oclemy on 3/14/2017 for ProgrammingWizards Channel and http://www.camposha.info.
 */
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        AndroidInitializeConfig config=new AndroidInitializeConfig(getApplicationContext());
        RushCore.initialize(config);
    }
}
