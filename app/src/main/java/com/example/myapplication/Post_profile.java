package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.api.ApiHandlel;
import com.example.myapplication.model.RegidtrationModal;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class Post_profile extends AppCompatActivity {

    EditText e1;
    EditText e2;
    EditText e3;
    EditText e4;
    EditText e5;
    EditText e6;

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_profile);
        e1 = findViewById(R.id.p_1);
        e2 = findViewById(R.id.p_2);
        e3 = findViewById(R.id.p_3);
        e4 = findViewById(R.id.p_4);
        e5 = findViewById(R.id.p_5);
        e6 = findViewById(R.id.p_6);


        b1=findViewById(R.id.p_8);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {


                Intent i=new Intent(Post_profile.this,MainActivity.class);
                startActivity(i);



                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                String s3 = e3.getText().toString();
                String s4 = e4.getText().toString();
                String s5 = e5.getText().toString();
                String s6 = e6.getText().toString();


                ApiHandlel.getApiService().reg_user(s1, s2, s3, s4, s5,s6, new Callback<RegidtrationModal>() {
                    @Override
                    public void success(RegidtrationModal regidtrationModal, Response response) {
                        Toast.makeText(Post_profile.this, "Profile Submit Succesfully", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        Toast.makeText(Post_profile.this, "Profile not  Succesfully", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}