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

public class YourPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_page);



        Button previous = findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YourPage.this, Page1.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Page 1",
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YourPage.this, Page2.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Page 2",
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView textView = (TextView) findViewById(R.id.text);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText(
                "Dear Clara,\n"+

                "Today, I remembered the taste of your skin.\n" +
                "\tI shut my eyes and a shape came floating in the dark. How it tasted when I put my mouth on it. \n" +
                "\tWhat we love, we define by taste.\n" +
                "\tClara, in case you forgot, I’m describing your face.\n" +
                "\tI remember how I could dab my mouth on that face the whole Sunday afternoon; and your earlobes, and your cheeks would flush red. And that face would yell stop, stop, please baby stop.\n" +
                "\tGiggles would then escape your small mouth like soap bubbles as a finger traced the bridge of your tiny nose; for whatever reason. \n" +
                "\tThe mouth, it was small too. \n" +
                "\tA hole that peeled out to upper and lower, pink curved lines. But they tasted of a promise and a moment, those pink lines of flesh. \n" +
                "\tAnd I would unzip them with my tongue. My tongue, it would dive deep. \n" +
                "\tThe tip, swimming, looking for a home under the roof of your mouth. I would floss your teeth with the waters of my mouth. The tasteless nectar of my mouth. \n" +
                "\tWhat we love, we define by taste.\n" +
                "\tDear sweet Clara, in case you forgot, I’m describing our first wet, French kiss.\n" +
                "\tYou would then raise your whole body, levitating, an ocean wave meeting the moon. \n" +
                "\tAnd then you would shudder. \n" +
                "\tLike a small hurricane.\n" +
                "\tWhat we love, we define by movement.\n" +
                "\tDear Clara, in case you forgot, I’m describing your orgasm, our orgasm.\n" +
                "\tLike a waterfall, I would cascade down to the heaving mounds on your chest, flooding my breath all over a dark nipple. \n" +
                "\tThen another dark hard cold nipple. \n" +
                "\tTorture them, those ripe berries. \n" +
                "\tTorture myself with your existence. \n" +
                "\tI would keep flowing, smudging your flat tummy with mouth strokes. I would paint you down to your oasis. The wetness. The warm wetness of your oasis. I wanted to be wet like you. So I pushed in. And you gasped. We gasped. \n" +
                "\tFaster. \n" +
                "\tFaster. \n" +
                "\tI slid my arms beneath your shoulders. You held tight. We wanted to melt into a brown and black candle. \n" +
                "\tTwo bodies, burning off together. \n" +
                "\tWhat we love, we define by intensity.\n" +
                "\tIn case you forgot, I’m describing our first bond, etc, etc.\n" +
                "\n" +
                "\tToday, I remembered you saying you were leaving.\n" +
                "\tPeople always leave. \n" +
                "\tHalf of the human race struts around the earth with sad faces because people left. \n" +
                "\tLovers, parents, friends. \n" +
                "\tPeople, they always leave. \n" +
                "\tUltimately, existence is all about leaving: people, places, habits, the past.  \n" +
                "\tBut you, you were just visiting your mom in Nakuru for two weeks. Just across town. Just a few hours’ drive from Eldy. And that evening I cried on your shoulder.\n" +
                "\tLike I’m five years old and mom is leaving—again.\n" +
                " \tThat was being a pussy, I told myself afterwards. But what else could I do when a part of me was leaving for fourteen days? Do you know how long that is for a heart that depends on another body to keep beating? Do you know that when you are twenty-one, all you want is to do is love, fuck, love, dance, sing, and be happy? \n" +
                "\tDo you know that when you are in love, fourteen days is fourteen lifetimes?\n" +
                "\tWhat we love, we define by time.\n" +
                "\tDear Clara, in case you forgot, I’m describing how much you meant to me.\n" +
                "\tAnd then I cheated.\n" +
                "\n" +
                "\tThree days after you left Wangeci showed up. \n" +
                "Wangeci, she was a neighbor next door. I know you remember her. \n" +
                "\n" +
                "\tShe and her boyfriend were just teenagers trying to start a marriage. A pitiable scene. Roba was a broke liquor-head. A class seven dropout selling second-hand clothes in West Indies market. Wangeci had just lost her periods and quit school at Form 3 from Moi Girls. She had miscarried so she spent days and days in bed. Occasionally she came out in her shorts to sun herself. Her thick brown legs and that Kikuyu ass so flawless you wouldn’t believe she just had a miscarriage. And you guys got close. Got to talk things. Got to invite her in for tea. Got to go to the salon together. I and Roba got to go out for a drink together. Go to talk about you guys. How juicy-hot-hot your young bodies were.\n" +
                "\tWhen Wangeci came, three days after you left, I was watching an episode of House of Cards. \n" +
                "\tMambo?  \n" +
                "\tOn the screen, Frank Underwood is talking to Zoe, the journalist. \n" +
                "\tNiko poa tu. \n" +
                "\tOn the screen, he’s telling her to call her father, it’s Father’s Day.\n" +
                "\tKuna chai kwa flask.\n" +
                "\tZoe goes outside, talking on phone.\n" +
                "\tThanks, but niko poa.\n" +
                "\tPhone in one ear, Zoe is drawing a heart on the glass pane. It later transforms into a big penis.\n" +
                "\tI and Wangeci, we never talked much. It has been always like that. \n" +
                "\tWangeci, in her shorts. Her short smooth legs, on the couch. Propped her head on the throw pillows watching the movie. Chewing gum. And I became aware of her. I joined her on the couch. \n" +
                "\tI reached out to her face. \n" +
                "\tShe kept staring at the screen.\n" +
                "\tOn the screen, Frank Underwood is saying, There’s a value in having secrets.\n" +
                "\tI touched Wangeci’s neck. \n" +
                "\tShe kept staring at the screen. \n" +
                "\tOn the screen, as Zoe undresses Frank, she’s saying to the phone, I’m not seeing anyone right now.\n" +
                "\tOn the couch, I’m touching Wangeci’s shoulders. \n" +
                "\tShe then looked at me. \n" +
                "\tI stared back, into her: she was a calm swimming pool and I was looking for my own reflection. \n" +
                "\tShe slouched down on the couch. Her body seemed to sink. I kept my hands going. Her breathing quickened. \n" +
                "\tOn the screen, Frank is pulling off Zoe’s black underwear and she’s saying to the phone, I’m really in a good place right now.\n" +
                "\tFrom the couch, I pulled Wangeci’s hand to bed. She reached down and slid her own panties off. Left them hanging on her left leg—just in case some nosey fingers knocked the door while we were at it. We then did the thing. After three seconds, I trembled and drooling, I buried my head in her neck, finished. She pushed me off, snapped her panties back, avoiding my eye contact.  \n" +
                "\tShe went back to her house like nothing had happened.\n" +
                "\tDear Clara, in case you want to know, yes I cheated. For three seconds.\n" +
                "\n" +
                "\tToday I remembered that too. That I cheated on you and you never found out. Or maybe you did but didn’t care. \n" +
                "\tWhat you don’t know doesn’t hurt. \n" +
                "Because when you came back from Nakuru, the sex was just dull. Wangeci’s body was on my mind all the time. \n" +
                "\tI just hated you. \n" +
                "\tAnd I blamed you. \n" +
                "\tOut of guilt I just blamed you. That maybe your little tour to Nax was just to see some boyfriend. That something was different with you.  Fights started over smallest shit. And I said, I don’t want to see you walking around with Wangeci. You just looked at me and shook your head. \n" +
                "\tNini mbaya na wewe siku hizi? \n" +
                "\tSijui. Maybe we need a break. I replied, eyes on my phone. \n" +
                "\tAnd you said, Fine. \n" +
                "\tThat was it. \n" +
                "\tNo tears, no goodbyes. \n" +
                "\tJust Fine. \n" +
                "\tI thought that was a little weird. My ego went flat. You didn’t put up a fight to defend what we had built for four years and half. No. Fine. You just packed. \n" +
                "\tYou just walked out. \n" +
                "\tDear Clara, in case you forgot, I tried to block the door but you just looked at me, your eyes dead and white, and I let you pass.\n" +
                "\n" +
                "\tNow, there are a million ways of dealing with a breakup:\n" +
                "\tOne, you could spend hours believing it never happened. That she’s just bluffing. She will bring her ass back after two hours. So don’t bother to call or text. Be a fucking man, man:\n" +
                "\tPour yourself a drink and breathe.\n" +
                "\tTwo, you can lock yourself in bed for two days, crying. Deleting all texts and photos. Deleting the past. Changing your WhatsApp profile to something that suggests desolation:\n" +
                "\tAdd any Nietzsche or Freud or Schopenhauer quote as the status. \n" +
                "\tThree, you can go out and drink and party and yell all night. Then cry quietly at the back of the taxi back to an empty house. Spend the following day with a pounding headache listening to a sad slow song on repeat:\n" +
                "\tThink suicide. \n" +
                "\tFour, you can actually attempt suicide. She might bring you flowers at the hospital, kiss your hand, cry, sympathize and say, Baby I’m sorry, let’s start over. But you can't because you have too much pride. You don’t want to die either. Because even in your death you will imagine her happy and sucking off another man and washing dishes for him. You know, all the things she did for you. So death isn't enough:\n" +
                "\tWe all die every day.\n" +
                "\tFive, you can call over Wangeci—you know the neighbor you used to cheat on her with—after her husband has gone to work? You fuck Wangeci imagining it is Clara’s body. You flip Wangeci over like the pancakes Clara used to cook. You viciously nail Wangeci's two holes. You cry internally while banging this soft body. The tears only come out through your penis into Wangeci's body. You poison her with your pain. You are punishing her. Punishing all women. Punishing Clara's body. But her body was your body. So this sex with Wangeci doesn't heal you. Nobody can sex you the way Clara used to. You could get lost in the memory of how sweaty and sweet the sex—or, love-making as she used to call it—used to be. And wank off once or twice for old times’ sake:\n" +
                "\tMemory is all we have.\n" +
                "\tSix, you can go berserk and write stupid messages to her if she hasn't already changed her number or blocked you. You can tell her how fucking glad you're it is over. How her pussy was too big anyway. How terrible a cook she was. How too skinny her thighs were. Ass so small it only fit a palm of your hand, LOL. How you never loved her anyway. How you wanted to end the whole thing ages ago but you were bidding time. How you're relieved it is over. You text all this crap. You wait for five minutes, thirty minutes, eight hours, two days, she writes nothing back. You feel like a moist piece of dog turd. Every time the phone beeps your heart pounds like, Ah I knew this bitch would text back. Only to find it is your landlord:\n" +
                "\tWhen love is gone, everybody is an enemy.\n" +
                "\tYour phone is a weapon of torture. You switch it off. Switch it back on after two minutes expecting six hundred missed calls and texts. Nothing. Not even your boys are texting today. Nature is conspiring against you. God wants you to die:\n" +
                "\tNature has no mercy for the weak.\n" +
                "\tSeven, you can start stalking her on all her social media accounts. See if she has truly moved on. She has. Because there's no teary post about you. About men. And how stupid men are. Men are skunks. None. Only some selfies with some friends. She was in Club 411 after the break up. She went to Starbucks swimming the following afternoon. She frets over school work. She is doing her masters at Baraton. She looks happy. And that kills you more. You ceased to exist the moment she said “Fine” through her teeth and left. Because you expected her to deactivate her account and cry herself to sleep for two weeks just like the other broken-hearted girls you had dated before her. You expected her to text you back begging, saying, Please let's start over. Life is stuck without you. None of that happens. This is not the Clara you know—or used to know:\n" +
                "People change when set free. \n" +
                "\tEight, you can call up Sammy and tell him about the breakup. But your boy Sammy has been single for years he sees no sense in relationships. Sometimes you suspect he is a closet homo. So you know he will laugh it off. Tell you, Fuck bitches, get money, bro. That’s the motto. But he has no bitch or any money so you don't know what the fuck he's talking about:\n" +
                "\tSo, never trust anybody with your pain.\n" +
                "\tNine, you can buy flowers and chocolate. Show up at her apartment in Elgon View uninvited. There are two possible outcomes: she will slam the door in your face or invite you in. Awkward silence will follow. She will be in her night dress. The one you bought her a year ago. The one that comfortably traces the curves of her small ass. The one that reaches mid-thigh. And you will look at those thighs and lust will set your body ablaze and block your fucked-up mind. You can’t afford to lose all this. All this hair, this intimidating silence, these drowsy eyes, this hand on her waist, this woman. No fucking way. So you will want to say something. You will clear your throat. You will stutter. How have you been? Before she responds her new guy will walk in from the bathroom, a towel wrapped round his waist:\n" +
                "\n" +
                "                                           *\n" +
                "\n" +
                "\tWhen you left, I remember sitting at the edge of the bed thinking with a cigarette, What now? All seemed so empty. The cigarette burns on the carpet were your kisses. The burning cigarette was my life turning to smoke. \n" +
                "\tAsh to ash. \n" +
                "\tThe house—a prison, the bed—a coffin, the future—an eternity in hell, and the pair of panties you left in the bathroom on purpose—a ghost of memories. \n" +
                "\tI sniffed them trying to conjure a memory. \n" +
                "\tNothing. \n" +
                "\tYour absence, like the last puff of a cigarette, sucked life out of everything. \n" +
                "\tThe heart felt like a pricked balloon, slowly puncturing. Slowly becoming a dried up tendril in my ribcage. \n" +
                "\tDear dearest Clara, in case you want to know, this is how loneliness feels. \n" +
                "\tI remember us debating on occasion about the nature of things. Why people fall in love. Why people start wars. And I said it was all about food, sex and shelter. \n" +
                "\tFood? Get the fuck out of here, you laughed and mock-punched my stomach. \n" +
                "\tSo am I like food to you or something? \n" +
                "\tI said Yeah. Soul food or some poetic shit like that. You’re fodder to my universe, until I die. And time will wind your whole existence into a memory when you’re gone.\n" +
                "\tYou said, so the romanticization of sex and love is a silly idea, isn’t it?\n" +
                "\tI said man tends to revere things he can’t understand. Loneliness is the only true essence of being. \n" +
                "\tAnd you asked, You mean to say you don’t love me or you’re with me because you can’t be alone?\n" +
                "\tWhat do you think?\n" +
                "\tI think you’re crazy.\n" +
                "\n" +
                "\tAnd I was. \n" +
                "\n" +
                "\tBecause I introduced you to Uncle Paul. We visited him in Kahoya. In his sixties, he had a bad eye that cried colored juice twenty-four seven. His napkins were all soiled with yellow liquid shit. So somebody was managing his law firm at Barung’etunyi Plaza. And I told you Uncle Paul had paid my way through college. He was my father when my father walked out one night and never came back. And I told you I had never told anyone this before. \n" +
                "\tAnd I told Uncle we would marry someday. \n" +
                "\tWe had planned a future together. \n" +
                "\tChildren.\n" +
                "\tPicking each other from work.\n" +
                "\tKissing in traffic. \n" +
                "\tGetting rich together. \n" +
                "\tTouring. \n" +
                "\tWhen you’re young and in love, everything is possible.\n" +
                "\tEven when lips that have tasted a hundred tongues say you're the only woman in their life, you believe them.\n" +
                "\tHoneymooning, having sex on any beach in East Africa, like Zanzibar, is possible.\n" +
                "\tLooking at the cigarette ash leave a dark hole in my jeans, love and its promises sounded stupid. \n" +
                "\tIn case you’re wondering, minutes were smoldering ashes leaving holes in my lungs, Clara. \n" +
                "\tIn case you really want to know, I couldn’t breathe. \n" +
                "\n" +
                "\tThat evening, around seven, I drag my sad ass to Sanjeel for a beer. \n" +
                "\tIt is empty; save for a waiter mopping the counter behind a giant TV screen on mute. An empty soccer match is on. The stadium, somewhere in England, is littered with empty fans waving red and white flags. So I sip my beer to fill up my emptiness. And it burns down my throat like battery acid to an empty stomach. The pub starts filling up. One by one, men in empty suits from empty jobs occupy the tall stools at the bar. We share empty stares or raised a glass and nod at each other in quiet acquaintance.\n" +
                "\tYou sit in a bar, and the only conversation you have is the drink in your hand. \n" +
                "\tAnd the eyes that stare at you, is like they can smell your loneliness.\n" +
                "\tBy 12 A.M. I have hopped from Sanjeel to Caesar's Palace back to Sanjeel like a restless school boy. \n" +
                "\tDead drunk. As a skunk. \n" +
                "\tI stagger across the roundabout to Who's? Pub. We used to come here for movies at Sosiani Cinema. \n" +
                "\tEverywhere I go, you are already there.\n" +
                "\tBefore I hit the stairs, I hoe creeps from the shadows. \n" +
                "\tSasa, utatoa ngapi? \n" +
                "\tOnly cops and prostitutes get to ask that.  \n" +
                "\tShiiiet, vitu gani hii tena? \n" +
                "\tFuck off.\n" +
                "\n" +
                "\tI curse and climb the stairs to a thick warm temperature of Rhumba music, thick women and a thick smell of beer. I order one. Sweep my eyes across the room. On one corner, an overweight bald head has his stubby fingers up a twenty-something year-old's skirt.  Next table two heavy brown skins flank some guy who seemed to enjoy all the happiness I am looking for. One of the brownies has her jeans so low her butt crack glistens with a trillion stretch marks. In the small dance floor, empty brainless people sway to empty noise from the speakers. \n" +
                "\tBeer in hand, I join the emptiness on the dance floor. \n" +
                "\tEvery time I sway my waist close to a girl, she would take one look and move away. Were I sober, this would have fucked up my self-esteem but here I am, not giving a fuck. Because the only person I gave a genuine fuck about is gone. \n" +
                "\tClara, in case you really want to know, this is called rejection. It eats you from the inside, leaving wrinkles around your eyes.\n" +
                "\tFed up, the pub pukes me out to the cold Eldoret wind of 1.00 A.M. The same hoe is still posted there. Thighs so fine you wouldn't believe a thousand dicks have been through them. I feel an erection throbbing in my jeans. \n" +
                "\tCombine beer and loneliness, some reckless vulnerability is born. \n" +
                "\tSasa uliamuaje? She asks, wriggling like fat a worm towards me. \n" +
                "\tOne finje. \n" +
                "\tSawa.  \n" +
                "\tNa ya lojo? She asks, her hand rubbing the fly of my jeans.\n" +
                "\tIn case you don’t know, this how they trap you, these sex workers. Bargain pussy to 50 bob, they always get you by the lodging trick. All I need right now is a bang-bang-bang-and-release behind the alley between Ndupawa and Shah Hardware Store. \n" +
                "\tBut she insists we get a room. \n" +
                "\tMid-month is a recession for most prostitutes in Eldy. Kalenjin farmers have not made a kill yet from selling wheat to come and spoil these hoes. Some of these old rich farmers are famed to spend 50K a night on pussy. \n" +
                "\tBut mid-month, horny hustlers like me rule these streets. \n" +
                "\tI grab her hand. We walk towards the main stage and pass by street kids rubbing their palms next to a fire lit from cartons and dry garbage. I stoop down to light a cigarette and they are like, Mzee nipe puff hata mimi. I hand them the whole Dunhill pack and we walk on. \n" +
                "\tBehind Sam's Club, there's a shortcut to Merita Lodging where people got mugged a lot. We walk on. I feel like getting mugged this night. \n" +
                "\tSomebody snatch my heart out and throw it on the street. Let it be run over by a car in full speed. \n" +
                "\tClara, in case you’re wondering how I feel, I feel like a wall ready to be crushed by a wrecking ball. I feel like a mistake, that’s how I feel.\n" +
                "\tThe fat lady at the entrance of the brothel asks for 200 bob. I pay an extra 50 for the condoms. She has probably witnessed men walk in with the same prostitute ten times this night. But who is counting?\n" +
                "I slam the door shut and throw up the hoe's skirt. \n" +
                "\tEish, lipa kwanza. \n" +
                "\tI give her the crumbled 150. \n" +
                "Ripping the condom with my teeth, I roll it on and then I go wild. \n" +
                "\tI am plunging her up against the wall, lapping my tongue on neck and face and chest. Licking off cheap make-up. Hands groping. \n" +
                "\tI feel loved. \n" +
                "\tI don't even know what her name is. \n" +
                "\tBut I feel loved. \n" +
                "\tNobody ever really knows a prostitute’s name, but I feel loved. Clara thought I will never get pussy or love, she is wrong.\n" +
                "\tBut I am yelling out, Clara baby I'm sorry as I ram into the hoe’s moneymaker. \n" +
                "\tAnd she pulls me off saying, \n" +
                "\tEish, we unaniumiza!\n" +
                "\tSo we take to the rickety bed with a thinning mattress. My jeans down to my ankles, she pushes me down the small bed, gets on top of me and works me. \n" +
                "\tMy thing keeps slipping in and out of her hole but we keep going. I keep mumbling, Sorry Clara. And the hoe gets belligerent:\n" +
                "\tEish, wee wacha kelele! Hebu mwaga haraka! \n" +
                "\tIn case you’re wondering, she wants me to empty my frustrations quickly into the condom so she can get back to work.\n" +
                "\tSo in one loud cry I explode so hard the condom could have burst. But who cares. \n" +
                "\tThis is, you, Clara expunging out of my system. \n" +
                "\tThe only thing is, the condom actually bursts.\n" +
                "\tThere’s cum dripping down the girl’s inner thigh.\n" +
                "\tShe shrugs.\n" +
                "\tI shrug and I tell myself, There are worse things in this world than getting Aids or syphilis in a bug-infested brothel. Such things include heartbreak, loneliness and a girl named Clara.\n" +
                "\tThe prostitute pulls down her skirt and leaves me cursing, peeling off the condom laced in thick milky semen, picking up socks—whatever; just dressing up. \n" +
                "\tI walk out of Merita Lodging feeling sober. A little bit lighter on my feet like I just walked out of a yoga class. \n" +
                "\tI want a smoke. \n" +
                "\tI reach to my pockets. All of my jeans pockets. \n" +
                "\tNothing. \n" +
                "\tNo wallet. \n" +
                "\tNo phone.\n" +
                "\tOh, goddamn  that pickpocketing bitch.\t\n" +
                "\tI run back to the brothel. Asks the fat lady if she’s seen the direction the hoe went. \n" +
                "\tI don't know, she replies chewing gum. \n" +
                "\tI go back to the room, checks under the bed, pillow, anywhere. Nothing. \n" +
                "\tFuck, fuck! Fuuuck.\n" +
                "\tClara. \n" +
                "\tThat’s when the tears come. \n" +
                "\tI just put my face in my palms and my body starts convulsing. Young and lonely and looking for love in the wrong places. \n" +
                "\tMy body just shakes. \n" +
                "\tThis body that had cost me you. \n" +
                "\tI let it move. \n" +
                "\tThis body, this slave of desire.\n" +
                "\tI let it flood. \n" +
                "\tThis body, this weapon of torture.\n" +
                "\tI let it soak my T-shirt wet.\n" +
                "\tThis body, this insatiable bag of water and hormones. \n" +
                "\tYou can water it, feed it, massage it, soak it in a bathtub full of wine. You can clothe it in fine linen, sex it, tattoo it, give it the best weed, take it for a vacation. But it will fail you in the end. This body will catch a disease or age, rot and die. But before that it will create scars for your soul. Scars like Clara. \n" +
                "\tThis withering petal. \n" +
                "\tAnd I remember that night. \n" +
                "\tIn case you feel the same indifference, the streets just looked on, unmoved, as you Clara, slipped through my tear-soaked fingers. \n" +
                "\n");




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
                Intent intent = new Intent(YourPage.this, Contents.class);
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
