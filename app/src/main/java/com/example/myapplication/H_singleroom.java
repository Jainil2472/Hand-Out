package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.UriPermission;
import android.net.Uri;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class H_singleroom extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hsingleroom);
        b1 = findViewById(R.id.s_btn);
        b2 = findViewById(R.id.s_btn1);
        b3 = findViewById(R.id.s_btn2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent call = new Intent(Intent.ACTION_CALL);
                call.setData(Uri.parse("tel:7486960455"));
                startActivity(call);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent call = new Intent(Intent.ACTION_CALL);
                call.setData(Uri.parse("tel:7486960455"));
                startActivity(call);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent call = new Intent(Intent.ACTION_CALL);
                call.setData(Uri.parse("tel:7486960455"));
                startActivity(call);

            }
        });
    }
}