package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class otp extends AppCompatActivity {
    Button b1;
    Button b2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        b1=findViewById(R.id.send);
        b2=findViewById(R.id.skip);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                String otp = String.format("%04d", r.nextInt(1001));

                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                SmsManager sms=SmsManager.getDefault();
                sms.sendTextMessage("9898147969", null, "HandOut OTP : "+otp, null,null);

                Intent X = new Intent(otp.this,submit_otp.class);
                X.putExtra("otp",otp);
                startActivity(X);

            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(otp.this,MainActivity.class);
                startActivity(i);

            }
        });

    }
}