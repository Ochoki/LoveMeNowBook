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

public class Run extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run);

        Button previous = findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Run.this, Part2.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "PART TWO",
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Run.this, Children.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Page 12",
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView textView = (TextView) findViewById(R.id.text);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("I.\tA mosquito French kisses your neck and one morning; you are tasting your own liver in your mouth. You can hardly eat or breathe.  You drag yourself to Twic Mission Hospital.\n" +
                "\t\tThis is June.\n" +
                "\t\tIt has not been raining for the past six months. \n" +
                "\tNow it is raining. Now a million life forms are being resurrected in these jungle hills that bear pockmarks of years of conflict. Now mosquitoes hum like a million sirens. Now all types of bugs and scorpions that would paralyze your nervous system within hours crawl up the walls of your block square room. Now, yellow spiders with red appendages scamper across the floor and you whack them with slippers again and again and again until smithereens of pink patterns decorate the floor.   \n" +
                "\tNow, mosquitos kiss deeply and leave tiny bloated bumps on any naked patch of your skin. It is fatal foreplay. You scratch the itches for hours until they turn purple. Some itches are orgasmic when you scratch them. Like the kind of sweet itches you have on your chin after a bad shave. So you scratch until you bleed. Then scratch some more. \n" +
                "\t\tAt the hospital, an untrained Dinka nurse is filling your form:\n" +
                "\t\tAge? \t\n" +
                "\t\t28\n" +
                "\t\tMarried?\n" +
                "\t\tYes.\n" +
                "\t\tWeight?\n" +
                "\tNot sure. You hop on the emerald weighing sale. \n" +
                "\t\t77 Kgs. \n" +
                "\tThey diagnose you with malaria. The worst type. The too-many-children-die-from-malaria-in-Sub-Saharan-Africa statistical type. They dart your butt with injections. And prescribe big pink tablets that would choke your throat unless you grind them into vinegar paste, and then drown them with water. \n" +
                "\tTwo days in bed things get worse. You have mouth ulcers. Your throat feels like an army has stomped through it. Since you can't swallow saliva, you let it dribble down to the pillow. It is the yellow juice of death. You can smell it in your beard. You have the loose bowels that empty your stomach of any excuse of a meal you have willed yourself to have. \n" +
                "\tDecades ago, your mama would cajole you, Please eat something, Brian. Pleeease. And you would shake your head slowly and you would order things. Things mom wouldn’t buy under normal circumstances unless it was Christmas. \n" +
                "\tNow you are alone in the middle of war and your body is one big sore. You are too weak to even wipe your ass. You vomit your guts out. Dark green stuff. Your room smells like a pharmacy and a mortuary.  But you don’t care because for years in this part of Africa, you have become accustomed to the sweet stench of decay. A reminder that the body is in perpetual decay. That existence is nothing but slow decay—the ultimate salvation. \n" +
                "\t\tYou are alone. \n" +
                "\tYou have always been alone. You don’t socialize. You don’t talk to people. Most of all, you don’t talk about pain and problems. This means you don’t care much about people’s pain and problems. So nobody technically knows you are about to die so they can start caring. The good thing with death is that that’s the only time you will ever be truly alone and at peace. As long you’re breathing, loneliness—not as in desolation or self-pity or attention deficiency or lack of love; but solitude—is something you will never totally experience. It’s a romantic notion pseudo thinkers and poets and snobs peddle around in the hope of looking unique. \n" +
                "\tThe supervisor had sent an e-mail on Tuesday. You are to e-mail logistics to the UNHCR Nairobi office. Today is Sunday. You are too weak, too detached to even open your laptop. Light stings your eyes. Sound tastes like acid to the ears. Food sounds like garbage. You only want water. Maybe an energy biscuit a day. Which makes you drink more water. \n" +
                "\t\tNature is fluid.\n" +
                "\t\tFay walks in. Fay is the assistant supervisor and—\n" +
                "\t\t\tJesus Christ, why didn’t you tell me you are sick? She is delirious. \n" +
                "\tAmid weak coughs you tell her it’s nothing. That you will be up and running within a day. She dashes out and comes back with juice, more energy biscuits, fresh towels and bed sheets. She helps you up and moves you out to the shade under the green neem tree. Puts a pillow under your neck and tells you fresh air is revitalizing. \n" +
                "\tShe goes back to scrub the pigsty that is your room. Rinses all the linen and curtains dry. Sets everything in place: files, laptops, cameras, notepads, and cabinets and shoes and those untouched books Sr. Lorna gave you before flying to Netherlands. Fay sweeps away all the trash: dry pens, pencil stubs, broken earphones, dry beans and rice grains, dry cells, rat shit, burnt matchsticks, cigarette-butts, paper, dry blobs of chewed gum, dust, dead bugs, live bugs. How did you even breathe in that sea of trash? Fay burns the junk in a small fire outside the compound. The way you imagine god will burn all the human trash invading his beautiful planet.\n" +
                "But Fay comes with bad news. The boss is mad as hell as why you haven’t e-mailed the logistics. \n" +
                "\tWhich means we can’t order another delivery of food and medication next month. Which means if you don’t respond as soon as possible there are many people willing to take your position. \n" +
                "\tThat is the cliché you always loath with employment. The threats of being fired. Being replaced, if you don’t beat a single deadline. \n" +
                "\t\tMore bad news.\n" +
                "\tWar has broken out afresh in Jongrel, 60 kilometers from Heglig, the rebel military base. Which means we need to send camera crew down there and your signature is needed, Fay says. Which means we may need more supplies for the imminent causalities. Which means you should have sent the logistics five days ago. Which means—\n" +
                "\t\tDamn it, Fay, can’t you see I’m completely incapacitated? \n" +
                "\t\tFor effect, I break into a coughing fit and she says, \n" +
                "\t\tFine. I will help you do it. \n" +
                "\t\tThanks. I mumble.\n" +
                "\tShe goes through all the files and records I had updated and e-mails them using my account. I trust Fay, Fays trust me as far work etiquette goes. She is Italian and I’m Kenyan. She is not married and I am. She smells good someday and high-fives everyone in the office but someday she comes to the headquarters in her pajamas, hair unmade, grumpy like a drowned cat. Some days I thank the sky for my job, some days I wish all my workmates were dead. Some days I grit my teeth at all the rich nations benefitting from this war, some days I think population reduction is necessary by all means if Africans have an appetite for a really good life. So let them maim each other a little bit more. \n" +
                "\t\tThese are the bi-polarities of a relief worker. \n" +
                "           Because the first time you step in a refugee camp you want to cry asking god why why why. You want to reach out and hug all the children. You want to adopt a couple of them. You question god’s motive towards his creation master plan. You fall into depression in your first two weeks. You get homesick. How can people live like this? \n" +
                "           You want to help build a tent, give your clothes to the old, give money and  sweets to the kids, write a book, write tear-jerking poetry, sell everything you own and donate your money, start a relief fund. You look at the refugees the way Jesus would look at ten lepers. \n" +
                "            A child's running nose is blocked with fat black flies.  There’s a cholera outbreak.  You want to document the whole thing. Send it to CNN, BBC, Al Jazeera, Sky News. You realize it has all been done before, and little has changed. \n" +
                "                    So you're here to work; not to save the world. \n" +
                "           You’re here because a friend said NGOs pay better. You’re here because for five years you have been an underpaid accountant for a failing microfinance company. You are here because you have a kid in class three and five and a wife and an ailing mother.\n" +
                "           So by your sixth month your altruistic musings hit the floor, and stoicism and complacency set in. Fuck it, you say. I didn't invent war. I'm not the male version of Martha Teresa. I'm here for the money. I'm here to solve my own war. \n" +
                "                    Life is about which side of the gun you’re on.\n" +
                "           As you recover, food begins to taste better. But you still avoid meat. Not that your near-death experience has suddenly changed you into a vegan, no. Or reminds you of leaking wounds and mass graves, no. It just smells awful, like a thousand unwashed bodies. \n" +
                "           But on food as a dietary choice and the ridiculousness of vegetarianism, you remember jumping on that bandwagon once, back in Kenya. True to form, meat started to smell appalling. Call it psychosomatic effect or placebo, it worked. Why you did it? You had a choice: vegetables and fruits in plenty in the neighborhood. You were then into that Buddhism/New Age thing. Travelling with a yoga mat in your back pack and such sort of thing. Purifying the body and such sort of thing. Getting enlightened and such sort of thing. Evolving to the 5th dimension and such sort of thing. Opening chakras, etc, etc. Eating meat is like eating a part of your own flesh, etc, etc. \n" +
                "           Then you moved here. Here where it's dry six months a year. No greens. It's meat every day and it's cheap. You remember buying chicken for 10 South Sudanese pounds late last year, right before the inflation kicked in. That's an equivalent of Kshs 10 or $ 0.1. A live, cluck-cluck-clucking kuku kienyeji you'd get for Kshs 700 or $ 7 in Kenya. Long story short, you fell in love with meat again. Now you could comfortably clear one whole chicken by yourself. And no health hazards here associated with red or white meat as vegetarians and health magazines/blogs might get you to believe. You were healthy as ever before that mosquito poison. \n" +
                "                   You try that vegetarian thing here, you drop dead. \n" +
                "          Humans can eat anything to stay alive. In fact, folks here eat cats, bush rats, snakes, and in Congo, people eat monkeys. Or if you move northward and move a few years back in Darfur, people ate raw leaves to stay alive. \n" +
                "           Maybe all one needs is change of environment. Change of circumstances: where all that green salad and collards in your fridge is nowhere to be found, where all you have is cattle and chicken, with the uncertainty of breathing the next day; and all your food beliefs will come tumbling down like a house of cards. In fact, most of your beliefs will turn to smoke. \n" +
                "            So you, on your road to recovery, you begin with two pieces of beef at a time. A chicken wing or some stew as your health bounces back. And your shoulders turn lean. And you keep lifting that homemade gym at the back of the house. You are whole again. Thanks to Fay and her relentless spirit. She is just too nice. \n" +
                "            You’re now ready to dodge flying bullets and dance Rhumba on cluster  bombs.\n" +
                "\n" +
                "II.\tThe only exciting thing about flying is the planning: the paperwork, the packing, the goodbyes, the driving to the airport at 5 in the morning. Anything else is as boring as watching flies mate. Especially if all you do is fly from one refugee camp to the next.\n" +
                "            From Kakuma, you land in Maban airstrip and hop into a UN truck. This is your emergency ground. This is where you meet in case of urgencies. Like now, a radio call just confirmed a dozen people are dead and about 27 causalities are on transit to Twic Mission Hospital. Medical supplies are being flown in the same day. But there is bad news. Topless military trucks carrying the wounded have been intercepted by government soldiers. \n" +
                "           When this happens, the emergency co-ordinator, local assistant commander, local bishops have to intervene. Of course a carload of rebel soldiers has to accompany them. I and Fay are asked to go along. \n" +
                "\tThere is a boom boom tutututu boom sound and giant mushrooms of smoke on the horizon from all that shelling. It is three hours’ drive form our center. Few huts in flames. More military trucks with teenagers in military gear yelling Jua! Jua! Jua! Jua! Jua! overtake us. We are all quiet in the car. You’ve been through this countless times. Every time it’s a new experience. It’s a voice saying what if things go wrong. You try not to think about Murphy's Law. You try not to think about Joe—your boy and Mokeira—your girl and their mom and your mom. But you chew gum and maintain a straight face. Nod at Fay for reassurance.\n" +
                "\t\tAs you approach the interception of cars and soldiers, Fay says, \n" +
                "\t\t\tOh-oh this doesn’t look good. \n" +
                "\t\t\n" +
                "\tA dozen soldiers in jungle uniforms and shiny AK-47s surround the two    vehicles that contain groaning bodies inside. \n" +
                "\tSmith, the Norwegian emergency co-ordinator and the bishop move closer. They ask what’s happening. The would-be leader of the concierge asks him who he is. Says I am so and so. I do this and that and why have you stopped these vehicles, my brother. These people need help, my brother.\n" +
                "\t\tFlattery doesn’t work in times of war.\n" +
                "I and Fay are just arm-folded following the conversation. Some blood is dripping from the floor of the car down to the moist earth. A little rubicund pool is forming. But I've seen blood before. I’ve seen it in shrapnel wounds. I’ve seen a burnt torso of a child. I’ve seen yellow intestines in the hospital. I’ve seen a man with first-degree burns without arms, cling on to life. \n" +
                "\t\tThis is not meant to be a pun.\n" +
                "\t\tI chewed on my gum and waited. \n" +
                "\tThe soldier pulled out his handgun and we were surrounded. Hands on our   heads, we were ordered to kneel down. \n" +
                "\tAnd he started yelling in his voice how NGOs are sympathizers of rebels. How kawajas, white outsiders, are interfering with the government’s affairs. That all NGOs and UN peace-keepers should pack and go.\n" +
                "\tI wanted to shut him up tell him we have heard this bullshit before. But then he signaled his boys to pull over Fay. And said, \n" +
                "\t\tThis would serve as a warning as (bang!) Fay’s body tumbled over. \n" +
                "\t\tFay’s body tumbled over.\n" +
                "\t\tFay’s body, tumbled over.\n" +
                "\tThen chaos erupted. Gun shots. Me running towards anywhere. Few wounded victims from the pick-up struggling to scamper to the bush to escape. Here, you rather die running than die on your knees beginning for mercy.  Picture me running back to drag Fay’s body. \n" +
                "\t\tFay was a person. Now Fay is a body. \n" +
                "\tFay was minutes ago, a breathing 38 year-old humanitarian. Fay cannot be a body lying in the middle of gun shots. Fay cannot be a body with hair soaked in red. Fay cannot be a body with a gushing red hole in her head. I’m rushing towards Fay. But the hailstorm of whizzing explosions stops me.\n" +
                "\tI can't tell you where the rest of my team is. But I can tell you in the middle of the chaos, a girl my daughter’s age is struggling to jump off the truck of the wounded. Her knee is badly prattled. She can’t walk. I grab her. And I tell myself: run. \n" +
                "\t\tRun:\n" +
                "\tPut the girl on your back and run.\n" +
                "\t\tForget everything you know and—run.\n" +
                "\t\tAs long you are running from something, you are a refugee.\n" +
                "\tWe are running from explosions and screams and racing of vehicles and radio calls and tall dark Dinka soldiers. We are running into tall dark Dinka soldiers. I’m stopped. The kid is screaming and crying on my back. She is slapped to shut up. Somebody knocks the back of my knees. I crumble to the ground.\n" +
                "\t\tMy tag I.D., captioned below my black and white passport photo, says, \n" +
                "BRIAN OMOKE, UNHCR, AREA LOGISTICTS OFFICER, MABAN—SOUTH SUDAN. \n" +
                "\t\tMy passport number reads, \n" +
                "\t\tAT345871A.\n" +
                "\tSomebody plucks it off my neck, spits on it, stomps on it with his boots and says things. Things like you stupid Africans being used by the kawaja to spy on the government for a few dollars. Things like who I work for. Who’s my boss. That you know I could shoot you right now. That where is your work permit. That where is your passport. That who is this thing with a dying leg you are running away with. That you would be held hostage until $ 20, 000 dollars are paid or something like that. And I say this girl needs help. And they say this girl should die because she is Nuer. And I say she’s just a girl. And they say yeah, yeah, she will grow up and give birth to rats. And I say nothing. But I think of Mokeira and bile rises up my throat. I stand up and say kill me but this girl needs help. That a real soldier doesn’t kill a kid. A girl. They say really?\n" +
                "\t\tI nod. And look them in the eye. \n" +
                "These moments nothing matters. These moments all the money I had saved over the years to start some business, to take my family on vacation, to school my children, mean nothing. These moments fear melts into anger and then absolution. If you stare at death in the face long enough, life becomes nothing.\n" +
                "\tSo here we are. Nothings in black skins arguing over nothing. Ready to shoot the many nothings that don’t speak the same language we do. Here we are watching another innocent little nothing bleed to death. But I know even stillness is chaos in waiting. Death only scares you because you have seen it happen to others. The orphans left behind to roam from one refugee camp to the next, dressed like rags. Making donors feel like heroes.\n" +
                "\tThese moments, you lose track of what happened. Because you didn’t die at that moment. The girl didn’t die at that moment. Because trucks pulled over with UN peace-keepers in white helmets.\n" +
                "\t\tBut the little girl didn’t make it. \n" +
                "\tJust like the rest of them who had not made it. Like her mother or father or uncle or brother or whole village. Just like the rest who made it but will never make it past the refugee tents. Those who will cling to hope, turn into adolescents, then parents, then a family of people who don’t belong. And the swelling number grows form a mere 14, 000 to 190, 000. And somebody has to type in his laptop: \n" +
                "\tWe need more sanitary pads for girls here. We need a school here. We need a borehole. Please donate. \n" +
                "\tYou will see this ad at the top right of your Gmail inbox or newspaper. Perhaps you will move on to more juicy stories like the political campaigns or sports. \n" +
                "\t\tThings that matter.\n" +
                "\tBut here, in this parallel universe, the numbers will keep swelling. And something will be born. A faith will be born. You group people for too long; they will grow their own language. A nation. A nation that neither forgives nor forgets. A generation of scars. Whether in Ajuong Thok, Yida, Hagadera, Kakuma, Dagahaley, Zaatari or Daadab, a movement starts to grow once these people accept their fate.\n" +
                "\tAfter the death of Fay and the little girl, you had had enough. Fay was one of the 70 plus aid workers who was shot for the past 8 years while in service for humanity. \n" +
                "\t\tYou resigned.\n" +
                "\n" +
                "III.\tThe only exciting thing about landing is when the tires of Y64S flight screech the runway and you know you're back home. And you're cruising from JKIA airport to a hotel. Your index finger on your cheek watching the towers and traffic and billboards, bombarding your subconscious with consumerism, roll by. At that moment Nairobi is a beautiful model with too much make up. And you want to spoil her with the few dollars in your wallet earned from war. This city provokes your appetite for a good life. Wine/women. Ribs/beer. Laughter/sex. Spending/living. No more mosquitos/bullets. Or hiding/running. And your hotel room has so many pillows it's hard to sleep alone. So you tell your baby woman you'll be home the day after tomorrow. Some of these fine thighs along River Road or Koinange Street could throw some home welcoming party in the sexiest way. \n" +
                "\tThese moments nothing matters. You are home, you are happy. You are hugged, you are needed. Because, money. Because, missing. Because, Daddy, Daddy, Daddy, umetuletea nini. Because, honey, is it true that women are raped in refugee camps? Because, curiosity, concern, family. Because, friends. \n" +
                "\t\tNobody knows what you have seen. \n" +
                "\tNobody saw Fay’s brain mix with blood or the little girl, in your arms, hemorrhage to death. \n" +
                "\tEven in the tranquil arms of your wife, some nights the sounds of bombs falling explode in your head and you wake up with a pounding chest.\n");
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
                String shareBody = "This is what humanitarian workers go through... #LoveMeNow";
                String shareSub = "Love Me Now or I Will Kill Myself";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share with friends..."));

                break;

        }

        return super.onOptionsItemSelected(item);
    }
}