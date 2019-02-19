package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Title extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);

        Button previous = findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Title.this, MainActivity.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Sign-in page",
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Title.this, Page1.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Introduction",
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView textView = (TextView) findViewById(R.id.title);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Love Me Now Or I Will Kill Myself");
        TextView textView2 = (TextView) findViewById(R.id.other);
        textView2.setMovementMethod(new ScrollingMovementMethod());
        textView2.setText("(a collection of short stories)");
        TextView textView3 = (TextView) findViewById(R.id.by);
        textView3.setMovementMethod(new ScrollingMovementMethod());
        textView3.setText("by");
        TextView textView4 = (TextView) findViewById(R.id.author);
        textView4.setMovementMethod(new ScrollingMovementMethod());
        textView4.setText("Michael Ochoki");
//        TextView textView5 = (TextView) findViewById(R.id.publisher);
//        textView5.setMovementMethod(new ScrollingMovementMethod());
//        textView5.setText("Digitally published by Mantra Technologies");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.contents:
                Intent intent = new Intent(this, Contents.class);
                startActivity(intent);
                break;

            case R.id.share:

                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "Hey, you're going to love this! #LoveMeNow";
                String shareSub = "Love Me Now or I Will Kill Myself";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share with friends..."));

                break;


        }

        return super.onOptionsItemSelected(item);
    }
}


