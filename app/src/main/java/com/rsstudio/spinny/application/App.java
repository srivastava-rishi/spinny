package com.rsstudio.spinny.application;

import android.app.Application;
import dagger.hilt.android.HiltAndroidApp;
import io.github.inflationx.calligraphy3.CalligraphyConfig;
import io.github.inflationx.calligraphy3.CalligraphyInterceptor;
import io.github.inflationx.viewpump.ViewPump;

@HiltAndroidApp
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initCalligraphyViewPump();
    }

    private void initCalligraphyViewPump() {
        // For Calligraphy Library
        ViewPump.init(ViewPump.builder()
                .addInterceptor(new CalligraphyInterceptor(
                        new CalligraphyConfig.Builder()
                                .build()))
                .build());
    }
}
