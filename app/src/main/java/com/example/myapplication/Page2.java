package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class Page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        Button previous = findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page2.this, YourPage.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Page 1",
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page2.this, Page3.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Page 3",
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView textView = (TextView) findViewById(R.id.text);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Let’s assume her name is Dee Dee. \n" +
                "And one coffee date from now, you will drop a tear every time you hear a love song. A one-night-stand from now, if you’re lucky, she may not even remember your name. A few months from now, dude—if you’re really lucky, you will be wishing you never met her, you will be wishing you were dead, rotting, six feet under.\n" +
                "Because—trust me—one day you will find that special chick who will make you laugh so hard, when she leaves you may never want to breathe again. So it’s fair to say we are constantly looking for something that will one day complete us, then finish us.\n" +
                "Our greatest adventure is finding death after we find love.\n" +
                "This may not make sense now, because, just like you, I haven’t met Dee Dee yet. Not at least in what you may call, intimate circumstances.\n" +
                "Dee Dee is not even her real name.\n" +
                "Maybe her parents named her Daisy Kwamboka, but she chose “Dee Dee” because it has two cool syllables; unlike, say, “D.K.”, which sounds like some disease men carry.\n" +
                "Dee Dee is like any other girl you have met so deeply in your life and from the first kiss you picture them in your house, pregnant with your first child, laying in your bed, looking fat and depressed, but in a sexy way.\n" +
                "From where you’re seated, if she turns the side of her face to look outside the window, you imagine her black eyeballs so dark they hold secrets hidden in the corners of her soul. Her face, you imagine, is so well-scrubbed you could see the pores breathing in her ebony skin. So far all you have is the back of her head. And you pray she takes out her small make-up mirror so you can catch the glimpse of her face in the reflection.\n" +
                "The misty windows of the matatu you’re in has other eleven passengers. There are other girls in this matatu riding from Odeon Cinema to Lavington, with the hem of their skirts a little over their knee-caps, and everybody is on their phone except you. Because she’s the one who has all your attention.\n" +
                "She’s in the seat right in front of you. \n" +
                "Something tells you, if you take her home, you’re sure your mother will like her. Sometimes you just know people by instinct.\n" +
                "You can tell a girl is beautiful from any angle you look. All good girls have woolly silky dark hair. Dee-Dee’s hair is just six shiny thick neat cornrows tied at the back of her head with a thin yellow wrist band. The tails of the twisted braids disappear down to her neck, like octopus tentacles, past what looks like a Chinese-lettered tattoo at the back of her left ear.\n" +
                "Something tells you, if you take her home, she will cook dinner and not eat until you come home from work.\n" +
                "Maybe not.\n" +
                "Maybe she has a tall handsome boyfriend, the type with cornrows and earrings and tattoos up to his neck, the type that won Mr. Campus in a modeling contest in some cool college in this city, like USIU. \n" +
                "Maybe she is single. \n" +
                "There’s the assumption that all pretty girls are already taken. And Dee-Dee, if she ever takes you, after your break-up, when her cute friends ask her if you two were actually dating, with a glass of some white wine in her hand, she will reduce your relationship to a:\n" +
                "“Yea, we fucked a coupla times, so what.”\n" +
                "Dee Dee looks like the kind of girl who thinks only about sex and tattoos. She doesn't worry about climate change, and the fact that rivers in Meru are drying up, and in Cape Town, people are fighting over water. It’s not like it’s her problem. It’s not like you’re being judgmental or anything.\n" +
                "Dee Dee doesn't care about the fact that three presidents in Africa have resigned this year alone. Or about another earthquake in Haiti. Or about the two men in Nyeri who molested a donkey to death, outside a church building. All these horrible headlines you see on the different daily newspapers. You’ve read so many newspaper headlines you have come to accept the conditioning reality that the world is inherently a horrible place. \n" +
                "Actually, it is.\n" +
                "As for Dee Dee, you bet she cares only about her German shepherd dog, her UK and Canadian friends from two vacations ago, and maybe when the iPhone X is coming out. You know, simple good things. \n" +
                "All pretty girls deserve simple cool things. Like blowing a half a mill a day on a house party. She has expensive taste, because her father is rich. This you can tell from her perfume. \n" +
                "Chanel Mademoiselle.\n" +
                "You bet, Dee Dee is a child of the millennium and all her WhatsApp friends don't type in Swahili or Sheng. She is what a newspaper cultural critic could call, the foster child of Afro-futurism. And when she goes up-country she has trouble wrapping her sophisticated tongue around mother-tongue syllables. But you would be surprised that she speaks French, Chinese and German fluently.\n" +
                "It’s not like you’re being judgmental or anything.\n" +
                "\t  In her bedroom, instead of teddy bears and posters of that local boy-band, Sauti Sol, you bet she has abstract paintings and sculptures you can only pick from K-1 flea market or any other art spot frequented by tourists in dark sunglasses. \n" +
                "If she, by some miracle in this matatu, turned round and you saw her face, you bet  her eyes are relaxed and kind, because all she has seen in life is beautiful hotels, and happy rich people, and islands and blue waters and rose gardens in her extensive backyard. You bet, by her smooth forehead and the tiny curves of her mouth when she smiles, she is the type to host reality TV talent shows. \n" +
                "Or if she’s an introvert, she’s the type to be in a baggy cotton sweater in her room writing code in Python. She’s not the type to waste time discussing other people’s money. Because she aspires to be on those Top 30 Under 30 Female African Entrepreneur magazines. You know, what those half-rich half-white American girls on that Love & Hiphop TV show call, A Boss Bitch. \n" +
                "\n" +
                "You temporarily come back to the present, check the buildings roll by outside the Matatu windows, check the phone in your hand if there are any notifications. You then reach your jeans pocket, fish out and unwrap some Fresh breath freshener pellets and pop them into your mouth. You don’t want your bad breath to make her switch seats or look back at you in disgust as your foul breath wafts through from the back of her head. You want to tap her shoulder and offer her some of the chewing gum but you bet, she’s into TicTac, not these street-hawked Juicy Fruit, PK types.\n" +
                "It’s not like you’re being judgmental or anything.\n" +
                "Something about Dee Dee’s hair is pulling you. So you put your right palm on the head-rest of the seat in front of you. When the vehicle hits on a speed bump, Dee Dee’s head taps on your fingers. This is the closest you will ever get to touch a dream, to touch her. You will forever cherish the scent of her hair spray.\n" +
                "Let's say at the end of this ride, when you both drop outside Lavington Mall, you will say hi, ask her if she has a minute to spare for coffee, someday, or...maybe this Saturday? \n" +
                "Because she’s a child raised on digital TV, high speed Wi-Fi, YouTube tutorials on how to bake a home-made chicken masala pizza, American feminist magazines and heavy metal rock songs, she will look you straight in your eyeballs and say, “Sure, an espresso will do.”\n" +
                "You will ask, You sure?\n" +
                "She’ll say, “Yep. Right now.” \n" +
                "Gesturing with her eyes and chin towards the mall because both her thumbs are working on her iPhone, she will say her dad brings her here sometime, when they’re not eating chu-toro, maguro and California rolls in a Tokyo Restaurant along Kolloh Road.\n" +
                "\n" +
                "As you pull a chair at Artcaffe, with a backdrop of soft Jazz music, you will study the menu like it’s written in Greek and you will say, This place, it is, uhm—it looks expensive.\n" +
                "And she will say, “Nothing is expensive if money can buy it.”\n" +
                "Looking at you straight in the eyeballs, she will say, “Nothing is expensive—you're just broke, dude.”\n" +
                "You will try to smile. An awkward, weak smile. Your palms are now wet as you mentally count the few notes in your wallet. The few digits in your M-Pesa account.\n" +
                "She will say, “Come on, order something. I will pay.”\n" +
                "Oh, sweet relief. \n" +
                "Over the coffee, she will tell you how her dad has an ashtray in the shower, in the car, almost everywhere in the house, and he’s dying of cancer but he can’t stop smoking.\n" +
                "Yes, you can sit with a stranger for five minutes and you will know their whole family's history. Some people have no family secrets to hide. Some people are just comfortable with the imperfections that come with family stuff. Being rich gives you that edge.\n" +
                "She will tell you how she and her mom don't get along because she's been in college for six years. She was to graduate two years ago. \n" +
                "“But this lecturer guy fucked my plans up.”\n" +
                "You won't ask how. Because you know a girl her type has no problem dating three boys in her class and two senior lecturers at the same time. \n" +
                "Again, it’s not like you’re being judgmental or anything.\n" +
                "She will ask you:\n" +
                "“How about you? Which college do you go to?”\n" +
                " \t   And you will tell her all you wanted was to be a grey haired scholar like Ali A. Mazrui or Ngugi wa Thiong’o or Wole Soyinka, but poverty and drugs fucked your plans up. \n" +
                "Let’s say after the espresso, you will exchange numbers. \n" +
                "And, let’s say you will call her after dinner but she won’t pick up. You will call again. She won’t pick up. You will call again and again. A girl like her deserves at least fifteen missed calls. And she won’t pick up. No matter how many women you have slept with in a week, it's the ones who don't pick your calls or reply to your texts that wreck your nerves, shrink your balls, making you feel this small. \n" +
                "Because it’s the birds that flew away we chase. It's the broken dreams we dream of, for a lifetime. No matter how successful we become, there’s always some failure tagging at us. And we try to run away from this by trying to achieve more. It’s like taking an overdose trying to cure an addiction.\n" +
                "So you will call again. And she won’t—\n" +
                "\t   Wait. No, let’s change the scenario. \n" +
                "Let’s say after the espresso, you will have the balls to take her home tonight. This she’ll oblige because from what you have heard, these bourgeois chicks always fantasize on banging some well-built rough dreadlocked weed puffing hood dude like yours truly. Also from what you have heard, these pretty chicks get lonely too because regular guys fear approaching them for fear that they are already taken or they’re too expensive or it’s just plain simple inferiority complex. \n" +
                "Let’s say the taxi will drop you both at your place. Inside the bedsitter, with an old carpet, a rusty gas cooker you never use, stacks of old newspapers, and more stacks of old newspapers, shirts on hooks and pretty much a bed with a thinning mattress, a dim energy-saver bulb hanging from the ceiling dotted with few dried up moths, she will take one sweeping look and with a long manicured finger on her nose, she will say,\n" +
                " “Dude, this place is too stuffy. Let's go to a hotel room.”\n" +
                "It’s not like she’s being judgmental or anything. This is a fact.\n" +
                "You then will call an Uber to some outlandish place like Osnet Boutique Hotel. At the entrance you will pass by a female security guard in blue uniform reading a newspaper, and she will smile at Dee Dee and you will be ignored.\n" +
                "\n" +
                "At the soft king size bed, you won't care how many guys Dee Dee has slept with, she's so pretty you will want to eat her out on the first date. You won't mind spiting hairs from your mouth after you suck her entire bushy crotch.\n" +
                "She will take offence. And she will defend herself saying, “Pubic hair shaving actually originated in ancient Egypt and Greece when prostitutes had to shave for hygienic reasons and their profession.”\n" +
                "Rubbing the length of her crotch, red fingernails just disappearing into the V of her legs, she will say, “In Islam shaving pubies is one of the Sunnahs of the fitrah, and pubies should not be left without shaving for more than forty days.”\n" +
                "Waving her bushy crotch close to your face she will say, “Now, dude, why can’t a woman simply own her body?”\n" +
                "She's the kind of girl who doesn't take criticism lightly. So Dee Dee will prop one leg on the toilet bowl and shave her pubies away and her armpits and the faint mustache all pretty girls always have, and dump the hairs in the hotel sink, and let’s say, the sink will block. \n" +
                "And because you think you love her—we all think we’re loved after having sex—you will poke the hairs with a toothpick until every strand of pubic hair drowns in the whirling water from the two taps of, let's say, the fourth floor of Osnet. Inspired, you might also shave the hairs around your own nipples, and pull out a few nose hairs.\n" +
                "After another nice clean hairless fuck as you lay smoking, she may want to borrow your phone and swipe photos of you smiling alone. Because you have no one, most photos are just you goofing at the camera. And every photo has this big creepy smile. She will tell you that people who smile in every photo know that they're super ugly. \n" +
                "“Even if you're ugly,” Swiping another photo, she will say, “you can always be used to make someone's ex jealous.”\n" +
                "Giggling, she will say, “Dude, relax. It’s not like I’m being judgmental or anything.”\n" +
                "\n" +
                "The morning after the one-night-stand, a white towel up to her breasts, dubbing the corner of her mouth with lip gloss in the mirror, she will tell you how she can't keep up with her parents' expectations. She wants to move out, start life, get some guy with money and start life, basically.\n" +
                "“You know what I mean? But I'm scared of losing the spoils of my parents. Like I know they won't let me take the car. The car mom bought me for my birthday. And every day she has to remind me how lucky I am. How she never had shit growing up. Ugh, it’s so exhausting.”\n" +
                "That theory about how most parents put up with their children? You will learn from Dee Dee that it works both ways. Children too can put up with their parents because of the simple fact that they’re rich.\n" +
                "She will say, “You to sit through every dinner the impossible crap parents feed you. Like forgive your enemies. Save money. Work hard. Be a good girl. Don’t hold a grudge. Don’t discriminate. Be honest. Don’t drink or smoke. Use a condom. In other words, they’re telling you to live a completely boring, unadventurous life. Life without risk.”\n" +
                "Seeing you say nothing because you are bending over making the hotel bed, putting pillows in place, Dee Dee will come over, spank you and say, “Gosh, all this is a man's ass?”\n" +
                " With a husky voice, she’ll whisper to your ear, “Tell me, dude, have you ever had a tongue deep in your—”\n" +
                "\n" +
                "This reverie of an impossible romance with a strange girl in a matatu cruising in this city of horrible, exaggerated newspaper headlines is interrupted by the tout tapping the door of the matatu signaling the driver to pull over. This is Lavington Mall. \n" +
                "And it is Dee Dee alighting. \n" +
                "And you wait for your moment. \n" +
                "Just to see her face. \n" +
                "Maybe to say hi.\n" +
                "Maybe to ask for her number.\n" +
                "And the tout is saying to Dee Dee, “Maze, Shiro leo ni za wapi, kwani ulihama Ongwaro?”\n" +
                "\t   Her name is Shiro  and the tout is asking where she’s going. She’s from Kawangware. She’s a nanny reporting for work at Lavington.\n" +
                "\t   Oh yea. Kawangware. That slum.\n" +
                "And Shiro, as you stare in disbelief, she smiles. There’s an upper missing tooth, and the rest of the teeth are—not to be judgmental or anything—just yellowish. She replies with a rough ghetto accent, “Zii maze naeda job. Nakwaga mbochi kwa sonko frani hapa Ravi.”\n" +
                "\t\n" +
                "Remember when you finish reading one of those brilliant how-to-get-rich books and then you’re so inspired but then you realize you will never ever be a Jeff Bezos or a Chris Kirubi? That’s how disappointed I am.\n" +
                "So you’re watching as Shiro fist-pumps with the tout and you notice she has a scar just over her left eye-lid and it looks smaller than her right eye, giving her an almost Forest Whittaker squint. All the perfect features you had imagined fade away. The hair, you notice, is just an extension of dead horse hair sewn into her natural hair.\n" +
                "         It’s not like you’re being judgmental or anything.\n" +
                "And you watch her disappear into the bright night and she never turns to look back. The six thick cornrows under the street light, fading off like a dream. \n" +
                "\tAnd you’re left stranded at the crossroads of your imagination and reality. Caught between Dee Dee, a rare bourgeois cool chick from the Nairobi suburbs and Shiro, the baby-sitter from Kawangware slums. \n" +
                "\tIt’s that old saying about imagination being better than reality.\n" +
                "\n" +
                " \tAs the city stretches before you, with tail lights of cars and streetlights simmering like a thousand embers, you wonder if every girl you have ever met in your life as a newspaper vendor was a figment of your imagination. You wonder if you being single has anything to do with your expectations on what a perfect girl should look and be like.\n" +
                "      And it’s not like you’re being judgmental anything.\n");


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
                Intent intent = new Intent(Page2.this, Contents.class);
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
