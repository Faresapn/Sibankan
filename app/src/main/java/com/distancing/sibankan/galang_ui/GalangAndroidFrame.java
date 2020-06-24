package com.distancing.sibankan.galang_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.distancing.sibankan.R;

public class GalangAndroidFrame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galang_android_frame);
        Button button1 = findViewById(R.id.buttonsebelumframe);
        Button button2 = findViewById(R.id.buttonselanjutframe);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GalangAndroidFrame.this, GalangAndroid26.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(GalangAndroidFrame.this, GalangAndroid20.class);
                startActivity(intent2);
            }
        });
    }
}
