package com.nasirbashak007.textrecognition;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void open(View view) {
        startActivity(new Intent(this,MainActivity.class));
    }


    public void openCamera(View view) {
        startActivity(new Intent(this,MainActivity.class));
    }
}
