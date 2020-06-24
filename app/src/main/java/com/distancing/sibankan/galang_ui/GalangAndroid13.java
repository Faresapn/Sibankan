package com.distancing.sibankan.galang_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.distancing.sibankan.R;

public class GalangAndroid13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galang_android13);
        Button button1 = findViewById(R.id.buttonsebelum13);
        Button button2 = findViewById(R.id.buttonselanjut13);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GalangAndroid13.this, GalangAndroid12.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(GalangAndroid13.this, GalangAndroid14.class);
                startActivity(intent2);
            }
        });
    }
}
