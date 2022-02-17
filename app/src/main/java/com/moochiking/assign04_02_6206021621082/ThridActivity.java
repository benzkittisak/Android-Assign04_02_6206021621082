/*
 * นายกิตติศักดิ์ ปานเหลือ
 * 6206021621082
 * */


package com.moochiking.assign04_02_6206021621082;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThridActivity extends AppCompatActivity implements View.OnClickListener {
    private Button returnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thrid);

        returnButton = (Button) findViewById(R.id.returnBtn);
        returnButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}