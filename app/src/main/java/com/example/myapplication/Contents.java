package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Contents extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contents);

        Snackbar.make(findViewById(android.R.id.content), "For quick access, tap on the story title!", Snackbar.LENGTH_LONG)
                .show();


        Button previous = findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Contents.this, Dedication.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Dedication",
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Contents.this, Part1.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "PART ONE",
                        Toast.LENGTH_SHORT).show();
            }
        });

/** To access the stories**/
        TextView part1 = findViewById(R.id.pt1);
        part1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Contents.this, Part1.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), "PART 1",
                        Toast.LENGTH_SHORT).show();

            }
        });

        TextView story1 = findViewById(R.id.story1);
        story1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Contents.this, YourPage.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), "The Prostitute and Heartbreak",
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView story2 = findViewById(R.id.story2);
        story2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Contents.this, Page2.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), "An Impossible Romance",
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView story3 = findViewById(R.id.story3);
        story3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Contents.this, Page3.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), "The Diary of a Cursed Child",
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView story4 = findViewById(R.id.story4);
        story4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Contents.this, Prayer.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), "Say a Prayer ",
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView story5 = findViewById(R.id.story5);
        story5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Contents.this, Wake.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), "To Wake Up; to Breathe",
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView story6 = findViewById(R.id.story6);
        story6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Contents.this, Redemption.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), "Redemption",
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView story7 = findViewById(R.id.story7);
        story7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Contents.this, Last.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), "One Last Story",
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView part2 = findViewById(R.id.pt2);
        part2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Contents.this, Part2.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), "PART 2",
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView story8 = findViewById(R.id.story8);
        story8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Contents.this, Run.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), "One Last Story",
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView story9 = findViewById(R.id.story9);
        story9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Contents.this, Children.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), "Run:",
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView story10 = findViewById(R.id.story10);
        story10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Contents.this, Gwaddi.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), "Gwaddi’s Memoir",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){


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