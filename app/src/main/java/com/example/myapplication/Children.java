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

public class Children extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_children);

        Button previous = findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Children.this, Run.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Page 9",
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Children.this, Gwaddi.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Page 13",
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView textView = (TextView) findViewById(R.id.text);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("From Gidel we drive towards Al Marral. It's 7 p.m. and it rained today. The floor of the earth is a wet carpet of mush mush, squish squish; but we have this Toyota FWD, so we shoot through the bushes like a firefly. \n" +
                "\n" +
                "\tI'm in the passenger seat. Being an expat and all, love or respect is extended this way. Little favors. It so happens that when a tire bursts halfway our destination, I'm not allowed to touch anything; not even get a stone from the bush to wedge it behind the front wheel, not even offload the sound equipment and food items and sleeping bags we have on the pick-up to make the tire jacking lighter. No sir. You just fold your arms with your black backpack, light a cigarette and wait.\n" +
                "\n" +
                "\tAfter one hour, we reach Al Marral. My job is to help with the sound. Fixing the audio mixer, microphones, the power generator, prop the projector and screen, and play music as loud as possible. This is the only way to attract a crowd. It works every time. \n" +
                "\n" +
                "\tAs Arabic songs from Khartoum, Juba, Eritrea, Egypt and Somalia ventilate throughout the surrounding hills, people begin moving in. Barefoot children and barefoot youth. Some have AK-47s slung over their shoulders.\n" +
                "\n" +
                "\tOur driver, Kuku Suleiman, parks the car next to the sound system and the lights flood the spot. Imagine where I'm standing with the sound system adjusting equalizer knobs as the DJ's booth in a nightclub; and the headlights of the pickup as the disco floodlights. In fact, all I hear is shouts of DJ play this, DJ play that as young men elbow through the crowd to hand me over their micro-SD memory cards. This is because as I keep mixing the Taarab with Lingala tunes and few Jamaican dancehall bangers, the girls have not been dancing and the young men know why. This is not the music they're used to. \n" +
                "\n" +
                "\tI play a number from the memory card stick, fast tempo-ed local Toro tune, and then the girls sway from their group and move towards the men. And everybody is happy. \n" +
                "\n" +
                "\tHow you dance this, is by stumping your right foot on the ground followed by slouching your right shoulder as you advance towards your dancing partner. No touching of bodies. That's an unwritten rule. There is strict social code against sexual advances in this region.\n" +
                "\n" +
                "\tAfter the warm up, the host—a local doctor—sends his son to whisper into our ears that supper is ready. We enter the huts to enjoy beef stew with mashed herbs and sorghum paste popularly known as 'kisra'. \n" +
                "\n" +
                "\tInside the hut, we're about seventeen heads in one room. Heads bobbing up and down. Mouths working. Jaws moving. Hands reaching a sinia. Fingers grabbing kisra, rolling it in stew, four fingers in the mouth, four fingers being loudly smacked. There's a smell of cooked meat in the air. Dead goats seasoned on firewood, the taste of smoke in your tongue. You see boiled maize-on-cob being undressed by front teeth, one row of grain after another. Mouths full of grains, you only say Hi, Hey, Yes, Haha with your mouth closed. After that the cobs are dumped on the soiled floor. \n" +
                "\n" +
                "\tPure satisfaction.\n" +
                "\n" +
                "\tNow, guess who walks in tapping everyone on the shoulder? This is Salla, the famed local musician. \n" +
                "\n" +
                "\tIf you're a musician in the showbiz world and you've come to kill the show, you come with a drum-set complete with bass guitar and solo guitar and keyboard, back-up singers and your own DJ and publicist and playback audio files, just in case. All Salla has is his tiny, tiny guitar called rababa. As for his entourage, two guys--one with two tiny, tiny tom tom drums and one with small pot with an opening on the narrow end. The other end is covered with cow hide. When you tap it, a killer soft baseline moves your feet. \n" +
                "\n" +
                "\tSalla attaches the wireless mike to the rail of his tiny, tiny guitar. The mike has to pick his voice and the rababa's. This rababa has only four strings. The other mike is held between the small pot and the drums. And with the strum of the first chord of the rababa, and behold, the party begins. \n" +
                "\n" +
                "\tMovement.\n" +
                "\n" +
                "\tIt's like, until the music commands us, we are here chained to our own devices. \n" +
                "\n" +
                "\tStuck in time. \n" +
                "\n" +
                "\tMusic talks and then—life; abandon.\n" +
                "\n" +
                "\tMusic: the noise we invented to drown the many noises in our heads.\n" +
                "\n" +
                "\tSalla, with a dangling green earring in his left ear, with his left hand in a dozen wristbands, he strums. Salla, he strums. He sings. In a high monotone pitch equalized by the gap in his upper teeth, he sings. \n" +
                "\n" +
                "\tNo idea what's being sung in the song. There's Al Bashir being mentioned. The ICC indictee who has ravaged this region with air bombs using Antonov cargo planes. There's mahaba being mentioned in a song. Love: music's number one theme. \n" +
                "\n" +
                "\tIt's the old marriage of love and war: art. \n" +
                "\n" +
                "\tThe drums guy, he has to hold a steaming cigarette with one hand and drum the drums with the other. It's the old ritual of evoking temporary happiness: music and getting high.\n" +
                "\n" +
                "\tGuns and sticks and hands and lit cigarettes and sing-alongs are raised to the darkened sky. Inspired, all of us join in. This is the moment we all savor.\n" +
                "\n" +
                "\tIf you moved too close, you smelt freedom in the air. \n" +
                "If you moved too close again, you smelt marijuana in the nostrils and in the finger tips.\n" +
                "\n" +
                "\tThe ground under our feet is mud and dying grass. A few hours ago this ground was lush green. Now it's concrete. Drop us right into the Amazon forest, and I promise you we'll create a shiny dance floor with our feet.\n" +
                "\n" +
                "\tA girl in bare feet is swaying too close, too close you have to pull back because everyone is watching. A new face in the crowd, you have to be modest. Be cautious. \n" +
                "\n" +
                "\tAnd the party goes on, right here in the middle of nowhere, surrounded by sound and moving bodies, right in this night where the only light you see is when someone smiles or from a burning cigarette.\n" +
                "\n" +
                "\tTired, you take a piss on the grass nearby. Your sports shoes squish squish on something soft. A dump a child just left. You have to go back to the stomping ground and let the feces mix with mud. \n" +
                "\n" +
                "\tThis life should go on forever.\n" +
                "\n" +
                "\tBut it doesn't. Because soon, Adam Kaluka the Outreach Program Manager, takes the mikes and states the purpose of our visit to the sweating crowd. In Tira dialect, he tells them about HIV, how to avoid it, its effects, and testing. \n" +
                "\n" +
                "\tThat's why we are here. HIV/AIDS awareness. HIV/AIDS is a new thing here. While the rest of the world is moving towards cancer of the cervix and Ebola and other complex emerging health threats, here in central Sudan, the marginalized Nuba ethnic group, has as little as 0.001% of HIV cases according to the Mother of Mercy Hospital statistics carried out in 2016. The rumour was, the 0.001% was attributed to the many foreign NGO workers like myself who (allegedly) introduced it here. Just for the record, a foreigner suspected or caught having sex with the locals has to be first caned, fined and deported.\n" +
                "\n" +
                "\tThis surprising reality could be attributed to the strict moral code on sexual matters and adherence to traditional law on sex and marriage; the Sharia law from the Muslim culture and the introduction of sanctity laws by the Catholic church in this area. Not to mention that condom use is a totally foreign concept and is mostly frowned upon. \n" +
                "\n" +
                "\tHowever, few cases of gonorrhea have been reported...\n" +
                "\n" +
                "\tBy 3 a.m., we shut the system down much to the groan of the revellers. We have to save on fuel, rest and begin again tomorrow with HIV testing.\n" +
                "\n" +
                "\tBecause it happens all the time you're in a new house and new bed, I can't sleep. So I and Kaluka just sit in the dark playing games in our phones, smoking, sipping coffee, talking. \n" +
                "\n" +
                "\tHe shows me the photo of his son. Puffy-eyed, the baby is just three days old. And Kaluka says he wants to dash back on a Grizzly 350 Yamaha bike to see his wife and kid and come back at 6 in the morning. He says it's his first child. He can't bear another minute away from him. \n" +
                "\n" +
                "\tHe says, \"I will name him after my father.\"\n" +
                "\n" +
                "\t\"When did he die?\"\n" +
                "\n" +
                "\t\"In 2011after the disputed elections. He was a soldier. He was in the SPLA. When the enemies raided our home, the rest of us ran to the hills. He was captured and tortured, had his nails pulled out, and then shot, and then set on fire.\"\n" +
                "\n" +
                "\t\"Sorry, man.\"\n" +
                "\n" +
                "\t“That’s why I also joined the military.”\n" +
                "\n" +
                "\t“How was it like?” I ask.\n" +
                "\n" +
                "\t“Fun at first. Bare-footed, you’re given only three bullets and every shot has to kill somebody so you can take their guns and bullets and shoes. And then your sleeves rolled above the elbow, you fire bullets while mosquitos fire fever poison into your blood stream. Above you, a heavy hum of the Antonov laden with bombs is looking for a place to drop them. Either way, you die, to rot and to be forgotten.”\n" +
                "\n" +
                "\t“Damn.” I say and I tell myself, this used to be movie stuff or something you read in a book. \n" +
                "\n" +
                "\tHe says, “After a while, you stop worrying about a bullet flying to your head. All you’re left with is questions like for what? For how long? Why?”\n" +
                "\n" +
                "\t“How old were you when you got recruited?”\n" +
                "\n" +
                "\t“I was 14 at the time. In school. They came, ordered everyone out of the class. If you were tall enough you gladly hopped onto the jungle pick-up and followed orders.”\n" +
                "\n" +
                "\tStaring at the end of his burning cigarette, he says, “Soon, orders are all you lived by. Order on how to aim. How to ambush. How to torch the huts. How to remain unmoved if children yelp through the razing fire. How to tear off a woman's clothes. How to tear a woman apart and empty your emptiness into their yelling and screams. How to tear off one's conscience and feel nothing thereafter.  Before long, you become the very people you’re fighting.”\n" +
                "\n" +
                "\t“Damn.” I say and I tell myself, I didn’t know Kaluka had such stories buried inside his calm personality.\n" +
                "\n" +
                "\t“I, like the rest of us, had become conditioned that I was dying for the cause. That this was the only way—dying. I died inside. What killed me more was the killing of my own people.” \n" +
                "\n" +
                "\t“Own people?” I ask.\n" +
                "\t\n" +
                "\t“Yes. Some of the soldiers we captured and tortured and slaughtered were Tiras, Toros, Moros. They had rough hair that had turned ash-brown from all the dust, shelling smoke and lack of proper food out in the jungle. They were boys just like me. Boys, either captured and turned, or just happened to be on the wrong side of the gun.”\n" +
                "\n" +
                "\t“Right.” I say and I tell myself, it’s more of they just happened to be on the wrong side of the ballot box.\n" +
                "\n" +
                "\t“I had anticipated running away several times. But running away was cowardly—an unpardonable act of betrayal. Treason. Besides, the images of children's burnt yellow intestines from the bombing of my own village by Russian Sukho fighter jets, the death of my father, fuelled my vengeance. To surrender meant to concede defeat and let the enemy infiltrate the people with their culture and religion. It was a war instigated by fear of losing one's identity.”\n" +
                "\n" +
                "\tHe breathes deeply.\n" +
                "\tWe both say nothing.\n" +
                "\n" +
                "\tI don’t ask how he got out. How he ended up where he is. Fighting a different war now: HIV/AIDS. Some questions are better left unasked.\n" +
                "\n" +
                "\t\"Now you see why I don't want my boy to be given some foreign name. I don't want my boy to be tainted with our colonial past.\"\n" +
                "\n" +
                "\t\"Of course.\" I say, avoiding saying anything contradictory. I tap the cigarette ash to the floor. \n" +
                "\n" +
                "\t\"But my wife,\" he drags in a cigarette and breathes it out through the corner of his mouth, \"she wants the boy be given an Arabic name. Because she's a Muslim, her parents are Muslims. All my family members are Muslims except me. So they all support her.\"\n" +
                "\n" +
                "\t\"Isn't it too early to start a fight over a baby who's barely a week old?\" I ask.\n" +
                "\n" +
                "\t\"I want to honour my father. My father was a fighter. My father was a nationalist. My father was an animist. He believed in the African spirit; in our purity and strength. He died a martyr like Yusuf Kuwa Makki.” \n" +
                "\n" +
                "\t“Yea, I read about Kuwa on Wikipedia.”\n" +
                "\n" +
                "\t“You know when I was law student in Catholic University in Kenya, I loved studying about African literature and about heroes like Kwame Nkrumah, like Nelson Mandela, like Jomo Kenyatta. People who saw the need in liberating Africa from colonial mind-control. Right now there are two forces fighting over our culture.\"\n" +
                "\n" +
                "\t\"Right.\" I say.\n" +
                "\n" +
                "\tHe continues, \"I'm the only Christian person in my family and that's only because the church is sponsoring my studies. I deferred for two years to first start a family. Family is what keeps our people united. Without family a man has nothing. So my aim is to start killing this colonial-dependence mentality by beginning with my son’s identity.\"\n" +
                "\n" +
                "\t\"Right.\" I say.\n" +
                "\n" +
                "\t\"You know, three of my brothers who work in Khartoum,—we are fourteen brothers in our family—they told me that for you to get a job there you have to change your name. And then they start praising you and calling you proudly once you have a new name—their name. And they make you feel loved. Especially with the oppression we have gone through for over thirty years, an outsider showering you with love and money and education and food and hospitals and praise is overwhelming. Do you know most African leaders don’t identify with Christian names?\"\n" +
                "\n" +
                "\t\"Yeah, I've noticed that.\"\n" +
                "\n" +
                "\t\"Do you know why?\"\n" +
                "\n" +
                "\t\"I really never thought so much about names. I mean, I'm Michael and I love that name. Maybe because it’s associated with very famous people, maybe not. It may mean anything to anyone. But it's just, just\"— I shrug— \"just a name.\"\n" +
                "\n" +
                "\t\"No, my friend. A name has power. In our community, all first borns are ‘Kuku’ for boys and ‘Kaka’ for girls. It's a magical name, it gives you power. You should also know that we, in our tribe, don't call diseases by name. Like Yellow Fever, we call it: a-disease-that-cannot-be-named.\"\n" +
                "\n" +
                "\tI say, “Wow.”\n" +
                "\tAgain, with a grin, I say, \"But you know 'Kuku' means 'chicken' in Swahili, right?\"\n" +
                "\n" +
                "\tHe laughs. \n" +
                "\tI laugh. I tip more coffee to his cup.\n" +
                "\n" +
                "\t\"Well, in some marketing companies, they first decide on the name of a product before launching it.\"\n" +
                "\n" +
                "\t\"Well, in that case, we should name children before they're born, right? Before they’re even conceived, right?\"\n" +
                "\n" +
                "\tHe laughs.\n" +
                "\tI laugh. I say nothing.\n" +
                "\n" +
                "\tLaughing, he says, \"My friend, that's funny. What's funnier, is that my family is getting divided over a name—my baby's name.\"\n" +
                "\n" +
                "\tI say, \"Well, I don't have children, I don't subscribe to any religious affiliation so I'm out of touch with such matters. That, to me, is what freedom smells like.\"\n" +
                "\n" +
                "\tAs an afterthought, I say, \"Hell, if I had an opinion in the matter, I would say let the children name themselves.\"\n" +
                "\n" +
                "\tHe laughs.\n" +
                "\tI laugh.\n" +
                "\n" +
                "\tThe coffee and the cigarette is taking a toll on us. We just want to talk and talk until the sun comes up. Until the dew steams away, and the ground is nothing but dried up red cakes. Until the music roars back. Until the people gather to hear about more strange diseases with strange names, like herpes zoster and chancroid and chlamydia. Diseases that leave your genitals with moon crates and explosions of yellow lava.\n" +
                "\n" +
                "Without a name, you don’t know what you’re suffering from. Until we give it a name, a disease is just part of our lives. Until we give it a name, a disease is less threatening, it’s less profitable, it has no job market.\n" +
                "\n" +
                "\tWe go out to pee so we can catch some sleep.\n" +
                "\n" +
                "\tAs we both stand there emptying ourselves on the grass, I look over to him and I say, “Kaluka, I think we ought to also let diseases name themselves.”\n" +
                "\n" +
                "\tHe laughs.\n" +
                "\tI laugh.\n");
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
                Intent intent = new Intent(Children.this, Contents.class);
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