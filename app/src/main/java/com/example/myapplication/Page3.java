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

public class Page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        Button previous = findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page3.this, Page2.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Page 2",
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page3.this, Prayer.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Page 4",
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView textView = (TextView) findViewById(R.id.text);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("This is not something you as a good father should read. If you love your children, please move on to the next story.  \n" +
                "        Because the last memory I have of my father is him catching me with a porno magazine in my small bedroom. He snatches it from me and licks his finger and flips through the pages. This he does with disregard that I have a boner and I'm really crossing my legs to cover it.\tHe stares at the photo of this one eagle-spread white naked model, points at the middle of her pinkie and he asks, “Asani, do you know what this is?”\n" +
                "\tI shake my head.\n" +
                "\tAnd I’m 13 years old.\n" +
                "\tHe slaps the side of my head and says, “I always knew you were dumb.”\n" +
                "\tHe grabs the back of my neck like he’s trying to choke me, waves the naked model close to my face so I’m staring at the shaved pinkie of the model and says, “This is a hole. Shimo. Sometimes human beings come out of this.”\n" +
                "\tHe says, “Sometimes useless children pop out of this hole.”\n" +
                "\tHe says, “But mostly, it’s piss and blood, which is way better than”—another slap—“useless children.”\n" +
                "\tAs you can see, this isn’t something you want to read. \n" +
                "As a responsible father, please fill in a cross-word puzzle after you’re done ingesting the political bile in your favorite newspaper.\n" +
                "   \tAs for my father, he slams the door, leaves me bleeding all over the porno magazine.\n" +
                "\t\n" +
                "\tAs I glide in and out of Lakicia’s tight pinkie, which is now turning red, this is what I remember.\n" +
                "\tSo I take my wood and put it in her rear which also turns red, and she screams, and I cover her mouth and say, Shhhh.\n" +
                "\tLakicia is only thirteen years old and for now you don’t have to know my age because you will judge me like my father did. If this makes you uncomfortable please, move on. There are better things to read. This story gets worse and worse and there’s no happy ending.\n" +
                "\tI’m a broken man. And all broken people want to break other people, especially the weaker ones. You know the saying, hurt people hurt people.\n" +
                "\tAll he ever did was tell me I wasn’t enough.\n" +
                "\tTo be enough, me, a useless child, I have to be tough in bed. The younger the girl, the more powerful I feel.\n" +
                "\tRight now Lacikia is whimpering, there’s tears, there’s blood, there’s little poop but I won’t stop. If you remember the horrible hurtful things parents said to you when you were little, you don’t stop. Every penetration is a doze of revenge. \n" +
                "\tLakicia.\n" +
                "\tShe’s a girl I met stranded outside Hill School, dust on her Bata Tofees school shoes, black earphones and a huge ass in a short checked skirt. A chest thrusting through a grey sweater with a school badge right on top of her left boob.\n" +
                "\tSo I took her for lunch, bought a bottle of gin and some blue pills for my libido and took her to my house. At my age, with my unkempt beard and clean shaven balding head, if you walk with a school girl in town, people assume you’re her father so nobody raises an eyebrow.\n" +
                "\tNow I’m about to shoot my load but Lakicia, this obese piece of shit, she is not even moving. I slap her twice and she’s whimpering but she’s not moving. It’s so frustrating bedding these young girls. And, no this is not statutory rape. Sorry to disappoint you. I have had sex with Lakicia before.\n" +
                "\tThis is what you might call, consensual sex with a minor. \n" +
                "\tAnd today of all days, this little piece of shit is on her periods. That’s why there’s blood. That’s why I keep switching from her pinkie to her rear because with all the blood her pinkie is getting soggy and I don’t like that.\n" +
                "\tAnd I have no condom on.\n" +
                "\n" +
                "\tI am drunk and high on Viagra and I’m having my second lay of the day and after this I’ll have to pee then jerk off, a.k.a. pull the bud a.k.a. choke the monkey. Pee and jerk off after every lay. This is how you get rid of infections in your urethra.\n" +
                "\tNo doctor will ever tell you this.\n" +
                "\tSay, if you had three shots with the other eleven-year-old kid, Amina, from across the street, wanked, and now two shots with this one and then wank, that’s an average of seven ejaculations a day. You do this every day, by your seventh day your ass muscles will cramp like hell. After they cramp like hell, they start getting sucked in and going flat. The way a sick and skinny man’s facial cheeks sunk in, this is how your ass cheeks should look. If you continue having more sex, you have a tight little bum. If you hit the gym every Sunday, what you have now is a Jonny Bravo tight body shape.\n" +
                "\tNo fitness coach will ever tell you this.\n" +
                "\tThat sex has all the answers.\n" +
                "\n" +
                "\tThis Lakicia kid has stretch-marks down the calves of her feet and inside her arms and all over her tits. When she stands, her knees cave in. These monster thighs don’t belong to a thirteen year old. How can a girl so small have such juicy flabs of flesh? You have seen women who have a small head and a thin neck and wide hips. When she arches her back and her behind expands twice the size and all the tiny dimples smoothen out. \n" +
                "\tThe ass, I grab it and keep humping. This is your thirteen-year old daughter. Don’t even think that I’m enjoying this. I don’t even want to empty my nuts so soon. So I have to let my mind wander. \n" +
                "\t\n" +
                "\tAfter that porno magazine incident, the relationship between I and my dad soured. If he was home I locked myself in my room, studying art. When I jumped on his lap with all the A’s in my Form One report form, he said this is not enough.\n" +
                "\tAs a first born I expected some privileges like having a right to choose my own career but I wasn’t enough.\n" +
                "\tLawyers make money, he said.\n" +
                "\tFine art is for losers.\n" +
                "\tArt is people who are not enough.\n" +
                "\tPeople who are filling a hole in their lives.\n" +
                "\tOkay, now I’m filling the holes of teenage girls, Dad.\n" +
                "\tThis is art.\n" +
                "\tThe way the blood from this girl’s two holes spreads out beautifully all over the bed-sheet, this is a masterpiece of surrealism. This is Salvador Dali’s Metamorphosis of Narcissus, 1927.\n" +
                "\tThe way this thirteen year old kid’s face contorts in pain, the way her pupils roll to the back of her head like she’s dying, Dad I’m telling you this is Edvard Munch’s The Scream impressionism portrait, 1893.\n" +
                "\tDad, if you look at my hard penis covered in period blood with a million veins along it, this is Carolina Falkholt’s phallic painting on a Manhattan wall, December 2017.\n" +
                "\n" +
                "\tWith these thoughts I keep smashing this kid. She long stopped breathing but who cares.\n" +
                "\tSee, what I’m trying to teach you here is, the best way to enjoy good long-lasting sex is to never think about it. Don’t look at the partner’s hair or thighs or the bulge of their ass, just stare at the stain in the ceiling or something. Think of the whole city of Mombasa going up in smoke. Think of pirates poisoning the Indian Ocean, think of millions and millions and millions of dead fish. Think of dead tourists at Diana beach. \n" +
                "\tThe best way to enjoy life is to never worry about it.\n" +
                "\tIf you have sex as frequently as I have, then forget deep meditation, forget magic mushrooms, forget weed dried in petrol, forget near-death experiences, sex is the ultimate source of enlightenment. So my mind is saying, the best way to stay alive is to forget that you exist. The best way to stay young is to never look in the mirror, never celebrate birthdays, never hang around with old boring people. People talking about their back pains, sugar level and faded dreams of their youth, avoid those cretins.\n" +
                "\tMe hunting down and molesting broken teenagers you would say, is my way of staying young, carefree, happy. It’s me waving my dick in Dad’s face saying, I am happy, I am free, you don’t own me, motherfucker.\n" +
                "\tIt’s strange how the people we don’t like control our every action. The things we do to disapprove them. The marriages we rush into to prove a point to those who hurt us and deserted us.\n" +
                "\tHow I have wrecked my life dying to prove my Dad wrong.\n" +
                "\tThoughts about my Dad are almost turning me off. So I come back to the present.\n" +
                "\n" +
                "\tBack to this fat piece of shit I’m molesting, whose parents are huffing and puffing wondering where the heck their daughter is, whether she has been abducted by a jinni. And now I'm about to come. If I shoot inside her right now it means you have a mix of semen and blood. \n" +
                "\n" +
                "\tHow you tame these small girls is you buy them gifts. Food, drinks, nose-rings, shoes. Just small girl stuff. And for God’s sake don’t be ugly. Dress up, be hip, have good breath. Then hypnotize them. Repeat keywords like relax, trust, love, beautiful. \n" +
                "\t\n" +
                "\tDad had said, to win a case in court, use hypnotic keywords like, justice, victim, money, Your Honour. And he had asked, “Asani do you know who lawyer is? How about a politician? How about a criminal? How about what all three have in common?”\n" +
                "\n" +
                "\tAnd so I had a law degree. Criminal law. First class honours. Law Society of Kenya failure. Not enough for a bar. So I had to run away from home, because well, according to my Dad, I had proved beyond a shadow of a doubt that I was a useless child. A piece of shit.\n" +
                " \n" +
                "\tAnd after two decades, I'm Mombasa's leading sex pest and I consider myself the leading maker of women because most girls around Mtwapa have been deflowered by yours truly. If you don’t believe me, then would you please ask Lulu, Lucy, Fatima, Asha, Soy, Hellen, Joy, Joylene, Belle, Tess, Feya, Kahawa, Malaika, and that deaf eight year-old kid, what was her name? Jamila, yes. And there’s Mariamu, Tausi, Zuhara, Zuria, Zuwar, those I can remember for now?\n" +
                "How many I gave some STI, I can’t remember.  All I remember is they’re young and sweet. Like this kid Tausi, you wouldn’t believe how deep and wide a twelve year-old can be, or how her tongue works along your shaft, licking every inch and when you go down on her, you couldn’t believe this kid hadn’t even grown a single wisp of pubic hair.\n" +
                "\tOr how Joy and Joylene, from across the street, came one morning to collect milk money for their mom. And it’s one of those mornings you take a lick and leave the door open and jump back to bed. And these frisky kids jump to bed saying, “Uncle tumetumwa pesa na mami”. And they’re pulling the blankets off me playfully, the way eleven year-old girls are supposed to be. How they giggled and wanted to touch your shaft is a story for another day.\n" +
                "\tNow, how about this, dear sweet Dad?\n" +
                "       Picture me running around the estates of Mombasa taming school girls. How many got pregnant I can’t remember.\n" +
                "\tIf they did, then you should know the number of fetuses probably rotting away somewhere that could have been your grandchildren. \n" +
                "Because, honestly, no modern parent in their right mind would want a teenager having a child. No teenager in her right mind wants to be a teenage mother. No matter how many successful, tear-jerking teenager mom stories you have heard, children raising children is just not right. In this age of contraceptives, legal abortion and feminist-driven careers, a child is just a liability. Motherhood is something women without education do to feel validated.\n" +
                "\tI warned you, as a good parent, this story will make you nauseous. So move on, watch a soap opera or something. Go gossip, go discuss politics. Go do your nails, Mama Anita.\n" +
                "\n" +
                "\tYou see, the first time I ran away from home to Mombasa, a shared a room with this really short Kamba guy called Kivunda.\n" +
                " \tWe shared a room in Mtwapa with a single bed. Before you get any gay ideas, we used to sleep in shifts since Kivunda worked nights in Nakumatt before it got broke and closed all its branches. Turns out Kivunda was an art enthusiast and stacked all sorts of books in the corner of the room.\n" +
                "\tOne night he's off duty and we're sharing a stub of weed and he says how Picasso had said sex and art is the same thing. That artists make artwork because of an excess of sexual energy. And this, according to Sigmund Freud, according to psychology, according to whoever, is called sublimation.\n" +
                "\tFunny thing is, Kivunda in his 30s, is a virgin.\n" +
                "\tAnd as for art, he’s a street poet who walks from one slam poetry hub to another, a guitar strapped around his shoulders. You must have seen these thirty-something year-olds still chasing some artistic dream. Kivunda is just a sweet soul.\n" +
                "\tSays his women are books, wine and yoga. \n" +
                "\tSays no tranquility or pleasure can beat these three. \n" +
                "\tSays sex is overrated. \n" +
                "\tSays Gandhi, Gautama and Jesus did without it. \n" +
                "\n" +
                "\tSo it's a weekend after payday and he's off duty and we go to chill out at Copacabana Beach, Mtwapa to stare at asses of tourists and maybe he will get a muse to write his half-assed rhyming poetry, as I smoke. So Kivunda is in a lotus position saying his 'ohm's to the ocean and I'm like fuck, why should Africans always imitate every silly idea in the name of spirituality? Me, I'm smoking my weed looking at young white girls splashing water wondering what if.\n" +
                "\tKivunda is saying how weird it is to pay money in order to swim in an ocean. I tell him it’s not worse than paying money to lift junks of steel in a gym. But he says how white folks have changed the world. He says, \"All capital cities in Kenya were colonial headquarters, can you imagine? Kenyan cities are built on blood. JKIA airport in Embakasi, Nairobi was built by Mau Mau convicts the British enslaved.\"\n" +
                "\tI blow out smoke and I ask him so?\n" +
                "\t\"The point is, without colonialism, Africa would be a jungle of savages. Colonialism, slavery, these saved the Black man from himself.\"\n" +
                "\tSo I ask him why with all this knowledge he’s still a virgin.\n" +
                "\t“My uncle had sex with a woman once. One of his testicles slid back into his urethra. He had to be operated and his nut removed. I was around twelve at the time. I swore never to have sex.”\n" +
                "\tI tell him if he doesn’t get laid his penis will shrink and eventually disappear into his urethra. I tell him it’s like the human tail or like the appendix. Nature discards what we don’t use.\n" +
                "\tHe says, “Are you serious?”\n" +
                "\tI say, Yup. You’ve seen these white collar guys who don’t do manual jobs how they have big tummies and small arms? Tonight you’ve to get laid, bro.\n" +
                "        That night we drown three bottles of VL white wine at Lambada and Kivunda is drunk and he's telling the waitress things. Says how he wants to dance with her and I tell him this place is full of old white women so let's hop over to Casaurina Nomad Bar for really real realness. \n" +
                "\tAt Casa, \"So many women here.\" He says. \n" +
                "\tIt's a small sea of brown cleavage and thighs swaying to Taarab and Bongo music. Mouths sucking on shisha; smoke everywhere. And I tell him, Hey virgin boy, all you need is 600 bob to get laid for a whole night tonight. \n" +
                "\tWell it’s never actually a whole night. You take a girl home or lodge or whatever, bang two shots and after two hours she’s paid and done but, well it is like when Safaricm says blah-blah call-per-minute, they actually mean 37 seconds. \n" +
                "\tThe language of business is trite.\n" +
                "\tAnyway, Kivunda is moving from chick to chick bargaining pussy. \"I like the tall one with perky tits.\" He whispers in my ear. I sip the cup in my hand and ask him how much she’s charging. He says she says 4 000. I say bro, Try another one.\n" +
                "\tSo he pulls the hand of this short yellow one with dark shadows round her eyes. Straight to the point I ask how much for a night. She says 2 500.  I say, Okay, we’ll call you. \n" +
                "\tShe asks, \"Kwani how much do you have?\"\n" +
                "\tI say 500. She slaps me. Right there in the club she slaps me and Kivundi is laughing his brains off. \n" +
                "\tKivundi says, \"We can give you 1 000.\"\n" +
                "\tShe says, “Buy me Tusker first.” \n" +
                "\tWe say, Okay, sweetheart. I whip out some cash, signal the waitress, she brings a beer, the girl grabs the beer, she hops over to the counter and swaps it for cash.\n" +
                "\tWhile she’s swaying her non-existent hips back from the counter, Kivunda pulls me aside and cups his palm around my ear and says, \"I actually don’t want a fuck. I want like a chick who can strip and dance in her underwear to the Kamba music at the house.\"\n" +
                "\tI say, Okay. So you’re paying her to dance. Awesome. But don't take her to the house. \n" +
                "\tI smack the tiny girl’s ass and tell Kivundi, enjoy this gift, man. Tonight say bye-bye to virginity. They both leave the club, his short hand round her small waist.\n" +
                "\tSo me, I’m left lonely and I feel like starting a fight. I’m torn between going back to Lambada to get some old white gay dude to bang for cash or texting these minors on my phonebook see which one can sneak out of their parents’ house tonight, or which one can sneak from their school dorm and come to their Daddy for some fun. Instead, I light some weed and head home. It’s around 3 A.M.\n" +
                "\tI open the door and it’s Kivunda humping the girl from the club and he’s crying real tears. The boy has just discovered the sweetest thing under god’s blue heaven. I roll a mat on the floor and try to fall asleep. Kivunda is telling me to get out. He’s saying how he can’t get it up while somebody is around. I tell him if he can’t fuck the girl then I will. The girl pulls him down and puts his thing in her mouth and he’s saying, “No-no-no-stop-stop.” The stupid guy has just come right in the girl’s mouth. \n" +
                "\tI and the girl are laughing like, seriously dude? She then comes down on the mat and she’s pulling my pants and I’m too shocked to have an erection despite her warm tongue and spit around the shaft of this thing between my legs.\n" +
                "\tI try to pretend to enjoy. Just to piss Kivunda off. I try to make a face you would make if your girlfriend was giving you a hand-job below the table in a crowded restaurant. I try to wiggle my little sluggish wick down her warm throat. That’s when Kivunda comes and pulls her off. He’s pulling her off, the tip of my dick is the only one touching her front teeth. She eventually lets go and there’s only strings of drool connecting us. Kivunda, his boner is banana strong, and it's nodding forming an upward curve. Gay or not, it's the type of penis you would want to put in your mouth. So I sit and watch as Kivunda’s banana disappears into the girl’s pinkie and believe or not, I’m so total turned off by this.\n" +
                "\tAfter the girl leaves in the morning, he says, “I’m going to marry this chick.”\n" +
                "\tI say, What chick.\n" +
                "\tI say, No way.\n" +
                "\tI say, You just had sex, bro. Have more often and you’ll get used to it.\n" +
                "\t“No, I’m serious.”\n" +
                "\tI laugh so loud and say, Bro this hoe has humped half of the men in Mtwapa, what the fuck?\n" +
                "\tHe says, “So what?”\n" +
                "\tObviously the brother got laid so well by that escort now he’s in what you might call love. And now he’s talking marriage. Somewhere somebody had said marriage is legalized prostitution. How appropriate. If you say sex is mutual masturbation, you could be half right.\n" +
                "\t“So I want you to move out.” \n" +
                "\tI say, Shut up.\n" +
                "\tHe says, “No, really move out. It’s not like you pay rent or anything.”\n" +
                "\tI say, Okay. He is right.\n" +
                "\n" +
                "\tBecause the truth is, I have no job. \n" +
                "\tI personally believe a job is enslavement and a salary is a bribe to keep you loyal to your masters.\n" +
                "\tHow I make money shouldn’t worry you.\n" +
                "\tBecause, you would think being a dildo delivery guy is really a job.\n" +
                "\tSincerely, if your Dad knew you peddled plastic penises on a tuktuk from Mtwapa to Changamwe for survival, he would not be impressed.\n" +
                "\tIf he knew that one time the police blasted you with several cartons of these candy colored dicks and they spilt them along Changamwe Road, and everyone with a camera-phone was recording and laughing, and that you appeared in the local newspaper, and that you spent a night in the cell until your boss, a Miss Fatuma came to bail you out, and that you had to work for three months without pay to pay for the lost merchandise, Dad would laugh his fat balding head off.\n" +
                "\tIf Dad knew, for instance, that in the coast you have tried every drug that comes to the shore of the Indian Ocean, that you had anal sex once from some tourist, and that it hurt like hell and left a tear in your asshole that never heals, that this tear stings like hell when your butt-crack sweats from the heat and riding a tuktuk full of sex toys all day, that you actually tried one of those dildos on yourself, Dad would say you're a waste of his precious sperms.\n" +
                "\tDad may say what he wants. \n" +
                "\tThe way you look at it, you're a savior to most marriages and relationships. You're a bridge between sexually frustrated women and their financially frustrated men. \n" +
                "\tA dildo a day keeps divorce at bay.\n" +
                "\tThe way you look at it, you're bringing happiness into people's lives. You're fulfilling a college girl's fantasy of having a penis go into her without all the bullshit that comes with a real penis. You're fulfilling most women's wish: a penis that is erect till the end of time; a penis that doesn't cough syrup into them and dies. A penis that doesn't plant a seed of useless children like yours truly.\n" +
                "\tDad would say anything, and he could be half right.\n" +
                "\tYou see, you'll always turn out exactly as your parents predicted. \n" +
                "\tBecause it’s every child’s duty to disappoint their parents.\n" +
                "\tThis is the only law. \n" +
                "\tForget about ambitions and role models and being a rebel and changing the world, your whole life is predestined by gods known as Mom and Dad.\n" +
                "\tAnd if you happen to have no parents, then you are free. Then you can be anything you want.\n" +
                "\tGo ahead. Use Wikipedia or any history book; watch any documentary if you can, and please, do call me if I'm wrong—I’ll leave my number. But here’s the fact: anybody who ever made history was an orphan.\n" +
                "\tIt is not like I want my father dead.\n" +
                "\tIt is not like I want him alive either.\n" +
                "\tIt is not like it’s any of your business.\n" +
                "\tWhat you should know is that after Kivunda kicked me out, I’m smoking these dry leaves of marijuana watching the wrinkles of the ocean from Mtwapa bridge thinking what will happen if I jump over when Lakicia calls saying she’s been suspended from school and she feels like killing herself.\n" +
                "\tSo I pick her outside the school gate with my tuktuk and bring her here, a lodge, at Makuti B&B.\n" +
                "\tAnother thing, always pick the troubled kids, the ones with parent and teacher issues. They are vulnerable, they want you to listen. They want you to rub their shoulders, hug them into your chest, stroke their over-shampooed hair, and reassure them. They are looking for a father figure, for a savior.\n" +
                "\tWell, I’m their Daddy.\n" +
                "\n" +
                "\tA few months later, Kivunda calls me saying his former prostitute, now wife, is pregnant. Says he has not touched a book since he got married. Says only lonely and broke people love books. It is a drug like any other. To numb the boring realities of their lives. Says he has gained so much weight, he says fuck that middle-class pretentious yoga shit.\n" +
                "\tI laugh and say, Cool.\n" +
                "\tBetween Kivunda’s one night stand, one fuck of a lifetime and marriage and pregnancy, my life gets better and better.\n" +
                "\n" +
                "\tIt’s a beautiful day and the streets smell of people’s perfumes and ambitions. The sky’s color looks like that Facebook logo. The weather could be anything you like, depending on how you feel. I feel great because Lakicia and I have been what you might call, together.\n" +
                "\tYou have no idea how many people want to punish you because they can’t have your love or your money. Lakicia didn’t care whether I was cold-hearted and broke. She accepted me and her eyes were kind.\n" +
                "\tIn another life, the perfect life Dad would have wanted for me, Lakicia was old enough to be my daughter. She gave me the attention and acceptance the world denied me so age didn’t matter. In any case, one day she’ll turn twenty-one or eighteen and I’ll shrug the guilt off my shoulders. \n" +
                "\tYou see people, most people, they want to you to pay for their attention. You flirt with some girl and then she’s asking for lunch. She’s saying, Or send that lunch to my M-PESA number. Or she’s saying, Can I bring my friends along?\n" +
                "\tSweet little Lakicia. \n" +
                "\t What the outside charged a fee, she gave me for free.\n" +
                "         She said fuck school, fuck teachers, fuck parents and moved in with me and I know she’s in what lonely people call love or some other mental illness like that.\n" +
                "\tThere was a warm feeling around my chest whenever she was around.\n" +
                "\tAnd with enough savings from hawking platic penises to sexaholic wives and college girls, I want to spoil Lakicia with some shopping. We stop  by a fruit vendor and we’re sipping this coconut juice when she says she has a headache and feeling a little kizunguzungu. She passes out for real and I have to rush her to a hospital. \n" +
                "            The blood samples are taken and then the doctor is saying to see me. He’s asking if I’m the father, and I say, Yeah, yes. He says, “I think your daughter has Aids.”\n" +
                "\tJust like that.\n" +
                "\tHoly shit.\n" +
                "\n" +
                "\tNobody, even your father with his law firm and dark suit and impeccable English, ever prepares you for this.\n" +
                "\tThen all the time you laughed at people claiming depression and anxiety and suicide.\n" +
                "\tThen all the time you laughed at people who said parents can actually mess your life with the poison of their words. \n" +
                "\tThen all the time you said you don’t believe in karma, or curses.\n" +
                "\n" +
                "\t\t\t\t\t*\n" +
                "\n" +
                "\tNormally, you crush Rohypnol pills, mix with weed and smoke it. Here in the drug dens of the Coast, we call it mkorogo. \n" +
                "\tSometimes when money for the drugs runs out, we, I and Lakicia, we swap the ARVs we get from AMPATH for pills of Rohypnol.\n" +
                "\tSometimes when all the pills and drugs run out, we smoke maize flour.\n" +
                "\tSometimes when I can’t find a vein on Lakicia’s scrawny arms, I stick a needle of heroin in her clitoris and then I suck it while she’s passed out. This gives her a double high.\n" +
                "\tAfter a few years, seeing you transform from a puffy-chested sex addict to a skeleton, Dad must be proud.\n" +
                "\tLakicia is a bag of stripe marks left after rapid weight loss supported by bones. When we have sex, the pelvic pones leave bruises on our hip joints.\n" +
                "       It's not like Lakicia has not begged me countless times to let her go and get help from her parents. But if she leaves me I have nothing in this world. We rather die together than live apart and alone.\n" +
                "\tSometimes we just hold each other and cry.\n" +
                "\tWe are having sex not to enjoy life but to die.\n" +
                "\tEvery day has to be lots of liquor, drugs then sex.\n" +
                "\tAfter the sex you trace Lakicia’s ribs down to her protruding pelvis.\n" +
                "\tWhere there was once a fat juicy yodi, now lay shriveled slabs of roast decaying beef with a tiny dark tendril of what you might call a clitoris.\n" +
                "\tEvery day we are being reduced to nothing.\n" +
                "\tI and Lakicia.\n" +
                "\tWith the little energy left, you take out a stub of a pencil, sharpen with a razor blade, get a blank piece of paper and try to sketch Lakicia’s frame.\n" +
                "\tWhat you have on the paper is stroke marks of what looks like a deformed embryo. That’s how fast a body can deteriorate.\n" +
                "\tBesides the virus chewing through every muscle in our bodies, there are other things like kidney and liver failure. Like bowel movements, like loss of appetite, like skin ulcers.\n" +
                "\tMinor things like darkened nails falling off of our hands or spitting out a rotten tooth, or hair loss don’t bother us so much.\n" +
                "\tEvery sex we have could as well be our last.\n" +
                "\tPlease, pray for us.\n" +
                "\n" +
                "\tAnd since any day could be my last, I scroll through my phone and dial. \n" +
                "\tHe’s saying, “Hello.”\n" +
                "\tI don’t speak.\n" +
                "\tHe’s saying, “Hello, hello?”\n" +
                "       He’s yelling, “Who is this?” \n" +
                "\tI say, Dad, please pray for me.\n");


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
                Intent intent = new Intent(Page3.this, Contents.class);
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
