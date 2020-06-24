package com.distancing.sibankan.galang_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.distancing.sibankan.R;

import org.w3c.dom.Text;

public class GalangHalaman1 extends AppCompatActivity {
    private  String yourString ;
    private  String yourNewString ;
    TextView textview;
    TextView textView2;
    TextView textView3;
    private TextView textblue;
    private String colorBlue = "<font color='#367FF9'>";
    private String colorCodeEnd = "</font>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galang_halaman1);
        textview = findViewById(R.id.textviewfiktif);
        String text = "Galang donasi fiktif atau main-main";
        SpannableString ss = new SpannableString(text);
        StyleSpan boldspan = new StyleSpan(Typeface.BOLD);
        ss.setSpan(boldspan, 13,20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textview.setText(ss);

        textView2 = findViewById(R.id.textviewfiktif10);
        String text2 = "Galang donasi untuk bayar hutang pinjaman";
        SpannableString ss2 = new SpannableString(text2);
        StyleSpan boldspan2 = new StyleSpan(Typeface.BOLD);
        ss2.setSpan(boldspan2, 20,41,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView2.setText(ss2);

        textView3 = findViewById(R.id.textviewfiktif1000);
        String text3 = "Galang donasi untuk terorisme & radikalisme";
        SpannableString ss3 = new SpannableString(text3);
        StyleSpan boldspan3 = new StyleSpan(Typeface.BOLD);
        ss3.setSpan(boldspan3, 20,43,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView3.setText(ss3);

        textblue = findViewById(R.id.textviewblue);
        yourString = "Sibankan berhak menutup sepihak penggalangan donasi yang melanggar aturan kami. Baca selengkapnya <(>di sini.<(>";
        yourNewString = yourString.replace("<(>",colorBlue);
        yourNewString=  yourNewString.replace("<)>",colorCodeEnd);
        textblue.setText((Html.fromHtml(yourNewString)));

        Button button = findViewById(R.id.button_halaman1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GalangHalaman1.this, GalangAndroid9.class);
                startActivity(intent);
            }
        });


    }
}
