package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Welcome extends AppCompatActivity {

    Button Proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Proceed = findViewById(R.id.proceed);

        Proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Welcome.this, MainActivity.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Sign in page",
                        Toast.LENGTH_SHORT).show();
            }
        });


    }
}
