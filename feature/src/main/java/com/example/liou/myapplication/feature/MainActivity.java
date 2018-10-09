package com.example.liou.myapplication.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ActionBar;
import android.view.Gravity;
import	android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import	java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();//隐藏掉整个ActionBar，包括下面的Tabs



    }

}
