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

public class Wake extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wake);

        Button previous = findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Wake.this, Prayer.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Page 4",
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Wake.this, Redemption.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Page 6",
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView textView = (TextView) findViewById(R.id.text);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Stuck in traffic, you just bought an Audi Q7, your first car, and you are driving along Moi Avenue with a dead body in the trunk. \n" +
                "\tAs you drum your fingers on the steering wheel, gnashing your jaws at this goddamn traffic, this is what the little voice in your head is saying:\n" +
                "\tYou are fucked. \n" +
                "\tThere is no divine purpose.\n" +
                "\tYou are not important.\n" +
                "\tYour Dad lied.\n" +
                "\tThe future doesn’t exist.\n" +
                "\tYou are gradual decaying matter.\n" +
                "\tAt the rearview, a police car is three cars away from you in the 5 p.m. traffic. In such times, the police are your worst enemy—by instinct—even though you know you didn’t kill the girl. Well, at least technically speaking. But if you get caught, this is what is going to happen.\n" +
                "\tThey are going to shove you into a dark interrogation room with a very low ceiling, a single yellow bulb hanging from it like an old testicle. \n" +
                "\tYour hands will be cuffed to the back of a shiny old chair and the questions will be coming from the other dark side where you can’t see the faces. \n" +
                "\tOutside the blocks of Central Police Station, cars will whizz by—the little blood cells in these urban arteries. In short, life will go on no matter what side of the street you are on.\n" +
                "\tLest you forget, this is your first real crime. And you have never been to jail. The possibility of self-incrimination is high.\n" +
                "\tYou glance at the rearview again. \n" +
                "\n" +
                "\tThis time, there is no police car or traffic but you in First Avenue Eastleigh talking to a Somali jeweler in a street named Al Bushra. You have 500 grams of nuggets you smuggled in through Lokichoggio airstrip from South Sudan. Each gram goes for 3, 800 shillings. \n" +
                "\tIn Al Bushra, no business is illegal. Here, you can buy and sell dollars, Euro and Yen, fake gold, antique jewelry, khat, right there in the street without police interference. \n" +
                "Here, women in bui-bui will be signaling the traders in case of suspected intrusion. \n" +
                "\tHere, Somali refugees have turned this street into Wall Street: banks mushrooming up, trading space the size of a coffee table goes for 50, 000; an acre is 20-50 million bob. \n" +
                "\tThe beauty of welcoming refugees into any country: labour and enterprise. \n" +
                "\tSo you trade your nuggets and walk away. This is not a crime, if you have not killed anyone to make money. In the making of profit, it is only a crime when you get caught and the law is twisted to make your choices look bad.\n" +
                "\tYou glance at the rearview again. No sign of this traffic loosening up. The voice in your head says:\n" +
                "Time is your greatest enemy.\n" +
                "\tAnother glance at the rearview mirror.\n" +
                "\n" +
                "\tAnd you are looking back at the earliest 15 years of your life. Life back home wasn’t a bed of rosebuds. Daddy had three wives. The third wife—no older than your eldest brother—was barren. Daddy loathed her; she found solace in humping your eldest brother. \n" +
                "\tDaddy is the reason why none of your sisters made it past class six. \n" +
                "\tDaddy, a hardcore misogynist. \n" +
                "\tSo your sisters had to get pregnant real quick and get husbands real quick. \n" +
                "\tLife has to be lived in the least painful way possible. \n" +
                "\tDaddy said out of his thirteen children, you are the only son who made him proud. Daddy kept calling the rest of your five brothers idiots but he paid school fees for them anyway. For you, he said, the day you were born, there was a cluster of fireflies at the corner of the hut. That meant the ancestors had chosen you. That traditional yada yada. That meant you were going to be somebody important in this country. \n" +
                "\tA politician maybe?\n" +
                "\tTo some parents, that is how important people are defined.\n" +
                "\tThe voice in your head says:\n" +
                "\tMaturity is when you discover how unimportant you are.\n" +
                "\tThe green digital display on the dashboard reads: 5.17 PM. \n" +
                "\n" +
                "\tThe cars in front start moving. \n" +
                "Two wheel spins at a time. \n" +
                "\tThen a halt. \n" +
                "\tMove. \n" +
                "\tHalt. \n" +
                "\tYou have to keep on tapping your right foot on the brake pad like a drummer or risk slamming into somebody’s tail light. The rearview shows the cop car trying to swerve to the second lane, and then it wheels back to your lane again. In a traffic jam, all cars are born equal. \n" +
                "\n" +
                "\tIn the rearview mirror, your eyes meet your eyes. \n" +
                "\n" +
                "\tThe eyes show no sign of anxiety. The thick eye lids the girl in the trunk loved to stare into speak of nothing but calm. If one looked closely, they would say at least you are not ugly. They would say your trimmed sideburns and faint moustache read like the diary of a very neat man. They would say by your pouting lips—in their pseudo psychoanalysis—that you must be bisexual. If they smelt the new leather linings on the seats of your new Audi, they would say your type lives somewhere in Muthaiga suburbs and don’t marry until in their early forties. They would say you are in your late-twenties, well-educated and probably worked as a junior manager in any of the top corporates in the CBD. They would say this because on your wrist there’s a 60K shillings watch. \n" +
                "\tThey would say, you don’t talk much; that that’s the quality of intelligence. \n" +
                "\tBut what would you say? The little voice in your head has a habit for rhetorical questions. \n" +
                "\tYou never know who you truly are. \n" +
                "\tYour cells degenerate every year. \n" +
                "\tYou are just a body with a name. \n" +
                "\tYou are a slave to an identity you have forged. \n" +
                "\tOnly dead men can tell who they truly are: a sum of the mistakes they made while alive. \n" +
                "\tAnd right now, you have one pretty and dead mistake in the booth of your white luxury automobile. \n" +
                "\tShe—the car—cost you 7.8 million. That money could save the lives of a whole village anywhere in this country. But you are a boy who ran away from the village and fell in love with the city. The city taught you how turn smoke into fire. \n" +
                "5.19 P.M. The LCD display on your dashboard reads. \n" +
                "\n" +
                "\tIn some rearview mirrors, objects are further than they appear. Events that happened four hours ago are closer than they appear. \n" +
                "\n" +
                "\tWamboi is her name. \n" +
                "\tWamboi was her name.\n" +
                "\t“My friends call me Wambo.” She said. \n" +
                "\tThat was on a Tuesday. She in a velvet dress that boldly spelt every word her body language could speak. \n" +
                "\tShe smelled like morning coffee in a cold day. \n" +
                "\tShe was the type of woman you would miss the way you would miss your bed: strictly out of convenience.\n" +
                "\tThere are women who do sex for money to support their habits like expensive shoes, and there are those who do it for self-sustenance. Wambo had an expensive habit: Opulex. That was the new Ecstasy for Kenyan college girls. It was a pink pill that looked like a Vitamin C tablet. Highly addictive and girls loved it for the same reason men love anal. Lex—as it was christened—went for two thousand-five hundred bob per pill. Wambo said she needed five to seven of this a day. You didn’t ask who was supplying them.\n" +
                "\tThe first night she came over for sex, you just stood there looking at each other for fifteen minutes. \n" +
                "\tShe tried to kiss you, you turned your neck. \n" +
                "\tYou just wanted to stare at her. \n" +
                "\tWith every stare your penis stretched an inch longer. What followed was casual making out. \n" +
                "\tShe said the pill slows down the lubrication of vaginal walls. \n" +
                "\tShe said, “So nothing has to be rushed.”\n" +
                "\tShe said, “It’s like cooing a baby to sleep,” \n" +
                "\tSo the rocking of bodies was slow, interrupted by occasional meeting of hot mouths and warm, wet tongues.\n" +
                "\t The rocking was slow and she said, “If I tap your back twice it means ride faster. One tap means slow down.” \n" +
                "\tLike teaching a boy how to ride a bike. \n" +
                "\tNo matter how many Kama-sutra books you’ve read, the art of sex is inexhaustible. The only sad thing is, after an orgasm, nothing matters.\n" +
                "\t“This way, we can have only one shot a night worth five good ejaculations.” she said. \n" +
                "Then she tapped your back twice.\n" +
                "\t“The secret of the pill,” she said, “is it contracts vaginal muscles. Two, it gives the woman extra energy.” \n" +
                "\t“Professional prostitutes use this to handle a dozen penetrations a night,” she said.\n" +
                "\t“Three,” she said, “it induces multiple orgasms, no matter the size of the penis.”\n" +
                "\t“Four,” she said, “the clitoris grows twice the normal aroused size. Picture the tongue of a baby dragon: a little flickering flame the size of your little finger.” \n" +
                "\tThen she said, “Women also want to cum long and hard.” \n" +
                "\t“Sex is the greatest prison of the mind there is,” she affirmed.\n" +
                "\tSex and success are overrated. \n" +
                "\tThe voice in your head says.\n" +
                "\n" +
                "\tFifteen years ago, your Dad defined success in two ways: money and control. He said a man can only be judged on how much money he makes. How he controls his spending and how he controls his sexual urge. \n" +
                "\tMaster self-control and you would rule over other men. By controlling your sexual urge Daddy meant:\n" +
                "\tDon’t trust the decisions you make when you have an erection. \n" +
                "\tBy that, Daddy was in some metaphorical way regretting being polygamous and feeding thirteen useless children on a small piece of land. \n" +
                "\tBy that, Daddy meant money and women should be handled the way one would handle a cigarette near a petrol station. \n" +
                "\tDaddy emphasized: “Money is important. Very, very important: it’s a measure of your value.” \n" +
                "\tWhat Dad was saying in other words, was that education is an option, financial freedom is mandatory. \n" +
                "\tYou thanked him for his wisdom and took an early bus to Nairobi.\n" +
                "\tThe first thing you did in the city of tall buildings and collapsed dreams was not to waste time. \n" +
                "\tThe first thing you did was to join the police service. The next thing you did after three years was to quit and join business school. \n" +
                "\tThe next thing you did after three years was photocopy your diploma and send to several companies. The ritual every graduate goes through. \n" +
                "\tStudy hard to work hard for other people, pay bills and taxes until you die. \n" +
                "As is the case, nobody was hiring.\n" +
                "\tAfter three weeks of walking around Nairobi with a brown envelope, you gave up. \n" +
                "\tOne thing Daddy always emphasized on was the art of despair. He said if things don’t work, give up. \n" +
                "\tAlways give up until you get what you want. \n" +
                "\tWhat you got was night club security at Beamerz for 8K a month. The house rent was 5K a month. To survive, you would shake half-empty bottles left by drunken revelers, gulp and stay alive. It didn’t matter if the drinks were laced by sleeping pills and spit. \n" +
                "\tMan’s basic responsibility is survival.\n" +
                "\tStaying alive.\n" +
                "\t5. 23 P.M.\n" +
                "\n" +
                "\tThe rear view mirror shows you the occupants in the car behind you are taking selfies and laughing. \n" +
                "\tA man and a woman. \n" +
                "\tIt shows you an approaching newspaper vendor. \n" +
                "\tA chewing gum vendor. \n" +
                "\tAn underwear and socks vendor. \n" +
                "\tWristwatch hawkers. \n" +
                "\tBodaboda cyclists. \n" +
                "\tVendors: the vermin of urban living. \n" +
                "\tBut this was you before your financial redemption. \n" +
                "\tPoor and unintelligent people should not be encouraged to breed.\n" +
                "\tBut your Dad was a short balding head with thirteen kids and three wives he beat up whenever they asked for food. \n" +
                "\tBeing born is your first crime. \n" +
                "\tBut right now, your first crime is in the trunk of your car. \n" +
                "\tIn the rearview, the man and the woman are now kissing. \n" +
                "\t“Kissing,” Wambo had said, “is the first sign of Obsessive Compulsive Disorder.” \n" +
                "\tThe idea that you want to stick your mouth into somebody else’s, to taste their oral bacteria and exchange drool, is never a sign of affection but maniacal desperation.\n" +
                "\tShe advised you never to kiss her as foreplay. \n" +
                "\tShe said, if she needed to get wet, the pill took care of that. \n" +
                "\tThat when a woman takes the pill, Opulex, the skin feels like it is sinking in a sea of feathers. \n" +
                "\tThat the fire in her legs begins like the rising of the morning sun: delicate and inviting. \n" +
                "\tThat her labia minora wants to turn inside out, like a rose bud, like a tulip, like the vagina is blowing you a kiss.\n" +
                "\t“What am I to do all the while, sit and watch?” You asked, feeling left out. \n" +
                "\t“No, you have two hands.” She said, biting your earlobe. “Use them.”\n" +
                "\n" +
                "\tThese flashbacks of you and Wambo having sex are giving you a boner. You can feel it stretching in your boxers. \n" +
                "\tAll that talk about necrophilia is making sense now. It is possible to sexually be aroused by a dead body. \n" +
                "\tAll our memories are dead events. \n" +
                "\tIf one can still masturbate over a memory of an ex they humped three years ago, having sex with a freshly dead body is a bit more realistic. \n" +
                "\tActually, you reach out to your iPhone and swipe through Wambo’s photos.\n" +
                "\tSwipe. A photo of her licking your sperms off the floor.\n" +
                "\tSwipe. A photo of her tongue shining with a smear of cum, sticking out.\n" +
                "\tSwipe. A photo of her in your shirt, dark braids, a finger in her red small mouth.\n" +
                "\tSwipe. A photo of her in an impossible tantric yoga position, her right big toe in her shaved vagina.\n" +
                "\tSwipe. \n" +
                "\tSwipe.\n" +
                "\tSwipe.\n" +
                "\tSwipe. \n" +
                "\tLong press. \n" +
                "\t“Delete selected items?”\n" +
                "\tYes.\n" +
                "\tIf only deleting memories was that simple.\n" +
                "\n" +
                "\tOn average, Nairobians spend 63 minutes on traffic. In Kolkata, it is 69 minutes. The reason? Human population surge. Everyone wants to have a child and then own a car. Because everyone believes a car—metal and glass on wheels—is a status symbol of some sort like having a ring in your genitals.\n" +
                "We are slaves to identities we have forged. \n" +
                "\t5. 26 PM. \n" +
                "\tYou take a look at the rearview mirror.\n" +
                "\n" +
                "\tAs a club bouncer, coupled with your cop experience, you go to notice patterns. Like this one fat guy who always disappeared to the back of the club with the club owner every month. When off duty, on Thursdays, you got to pass by and eavesdrop. \n" +
                "\tYou heard money being mentioned. \n" +
                "\tDeals. \n" +
                "\tProfit. \n" +
                "\tLosses. \n" +
                "\tLawyers. \n" +
                "\tCops. \n" +
                "\tGold. \n" +
                "\tCash, cash, cash.\n" +
                "\tWhat, what.\n" +
                "\tYou later learnt the fat guy had invested in the club and owned a couple of hardware stores around Eastleigh. Word had it he was one of the sleekest smugglers of gold from South Sudan. \n" +
                "\tDuring your police days, his name was once brought up. He went by Kioko or something. To smuggle the gold, he used the priests that worked for various NGOs and sometimes the gold was shipped in cargo trucks that transported relief food to the region via Kakuma Refugee Camp.\n" +
                "\tSo you approached him.\n" +
                "\tWithin a year you got to make connections you never thought existed. \n" +
                "\tFrom private dinners in Westlands to prostitutes who don’t take cash. \n" +
                "\tFrom nephews of politicians who shipped in drugs from Mombasa to names you know on Facebook that have killed at least two people over business beef. \n" +
                "\tFrom a gay journalist that sucked off some governor for Dubai trips and prime time slots on TV, to how you can make two million bob a week.\n" +
                "\tThat’s when you got an invite to the 3084 Lodge Harmony.\n" +
                "\n" +
                "\tAll the Proposer—a very wealthy acquaintance—had to do was make some declaration.\n" +
                "First question:\n" +
                "\t“Would you welcome him into your home?”\n" +
                "Second question:\n" +
                "\tDo you vouch for him in every respect as a suitable and desirable person for admission to the Craft?\n" +
                "\tThird question:\n" +
                "\t“Would his home or business circumstances make it difficult for him to attend regularly at Lodge meetings?”\n" +
                "\tAs a Candidate for Initiation you had to be tested. Your right hand on the Bible:\n" +
                "\tFirst declaration:\n" +
                "\tI have never been convicted by a Court of any offence.\n" +
                "\tSecond declaration:\n" +
                "\tI have never been the subject of a finding of dishonest or disgraceful conduct.\n" +
                "\tThird declaration:\n" +
                "\tI have never been disciplined by any professional, trade or other tribunal.\n" +
                "\tYou learnt about the Three Pillars:\n" +
                "\tSocial Interaction.\n" +
                "\tCharitable Giving.\n" +
                "\tAnd Integrity.\n" +
                "\tThe First Degree questions leading to your Second Degree.\n" +
                "\t“When were you made a Mason?”\n" +
                "\tAnswer:\n" +
                "\tWhen the Sun was at its meridian.\n" +
                "\t“How do you account for that which at first view appears to be a paradox? “\n" +
                "\tAnswer:\n" +
                "\tThe Sun being the center of our solar system, and the Earth constantly revolving about it on its axis, and Freemasonry being universally spread over the Earth's surface, it necessarily follows that the Sun must always be at its meridian with respect to Freemasonry.\n" +
                "\t“How do you demonstrate the proof of your being Mason to others?”\n" +
                "\tAnswer:\n" +
                "\tBy signs, secrets and the perfect passwords of my entrance.\n" +
                "\tYou got to learn that Freemasonry wasn’t a shortcut to wealth.\n" +
                "\tThere were no people worshipping the devil or sacrificing relatives for money or entering the Lodge backwards while naked.\n" +
                "\tThere were no souls sold there or drinking of blood.\n" +
                "It's a rich boys' club with good intentions.\n" +
                "\tGentlemen in red neckties you see on TV every evening.\n" +
                "\tThese men are your bosses. They own 60% stock in your favorite bank. They own the companies you work for. Yet, according to your local street prophet, you know these honorable men as devils who cause road accidents in Kenya as a sacrifice. \n" +
                "\tAny narrative to keep the poor comfortable and safe is always welcome.\n" +
                "\tBut you, young and money-hungry, all you needed was the connections.\n" +
                "\tYou interact with these people, these wealthy, intelligent brains on weekly basis; you start to get ideas like you are destined to greatness. \n" +
                "\tYou start to believe what your Dad had said, about a cluster of fireflies. \n" +
                "\tYou become superstitious: that cluster of fireflies symbolized you surrounded by very important people. \n" +
                "\tYou start believing in the Law of Vibration. \n" +
                "\tYou start believing in prayer. “Write your dream on a piece of paper,” the spiritual teacher had said—three years ago, in a Pranic Healing Center, now closed—“and shove it in that pot of good luck at the corner. Namaste, Namaste.”\n" +
                "\tYou start loathing the poor. \n" +
                "\tYou start hating yourself.\n" +
                "\tAporophobia: fear of and contempt towards people who live in poverty. \n" +
                "\tBack in the cop days, when you were doing your nightly patrols, with a twig of miraa in your jaw to keep you awake, you always wondered who owned the gated suburbs and how they did it. \n" +
                "\tNow you did. \n" +
                "\tWho fucked all these expensive suburban pussies that looked untouchable with giant, shiny cars and handbags. \n" +
                "\tNow you did. \n" +
                "\tIt was during one of those private dinners that you met Wambo. A clinical psychology student, Daystar. \n" +
                "\n" +
                "\tWambo, Wambo, Wambo. \n" +
                "\n" +
                "\tOnce in a while a girl teaches you something exotic in bed and then she disappears for life. \n" +
                "\tShe was that woman you would remember past your marriage, past your third child, past your fiftieth birthday. \n" +
                "\tShe was the first freak to tell you, “Stick your toe in me and wiggle it,” and then she bandaged it with a warm tongue. \n" +
                "\tAnd then she told you stick it in her anus. \n" +
                "\tAnd then she stuck a wet finger in your anus.\n" +
                "\tAnd then you walked around toying homosexual fantasies for a month.\n" +
                "\n" +
                "\tWambo, Wambo, Wambo.\n" +
                "\n" +
                "\tWambo taught you how to ejaculate without touching, without penetration. \n" +
                "\t“It’s called ‘ngwiko’ and my community did it to boys and girls before circumcision.” \n" +
                "\tShe said, peeling off her clothes.\n" +
                "\t“All you have to do is stare deeply into my eyes and imagine all you can.” \n" +
                "\tShe said, peeling off your clothes.\n" +
                "\t“Stare until you go into a trance.” \n" +
                "\tShe said, both of you naked, standing in a distance that an erect penis and erect breasts can’t touch another skin. \n" +
                "\t“The whole exercise was meant to balance sexual energy between the boy and the girl.” \n" +
                "She said her pupils boring into yours.\n" +
                "\t“Oh, that tantra mumbo-jumbo?” You asked, feeling equally knowledgeable. \n" +
                "\t“To induce coming,” she continued, “keep contrasting the muscles of your pelvic floor until there’s fire boiling from the base of your spine.” \n" +
                "\tShe said, her eyes a pair of two little moons.\n" +
                "\tEvery cell in your body was aching to reach out and touch a skin, anything. \n" +
                "\t“Imagine all your hands and feet cut off, and you’re not flexible enough to bend and suck yourself off.” She said, her eyes not blinking. “And you want to desperately jerk off.” \n" +
                "\tShe said, “You ever heard of apotemnophilia?”\n" +
                "\t“What?”\n" +
                "\t“A fetish amputees have where they’re sexually aroused by a missing limb” \n" +
                "\tShe said, her eyes burning into yours.\n" +
                "\t“Another thing you should know about kissing,” she said, “it has vorarephilia tendencies.”\n" +
                "“Wha—?” \n" +
                "\t“Being sexually aroused by eating another person’s body parts.” \n" +
                "\tShe said, without blinking.\n" +
                "\tAnd that explained the fetish you have always had of biting off a woman’s clitoris with your teeth during oral.\n" +
                "\tThen you felt the heat building. \n" +
                "\tThe fiery rush. \n" +
                "\tThe blinding flow of whatever. \n" +
                "\tAnd then—spurt, spurt—you dribbled the liquid seeds on the floor. \n" +
                "\tHer eyes not leaving yours, Wambo bent down to lap the sperms off like a dog.\n" +
                "\tSmacking her lips, she said:\n" +
                "\t“The Samba, in Papua New Guinea, believed semen transformed into milk so they encouraged pregnant women to swallow them.”\n" +
                "\n" +
                "\tOn average, Nairobians spend 63 minutes on traffic. In Kolkata, it is 69 minutes. Maybe this is one of those days.\n" +
                "\t5.28 PM, the digital display says.\n" +
                "\n" +
                "\tLooking at the rearview mirror, the couple in the car behind you is now worshipping the photos they just took. The woman’s head on the man’s shoulder, they are worshipping the photos they just took. \n" +
                "\tMaybe they have Instagrammed them. \n" +
                "\tMaybe they have hashtagged them.\n" +
                "\t#stuckintrafficwithbae\n" +
                "\t#stuckintrafficwithadeadbody \n" +
                "\tThe little voice in your head says.\n" +
                "\n" +
                "\tYou take a look at the rearview mirror.\n" +
                "\n" +
                "\tOne night, as you lay smoking after sex, you asked her, out of curiosity, why she really needed the pill at 23 years of age.\n" +
                "\t“Erectile dysfunction is caused by low blood flow to the genitals. This pill,” she said, “causes more blood flow to the genitals and less to the brain.”\n" +
                "\t“This explains the lack of cognition during intercourse or when one is drunk because of the accumulation of carbon dioxide in the brain.” \n" +
                "\t“So less and less blood flows to the brain and if it’s extreme, there is loss of consciousness and light-headedness and euphoria. The magical rush from your toes to your eyebrows. This is called hypoxia. This is how all narcotics work. All drugs are used as a substitute to sex.”\n" +
                "She had not answered the question.\n" +
                "\tIt didn’t matter.\n" +
                "\tAll you did was listen. Then you asked her whether the pill had any psychological side effects like perception on the essence of love and sex.\n" +
                "\tShe said:\n" +
                "\t“Love and sex are strong instincts that trigger the replication of the genes. They are not magical. Don’t let poets lie to you.”\n" +
                "\tThis girl is always full of useful information, you stared at her mouth in awe. Sometimes you wondered what she was hawking her body for when she could make money blogging about sex or something. Sex therapist or something.\n" +
                "\tEverybody who knows something wants to be something. A consultant of Something Something. Everybody wants to rip you off with the little knowledge they have acquired.\n" +
                "\t5.30 PM. \n" +
                "\t5.31 PM.\n" +
                "\n" +
                "\tLooking at the rearview mirror, you wondered what the outsider looking at you in your car would think. Would they look at you and say, “Damn I’m getting a loan to buy a car like that to make my ex jealous!” or would they walk on, not giving a shit? \n" +
                "\tIt doesn’t matter. \n" +
                "\tBecause you remember the feeling when you walked to the dealership today. \n" +
                "\tThe joy, the anxiety.\n" +
                "\tAfter signing all the papers, you had your new ride kissing the tarmac with a feeling you only get when something good and new happens. \n" +
                "\tAnd when something good and new happens, you want to celebrate. \n" +
                "\tAnd when you want to celebrate, sex and beer top the list. \n" +
                "\tAnd when sex tops the list, Wambo tops the list.\n" +
                "\tmeet me @ th hse\n" +
                "\tYou texted.\n" +
                "\tShe sent an emoji.\n" +
                "\t5.31 PM. \n" +
                "\n" +
                "\tYou take a long look at the rearview, trying hard not to recall what happened this morning.\n" +
                "\t5.31 PM. \n" +
                "\n" +
                "\tYou take a long look at the rearview, vividly recalling what happened this morning.\n" +
                "\tThis morning, since it was a special morning, to celebrate your new symbol of success, Wambo asked you to choke her when she was about to climax. \n" +
                "\t“This is called gasping, literally. The more oxygenated blood you cut off to the brain, the more intense and mind-blowing the orgasm.”\n" +
                "\t“And this is not meant to be a pun.” \n" +
                "\tShe was at her sex lecture again.\n" +
                "\t“So I want you to put your thumb here,” pointing to the side of her neck, “and squeeze until I milk all the juices from my body.”\n" +
                "\tShe lay flat on the floor. \n" +
                "\tYou positioned your body at 90-degree angle in between her legs. \n" +
                "\tYou penetrated. \n" +
                "\tHolding one leg up the air, you started gliding slowly.\n" +
                "\tIn, out.\n" +
                "\tIn, out.\n" +
                "\tGear one. \n" +
                "\tAnd she was saying, “Did you know that female marsupials have two lateral vaginas?”\n" +
                "\tYou shook your head and kept humping away.\n" +
                "\tShe tapped your knee twice. \n" +
                "\tYou obeyed and increased speed.\n" +
                "\tThis normally goes for ten to twenty minutes.\n" +
                "\tShe was saying, “Did you know that the female spotted hyena pees and fucks and gives birth through the clitoris?”\n" +
                "\tAs an automated response, you reached out and started squeezing her swollen bean.\n" +
                "\tShe tapped you thrice. \n" +
                "\tYou obeyed, you flipped her on all fours.\n" +
                "\tTurning her head, she asked, “Did you know that female jawless fish have no vagina?”\n" +
                "\tNo—now shut up.\n" +
                "\tAnother ten to twenty minutes of humping, breathing, sweating. \n" +
                "\tAll the while you’re thinking, how do I make another million this week.\n" +
                "\tShe tapped once. \n" +
                "\tBack to gear one. \n" +
                "\tFifteen minutes of slow, pleasurable labour.\n" +
                "\tShe asked, “Do you know that the Brazilian Neutral insects have reversed genitalia?”\n" +
                "\tHow?\n" +
                "\t“The males have pussy-like openings while the females have dick-like organs.”\n" +
                "\tYou said, Wow.\n" +
                "\tShe said, “Another sign that humans are the least evolved of all animals if sexuality is anything to go by.”\n" +
                "\tThen she tapped thrice. \n" +
                "\tYou flipped her back, and grabbed both her legs at the ankles like a mom changing a baby’s diapers.\n" +
                "\tTen minutes of sweet aerobics melted on. \n" +
                "\tShe tapped four times. \n" +
                "\tYou took your wet glistening stick out, slapped it around her pink hole taptaptaptaptaptap until she said stop stop stop. \n" +
                "\tYou raised your knee to get comfortable. You pushed both legs all the way framing her head between them, she looking like chicken on a tray, and you then set your muscles on fire. \n" +
                "\tMore friction, more liquid volcano building up.\n" +
                "\tMore friction, you thought smoke could coil out of the genitals.\n" +
                "\tMore friction, and then she reached for your hand and directed to her neck. \n" +
                "\tShe was about to cum. \n" +
                "\tYou too felt your little soldiers matching from the base of your spine. \n" +
                "\t“Harder.” She commanded.\n" +
                "\tThat meant squeezing the carotid artery as she had instructed. \n" +
                "\tThat meant you giving an order to your soldiers to hold back. But they were getting impatient.\n" +
                "\tYou squeezed her neck again. \n" +
                "\t“Harder.” She squawked, like a hen, her voice muffled by the grip in her neck.\n" +
                "\tYou squeezed again.\n" +
                "\tAnd again.\n" +
                "\tAnd again and harder, your thumb sinking in.\n" +
                "And again you squeezed the veins and arteries and wind pipe and oxygen as you spurted splotch after splotch of sperm into her.\n" +
                "\tPhew, you rolled back as—\n" +
                "\tShe shrieked, convulsed violently and went quiet.\n" +
                "\tVery quiet. \n" +
                "\tMeanwhile, jets of hot liquid shot up from her vagina again and again and again.\n" +
                "\t5.33 PM. \n" +
                "\n" +
                "\tA look in the rearview mirror, the corner of your eye is gleaming. \n" +
                "\tYou can’t believe this, but a tear is forming, squeezing out and trickling down along your laugh lines.\n" +
                "\n" +
                "\tAgain and again you tried to wake her up.\n" +
                "\tAgain and again she didn’t respond.\n" +
                "\tSlapping her cheeks, shaking her, saying hey wake up, wake up, fuck—come on, wake, up!\n" +
                "\tIt was like her heart beat had stopped.\n" +
                "\tLaying there in a puddle of her own cum, it was like she will not come to.\n" +
                "\tIt was like after two hours she was not going to breathe.\n" +
                "\tIt was like, as you sipped bottle after bottle of vodka, saying fuck fuck fuck what have I done, she was not going to wake up, to breathe.\n" +
                "\tIt was like you had to think fast.\n" +
                "\tWrap up the body and take it somewhere.\n" +
                "\tDump it somewhere. \n" +
                "\tNairobi River or somewhere. \n" +
                "\tDrop it somewhere.\n" +
                "\tThen drive somewhere.\n" +
                "\tAnywhere.\n" +
                "     \tWithout looking back.\n");
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
                String shareBody = "Sad ending but an absolutely interesting read! #LoveMeNow";
                String shareSub = "Love Me Now or I Will Kill Myself";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share with friends..."));

                break;

        }

        return super.onOptionsItemSelected(item);
    }
}