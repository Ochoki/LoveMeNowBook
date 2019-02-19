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

public class Last extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        Button previous = findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Last.this, Redemption.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Page 6",
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Last.this, Part2.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "PART TWO",
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView textView = (TextView) findViewById(R.id.text);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("All these stories you read are about some guy blaming his fuck-ups on his parents, or women.\n" +
                "\tSo we can all agree that the curse of having dead-broke parents is, the last thing you need is creating dead-broke children. To break the cycle, you have to trot the globe hunting down money. \n" +
                "\tAnd any hint from a clingy female who wants marriage and babies has to be dropped quick. \t\n" +
                "\tAnd out of revenge, this clingy female, she will get hitched to any available brother so she can send you wedding photos, hoping to give you a raise.\n" +
                "\tIf that doesn't work, she has to get pregnant quick and send you photos of an hour-old baby, eyes still swollen shut with dry amniotic fluid. \n" +
                "\tGirl please, don't get syphilis trying to hurt a brother you will never have. You text. \n" +
                "\tAnd for the record, you text, I hope that baby suffocates under your big breasts and dies. \n" +
                "\n" +
                "\tIt’s that old saying about revenge being served cold.\n" +
                "\n" +
                "\tMeanwhile, your passport is getting tattooed as you willingly participate in modern slavery. Even after riding cabs in Europe and guarding business stores in Dubai and tending to old wizened grannies in Canada, it's not enough. Life is really never enough to accomplish all your dreams. So you have to choose carefully what you really don't want. \n" +
                "\tFor a while you walk around thinking you're different from everyone else. That you know the secret to happy living. And you keep writing things that could get published if you get a good agent. Writing is your dream. You blog for a while. Just to horn your skills. To get an audience. This is your third novel in the works. All unpublished, just getting revised draft after draft. Writing killer opening sentences in your head while on a plane, on a train, on a bus, on a girl, in a bar, in a mess. \n" +
                "\t\n" +
                "\tThings seem to look up until you fall in love.\n" +
                "\tAnd your whole life is a poorly constructed plot. \n" +
                "\tAll because of this chick called Maria.\n" +
                "\n" +
                "\tLook, you’re not the only guy to ever blame a broken dream on an innocent woman.\n" +
                "\n" +
                "\tMaria, this chick, she slept with her jeans on the first night she came to your house. You had a rock solid boner the whole night until your navel hurt. If you hold an erection for too long, hot blood floods your veins and if there is no immediate release, your throbbing boner begins to ache. \n" +
                "\tYou ran fingers along the hem of her denim hipster, trying some encouragement. Her back shuddered. She then twitched and coiled like a centipede. When you tried to snake your fingers down her panties, this chick, she slapped your wrists.\n" +
                "\tUndeterred, like darts, you poked her face with your tongue. \n" +
                "\tIt helps blood circulate your face, you told her. \n" +
                "\tThis is the most beautiful-est face I’ve seen in my life, You said to her. With a face like hers, smooth and tender full cheeks, with a stiff penis reasoning on your behalf, you would say anything. Nothing too deep.\n" +
                "\t“I’ll be more beautiful if you close your eyes and imagine me.” She said. \n" +
                "\t“Go ahead, try it.” Said Maria.\n" +
                "\tSo you stopped licking her face and closed your eyes. Like really closed them. All you saw was her naked. \n" +
                "\tSo you, not to rush things, you kept playing these silly games. \n" +
                "\tKiss or Dare. \n" +
                "\tPhone games. \n" +
                "\tCandy Crush Saga. \n" +
                "\tFor three days and more, you cuddled. \n" +
                "\tNo sex. \n" +
                "\n" +
                "\tShe wasn’t here for sex. You met through a friend of a friend of her friend on WhatsApp while she was trapped in Beirut. She was back in Nairobi and was now looking for another job. A connection to Qatar. And you knew people. To buy time, you talked her into staying with you for a few days as you patch things up. Bribe people, forge school papers, make phone calls, the works.\n" +
                "\tDuring the night you tickled each other and giggled. You kissed her forehead so many mornings her third eye chakra must have opened. \n" +
                "\t“Are we lovers or something?” She asked.\n" +
                "\tNo. I just, just...\n" +
                "\t“Then don’t touch me like that.”\n" +
                "Sawa, Fine. I’m sorry.\n" +
                "\n" +
                "\tDuring the day you kissed the earth with the soles of your feet around the neighbourhood. On a Friday, you taught her yoga and murdras. How to connect the soul to the universe, the astral planes. How to invoke the Violate Flame and clear energy blockages. How to make a wish and realign the stars in her favour. You taught her how to read lay lines. How to tell, from the palms of her hand, if she’s going to die rich and happy.\n" +
                "\n" +
                "\tAll our basic concerns are about death and happiness.\n" +
                "\t\n" +
                "\tOn a Saturday, you were to go swimming at Starbucks but it rained. Really it was a drizzle; a sky piss. So you were running back home when her shoe strap snapped. The rain stopped. As the cobbler fixed it by the roadside, she saddled her arm on your shoulder. Her bangles glistened in the sun that cracked through the clouds, forming a rainbow. The street was staring at you. \n" +
                "\tPDA is a crime in UAE, you told her. \n" +
                "\tThen this was her chance to be herself. You paid the cobbler with a Kshs. 1000 note. \n" +
                "\t“Boss, hauna looze?” Asked the cobbler as he clicked his tongue to ask for change across the street. \n" +
                "\tYou had a twenty bob coin in your back pocket but you wanted to impress Maria. The silly little things men do to get laid.\n" +
                "\tLater you had ribs and beer at Greenline Choma Zone and then dove-tailed your fingers back home.\n" +
                "\t\n" +
                "\tSome days, you could be silent for an hour. Her eyes could survey your apartment. The cobwebs and stinking frying pans growing moss in the kitchen sink. \n" +
                "\tYou never cooked. You always ate at the same hotel whose butcher has a missing index finger.\n" +
                "\tAt the corner of your house a box of water-stained pages of poems and prose lay bare like a broken heart. At the ceiling, an affixed “I AM” note stared down on you. So deep into New Age, all you wanted was to travel to Himalayas and meditate, surviving on a grain of rice a day, until you become God. \n" +
                "\n" +
                "\t“You know Sam, all I want is to be happy.” She said. \n" +
                "Her hair extensions smelt good. So you stroked them and replied: \n" +
                "\tMaria, people say life is not fair yet they strive for average. Why?\n" +
                "\tShe began sobbing.\n" +
                "\tShe re-told you tales of her life as a UN refugee worker in Beirut. All she ever wanted was to work in places that carried some risk. \n" +
                "\tBut why? Was her broken heart searching for meaning? Was there a hole in her soul that needed to be filled? \n" +
                "\tShe told you how they were mishandled because they are African. \n" +
                "\tIt’s that old saying about war being started by the rich but fought by the poor. \n" +
                "\tThe stars lied to us. \n" +
                "\tWe are not here to twinkle. \n" +
                "\tShe said how she slept in bags. Bugs bugging her. In some nights she would slide a finger in her woman. \n" +
                "\tYour WhatsApp chats stimulated her, even if you had not met in person. \n" +
                "\t“Becaussse you are soo kind,” she said. \n" +
                "\tAnd that plus the photo of her son kept her alive when eight Kenyans of her crew had died in Lebanon feeding war victims. They were to dispatch the rest of the crew to Syria in a month. She didn’t want to go and die there. \n" +
                "\tShe has a son, goddamnit. \n" +
                "\n" +
                "\tYou—an economic refugee, you an international hustler—were in Dubai at the time. A city build on oil and dreams, a city loved and loathed for its insanely priced buildings and heat, you came here with just a passport and a Kenyan dream. How you moved from a security guard to an entrepreneur is  nothing short of the sweat and hunger of a child raised in poverty. So when a friend told you of her friend trapped in Beirut and she couldn’t be released until her contract expired, and she feared for her life, you had to think fast.\n" +
                "\tYou had to fake her mother’s death to get her back home. She cried at the airport when she saw you in your white Converse sneakers and a goatee. And white earphones.\n" +
                "\n" +
                "\tShe told you sad tales about her son. The deadbeat dad. Her diabetic mother. How her relatives hate her because she got pregnant at sixteen. Bad example to the family. She has no friends. All she needs is somebody to trust. \n" +
                "\tYou dubbed a tear away with your little finger. \n" +
                "\tWhile pouring her heart out, her mother called. Her tone and face changed. Then the voice of her son on phone must have been the whisper of God. For once, Maria was happy. \n" +
                "\tAnd you took her into your chest and assured her: \n" +
                "\tAll you need is these two people who love you unconditionally: your mom and your son. \n" +
                "\tFuck society that wants you polished and perfect.\n" +
                "\tFuck me too if I’m going to break your heart someday. \n" +
                "\tFuck all the men that promised you heaven as they put your body through hell. \n" +
                "\tMaria, you are a phenomenal woman. \n" +
                "\tAt this perfect moment, you asked:\n" +
                "\tMaria, can you trust me even for just one kiss?\n" +
                "\tNarrowed eyes, she sighed.\n" +
                "\t“Give me time, Sam.”\n" +
                "\n" +
                "\tBack from your secret missions downtown River Road one evening, you spread all the fake diplomas and high school certificates she needed on the bed. Told her you had booked her travel date in thirty days. \n" +
                "\tOf course she hugged you. \n" +
                "\tOf course you wanted her glued to your chest for as long it took for her to say, “I don’t know how to thank you for this.”\n" +
                " \tYou said you are welcome. \n" +
                "\tShe had to leave on a Monday to go home and do stuff before leaving for Qatar. \n" +
                "\tYou were on your way to the bus stage when somebody snatched her handbag. Fifteen K in cash, that pearl necklace you bought her at Maasai Market, gone. Her passport and papers and I.D., gone. You had to go back to your house. It’s in the nature of Nairobians to watch you getting robbed and do nothing about it.\n" +
                "\t\n" +
                "\tThat night Maria wanted to end her frustrations in one giant orgasm. \n" +
                "\tSo you licked up her salty tears. You planted fire on her skin, you nibbled her earlobes. You glued your mouth on her belly button and moved it in circles. You wiggled your tongue between her toes. You pulled down her knickers and spread her legs apart like a map, ready for love. Your dagger’s tip was about to break into her portal of pleasure when she broke into a—\n" +
                "\t“No, no. Please, no.” \n" +
                "\tA sob. \n" +
                "\tHer body convulsing. \n" +
                "\tYou stopped. \n" +
                "\tYou swallowed a hard lump on your throat and rolled over. There was water in your eyes. It was raining outside. A part of you wanted to take advantage of her. Of all you had done for her, at least you deserved some sweet loving, some thank you in a form of wild passion. Was that too much to ask? A word bitch could be heard dancing at the corners of your mind. \n" +
                "\tShe fell asleep. Sprawled like that, she in soft snores. You covered her, grabbed your phone and began typing things.\n" +
                "\n" +
                "\tCarlos Santana’s Maria Maria is playing, on low volume, when she wakes up. That Westside story song. It’s 3.33 AM. People called it the devil’s hour. Up next on the playlist is Maria Callas’ O Mio Babbino Caro just low enough to take your mind somewhere, especially when there’s a hot woman lying half-naked next to you and you can’t even make sweet tender love to her. \n" +
                "\t“It sounds devilish, that song.” She said. Because opera has always been a soundtrack in horror and thriller movies. \n" +
                "\tYou told her the song was actually a story about a girl begging her father to allow her marry the boy of her dreams, or she could kill herself if he didn’t. \n" +
                "\t“Do you believe in God? Are you a Mason?” She asked this because a badly sketched tattoo of a pyramid covered your chest. \n" +
                "\tWell, we all make mistakes when we’re fifteen and having read too much esoteric stuff.\n" +
                "\t“How old are you by the way?”\n" +
                "\tI don’t know. \n" +
                "\t“When is your birthday?”\n" +
                "\tI don’t celebrate birthdays.  \n" +
                "\t“Why?”\n" +
                "\tBecause birthdays are a sign that most people are worried about growing old. The best way to look at the age phenomenon is to set a death day. That way, you don't count the years you have lived on earth but the years left. It's like a countdown to the end of the world. That way, each day is your last day. Each morning is your birthday.\n" +
                "\tShe said, “Mhhh. Wow, okay.”\n" +
                "\tShe asked, “Why are human beings so complicated?”\n" +
                "Because we're machines aware of ourselves; and every day we are haunted by that awareness. You said.\n" +
                "\tAfter a pause she asked what you thought of sex. Without thinking whether this was a test or not, you said,\n" +
                "      I had a little rhyme somewhere that read like this:\n" +
                "\tSex is hot, wet and pink.\n" +
                "\tSex is sweat, spittle and stink.\n" +
                "\tThis is the part you expected her to at least laugh but she didn’t. Instead, she was on to her next question.\n" +
                "\t“Why is art these days as boring as counting raindrops?”\n" +
                "\tBecause, Maria, people don't want to create anymore. You said. People want to react. They're waiting for something to react to: rumour, gossip, news. \n" +
                "\t“As a writer,” she asked, “do you consider yourself an artist?”\n" +
                "\tArt is not a calling or mystical force you read about in Eastern mysticism books. You said, sounding rather defensive. Art is the ability to create something an average person can waste time on.\n" +
                "\t“And why do people cheat and lie in love?” This she asked with an edge in her voice, her face taking shapes. Like cheat, lie, love were lemon drops on her tongue.\n" +
                "\tYou told her people will sweat and stutter when they're dating you for the first time. When they have been battling loneliness for years, when they have been praying for a soul-mate, when they have claimed depression, they wonder if you will be the end of all heartbreaks. Six months later, they will cheat on you and tell you right in your face, they can do without you. \n" +
                "\tIt's in the nature of people to forget.\n" +
                "\tIt's just in the nature of people to fuck up.\n" +
                "\tMaria had closed her eyes long time ago. She was drooling on the corner of her pink mouth.\n" +
                "\n" +
                "\tShe had to go home anyhow. Said she was sick of being bitch-slapped by life. In the morning you hugged, leaning at the back of the door for some minutes. Of course you felt something growing, swelling back to life. She stared into you.\n" +
                "\tShe said, “Sam, you’re a gentleman.” \n" +
                "\tShe then planted a kiss on your forehead. \n" +
                "\tYou kissed back. \n" +
                "\tShe kissed back, lower, on the lips. \n" +
                "\tYou kissed back, lower, on the lips, deeper. \n" +
                "\tShe kissed back and—to spare us the breathy, steamy, details—you had sex just right there at the back of the door. \n" +
                "\tAnd because she caught you unawares, and because of the pent up passion you had endured for the last seven days, you were done after two seconds. \n" +
                "\tYou wait for a miracle your whole life and when it happens, you are not ready.\n" +
                "\n" +
                "\tYou saw her off at the bus stage. \n" +
                "\n" +
                "\tAh, Maria. \n" +
                "\tAs the wind blew, you could feel her through the weather. \n" +
                "\n" +
                "\tMaria was the worst thing that ever happened to you because, boy, was that girl a stunning beauty or what? \n" +
                "\tMaria was the worst thing that ever happened to you because, boy, was that girl pregnant or what?\n" +
                "\tAnd that you had to marry her or what?\n" +
                "\n" +
                "\tAll it takes is two seconds to change the next twenty years of your life.\n" +
                "\tAll it takes is two seconds and you have to pay a price for the next twenty years of your life.\n" +
                "\tLook, you’re not the only guy to ever blame a broken dream on an innocent woman.\n" +
                "\tAnd on an innocent child.\n" +
                "\n" +
                "\tBecause one moment you are a promising contemporary novelist, the best thing to ever come out of Nairobi streets after Wainaina Binyavanga, and the next thing is, you are wiping a baby’s ass and changing diapers. \n" +
                "You read a book once in six months. Because once you open a page to breathe in the sweet smell of an old book, Sam Junior jumps on your lap tugging at your beard, saying Daddy what, what.\n" +
                "\tAnd those treasured waiting-to-be-published novels zipped in a folder in your MacBook Air? You read them late at night and they taste like yesterday's soup. You begin deleting a paragraph after another, hoping to rewrite a fresh one. The more you read them the more they sound familiar. \n" +
                "\tWho's going to be impressed by this shit anyway when series movies and blogs have complicated story writing? When Nigerians keep scooping award after award, who is going to read stories about Nairobi struggles and love and sex and drugs? Come on, even a broke rapper can write a sixteen bar verse about that. So you keep hitting the backspace button on your laptop until the cursor blinks on any empty screen.\n" +
                "\tPretty much like your life.\n" +
                "\n" +
                "\tSo you resort to Facebook to post something. And what infuriates a failed writer more than bad politics? The blame of things wrong with the world? You attack these fat uncaring corrupt geezers. These yappers in their mismatched neckties. These Oxford educated balding media leeches with bad accents. These inheritors of colonial greed. What do they know about life? You write post after post over this and that. From Kanye's tantrums to Trump's pussy-grabbing blabber to Uhuru Kenyatta's blood shot eyeballs. You brutally analyze every news item.  \n" +
                "You are a failed project and you can only see failure everywhere. \n" +
                "\tAnd, boy you do get a social media following. You are a status symbol of all frustrated young voices who need an outlet. Somehow you feel yeah, I'm a writer after all. Until National Security Council sends a warning to your e-mail. Saying you're spewing hate speech on social media. \n" +
                "\tAnd that seems like all you need to become something, somebody, at last. For a moment you picture yourself being dragged to court, and being called a domestic terrorist. Second, there's Maria and the baby and her son watching you on TV being escorted to court. Third, there's the social media heroic praise of you but that is where it all ends. No ‘Like’ button is going to get you out of jail, until Facebook is made part of the constitution.\n" +
                "\n" +
                "\tSo you deactivate your account and pretty much deactivate your social life. You retreat into a corner of your house and try, for the last time, to write one last story without Maria in it.\n");
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
                Intent intent = new Intent(Last.this, Contents.class);
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