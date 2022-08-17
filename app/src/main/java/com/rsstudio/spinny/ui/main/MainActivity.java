package com.rsstudio.spinny.ui.main;



import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;

import com.rsstudio.spinny.R;
import com.rsstudio.spinny.databinding.ActivityMainBinding;
import com.rsstudio.spinny.ui.base.BaseActivity;

public class MainActivity extends BaseActivity {

   private ActivityMainBinding binding;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.tv.setTextColor(R.color.chineseBlack2);
    }
}