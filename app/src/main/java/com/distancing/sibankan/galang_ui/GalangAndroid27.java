package com.distancing.sibankan.galang_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.distancing.sibankan.R;

public class GalangAndroid27 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galang_android27);
        Button button1 = findViewById(R.id.buttonsebelum27);
        Button button2 = findViewById(R.id.buttonselanjut27);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GalangAndroid27.this, GalangAndroid25.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(GalangAndroid27.this, GalangAndroid26.class);
                startActivity(intent2);
            }
        });
    }
}
