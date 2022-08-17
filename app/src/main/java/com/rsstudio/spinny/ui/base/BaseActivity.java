package com.rsstudio.spinny.ui.base;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rsstudio.spinny.R;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }
}