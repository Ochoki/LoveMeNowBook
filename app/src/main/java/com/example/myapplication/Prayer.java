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

public class Prayer extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prayer);

        Button previous = findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Prayer.this, Page3.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Page 3",
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Prayer.this, Wake.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Page 5",
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView textView = (TextView) findViewById(R.id.text);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText(
                "\n" +
                "   Everyone you meet here has an invisible rope around their neck; waiting for someone to do one more wrong thing, for life to disappoint them one more time, and then they are done.\n" +
                "\n" +
                "\tToday, it is a programme we call the Purge, which gives everyone a chance to expunge things they hate. \n" +
                "\tThings other people have put them through.\n" +
                "\tSo Suzie, one of the founders of this support group and who happens to the mean admin of the WhatsApp group of the same club, opens the discussion. Today’s topic: One Thing I Regret.\n" +
                "\tSuzie opens, “The dude was like the meanest dude I’ve ever banged.”\n" +
                "\t“He was ugly and had this chronic foul breath, we never did missionary even once.”\n" +
                "\tThe rest of us laugh, and we snap our fingers.\n" +
                "\t“Why I loved him, I don’t know.”\n" +
                "\t“Somehow he cums inside of me and the next part of my life is to nurse an ugly baby with a big head and nose and thinning, brown hair.”\n" +
                "\n" +
                "\tThe way Suzie scans her eyes across the dead silence in the room, you would think she is saying this from a memorized TV script. \n" +
                "\tNo, this is her life.\n" +
                "\tToday, she is in this animal print top, and blue flat shoes. With the black tights covering her feet scars, and with the make-up covering her freckles, she looks brand new. Her left arm has this big bangle that glides from her wrist to her elbow because her arms are so thin. \n" +
                "\tAnd her hair, she has no hair. Blame it on chemotherapy. \n" +
                "\tBut in both ears there are big round earrings, then a purple lipstick on her pinched pink mouth. \n" +
                "\tShe is not aging, but her eyes look sad and old, despite the long curled up fake eye-lashes.\n" +
                "\tHer long eye-lashes blinking, she says, \n" +
                "\t“You know, this thing cost you a dream-career and a college degree, but you clean it and feed it and upload a few photos of it. Just for likes, just for some pretend love.”\n" +
                "\tA pause then she says, “A baby can be a bad decision, a scar, a souvenir of stolen dreams. Right there and then you realize children are just things we pretend to love out of our insecurities until they're old enough to get the fuck out of our house and go fend for themselves. It’s what my parents did. So yea, I regret giving birth.” \n" +
                "\t“I should have given the dude a blow job.”\n" +
                "\tThere’s a chuckle in the room, and then we all laugh and snap our fingers the way they do in poetry readings.\n" +
                "\tSuzie is a twenty-three year-old single mother battling breast cancer. \n" +
                "\tAccording to her other confessions, her boyfriend ditched her when he felt a lump while cuddling her breasts one morning. \n" +
                "\tShe was five months pregnant at that time. \n" +
                "\tHer son is four years old now.\n" +
                "\tThis is the Changez Youth Center, in the heart of Eldoret, this small town. In the same compound, there is a reproductive health facility at the front block where abortion, cancer screening and HIV testing is done. The building we are in is a pimped up Maersk shipping container. \n" +
                "\tOn the floor, there is a grey carpet. \n" +
                "\tAt the corners, there is TV and speakers and projector screen, marker pens and flip charts, water dispenser and board games. In everybody’s hand there’s some gadget. Some phone, some laptop or some ice-cream.\n" +
                "\tWe normally sit in a circle and in the center of the circle, there is the ‘hot seat’. \n" +
                "\tThe confession box.\n" +
                "\tWhere you air your heart out.\n" +
                "\tWhere your past and your present meet.\n" +
                "\tEvery Sunday we have to meet and do this.\n" +
                "\tTalk problems. \n" +
                "\tNobody is here for solutions.\n" +
                "\tWe are the victims. \n" +
                "\tThe young and the angry. \n" +
                "\tWe are the hungry, the neglected.\n" +
                "\tThe afterthoughts of national dialogue.\n" +
                "\tThe rape survivors. \n" +
                "\tWe people living with viral loads in our blood stream. \n" +
                "\tWe people doctors and family and God have given up on.\n" +
                "\tTo make us feel even more isolated, the labeling had been baptized from “rape victims” to “rape survivors.” \n" +
                "\t“Cancer patients” to “cancer warriors.” \n" +
                "\t“HIV patients” had changed to “people living with AIDS.” \n" +
                "From “perverts”, to “LGBTQ” and other emerging acronyms. \n" +
                "\tJust like instead of saying you are a poverty-stricken piece of shit, you say, “I come from a humble background.” \n" +
                "\tYou know the age of modesty.\n" +
                "\tBeing so kind, being oh so civilized. \n" +
                "\tEuphemisms have simply ruined the beauty of pain. \n" +
                "\tSo we, the misfits from around the town, from various colleges and from broken homes, we meet here once a week. \n" +
                "\tWe the homosexuals, we the lesbians, we the orphans, we the tumor-bearing optimists.\n" +
                "\tNone of us are addicted to anything like alcohol or porn.\n" +
                "\tOur main addiction is hopelessness and pain.\n" +
                "\tWelcome to club Hopelessness & Pain Anonymous. \n" +
                "\tWe incest victims.\n" +
                "\tWe the people who claim to be depressed. \n" +
                "\n" +
                "\tJudging by the number of faces that flock in every week, saying how they feel unwanted, how their ungrateful alcoholic father abandoned them, how the frigging government doesn’t care, depression and suicide threats seem to be everyone young person's favorite diseases. \n" +
                "\tWe addicts of pity and pain.\n" +
                "\tThe more you listen to these confessions, the more you learn that when people say they’re depressed, what they’re saying is, \n" +
                "\tI’m unloved.\n" +
                "\tI’m broken. \n" +
                "\tI’m dying.\n" +
                "\tLove me, love me. \n" +
                "\tOr I will kill myself.\n" +
                "\tI’m broke.\n" +
                "\tGive me money.\n" +
                "\tGive me meaning. \n" +
                "\tOr I will fucking kill myself.\n" +
                "\tAnd we—the pain and suffering professionals, we PhD holders about human suffering, we people in suits and stethoscopes—we stick needles into these people. We pump pills and therapy and prayers and hope into these people, until they actually kill themselves.\n" +
                "\tWe tell these people, cheer up, find meaning, find something you love, write poetry, paint a landscape. \n" +
                "      \tWhat we’re telling the world is, art is for the hurting, for the depressed, for the intelligent, for the poor.\n" +
                "      \tWhat we’re saying to the world is, as long as you’re rich and happy and healthy and both parents are alive and rich, art is not for you. \n" +
                "      \tYou’re a sell-out. \n" +
                "      \tYou never started from the bottom, so you can’t be here.\n" +
                "      \tWhat we’re saying is, flood art with pain because:\n" +
                "      \tWe are addicts of pity and pain.\n" +
                "         \n" +
                "\t Here, in the Center, dressed in stripped socks and hats and pencil jeans and white earphones and long fingernails pecking on smartphones like peckerwoods; dressed in different colors of sadness, here gathered generation pizza and phone apps. \n" +
                "      \tMe, honestly, I don’t know what I’m doing here.\n" +
                "      \tNo, not in this world of scented condoms and lube dispensers, but here, at Changez.\n" +
                "      \tHere is my introduction, and it involves a girl.\n" +
                "\tFirst, let me introduce what I do for a living.\n" +
                "\tFirst, let me introduce my hands.\n" +
                "\n" +
                "\tHours and days and months and years of pounding on metal, leave your palms as smooth as a truncated car tire. Then while other men worry about a weak erection or an empty wallet, your greatest worry is how, with rough palms like these, you are ever going to caress Claudia. You may smell of grease and oil and paint and dust and sweat. She may put up with that. She may put up with a sitting room decorated with automobile spare parts, but palms rivaling sandpaper is a total turn off.\n" +
                "\tMy life can be defined by verbs.\n" +
                "\tLifting, scrapping, sweating. \n" +
                "\tFixing. Crank shafts, brake disks, car doors, tires, and exhaust pipes for the last eight years. All I have to show for it is really huge forearms with a network of veins, and a bad sense of humour. \n" +
                "\tI hate music, art and laughter.\n" +
                "\tI don’t use words like I’m sorry and please.\n" +
                "\tI have no father, no mother, no friend.\n" +
                "\tI hate children and all public holidays.\n" +
                "\tI have no car, no house, no savings, no problem. \n" +
                "\tGo ahead. \n" +
                "Say it.\n" +
                "\tSay I hate myself. \n" +
                "\tSay I had an unpleasant childhood.\n" +
                "\tSay it. \n" +
                "\tAnd you could be right. \n" +
                "\tAnd you would have solved nothing.\n" +
                "\tYou see, some things, most things, they begin as a hobby, as a pastime, as an escape from pain, then they become the rest of your life. \n" +
                "\tWhat you should know is that I love fixing cars, the way some depressed people love sex.\n" +
                "\tEveryone has their fix.\n" +
                "\tAn escape.\n" +
                "\tMe, I’m doing this because I killed them. \n" +
                "\tIt was an accident. \n" +
                "\tA car skidded off the road, somewhere along Naivasha, and the next thing I see is my father's and mother's casket and flowers. \n" +
                "\tYou don’t want to remember every detail of a car accident.\n" +
                "\tUncle took me under his wings. \n" +
                "\t“Help with fixing cars down there,” he said. \n" +
                "\tTherapy sessions hadn't worked. \n" +
                "\tHe said, face your fears. \n" +
                "\tHe said, the more I fixed wrecked cars the more I dealt with the guilt of killing my parents. \n" +
                "\tThe guilt of insisting that I drive them to work that fateful morning of year whatever, day whatever. \n" +
                "\tYou have to learn to un-remember some details.\n" +
                "\tAnd he, Uncle M., was right.\n" +
                "\tYears later, instead of music, you prefer listening to a running engine.\n" +
                "\tInstead of poetry, you read Helms' Service Manuals until you fall asleep.\n" +
                "\tTo stay sane, I joined the club to hear people with worse problems than mine. People with rotting internal organs, young people afraid of living because society has to decide how you should use your genitals. All these stories they told with pent-up tears made me feel better. Not all of it was grin though.\n" +
                "\t\n" +
                "\tLike today, at the Center, next to talk is Kevin, another twenty-three year-old self-confessed social critic. \n" +
                "He is here because his father disowned him. Says he has attempted suicide seven times. He says he reads at least 200 books a year. \n" +
                "\tIt’s funny how college drop-outs read so many books. \n" +
                "\tFixation. \n" +
                "\tAnd he has self-taught himself a couple of programming languages, he is working on a social app and website, called Misfits, strictly for us delinquents to find love. And for this, he never left his Lenovo laptop behind.\n" +
                "\tA year ago, Kevin was gay. This year, Kevin is bisexual, because well, being gay has become too mainstream. \n" +
                "\tLook, you don’t have to believe everything everyone says here at the Centre. Today’s topic: Sexuality and Personal Freedom.\n" +
                "\tKevin shuts his laptop, with his index finger he adjusts his glasses and begins,\n" +
                "\t“Being gay has become too mainstream.”\n" +
                "\tHe continues. \n" +
                "\t“It used to be something of shock value. Some rebellion that got society listening. Now everybody is using it to promote a book, an album, a political agenda. \n" +
                "\tThis is what will happen if they legalize weed all over.\n" +
                "\tThe only hope we have left is incest.”\n" +
                "\tThere is chuckle in the room followed by a What?\n" +
                "\t“And this is how they will ruin incest, our only weapon against social conformity. It will begin with some celebrity saying in interviews in tears how he deeply loves his sister. How now he and his sister are getting married.”\n" +
                "\tKevin says, “Or it will begin with some cute R&B singer revealing through lyrics how she has always been having sex with her father. \n" +
                "\tShe will say, with a tremble in her voice, chocking in a tear or two, holding a Grammy award, how she wants society to respect who people choose to love. \n" +
                "\tThat just because it is father and daughter having consensual sex it doesn’t mean it’s not love.\n" +
                "\tOur genesis as a species is founded on incest.\n" +
                "\tWhichever book or theory you cling to, incest is our genesis.\n" +
                "\tAnd ever since, we have been evolving backwards.”\n" +
                "\t“And in 2024, in the States,” Kevin says, “a Democrat presidential candidate will use incest as campaign bait.”\n" +
                "\tWith a prophetic gesture, Kevin, this book addict, he says,\n" +
                "\t“While the rest of Africa will take it to the streets with twigs and placards protesting saying, incest is taboo, South Africa will have two blood brothers kissing, waving their wedding rings to the camera.”\n" +
                "\tThere is giggling in the room. You have to admire Kevin’s brilliant mind.\n" +
                "\t“And then Hollywood will start sneaking in scenes of sons banging their mothers into movies; sisters blowing their brothers; son and father fighting over mother-cum-wife in soap operas.\n" +
                "\tAnd a Kenyan teenager, with all this subconscious programming, will think this is cool. \n" +
                "\tAnd this Kenyan kid will one dinner evening tell her mom and dad that she and their son are getting married. \n" +
                "\tAnd then preachers will declare war on Satan.”\n" +
                "\tWhen this happens, according to Claudia, it's time to say a prayer. \n" +
                "\tClaudia isn’t a member of Changez.\n" +
                "\tShe is the girl I mentioned earlier.\n" +
                "\tAnd this is how we met.\n" +
                "\n" +
                "\tAround 4 PM.\n" +
                "\tMaina J a.k.a. Mista Fixa is slouched under the hood of this old Subaru filing rusty battery terminals and blowing at them.\n" +
                "\tA cigarette is melting at the corner of his mouth. \n" +
                "Maina J a.k.a. Mista Fixa, through spurts of smoke, says he wants to quit smoking. He has been saying this for years. \n" +
                "\tI tell him don't quit. \n" +
                "\tSmoke until your body says no. \n" +
                "\tSmoke until you start coughing blood and soot then you know it is enough. \n" +
                "\tThe body knows when it’s has had enough, and by then you’d be dead.\n" +
                "\tDon’t postpone your desires.\n" +
                "\tWe simply live to fulfill a body’s desires. \n" +
                "\tMaina, we are body slaves.\n" +
                "\t“Oh my, God. That's a terrible advice to give a friend.”\n" +
                "\tSays this brown-yellowish smile stretching out a palm for a greeting. \n" +
                "\tFollows another chocolate-dark smile followed by a handshake. \n" +
                "\tThe two, one 3.5 feet tall, the other 4.3 feet tall, are in long-ass frocks, with a Bible clutched where a handbag should be.\n" +
                "\tThey say, “I'm Claudia.”\n" +
                "\tPointing, “And this is Mercy.”\n" +
                "“We are from The Rapture Ministries and we have a wonderful message for you”, says Claudia.\n" +
                "\tOf course we know the message.\n" +
                "\tWe know these intruders. \n" +
                "\tThese pretty faith hawkers.\n" +
                "\tThey are little worse than a landlord's knock on your door in the morning; a little better than Jehovah Witnesses. \n" +
                "\tEvery month, these fishers of men held healing crusades around the country, from one city to another. \n" +
                "\tCripples and the blind walked and, behold, they saw. \n" +
                "\tCitizen TV, NTV and KTN streamed everything live. \n" +
                "\tIn the wailing sea of long-ass dresses and blue head scarves, I imagined Claudia and her friend there, tears shining on her tomato-smooth cheeks saying, “Thank you Lord, Thank you Jehovah Jire.”\n" +
                "\t\n" +
                "\tThe cult, born in Israel and imported to Kenya by some DNA scientist, demanded that they wear long-ass skirts with coats with long-ass sleeves. This is to wad off temptations, to insulate the body against sin. Once a while they rolled in ash and dressed in sacks. They don’t marry or date anybody outside their church. \n" +
                "\tBecause, light and darkness cannot mix.\n" +
                "\tBut here they were, in their clean shiny ground-sweeping dresses, preaching to two aprons reeking of grease and steel and diesel.\n" +
                "\tBored, I ask Claudia to leave her number in case I had more questions about Christ’s much hyped second coming. \n" +
                "\tMaina J a.k.a. Mista Fixa took advantage of this and he is asking them, \n" +
                "\t“Sasa warembo, is there a prayer that can help me stop smoking?”\n" +
                "\n" +
                "\tThis evening, after scrubbing off paint and grease stains from my nails and back of the ears, after a steaming plate of ugali-samaki, TV on mute, legs on the coffee table, a toothpick fishing food particles from my teeth, I call Claudia.\n" +
                "\tI say, Hello.\n" +
                "\tShe says, “Hi.”\n" +
                "\tI say, Tell me more about your church.\n" +
                "\tShe says, “We are preparing people for the rapture.”\n" +
                "\tRapture? I ask.\n" +
                "\tI ask, Is that like the sudden disappearance of people from earth?\n" +
                "She says, “Yes.”\n" +
                "\tI say, Hahaha. \n" +
                "\tSpitting a food particle from my teeth, I say, You actually believe that crap?\n" +
                "\tShe says, “Look mister don’t make fun of my beliefs.”\n" +
                "\tShe says, “Don’t you believe in the word of God?”\n" +
                "\tI ask, Which word? Because God surely has said many things.\n" +
                "\tShe says, “The holy Bible.”\n" +
                "\tI ask, Which Bible? Because surely there are many versions out there.\n" +
                "\tRaising her voice on the phone, she’s becoming emotional. \n" +
                "\tThis a sign of attachment.\n" +
                "\tNobody wants their god threatened.\n" +
                "\tShe’s asking why I hate God. \n" +
                "\tAnd I tell her hate is such a strong word. And I tell her it has nothing to do with my parents' death in a car crash when I was whatever age. The theory is, most atheists are believers God has disappointed in the past. \n" +
                "\tBut I tell her I just think the idea of some guy in the sky controlling every thought, fetish and emotion of eight billion humans on a blue grain of sand floating in the infinite sea of the cosmos is just plain dumb ridiculous.\n" +
                "\tI tell her she's being brainwashed by Prophet Beard Man and his The Rapture Ministries cult. \n" +
                "\tI quote Charles Dawkins. \n" +
                "\tShe says, “It ever occurred to you that you’re also being brainwashed by books?”\n" +
                "\tAnd right there she punches a hole in my ego.\n" +
                "\tNobody wants their beliefs attacked.\n" +
                "\tAnd I stutter and I say, \n" +
                "\tL-Look some people need God, others don't. \n" +
                "\tJust like how other people need a cigarette in the morning, others don't.\n" +
                "\tIt’s a lame analogy, but it seals the hole in my ego.\n" +
                "\tThen she mentions hills and planets and birds and trees and human races and said all these couldn't happen by chance. \n" +
                "\tAll this mysterious beauty.\n" +
                "\tI say, Claudia, some people look at the ocean and see poetry. Others look at it and see it for what it is: water. Some people look at the stars and see their lives' predictions. Others look at the same stars and see cigarette burns on the carpet of the sky.\n" +
                "And she says, “Who created you?”\n" +
                "\tShe says, “Or did you create yourself?”\n" +
                "\tOh, that cliché question. Oh that high school debate boring question.\n" +
                "\tI say to her I’m a work in progress.\n" +
                "\tI say to her Jewish God has nothing to do with me, a broke African car mechanic.\n" +
                "\tThis is more of a revelation.\n" +
                "\tShe says, “Jesus died for everyone.”\n" +
                "\tI say, Claudia, look: religious Jewish teachings appeal more to Africans because of the common historical prejudices they experienced: slavery and torture. Jews became stronger brilliant world masters while Africans became Bible-thumpers and baby-churning machines.\n" +
                "\tShe says, “Goodnight,” and hangs up.\n" +
                "\tShe calls back at around midnight, saying, “Peter, don't you see all these wars as a sign of God trying to tell us something? That the rapture is nigh?”\n" +
                "\tThen she goes on to justify war saying God is punishing humans because of sin. You know, sodomy, lesbianism. Sins of the flesh.\n" +
                "\tYou know, same sins, different punishments. \n" +
                "\tThe way our loving God did with Sodom and Gomorrah, because some men wanted to bang angels. \n" +
                "\tNoah, the ark and the flood. \n" +
                "\tBecause God saw how corrupt the heart of man is from his youth. The plagues. \n" +
                "\tBecause, because, because.\n" +
                "\tEven God, in his all-mighty power, needs an excuse.\n" +
                "\tBored, half-asleep, I say to Claudia’s ear on the phone, such God is an egomaniac who deserves to boil in the fires of hell.\n" +
                "\t“What—”\n" +
                "\tWhen we were kids, I continue, and you had beef with another boy, you drew a line in the sand. Whoever crossed it, was the hero and a fight broke out. Now we draw boundaries on countries and drop bombs over them. \n" +
                "\tThis is our part-time sport.\n" +
                "\t“Tell me you are joking.”\n" +
                "\tAbout war?\n" +
                "\t“About God being...that word.”\n" +
                "\tI say a slow, sleepy, \n" +
                "\tYup.\n" +
                "The phone stops talking.\n" +
                "\tThen she doesn’t talk for days. \n" +
                "\tWhen she talks again, it is a Bible quote popping on my phone about only fools say there's no God. A series of texts follow after that. Everyday a couple of texts about the Rapture keep popping up on my phone.\n" +
                "\n" +
                "\tThe following evening, I'm scrolling my phone at the bus stage waiting for a car. \n" +
                "\tWhat I'm actually doing is zooming in and out my photos with both of my thumbs—something I learnt from Maina J a.k.a. Mista Fixa. \n" +
                "\t“It makes you look busy,” he had said. \n" +
                "\tHe had said, “To look busy is important. Some people call this employment.” \n" +
                "\tBetween my legs, is a polythene bag heavy with groceries from Ukwala supermarket.\n" +
                "\t“Hey, look up or you will miss the world around you.”\n" +
                "\tSomebody says.\n" +
                "\tIt’s Claudia.\n" +
                "\t“How was your day today?”\n" +
                "\tCool.  How's life?\n" +
                "\t“Good in the Lord.”\n" +
                "\tShe says they have a Friday kesha in church.\n" +
                "\tLet's go, please.\n" +
                "\tI show her the shopping.\n" +
                "\t“Then this Sunday please come to church. Do it for me.”\n" +
                "\tCan't. \n" +
                "\t“Why?”\n" +
                "\tAll my clothes, they are dirty.\n" +
                "\t“God doesn't judge what's on the outside.”\n" +
                "\tI tell her church seems to me a place where people meet every weekend to compare clothing. \n" +
                "\tI tell her when I was young, all the best clothes were for Sunday service and Christmas.\n" +
                "\tShe says, “Ha ha ha.”\n" +
                "\tShe says, “The body is a temple and it has to reflect God's grace and abundance.”\n" +
                "\tI say, Amen.\n" +
                "\t“It will be the happiest day of my life if you come to church one day.”\n" +
                "From the assessment of it all, to her, I am God's project. \n" +
                "\tI am her test of faith to God. \n" +
                "\tI am the lost lamb.\n" +
                "\tAnd she is on a mission to rescue my soul from the devil's claws. \n" +
                "\tClaudia likes the fact that I don't drink, smoke or party. \n" +
                "\tAnd I’m a virgin.\n" +
                "\tI’m pure.\n" +
                "\tI am heaven material, I am worth saving.\n" +
                "\tTo save me, she implies, she will do anything.\n" +
                "\tThen do my laundry tomorrow. I tease her.\n" +
                "\t“You’re not serious. Are you?”\n" +
                "\tI nod.\n" +
                "\t“Sawa, where do you live?”\n" +
                "\n" +
                "\tThis is Saturday.\n" +
                "\tI'm outside the house on a wooden stool reading a Saturday newspaper. \n" +
                "\tI’m not reading the newspaper. \n" +
                "\tI’m thinking what would it take to smash this pretty thing in here?\n" +
                "\tTake note, I’m a virgin.\n" +
                "\tThis pretty thing crooning to some gospel ballad, is Claudia scrubbing the house clean. \n" +
                "\tMy clothes smell fresh on the hanging line.\n" +
                "\tAfter that she cooks.\n" +
                "\tNgwacé, chicken, chapati.\n" +
                "\tIt’s a little weird how you meet a girl and the next thing she’s playing housewife in your house. If this isn’t the antithesis to feminism then I don’t know what it is.\n" +
                "\tClaudia prays before we eat. \n" +
                "\tAfter we eat, she prays again, longer.\n" +
                "\tMy rough hand cupped into hers, both of us kneeling on the carpet, she's telling God to bless the work of my hands. \n" +
                "\tTo protect my humble home, to bring blessings. \n" +
                "\tTo protect me from fornication.\n" +
                "\tThen she prays for Kenya. \n" +
                "\t“The youth to avoid the sin of homosexuality, and miniskirts. The sin of women wearing trousers, men wearing earrings, Lord. \n" +
                "\tThe evil spirit of tattoos, sagging jeans, Yesu Kristo.\n" +
                "\tOh those night clubs where men sell their souls to poison in bottles, Lord. \n" +
                "\tGod, save your children from dancing. \n" +
                "\tDancing to the devil's music, Jehovah Jire. \n" +
                "\tWith a quiver in her voice she says Jehovah Nisi, let your people know cancer is retribution for sexual perversion.\n" +
                "\tLet your people prepare for the rapture.”\n" +
                "\tAll the while I’m imagining of lifting up her long-ass dress, see what thighs the good Lord has blessed her with. \n" +
                "\tOf all the irresponsible voters, the Sachangwani road massacre, morticians raping pregnant women at Kenyatta National Hospital, this pretty brainless chick is snitching to her God about clubbing and sex.\n" +
                "\tSo forgive me Father but right now I want to kiss her mouth to shut her up. \n" +
                "\tHer legs to the ceiling, me smashing the holy spirit out of her. \n" +
                "\tThings I see in porn.\n" +
                "\tTake note, I have never had sex.\n" +
                "\tMy only girlfriend is my hand.\n" +
                "\tI’m squeezing Claudia’s soft hand.\n" +
                "\tI’m having a boner when she says, “In Jesus's name I pray Holy Merciful Father,” and we both say,\n" +
                "\t“Amen.”\n" +
                "\tShe is saying goodbye.\n" +
                "\tShe says, “Remember to keep your promise.”\n" +
                "\tShe gives me a prayer book.\n" +
                "\tI say goodbye.\n" +
                "\tI slam the door and dash to the bathroom to do I don’t know what.\n" +
                "\n" +
                "\tThis is Sunday, 9 AM. \n" +
                "\tThis is me in pink shirt. \n" +
                "\tMe in blue necktie, blue pants. \n" +
                "\tMe in a groomed moustache. \n" +
                "\tShoes have to shine.\n" +
                "\tClaudia comes to pick me from the church gate saying, with a stretched smile, \n" +
                "\t“God, I can't believe that you came.”\n" +
                "\tYou just called me God, I say.\n" +
                "\t“Hey don’t blaspheme now,” she says.\n" +
                "\tIn the church, I take a plastic chair near the front row, near the pew. \n" +
                "People are mourning, singing their sins away. \n" +
                "\tA lady is bawling to the wireless mic, filling the iron-sheet walls with her voice. The sound system is poorly tuned so you have to snuggle a finger into your ear to save your eardrums. \n" +
                "\tClaudia just joins in. Her sweet voice is a silver lining. Whether she does it because I'm watching, it's hard to know. \n" +
                "\tEyes closed. \n" +
                "\tMumbling things to Jesus.\n" +
                "\tFull yellowish-brown cheeks. \n" +
                "\tHips that swell through the long-ass dress. \n" +
                "\tClaudia, a voluptuous bundle of admiration. \n" +
                "\tClaudia with a kind, raspy tone. \n" +
                "\n" +
                "\tI swear to God, every argument about God we have had, I and Claudia, my stupid brain translated it into foreplay. \n" +
                "\tDivine flirtation. \n" +
                "\tEvery Bible quote texted to me about the rapture was a decoded love message.\n" +
                "\tThen we which are alive shall be caught together with them in the clouds to meet the Lord.\n" +
                "\t(1 Thessalonians 4:17)\n" +
                "\tMy stupid brain’s translation: \n" +
                "\tI and Claudia shall together walk down the aisle; her in a bubbly wedding dress white as a cloud.\n" +
                "\tI tell you, in that night there shall be two in one bed; the one shall be taken, and the other shall be left. \n" +
                "        (Luke 17:34)\t\n" +
                "\tMy stupid mechanic brain’s translation: \n" +
                "\tI and Claudia shall have sex so hot and rough that one of us will run away from bed.\n" +
                "\tImmediately after the tribulation of those days shall the sun be darkened, and the moon shall not give her light...and the powers of the heavens shall be shaken. \n" +
                "\t(Mathew 24:29)\n" +
                "\tMy stupid never been laid brain’s translation: \n" +
                "\tI and Claudia shall be covered in the blanket of darkness, groping our God-given bodies, the whole bedroom shaking.\n" +
                "\tSeeing her here, in the podium, you have to study her.\n" +
                "\tBeneath the trimmed long-ass coat with matching blue long-ass dress that reached the ankles, beneath the layers of soft silk inner dress that showed at cuffs of her coat, beneath the repentance and holiness aura, beneath the lifted face to the church roof and arms praising and worshipping in surrender, lay a yellowish-brown fat pussy.\n" +
                "\tForgive me Father but I want to multiply her beauty and fill the earth with her genes.\n" +
                "\tTo avoid having an erection in church, I imagined Claudia burning in hell. \n" +
                "\tI imagined her body half burnt, half rotting. \n" +
                "\tAs she joyously praised the Lord for all he has done for her, for us, for you and me, I imagined her mouth in flames. \n" +
                "\tI imagined a colony of houseflies buzzing around where her pubic hair should be. \n" +
                "\tTo avoid lusting after this betrothed angel of God, I imagined her breast nipples being nibbled by rats.\n" +
                "\tWhen lust tempts your body, Claudia had told me, say a prayer. Any prayer.\n" +
                "\n" +
                "\tToday, a Monday at work.\n" +
                "\tToday, for some reason, Claudia is on my mind.\n" +
                "\tToday, in my apron, changing the tire, I’m just in high spirits, whistling when the hydraulic jack slips and a brake disc catches my hand. \n" +
                "\tBefore I could yell enough, for four guys to set aside their githeri plates to come and lift the car, I am staring at deep white tissue across my palm. \n" +
                "\tBlood mixing with grease. \n" +
                "\tFor the next twenty something days, after pus has all dried up into yellow smudge, I will walk around with a sling and a plaster wrapped around my left hand. Just to show the world my pain. The truth is, my two fingers are broken and my nerves hurt like hell. I can’t even afford to wipe my ass with my left hand.\n" +
                "\tSo even after the scar is completely healed, I will still wear that bandage until it turns grey with dirt.\n" +
                "\tWhen they ask me at the Centre what happened, I lie that I cut myself hopping to bleed to death.\n" +
                "\tThen they snap their fingers, laughing, saying Peter you’re an asshole.\n" +
                "\tYou can't sit through listening to people pour their pain without showing some vulnerabilities yourself.\n" +
                "\tPeople love you when you share pain. \n" +
                "Where pain is concerned, people don't like indifferent people. People hate it when you can swim while everyone else bitches about how strong the tide is, how tough are the times, how politicians keep looting.\n" +
                "\tNo, they want pain, they want all humanity hurt and complaining.\n" +
                "\tAnd it’s Claudia I’m thinking about.\n" +
                "\tThe person you think about when you’re in pain, that’s your God.\n" +
                "\n" +
                "\tI call her ask her to come today to the Centre. To see the invisible crosses and crowns of thorns people carry around.\n" +
                "\tShe asks what really went on. \n" +
                "\tWho what why. \n" +
                "\tI tell her.\n" +
                "\tShe says no. An evil spirit was at work if what I had mentioned was really what people talked about. She asks me if I was one of them, you know, perverts.\n" +
                "\tSocial miscreants.\n" +
                "\tI tell her no. I tell her here was the only place I felt I belonged. \n" +
                "\tI tell her church was a blanket that left my feet cold. \n" +
                "\tI tell her here, this is how these people prayed. I tell her prayer doesn’t have to necessarily contain gods and complaining and asking for blessings. I tell her prayer can be our silent wishes and pain and war and our fears and our dreams.\n" +
                "\tShe says, “Every day I’m praying for you, Peter.” \n" +
                "\tMy stupid heart’s translation: \n" +
                "\tEvery day I am thinking about you, Peter.\n" +
                "\tI tell her thanks.\n" +
                "\t“But tomorrow,” she says before hanging up, “I’ll tell you something I’ve never told anyone.”\n" +
                "\tThis kind of promise leaves a tight knot in the floor of your stomach.\n" +
                "\tAnd a few months later, you will learn that just because someone shares all their secrets with you, it doesn’t mean that they will not betray you. It doesn’t mean that they will not leave, along with their shared secrets and share them with someone else. \n" +
                "\tAnd that someone else will think they’re special, the way you do now.\n" +
                "\n" +
                "\tSince I can’t work at the garage, because my left hand is semi-paralyzed, I’m at the Center listening to problems. Today, at the Centre, on the hot-seat, is this chick with Gothic tattoos called Benta.\n" +
                "\tThe topic is: My Deepest Secret.\n" +
                "\tBenta is 27. \n" +
                "\tBenta has slender arms, a wide mouth and her hair is a giant knot of black thread.\n" +
                "\tBenta is a former nanny and domestic offender. According to her confessions, one could make money eeeasily in this depraved country. All you need is several fake IDs. Then roam from posh home to posh home looking for a nanny job. Since most of these bourgeoisie one-kid one-car banker-husband moms don't do any background check and only hire nannies through relatives and friend referrals, you could make money stealing their clothes, jewelry or abduct their child and ask for ransom.\n" +
                "\tBenta says, “You could make a lot of money lying.”\n" +
                "\tShe says, “Lying is the key to wealth.\"\n" +
                "\tBenta says the day she was caught, she was molesting a boy. Says she used to masturbate by touching herself while fondling the kid's penis when her bosses were at work. That now she's addicted to touching herself. That everything in her house from cooking sticks, hairbrush handles, the bristled end of a tooth brush, empty slender deodorant containers, a slender nail brush bottle, a spoon, a frozen sausage have all given her pleasure.\n" +
                "\tSomebody from the audience asks if she has  a history of sex abuse.\n" +
                "\tShe says, “Yes. My step-dad.” \n" +
                "\t“I was ten. He broke my virginity. He had just met mom after a month. He kept fingering me, kept kissing me and saying some awkward stuff, and I let him. As I grew up, every night I would touch myself before falling asleep. As I grew up, me and my step-dad, we did it once or twice before I left home because I got pregnant. I aborted the thing and got my first nanny job in Kapsoya. \n" +
                "\tScrub the house and pots during the day, scrub my clit for hours during the night.”\n" +
                "\tBenta chuckles and says,\n" +
                "\t“So one day, I'm feeding this kid on my lap and he pees and his tiny thing is erect and I touch it and then I'm horny and the kid is like 2 years old, right?”\n" +
                "\n" +
                "\tClaudia just texts saying she’s on her way to see me.\n" +
                "\tI dash out, leaving Benta narrating her inspiring story.\n" +
                "\n" +
                "\tI serve Claudia with a glass of juice out of the fridge. I pour a little juice myself.\n" +
                "\tWe’re sunk in this cool sofa I bought and we’re watching TV. She flicks the remote to Sayare TV. Some preacher is yapping some sermon.\n" +
                "\tSo I ask, What’s the big secret?\n" +
                "\t“I have not always been a church girl.” She begins. This is more of a confession.\n" +
                "\tAnyway, I will tell you what she’s telling me.\n" +
                "\tThat she loved to party. \n" +
                "\tIt’s fresher’s night and she wants to lose her virginity. \n" +
                "\tThis handsome guy, a third year drives her to his apartment. But this dude, he has no rubber. She is afraid to get pregnant, get a disease or whatever first timers are afraid of. This dude is insisting. She is screaming. He is slapping her, punching her face in. He goes to the kitchen. She is running out, clutching her clothes to her chest, screaming her lungs out. The dude grabs her and stabs her.\n" +
                "\tClaudia rolls up her blouse to show me a scar under her left breast. \n" +
                "\t“Since then, I decided to give my life to Christ. I decided no man is ever going to touch me. Until God shows me the right man.”\n" +
                "\t“You see this,” pointing at her lower teeth, “these are fake.”\n" +
                "\tWhat happened to the bastard? I ask.\n" +
                "\t“My father wanted him in jail but I told him to forgive.”\n" +
                "\tI want to hug Claudia, wipe away an invisible tear drop.\n" +
                "\tI want her to spend the night.\n" +
                "\tSo I can kiss the scar away.\n" +
                "\tI don’t tell her that.\n" +
                "\tI know she can’t stay.\n" +
                "\tStill.\n" +
                "\t\n" +
                "\tTuesday, this evening, after supper, I’m taking my chances. \n" +
                "\tI text:\n" +
                "\tI think I’m falling for you.\n" +
                "\tShe goes offline.\n" +
                "\tThen later: \n" +
                "\tTyping...\n" +
                "\tTyping...\n" +
                "\tTyping...\n" +
                "\tHave I gone too far?\n" +
                "\tBut then a text:\n" +
                "“But you know my stand. I just want to serve the Lord.”\n" +
                "\tI text:\n" +
                "\tOK.\n" +
                "\tHere we are, two virgins afraid to love each other because her God is interfering. \n" +
                "\tAll I want is to get laid before I die in a car crash to meet my parents. \n" +
                "\tBecause according to Maina J a.k.a. Mista Fixa, what you love doing is what will kill you. And I love doing cars, as a distraction. Every time I test drive a client’s car, I have this urge to ram into an electric post and end it all.\n" +
                "\tA text:\n" +
                "\t“Even if I accepted our church is very strict.”\n" +
                "\tI text:\n" +
                "\tOK.\n" +
                "\tA text:\n" +
                "\t“I can only accept if you promise to attend our church.”\n" +
                "\tKevin is right, sometimes. Unconditional love doesn't exist. You see, even Jesus's sacrifice comes at a price: obedience. \n" +
                "\tAccording to Kevin, all the freedom fighters' sons and grandsons are the ones running African governments. \n" +
                "\tEverything is for sale.\n" +
                "\tWhich is to say, nothing is for free.\n" +
                "\tA text:\n" +
                "\t“Just so you know, I think I'm falling for you too.” \n" +
                "\tThere is a tight knot in my belly.\n" +
                "\tThere is water in my armpits.\n" +
                "\tThere is a text:\n" +
                "\t“But I will ask God for an answer first.”\n" +
                "\tI text:\n" +
                "\tWhat answer?\n" +
                "\tA text:\n" +
                "\t“If you're the right one.”\n" +
                "\tI text:\n" +
                "\tLol. \n" +
                "\tI text:\n" +
                "\tOK, OK. \n" +
                "\tI text:\n" +
                "\tSleep well.\n" +
                "\tA text:\n" +
                "“God bless your night, PK.”\n" +
                "\tYou wake up three or four times a night like this to read and re-read this chat.\n" +
                "\tAnd then you know your stupid brain has gone full psycho.\n" +
                "\n" +
                "\tThis afternoon, these social snobs at the Center are dissecting, according to professor Kevin, the most boring topic of all time: \n" +
                "\tLove, Love.\n" +
                "\tKevin, the 23 year-old self-confessed freethinker, mister smart pants, is saying this:\n" +
                "\t“Love is not flowers and the moon and a kiss and wine.\n" +
                "\tLove is norepinephrine, that chemical that speeds your heart.\n" +
                "\tLove is dopamine, another chemical reaction that makes your armpits jelly when your crush answers your phone call.\n" +
                "\tLove is phenylethylamine, the hormone that gives you a boner triggering animals to mate and propagate the human species.\n" +
                "\tLove is oxytocin that makes you want to fly two planes into a building that houses that nigga, you know, who’s banging your girl.”\n" +
                "\tWe laugh, we snap our fingers.\n" +
                "\t“From birth to death, your job is to obey these chemical reactions in your brain and feed them. Humans call these neurotic reactions anger, hunger, loneliness and love.\n" +
                "\tLove is a virus in the brain. That sentimental bullshit that has left you with lifetime emotional wounds.”\n" +
                "\tI hate his guts, this guy Kevin. He is an asshole. \n" +
                "\tWhat I feel for Claudia isn’t some fucking hormones. \n" +
                "\tIt is real.\n" +
                "\n" +
                "\tSo real that I spend more Sundays in church with Claudia than in this hopeless den. Listening to miserable whiners.\n" +
                "\tFor the next four Sundays I just sit bored there, in the church. \n" +
                "\tAccording to Maina J. a.k.a Mista Fixa, man can put up with anything for the sake of pussy. \n" +
                "\tTell a man to swim across the Indian Ocean from Mombasa to Archipelago for the sake of pussy, he will. \n" +
                "\tDo this every week, and church is defined by verbs: standing up, sitting, clapping, tithing.\n" +
                "\tListening to all your human mistakes getting labeled as sins. \n" +
                "Then close your eyes and let’s pray.\n" +
                "\tYou watch people pray and you're thinking, \n" +
                "\tLook at these robots. \n" +
                "\tRobots mumbling to their software designer. \n" +
                "\tTelling the software designer how grateful they are he made them: slaves to his binary commands: on-off, off-on, off-off, on-on, off-off-on, on-off-off. \n" +
                "\tThese robots are scared of the day the software engineer will return like a thief and kill all robots except the ones who obeyed and executed all commands embedded in their micro-chips. \n" +
                "\tThese robots may even fight with other robots over whose programmer is the geekiest. \n" +
                "\tAll is not lost.\n" +
                "\tBecause you, Peter Kiguru, are getting saved.\n" +
                "\tA different kind of salvation.\n" +
                "\tAll this hanging out and fighting for God’s attention with Claudia is becoming an emotional bond. \n" +
                "\tIt doesn’t take long before Claudia starts talking weddings. \n" +
                "\tThis is how most relationships begin: by mistake; and after three years, all you have is a failing marriage, or suicidal thoughts. \n" +
                "\tOr murder.\n" +
                "\tClaudia is inviting me to weddings. \n" +
                "\tPeople cutting cake. \n" +
                "\tPeople blessing these holy unions. \n" +
                "\tSoon enough, you begin to picture you peeling up the wedding mask to meet Claudia’s smiling mouth; people clapping in the church. Preacher saying by the power invested in him, then kiss the bride. \n" +
                "\tYour stupid never-been-truly-loved brain begins to picture Claudia wife-ing around the house with a swollen tummy. \n" +
                "\tShe in mood swings. \n" +
                "\tShe eating soil because minerals, because cravings.\n" +
                "\tSoon enough, the guys at Mwangi Auto Repair garage next to Sosiani River have to know that you're becoming a family man. \n" +
                "\tDays to go home, masturbate and sleep with lower back pains, alone, are over. \n" +
                "\tAnd by masturbate it means you have to soak your palms in water first, then soften them with lotion because they’re so rough. And because your left hand is so completely paralyzed you can’t make a fist, adjusting to rub your wood with your right hand could be quite a task.\n" +
                "\tNothing is easy as you think.\n" +
                "\tSome nights you used to go to bed with a bottle of hot water hugged to your chest. This tricks the body into believing another human was next to you, then you would sleep, then you would dream about Claudia’s mouth cupping yours, tongues finding each other.\n" +
                " \tNow imagine, you, a miserable car appliance addict, you, an abandoned orphan, you, a jerking off addict, marrying a church girl. Church girls, according to Mista Fixa, are believed to be the most faithful lot.\n" +
                "\tBecause adultery is not in God’s to-do list.\n" +
                "\n" +
                "\tThis evening, with Claudia at Mursik Cafe sipping some tea. This morning she had texted saying she has something to tell you.\n" +
                "\tThat knot at the basement of your stomach made sure you reach here two hours early and wait, revising your nightly chat texts.\n" +
                "\tShe is saying, “I know you're a non-believer, but I love you.”\n" +
                "\tOh God, this is not happening.\n" +
                "\tOh God, I don’t deserve to be loved.\n" +
                "\tShe’s saying, “Believe it or not, when I sing  in church, I sing for you.”\n" +
                "\tI’m looking at her mouth. Oh these words, these sweet words that come out of her small red lips.\n" +
                "\tShe’s saying, “I open the Bible and your name, Peter K is there.”\n" +
                "\tShe sighs.\n" +
                "\t“But I have told my parents, they're against it. No daughter of theirs is going to marry some car mechanic atheist.”\n" +
                "\tShe must have seen the reaction on my face. \n" +
                "\tShe says, “I’m sorry. I didn’t mean to sound like that.”\n" +
                "\tMy stomach is clenching into a small fist.\n" +
                "\t“Tell you what. So you be a good boy and keep coming to church for two months only and then we'll announce our wedding plans. This should be our little secret, Peter.”\n" +
                "\tShe then reaches out across the table and rubs my hand. My left paralyzed hand. For some reason, this reminds me of Jesus and the ten lepers. This here, is a touch of God. \n" +
                "\tThis is here, I tell myself, is the ultimate sacrifice. This is why Judas did what he had to do: people do what they believe serves their best interest.\n" +
                "\n" +
                "\tSo you, your newly loved heart on wings, you quit going to the Center altogether.\n" +
                "\tLight cannot mix with darkness.\n" +
                "When you’re saved, you leave the old world behind. The world of people whining about employment and disease and discrimination, you don’t belong there anymore.\n" +
                "\tNow saving money starts. \n" +
                "\tAfter a day of scrubbing metal, sucking in brake fluids, you pass by a gift shop to see what necklace to buy. \n" +
                "\tTo ask where do I find wedding dresses and, and event planners and, and, how much would they cost?\n" +
                "\tFor the first time, living life for another person feels like this: purpose, meaning and butterflies.\n" +
                "\tNo more isolation. \n" +
                "\tNo more trapped in your own anti-social bubble in a one bedroom apartment. \n" +
                "\tAll those disillusioned kids at the Center? All they need is somebody to love. Love is the cure, and it’s free. But since, we’re addicted to attaching a price to everything, we buy love in small packages of dating apps, rose flowers, money, marriage, and unrealistic promises.\n" +
                "\n" +
                "\tThis afternoon she calls saying, “Can we meet? I have something to tell you.”\n" +
                "\tSo we  meet at the top floor of Hotel Comfy. \n" +
                "\t“There is a mega crusade in Kisumu and I have to go, I must go.”\n" +
                "\tI say sure.\n" +
                "\tSure, bold-lettered posters and billboards bearing the revered image of Prophet Beard Man announcing a major healing revival, are all over the streets for the past two weeks. TVs have been flashing a one-minute commercial about the same. Showing the prophet in slow motion as he, in one hand wave, sends a crowd of women fainting and crying. \n" +
                "\t“It will take a week.”\n" +
                "\tI say OK. \n" +
                "\tAnd we hug each other. \n" +
                "\tI want to cry.\n" +
                "\t“Keep praying for us.”\n" +
                "       Still hugging, her right hand rubbing my back.\n" +
                "\t\"Remember our plan.\"\n" +
                "       Letting go of the hug.\n" +
                "       \"I love you, take care.\"\n" +
                "       I don't say a word.\n" +
                "       I'm tongue-tied.\n" +
                "       I'm loved, I'm tongue-tied and she's leaving.\n" +
                "\t\n" +
                "\tAfter she leaves you can’t help but start counting down the days and each day is 100 hours long. \n" +
                "\n" +
                "\tSo today is the second day since she left.\n" +
                "\tShe WhatsApps photos of the stadium jammed with people who need saving from disease, poverty, broken marriage, unemployment, childlessness. \n" +
                "\tPeople who are leaving this world behind.\n" +
                "\n" +
                "\tToday is the fifth day and she is online less and less.\n" +
                "\n" +
                "\tToday is one week after she left and she's permanently offline. This is expected when people find something meaningful to do.\n" +
                "\n" +
                "\tToday is two weeks and I don't hear from her. \n" +
                "\tNo call is received. \n" +
                "\tNo text message is delivered. \n" +
                "\tThe mobile subscriber cannot be reached. Please leave a message.\n" +
                "\tIt’s the first time in my life I want to smash the phone on the wall.\n" +
                "\n" +
                "\tToday is the third week since she left.\n" +
                "\tI call her sister.\n" +
                "\tShe has not come home yet.\n" +
                "\t“Ah, we ndio Pita?”\n" +
                "\tEeh.\n" +
                "\t“Akirudi ntakwambia tu.”\n" +
                "\tSawa.\n" +
                "\n" +
                "\tToday, it’s one month since Claudia left for the Mega Healing Crusade.\n" +
                "\tSince she left, I have started drinking and smoking because I can’t sleep.\n" +
                "\tBecause I can’t think of anything else.\n" +
                "\tAnd I keep calling. The recorded voice of Miss-Whatever in Safaricom keeps saying, The mobile subscriber cannot be reached. Please leave a message.\n" +
                "\tPlease leave a message?\n" +
                "\tOkay.\n" +
                "\tI take a mouthful of this Black Label bottle and I say to the phone, Look I miss you. Please try to call me back, or text back or send me an emoji, anything. Please. I love you.\n" +
                "\n" +
                "Day two. \n" +
                "\tI dial the phone. The mobile subscriber cannot be reached. Please leave a message. \n" +
                "\tI say to the phone, Please. I love you, text me, text me, call me, come back. I love you, love you, love you, bye.\n" +
                "\n" +
                "\tDay three. \n" +
                "\tI am having a conversation with Claudia on the phone except that there's no Claudia on the phone.\n" +
                "\tI am saying, Actually, it never occurred to me that I would ever fall in love with a church girl. It never occurred to me that I would ever fall in love at all. How would I deserve love from someone like you? Please come home as soon as the crusade is over. I love you. Goodnight.\n" +
                "\n" +
                "\tDay three, two hours later.\n" +
                "\tI am thinking, this night she has to know the truth. Maybe this will jostle her into calling back. I dial her number again. The mobile subscriber blah blah, leave a message. \n" +
                "\tI say, The truth is I actually killed my parents, Claudia. \n" +
                "\tI swallow a mouthful of Bluemoon vodka and I say, I loved my Mom and my Mom loved me she used to bathe me up to when I was twelve years old. She used to touch my face and my legs and my hair and tell me I was a pretty boy. She would let me touch her hair too, breasts, and it felt so good. Then my father started cheating on her. What I overheard him say was she couldn’t give him another child. So he was cheating. And I hated him. And in every way you remind me about my Mom. \n" +
                "\n" +
                "\tThis has become a ritual. \n" +
                "\tA personal prayer.\n" +
                "\tEvery night after leaving the garage, after cooking, after eating—if you can call it that, after going to bed, with a bottle of hard liquor on my night-stand, before falling asleep, I have to talk to the phone, I have to confess my feelings and my fears and my undying love to my savior, Claudia. Things I never shared with the other tormented, unloved souls at the Centre. After that I would jerk off either to the memory of the face and hips of Claudia or her voice when she sings in church. My jeans don’t fit me anymore. \n" +
                "\tNote, I’m losing weight.\n" +
                "\tAlso note, I’m losing my will to live.\n" +
                "\tAlso note, have stomach ulcers.\n" +
                "\n" +
                "\tDay four.\n" +
                "\tAnd I'm saying this after the tone:\n" +
                "\tAfter my mother found out Dad was cheating on her, they fought every night. And he slapped my Mom she started wearing sunglasses to cover up bruises. And I resented him. \n" +
                "\tSo this morning they are arguing again and they are both leaving for work. I tell Dad I want to drive. When you’re an only son to two rich parents, you can get what you want. Like driving by the age of eleven. So Dad, he gives me the car keys, he sits in the passenger seat while Mom is in the back. I am driving. I am thinking this selfish stranger here is not my Dad. I am thinking why can't he just die. I am thinking this when I hit the pothole and another and I am losing control. And Dad is trying to grab the wheel with me. But we are now off the road and....Look, Claudia, I love you.\n" +
                "\n" +
                "\tIt’s not like Oedipus complex is anything Claudia would understand. In Claudia’s version, it’s like Jesus stabbing Joseph to death because he loved Mary too much. It’s like Jesus shooting God in the face.\n" +
                "\n" +
                "\tSo after two hours I dial the phone again. And I tell her:\n" +
                "\tLove me now, or I will kill myself.\n" +
                "\n" +
                "\t*\n" +
                "\n" +
                "\tToday, it’s the second month since Claudia left.\n" +
                "\tIf I dial the phone, this is what it says:\n" +
                "\tThe number you're dialling is currently out of service.\n" +
                "\tSo I have stopped talking to the phone.\n" +
                "\n" +
                "\tJust so you know, I have paid for everything.\n" +
                "\tFor our wedding. \n" +
                "\tTents, chairs, and wedding clothes, and my boys at the garage have booked suits.\n" +
                "\tDark blue with white neckties, I told them.\n" +
                "\tClaudia will love the combination.\n" +
                "\tUncle M. and Auntie will be my guardians.\n" +
                "\tWe are set, ladies and gentlemen.\n" +
                "\tAt least, make my mama and papa proud.\n" +
                "\tThe only problem is, Claudia’s phone is dead and she has never returned from the crusade.\n" +
                "\tHer sister doesn’t answer my calls anymore.\n" +
                "\n" +
                "I went to church yesterday.\n" +
                "\tShe wasn’t there.\n" +
                "\tBut a rumour was there.\n" +
                "\tThe rumour is confirmed when photos begin floating on Facebook.\n" +
                "\n" +
                "\tRumour is truth in denial.\n" +
                "\n" +
                "\tThen you don't believe what you see. \n" +
                "\tHow could you?\n" +
                "\n" +
                "\tWhat you see means you will always be an orphaned virgin sniffing grease and car paint and oil and pounding on metal until the sun sets permanently.\n" +
                "\n" +
                "\tWhat you see is a blue stripped suit, a broad grin on fat cheeks, a tiny scar right in the middle of his forehead, standing next to Claudia.\n" +
                "Holding Claudia’s hand. \n" +
                "\tClaudia in a milk-white wedding dress. \n" +
                "\tThe dress you have imagined a thousand times.\n" +
                "\tYou scroll the comments and they say congratulations Pastor Etc. Etc. \n" +
                "\t“Congratulations Pastor on finding such a good wife.”\n" +
                "\t“God truly works,” the comments say. \n" +
                "\t“He who finds a wife finds a good thing,” the comments say. \n" +
                "\tEvery comment is a stab right into your orphaned, unloved heart.\n" +
                "\t“Congratulations, Claudia,” the comments say.\n" +
                "\n" +
                "\tNow.\n" +
                "\n" +
                "\tWhen you feel betrayed and rejected, say a prayer.\n" +
                "\tWhen you realize you were being played, say a prayer.\n" +
                "\tWhen you realize all she left behind was a prayer book, say another prayer.\n" +
                "\tThen throw that book through the window of the fifth-floor of your one-room apartment and watch the pages flip flap and hit the ground below, and silently wish it was you.\n");
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
                Intent intent = new Intent(Prayer.this, Contents.class);
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
                String shareBody = "Love story with a twist! #LoveMeNow";
                String shareSub = "Love Me Now or I Will Kill Myself";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share with friends..."));

                break;

        }

        return super.onOptionsItemSelected(item);
    }
}