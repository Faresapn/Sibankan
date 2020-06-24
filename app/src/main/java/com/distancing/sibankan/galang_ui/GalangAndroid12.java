package com.distancing.sibankan.galang_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.distancing.sibankan.R;

public class GalangAndroid12 extends AppCompatActivity {
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galang_android12);
        button1 = findViewById(R.id.buttonsebelum12);
        button2 = findViewById(R.id.buttonselanjut12);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GalangAndroid12.this, GalangAndroid10.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(GalangAndroid12.this, GalangAndroid13.class);
                startActivity(intent2);
            }
        });
    }
}
