package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class Page4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = "Hey, check out this amazing book! #LoveMeNow";
        String shareSub = "Love Me Now or I Will Kill Myself";
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent, "Share with friends..."));
            }
        });


        Button previous = findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page4.this, Gwaddi.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Page 12",
                        Toast.LENGTH_SHORT).show();
            }
        });

//        Button next = findViewById(R.id.next);
//        next.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Page4.this, Page4.class);
//                startActivity(intent);
//            }
//        });

        TextView textView = (TextView) findViewById(R.id.text);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("\n" +
                "Michael Ochoki is a Kenyan writer and artist. Winner of KOLA:\n" +
                "African Street Writers Awards (Nigeria), his work poems and short stories have appeared in BabishaiNawe " +
                "Poetry, StoryMoja, Praxis Magazine, Kalahari Review, African Writer, Nyanza " +
                "Literary Awards and Jalada Review. His poems have been featured in the anthology, " +
                "“Best New African Poets 2016” and AFROCENTRIC anthology. \n" +
                "\n" +
                "Love Me Now or I Will Kill Myself was partly inspired by events in Southern " +
                "and Northern Sudan during his tenure as a humanitarian worker.\n" +
                "\n" +
                "He currently lives in Eldoret, Kenya as a record label founder and producer.\n"+
                "\n"+
                "*********\n"+
                "\n"+
                "Did you enjoy the stories?\n" +
                "Kindly hit the share button below.\n" +
                "Thank you!");


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
                Intent intent = new Intent(Page4.this, Contents.class);
                startActivity(intent);
                break;

            case R.id.color:
                ScrollView scroll = findViewById(R.id.scroll);
                scroll.setBackgroundColor(Color.BLACK);
                TextView textView = findViewById(R.id.text);
                textView.setBackgroundColor(Color.WHITE);
                break;
            case R.id.share:

                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "You should get this book! #LoveMeNow";
                String shareSub = "Love Me Now or I Will Kill Myself";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share with friends..."));

                break;

        }

        return super.onOptionsItemSelected(item);
    }
}




