package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class submit_otp extends AppCompatActivity {

    Button b1;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_otp);

        b1=findViewById(R.id.sub);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {


                Intent i=new Intent(submit_otp.this,locationchoose.class);
                startActivity(i);

            }
        });
        e1=findViewById(R.id.i4);

        String otp =  getIntent().getExtras().getString("otp");
        e1.setText(otp);

    }
}