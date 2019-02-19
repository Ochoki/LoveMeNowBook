package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class Page1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        Button previous = findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page1.this, Title.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Dedication",
                        Toast.LENGTH_SHORT).show();
            }

        });


        Button next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page1.this, Dedication.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Dedication",
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView textView = (TextView) findViewById(R.id.text);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("\nThis collection has two parts: stories of love and then stories of war.\n" +
                "\n" +
                "Narrated in the first and second person, these stories capture the experiences of a young African male as he traverses through the search for love, acceptance, freedom, sexuality and human conflict. \n" +
                "\n" +
                "PART ONE\n" +
                "\n" +
                "\n" +
                "The first story “The Prostitute and HeartBreak\", written as a letter mourning lost love, a teenager tries to heal his broken heart in a night of reckless abandon as he engages in unprotected sex with a commercial sex worker, getting robbed, left alone in the street to mourn lost love. \n" +
                "\n" +
                "In \"An Impossible Romance\", the story is all too familiar. You have sat next to a girl in a matatu and wondered if they could be your next soul-mate. As the narrator finds out, things are not always as perfect as we imagine them.\n" +
                "\n" +
                "Most sociopaths blame their bizarre acts on bad parenting—well, at least that’s what psychoanalysis says. In \"Diary of a Cursed Child\", a law school student ends up as a chronic pedophile in Mombasa. He eventually marries one of his victims and they both die of Aids and drug abuse. Towards the end of his life, he tries to make amends with his father.\n" +
                "\n" +
                "\n" +
                "\"Say a Prayer\" tells of Peter Kiguru, an auto mechanic and atheist who falls in love with a church girl, only to be betrayed as the girl marries her pastor. All she leaves behind with Peter is a prayer book. \n" +
                "\n" +
                "Suppose you're a new member of the upper middle-class. Stuck in Nairobi evening traffic, in the trunk of your car there's a dead body. Where would you dispose it? In \"To Wake Up; To Breathe\", some things just go wrong when everything is going so right.\n" +
                "\n" +
                "\"Redemption\" is a story of a young boy growing up in the slums and falling in love with his teacher. She eventually dies of stab wounds from a jealous boyfriend. This is before the boy robs her as a means to escape the crippling poverty in the ghetto.\n" +
                "\n" +
                "In \"One Last Story\", an aspiring writer is torn between family obligations and writing. Seeking solitude so he can write his first book, he falls in love and all that changes.\n" +
                "\n" +
                "Reading through all the seven stories, one realizes the similarities: the narrator has sexual experiences with different women; the narrator views himself as a social misfit and he's torn between personal fulfillment and finding true love.\n" +
                "\n" +
                "PART TWO\n" +
                "\n" +
                "Sudan has been in conflict for the past three decades. It was presumed that the cessation of the South from the North will quell the civil war but that only escalated the situation. \n" +
                "\n" +
                "Perhaps the conflict between Arabs and the Nuba tribe in Northern Sudan doesn't have the international attention the one in South Sudan and Dafur has. The three memoirs especially \"Let the Children Name Themselves\" and \"Gwaddi's Memoir\" borrow heavily from personal experiences I had while working there as an expatriate. \n" +
                "\n" +
                "\"Run:\" exposes the dangers humanitarian workers and volunteers endure while in the field. Several aid workers have been held hostage and killed in South Sudan. In fact, over seventy have been killed for the last eight years.\n" +
                "\n" +
                "\"Let the Children Name Themselves\" poses the question: the Sudan conflict and other conflicts in Africa are they more about identity and religion and less about politics and oil? \n" +
                "\n" +
                "\"Gwaddi's Memoir\" chronicles the timeline of events since colonialism to date in Northern Sudan, specifically the Nuba region. In 2018, it's a little shocking that colonialism exists. Though most scholars argue that each African state still serves their colonial masters, at least there's the illusion of self-determination and democracy in contemporary Africa. As for the Nuba people, they are fighting to peel themselves from the Sharia Law imposed on them by the Arabs through intimidation, kidnapping, segregation and aerial bombing.\n" +
                "\n" +
                "These memoirs are not preachy. They don’t have solutions. \n" +
                "\n" +
                "None of the stories in this collection has a solution to anything. If we solve all the problems in the world, then we won’t have any stories left to tell.\n");

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
                Intent intent = new Intent(Page1.this, Contents.class);
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
