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

public class Redemption extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redemption);

        Button previous = findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Redemption.this, Wake.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Page 5",
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Redemption.this, Last.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Page 7",
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView textView = (TextView) findViewById(R.id.text);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Warning: against the advice of one book reviewer and critic, there will be digressions in this story. Because of that old philosophy that says the memories we have about people are interwoven with the places we met them, I couldn’t help it.\n" +
                "\tAnd it’s also true that your tongue, having tasted the good life, no longer wants to acquaint itself with that ghetto jive. Truth is, even then, as a pimpled teenage piece of shit in the ghetto coming to terms with class stratification, you never really felt you belonged. You know, the way one can sit in a crowded club with loud music and still feel lonely. \n" +
                "\tI know, I know. \n" +
                "\tBoys you left behind when you moved to the suburbs will sneer and spit some hood philosophy like how you can’t take the ghetto out of a nigga. \n" +
                "\tOr something like now that you have some money, you will front like you never lived in the slums. And you will say, Yeah, I’m a butterfly and I’ve never been a caterpillar. But this story is not about the broke who rob the broke and call themselves victims of the system. \n" +
                "\tIn every dreamer who makes it, a thousand are left behind. So goes the Kenyan dream.\n" +
                "\tSo this story is about a girl who gave you gonorrhea—now dead—called Chebet.\n" +
                "\tChebet was your high school teacher.  \n" +
                "\tFormally, Madam Chebet. To the boys in our school, Miss Che-butt. Because of her bubble butt and short skirts.\n" +
                "\n" +
                "\tBut first, let me tell you about Langa. The ghetto: the dumpsite of urban dreaming. The place where the 2007 political massacre started. \n" +
                "\tWhat I didn’t like about the ghetto was the polythene paper garbage that clogged the sewers when it rained. No matter how many times the city council sent over their caterpillars to level out the space each election year, there was about four feet layer of polythene in the ground. Each week there were dark clouds of smoke of trash being burnt elsewhere, but there was always heaps of polythene littering the streets. There was just way too much pollution. Too much polythene sometimes you suffocate in your dreams. \n" +
                "Way too many people living savagely. \n" +
                "\tThen there are the numerous children that run the streets born by single moms whose beds seemed to warm bodies of different men.  Wild oats like yourself. Even that shouldn’t be part of your past. In your past, you have a normal family. Middle class daddy who spoils you with things.\n" +
                "        Langa, like any other ghetto, had numerous school dropouts who smoked weed, listened to Pac and Ice Cube; dressed like American rappers: recycled jeans, sketched raw tattoos using barbed wire, and hated the police. Some actually pursued rap and out of the bunch, none of them made it. No mainstream radio could play that ghetto shit. That, despite the numerous radio and TV stations mushrooming every year. Some got far as getting some TV interviews but still came back to the slums broke.\n" +
                " \tHalf of them were gunned down by the same  police they hated while the other half knocked up some girl, got married, and that was the end. \n" +
                "\tThey say when everything else fails, marry. Marriage has so many losers you wouldn’t believe:\n" +
                "\tLoser parents raising loser kids.\n" +
                "\tLoser kids befriending other loser kids.\n" +
                "\tLoser kids growing to loser adults.\n" +
                "\tLoser adults voting. \n" +
                "\tThe cycle continues from one ghetto block to the next.\n" +
                " \t\n" +
                "\tYou learned to smoke weed the day Peace’s little brother was gunned down for a suspected robbery. You sucked on that reefer so hard your lungs felt like a ground for a rocket launch. Then the tip of your soul turned into a muzzle of a gun and you wanted to storm every police station and put seventeen bullets into a body to mourn the seventeen years a bullet's cop just wasted. \n" +
                "\tSuch was the life. You actually enjoyed it because it never got to you. You know, getting sucked into the whole system of drugs, reckless sex, jail or whining about politicians or dressing like a freaking reject. It never got to you. All that hardcore slang talk and tough attitude never got to you. You hated it. \n" +
                "\tBecause you were aware of your environment and saw it as a transition; not a predestination. \n" +
                "\tBut you had a wild side too because sex in the slums is cheap. And the girls had consumed too much chips mwitu and Coca-Cola; they had chubby bottoms cushioned with cellulite, and those bottoms seemed to defy gravity. On Sundays and school holidays, hell, the ghetto queens dressed to impress. And you devoured your youth doing things to those chubby bottoms. All those different types of booties: Kikuyus, Luos, Kalenjins, Kisiis, Luhyas, all of them. Brown, black, yellow-yellows, you banged anything that had a vagina. Because sex is the greatest entertainment known to man. Especially a man who has nothing to lose.\n" +
                "\tTo date, you swear Kikuyu booty is the best. All that cabbage-githeri-mokimo-viazi diet did something to their bodies.\n" +
                "\tLike there was this Njeri chick you dated for a week. She had just landed from shagz and she was attention-thirsty; with terrible Sheng accent (trying too hard to be an urban chick). Every time you penetrated her, you felt different. Different because her tribe controls everything in the country and so it felt like some conquest—until she started asking for money. Then you ditched her.\n" +
                "\n" +
                "\tLet me now tell you about Madam Chebet. \n" +
                "\n" +
                "\tBefore she died, I was among the people surrounding her death-bed. Hospital beds are shallow graves in waiting. \n" +
                "First time I saw somebody close their eyes, take a deep breath and die. To date, that shit gives me nightmares.\n" +
                "\tEven in her death, Chebet was an angel. The finest Kalenjin features you will ever get. My obsession with girls with dark skin grew from her. \n" +
                "\tHow do you describe a dead beautiful girl? \n" +
                "\tYou don't. \n" +
                "\tIt's creepy. \n" +
                "\tIt’s disrespectful to the dead. \n" +
                "\tBut let me tell you how flawless her skin was: if you have seen rain fall on glass, then you catch the drift.\n" +
                " \n" +
                "\tChebet died from stab wounds to her abdomen. The guy who stabbed her was her college boyfriend. They were to wed a week later. The guy was stoned to death on the spot by onlookers somewhere in Maili Nne. It didn’t matter whether his father was some tycoon in the ghetto. Every ghetto has some millionaire. Ghetto was still ghetto. In the ghetto, justice is meted out in equal measure without delay. But the ghetto dwellers instead of complaining, couldn’t match straight to State House and face those fat bastards they elected and show them the finger. \n" +
                "\tGeorge Carlin said when poor people riot about bad economy, they never attack the bourgeoisie; they attack the proletariat.\n" +
                "\tIn the ghetto, I can tell you how the poorest of the poor live. An African ghetto is not like the housing projects in the First World countries where Blacks and Haitians and Dominicans and Mexicans live. \n" +
                "\tA ghetto in Kenya is a fucking scum. \n" +
                "\tA snot in God’s big nose.\n" +
                "\tYou wonder how niggas breathe through that shit.\n" +
                " \n" +
                "\tIn the ghetto, I can tell you what you already know. \n" +
                "\tLike how you would survive on 20 shillings a day. \n" +
                "\tOr how you heard a neighbour’s house get broken into and you’re too chicken scared you can’t even breathe right. Even as a sworn atheist—who had read too many books for his own good—you mumbled a prayer to Whoever. And the neighbour who does night shifts as a waitress in a bar in town screams your name at six in the morning saying you must have been involved in the robbery. That's how easy it is to sleep in a police cell. It takes the landlady to intervene. Saying she knows you. You’ve been a good boy since you became a tenant. Partly she is saying this tongue-in-cheek because she knows you’re sleeping with her daughter who’s barely fourteen. That’s another thing about the ghetto. \n" +
                "\tPussy is pussy. Just like weed. \n" +
                "\tSo it is normal to see fifteen year-olds with babies on their back as they wash another woman’s bra to get milk for the baby.\n" +
                "\n" +
                "\tI want to tell you why Chebet died. \n" +
                "\n" +
                "\tWhy she died is more important than why she would fall in love with a student—eleven years her junior. Why she kissed you in the staffroom one evening. Everybody wanted to lay Madam Chebet. The pot-bellied principal, the chain-smoking gateman, the bursar who stole bursary meant for orphaned students, male teachers otherwise known as Team Mafisi, the ever-in-the principal's office school chairman, all wanted to bang Madam Jebet. \n" +
                "\tNot that she was loose or anything. \n" +
                "\tOr exuded slut vibes or anything. \n" +
                "\tShe was just irresistibly voluptuous. \n" +
                "\tGraduated from Maseno, she was your Form Three Swahili teacher. Of course her fake Coast Swahili accent drove you nuts.\n" +
                "\tAll young teachers dress alike: \n" +
                "\tJeans, T-shirt. \n" +
                "\tJeans, hoodie. \n" +
                "\tSkinny jeans, sneakers. \n" +
                "\tNo suit, no tie. \n" +
                "\tLanguage: sheng.\n" +
                "\tThat fucking ridiculous Mohawk hairstyle.  Some want to compete with students, some refused to grow up. Some compete with each other. Some simply couldn’t shake off their campus mentality. Some obviously chose the wrong career. A ripple effect of the system where degrees in sciences and economics have no job market. So some graduate is better off earning a quarter of his value trying to teach.  \n" +
                "\tChebet was no exception. Low cut blouses with long tight skirts with long slits at the back. When she stretches to write the lesson’s heading at the chalkboard, you imaged her bending over. At night when all other boys in the dorm had presumably gone to sleep, you would slide a hand in your shorts and let Madam Chebet’s image invade your mind.\n" +
                "\tAnother thing you learnt is, male teachers want to have sex with their students all the time: \n" +
                "\tThe head girls. \n" +
                "\tThe fat girls in class. \n" +
                "\tThe cute ones with too much lip bum. \n" +
                "\tThe ones who dashed to the dorm during lunch to spray extra colognes under their armpits. \n" +
                "\tThe ones who sit badly in class. Any teacher loves to see some brown thigh. \n" +
                "\tThe ones with rich parents. \n" +
                "\tThe ones who take compositions for marking all the time. \n" +
                "\tThe little seductive devils: you know, the ones who rub tits on that new hot English teacher when he’s marking books. \n" +
                "\tThe ones who bend cleaning the principal’s office. \n" +
                "\tThe ones who borrow teacher’s phone to call whoever at home.\n" +
                "\tIt is easier to bang any adolescent as their teacher. You’ve power over them. \n" +
                "\tThe problem is a boy bent on banging his teacher. It is rare. It is risky. It can get you suspension or it could get you blacklisted by male teachers who are eyeing the same bird. So many unmarried male teachers hovered around your school. Some banged everything from the matron, the cooks, the hypersexual spoilt brats in Form One West, and the secretary. Not that your school was a sinner's den. No, all this took place discreetly and you only caught wind of it when boys were gossiping late at night.\n" +
                " \n" +
                "\tSo, you a fifteen year-old pimpled prick with a deep voice, how do you bang teacher Chebet? \n" +
                "\tDo you slide a note in your Insha book? \n" +
                "\tOr do you stalk her home during the holidays and rape her? \n" +
                "\tDo you start doing favors like cleaning the board when it’s Kiswahili lesson or do you raise your hand every time she asks a question in class? \n" +
                "\tDo you get As in her subject or do you start imitating her fake accent to draw her attention?\n" +
                "\tNo. You approach her and tell her you have been wanking off for months and you want to fuck her:\n" +
                "\tMadam, my left hand is growing blisters, I want the real thing now. Your warm, moist, mature thing. \n" +
                "\tOf course, that is a dumb move. \n" +
                "\n" +
                "\tBecause the ghetto makes you smart, you already know this. \n" +
                "\tBeing dumb in the ghetto can get you killed. You have to be smart. \n" +
                "\tIt makes you figure out how to argue your way through if a cop on patrol snaps cuffs on you because you’re roaming the streets past 11 a.m., smoking weed and you have no I.D. \n" +
                "\tYou learn how to survive a whole year without a job. Makes you learn tolerance. Like that Luo neighbour who plays Ohangla full volume in the middle of the fucking night when he’s not beating or banging his depressed wife. And they share the same bedsitter with three kids and another quiet girl his in-law just brought in. \n" +
                "      You learn how to squat well in an overflowing latrine and take your dump without getting more shit slapped back to your ass-cheeks and shirt.\n" +
                "       You learn how to survive on supu-mandazi every day. Still hit the gym and walk around with a TapOut vest, veins on your shoulders looking like a rock. \n" +
                "       How not to break into a door and walk away with a glass table and hawk it for rent. \n" +
                "       How to create rapport with your local shopkeeper so you can take milk and bread and eggs on credit; especially when your girl comes over. \n" +
                "      How to move at night when the landlord is asleep, gone with three months' rent and all the debts you owe neighbours and friends. Including the generous Maragoli shopkeeper. \n" +
                "      \tMost of all, you learn how to get pussy without a sweat.\n" +
                "\n" +
                "\tWhen Chebet died, I swear I didn’t weep. \n" +
                "\n" +
                "\tBecause the ghetto pacifies you on most things. \n" +
                "\tBecause you can wake up to a twisted neck naked corpse on your way to mjengo. Cops don’t bother to pick the body on time and flies and dogs and pigs are already biting off some ass. \n" +
                "\tYou could see a Facebook post saying RIP Njenga. And you just shared a bottle of Kenya King at the pub last night with Njenga. Njenga with his funny mouth.\n" +
                "\tYou could wake up to an underwear in the gutter because a woman was raped last night. And when your stepmother died you didn’t attend the funeral. Because I have no fucking bus fare! You yelled to the phone when they asked when you attending the funeral. \n" +
                "\tYou have seen grime. \n" +
                "\tRiots. \n" +
                "\tDespair. \n" +
                "\tSuicide, because somebody got fired from an Asian hardware store. His job was offloading cement from cargo trucks. The heaving of cement and iron rods had curved his shoulders out of wood; he could have tried boxing or night club security but the nigger just drank rat poison and died. \n" +
                "\tA pussy, by the ghetto definition. \n" +
                "\n" +
                "\tOne evening stroll, as you munch a cob of roast maize, you come across a group of people gathered at the trench. There are dogs in the trench, growling like they’re fighting over a bone or something. Or maybe they’re mating. Humans love to watch sex. What are the dogs doing? Fucking? You ask an onlooker in jest. \n" +
                "No, they’re eating a fetus. You think he’s joking. So you take a look. That scene makes you nauseous for a few hours.\n" +
                "\tSo one death out of millions doesn’t fester you—to say the least. \n" +
                "\n" +
                "\tOne would say you never loved Chebet. But they don’t know.\n" +
                "\n" +
                "\tThey don’t know that to get Chebet you did things. \n" +
                "\tLike attempted rape. \n" +
                "\tNot exactly. \n" +
                "\tBut you planned it: wrote it, directed it and produced it, like all Tyler Perry movies. \n" +
                "\tYou planned it with Joe and Mato. The two weed peddlers who hawked groundnuts for a living as a cover-up. But it was Mato’s idea. That when she was leaving during the April holidays, they would ambush her. Just scare the shit out of her. And you would come just in time to save her from these wolves. And the two, in their hoodies, would run. And you would 'run after them'. And you would come back like TV a hero, out of breath and say, Pole Madam. I can't believe those thugs!\n" +
                "\tAnd she was so shaken she begged you to take her home. And you did. But you said take care, Madam. These streets ain’t safe.\n" +
                "\n" +
                "\tAnd then the second week you pump into her in town. She now calls you by name. And she said I hope those bastards get arrested. And you ask her if she reported the thing to the police. \n" +
                "\tShe said, There was no need. \n" +
                "\tBesides, they just scared me, those silly boys. \n" +
                "\tAnd she asked what you were doing for the holidays. Whether you attended private tuition. \n" +
                "\tYou said No. Just watching movies. \n" +
                "\tDo you live with your parents? \n" +
                "\tNo. \n" +
                "\tKwani wako wapi? \n" +
                "\tYou didn’t answer that. \n" +
                "\tAnd you’re still looking for a hint—any hint—that she feels you but she maintains a straight face. \n" +
                "\n" +
                "\tBut let me tell you what happened after the week I pumped into her in town. She just gave me her number. Just in case those bastards attack me again, she winked. That was it. As a joke. Then I simply texted Nyt that night. U2, she replied. I didn’t know teachers texted like that too. I mean, she was a language teacher, damn it. \n" +
                "\tAnd she was 26. \n" +
                "\tAnd I was 15. \n" +
                "\tAs if that mattered.\n" +
                "\n" +
                "\tSunday, she asked you to accompany her to church. You did. Nobody home, can we go for lunch? You. Did. \n" +
                "\tTwenty minutes’ drive from town, their estate sat in the leafy Kapsoya suburbs. A place heavily shared with middle-class Sudanese who had escaped war in their country and UNHCR wired hundreds of thousands a month into their accounts. \n" +
                "\tA really nice house, two cars in the garage. \n" +
                "\tA dog. \n" +
                "\tDogs. \n" +
                "\tA cat. \n" +
                "\tA garden. \n" +
                "\tA manicured boulevard. \n" +
                "\tThings. \n" +
                "\tSeen through the eyes of poverty, this was LIFE. \n" +
                "\tShe served well-seasoned chicken with a dozen other dishes. You were too nervous to eat. Sipped juice. Then she dropped you in town with her mom’s car. \n" +
                "\tThat night you slept with a big-ass smile on your face.\n" +
                "\n" +
                "\tWhen Chebet died, I didn’t sleep.\n" +
                "\n" +
                "\tBecause she was nice to me. \n" +
                "\tShe bought me things. \n" +
                "\tClothes. \n" +
                "\tSneaked me to clubs. \n" +
                "\tWe had struck a deal with the night watchman. On Fridays I didn’t sleep in school. It was I and she grinding waists in slow motion to disco lights. Cuddling and sexing Madam Chebet until five in the morning. \n" +
                "\tShe was truthful to me. She told me about Japheth. A Kisii former college mate who wanted to marry her. He was 35, tall, managing his father’s business. \n" +
                "\tYou see that hotel in Maranda Building? \n" +
                "\tYes. \n" +
                "\tThat’s their family property. \n" +
                "\tJust some pillow talk.\n" +
                "\tAnd those three matatus with TV screens operating from Town to Maili Nne? \n" +
                "\tMh.\n" +
                "\tThat too. \n" +
                "\tSo are you going to marry him?\n" +
                "\tNo.\n" +
                "\tWhy?\n" +
                "\tYou’re too young to understand.\n" +
                "\n" +
                "\tChebet always treated me like that. Just some fuck boy. Just because she was my teacher. But I made her scream when we were doing it. \n" +
                "\tAnd one day she told me to pull her hair. That was crazy because I did it and I felt really in charge. \n" +
                "\tAnd some morning she would put my thing in her mouth. \n" +
                "\tAnd after that she wanted me to put my mouth on her other bushy mouth. Her other bushy mouth, it tasted salty and smelled like an armpit. So I rushed to the bathroom and vomited.\n" +
                "\tAnd that’s how I started sneaking my phone to school. Downloading some porn MP4s. Learning exotic ways of pleasuring her. She would send some outlandish texts. \n" +
                "\tAnd then I started cutting eye contact in class whenever she was teaching. Whenever I saw her talking to any of those hippy male teachers I would skip lunch. Loss of appetite. \n" +
                "\tNobody should even smile at Madam Chebet. \n" +
                "\tShe was mine.\n" +
                "\n" +
                "\tWhen Chebet died, the ghetto changed colour. \n" +
                "\n" +
                "\tBecause it was she who took you out of the ghetto. \n" +
                "\tBut not before she gave you gonorrhea. \n" +
                "\tYou just found yourself peeling an egg-yolk yellow scab from the tip of your penis one morning in the school latrine. There was puss in your urine. Urinating was like shooting a thousand needles out of your spine. You just slid an agitated note in your Swahili exercise book. \n" +
                "\tLater in the evening she sent for you in the staffroom. All teachers had left. \n" +
                "\tShe just grabbed the collars of your school shirt and started kissing you. Saying, Sorry, sorry, I’m so-so sorry or some shit like that. \n" +
                "\tYou signed in sick to the dormitory master the following day and saw some doctor in some clinic in town and you were mad as hell because this fucking teacher was cheating on you or she had caught the crap from that Japheth motherfucker which means he was also cheating on her or whatever the fuck you just wanted to smash things.\n" +
                "\n" +
                "\tTo make it up, she took me to stay in their place. Her dad was a divorced man. She was an only child. Her dad was to fly to wherever. Dubai or something. Such a wealthy good man with only one kid—a girl—and had refused to remarry.\n" +
                "\tIn the ghetto—you get the picture by now. \n" +
                "\tYou must also get it when I say I quit school.\n" +
                "\n" +
                "\tChebet wanted me around all the time. Chebet loved sex. I loved sex. I sexed so hard my buttocks disappeared. \n" +
                "\tPleasure also leaves a scar.\n" +
                "\tI sexed so hard I lost appetite for sex. \n" +
                "\tBut Chebet's cheekbones glowed tenderly. The ass had grown into a bouncy giant bulb onion. \n" +
                "\tChebet quit teaching.  Either out of guilt of conscience or love or boredom. She just resigned. \n" +
                "\tIt didn’t matter to me. \n" +
                "\tThey already had too much money. With the frequent teachers’ strike, you wonder what a rich girl like that would take teaching for off all jobs. We just lazy-boned around eating her father’s money and living large for months. \n" +
                "\n" +
                "\tIf you’re getting bored, this is how this story should end:\n" +
                "\tChebet got back to Japheth.\n" +
                "\tYou went back to the ghetto. \n" +
                "\tHang around a few weeks, got fed up with the bleakness.\n" +
                "\tYou got a few hooligans you was acquainted with. \n" +
                "\tThey robbed Chebet’s home, leaving her unconscious.\n" +
                "\tYou split the loot.\n" +
                "\tYou opened a boutique shop and a music studio. Made money from the ambitious clueless rappers.\n" +
                "\tYou made a ton of money. Saved, doubled your businesses.\n" +
                "\tWithin two years you bought land at Raceourse. \n" +
                "\tWas on your way to buy a house.\n" +
                "\tOne day Chebet came to your studio.\n" +
                "\tSaid she missed you.\n" +
                "\tYou went home.\n" +
                "\tYou had awkward sex—that boring nostalgic sex exes normally have.\n" +
                "\tShe said they were planning a wedding with Japheth.\n" +
                "\tAnd that will you please come?\n" +
                "\tOn 12th November 2006, you were called by a friend that Chebet was in Moi Referral Hospital.\n" +
                "\tYou rushed there.\n" +
                "\tThe doctor said she had lost a lot of blood.\n" +
                "\tAnd she didn’t make it.\n" +
                "\tAnd that she was pregnant.\n" +
                "\n" +
                "\tThe end.\n" +
                "\t\n" +
                "\tBut you know, even at 43, even after trying to run for an MCA seat for Racecourse and failed terribly, you look out of the balcony to the view of palm trees and your children playing in the backyard, you know if it wasn't for Chebet's redemption of you from the slums, your life could have taken any direction but this. So you raise a glass of Remy Martin to the sky: \n" +
                "\tMay her sweet ass rest in eternal peace.\n");
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