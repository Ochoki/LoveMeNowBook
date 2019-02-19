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

public class Gwaddi extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gwaddi);

        Button previous = findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gwaddi.this, Children.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Page 11",
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gwaddi.this, Page4.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "END",
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView textView = (TextView) findViewById(R.id.text);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("His name is Philip Hepa Kamal Gwaddi. He was born in the remote and poorest area of Sudan, South Kordofan State, Eastern Kiehama village, Eastern Kichama bordering Kauda from the South and Heiban from the North and Shan-Obal to the far East of Kichuma.\n" +
                "\tAccording to his memoir:\n" +
                "“It was on 6th June, 1980, on a wet and humid Sunday morning, when my mother, Keniko, gave birth to me.”\n" +
                "\tHis parents named him Gwaddi, as second born of the family. This was years before a white man set foot in the heart of the village. Some years later he would be taken to a nearby chapel where he would be sprinkled with water and named “Philip” by an Italian priest named Barnaba. \n" +
                "\tThe year Gwaddi was born, his father left for South Sudan, walking for two months to be recruited as a soldier for the then just founded Sudan People’s Liberation Movement. Growing, curious and feeling the gap left by an absent father, he used to ask his mother about his father and she could not tell him that he had gone to Juba to bring a gun so he could chase the Arabs from their land; because they were looting and stealing their cattle and raping their women.\n" +
                "\tIn around 1996 his father returned from South Sudan and brought along some cows and told him to take care of them for his school fees in the future.\n" +
                "\tA year later, the Arabs raided the village, captured all the cows, sheep and the goats and killed three men who were neighbors in Gwaddi's village. They first drank all the milk in the gourd and then burnt down the cowshed. Luckily for Gwaddi, he had sneaked through the thorny fence into the bush. This was his first time to witness the horrendous history his people had endured. \n" +
                "\tYears later, you wouldn’t blame him if he told his children who their enemy was. You wouldn’t blame his children’s children harboring the same hatred towards the Arabs. You wouldn’t blame a whole generation for not trusting a particular race with their lives. There are some wounds even time can’t heal.\n" +
                "\n" +
                "\tIn the early 90s, most African countries were past the yoke of colonialism and had claimed sovereignty, but for this Nuba tribe in the remote parts of Sudan, being raided and kidnapped as slaves by Arabs was pretty normal from 1955 when Arabs and the British raided Africa for exploration and whatnot, up to date.\n" +
                " \tIn 1993 Gwaddi was kidnapped from a black market where he and other boys had gone to trade gold nuggets for sorghum. For four days they were held hostage and threatened. In his memoir he recalls:\n" +
                "“The captives told us that they wanted our blood and liver, lungs to eat because we were animals. And all animals should be killed and be eaten.” \n" +
                "\tThrough 1972, 1983, 2011 up to now, Arabs still attack Nubians using Russian aircrafts and jets. You could only be safe if you converted to Islam and practiced Sharia Law. Which meant you could also join their military and fight for them. Which meant soon enough you could be pointing a gun at your own brother in the battle field. \n" +
                "\tThe same divide and rule tactic had worked all over Africa during colonial times. In Kenya, where the British lured a section of Africans with education, Christianity and gifts,  resistant militant groups arose among Africans who felt betrayed by their own Africans. So they fought. The colonialists would only stand by and watch as Africans slaughtered each other. Colonialism and slavery has always been a war of the mind. \n" +
                "\tYears later, when Gwaddi got exposure through education and technology, he would learn that the same narrative would be heard across the world, somewhere in America. There, during and after slavery, the house negro (sell-outs)  versus the field negro (conservatives) philosophy would be born among African slaves in the Americas. To date, even with the Pan-Africanism movement and the Ubuntu philosophy, there are two types of Africans: those who believe for an African to succeed he has to follow the money and those who believe an African can only earn respect from other races if he sticks to his African ways—if he can condemn what minorities call white supremacy. \n" +
                "\tBut for Gwaddi, the year 1998 when he first saw a white man, he couldn’t believe it. His hair was long and soft and could not need a comb. His eyes were different from that of an African. The man approached to greet them with other boys but they coiled hands to themselves in fear. He later learned his name was Father Kizito, a missionary. He was introduced to them by a local young man who had gone to East Africa. And then one clap at a time, they sang to welcome him because, according to this local young man, Father Kizito had come with something they called education. This education involved learning how to speak like him and drawing things that they called letters. \n" +
                "\tSoon enough, they sat on stones under trees. Teachers would draw those letters on ‘chalkboards’ made from barks and soil using cassava roots and charcoal,  and pupils could copy on the ground using sticks and their fingers. They would stretch their mouths, their tongues learning to utter these strange sounds the teacher called alphabets. This new language was called English. At first, any question was answered with a no-no, or a yes-yes and sir.\n" +
                "\tWhat they called school fees could be paid in the form of sorghum, okra, groundnuts, sim sim, chickens and so on. \n" +
                "\tFor other children to arrive under the tree to learn, it took two  to four hours of walking from home on bare feet. \n" +
                "\tAnd years that followed, things kept changing; some for the better, some for the worse. \n" +
                "\n" +
                "\tFor instance, the school was no longer under shajr, the big tree. There were modern stone and mortar classrooms, better teachers were brought in from Kenya and Uganda. Instead of scribbling on the ground with sticks, books and pens were brought. More subjects were introduced and Gwaddi’s mind glowed in this spectrum of knowledge. To learn about planets in science. To add and to subtract. He developed a passion for arts. \n" +
                "\tAt first he could sketch trees and cows and camels and the many Nuba hills. With his teacher’s encouragement, he painted portraits of Jesus and Mary and they could be hang in the chapels in Heiban, Kauda and Gidel. Up to date, if you go to St Bakhita Primary School, Heiban, you will find one bold drawing on a cardboard. The painting is an abstract splash of different colours and shades. According to his memoir, the painting is to be interpreted this way:\n" +
                "“The yellow expresses the calm and peace in my family at the beginning. The red shows the killing that happened on the night the blood poured out. The mustard colour is the sorrow. The brown expresses the suffering and the thinking of the family. The black circles outside show my father and my brother. The yellow are my family members still alive. \n" +
                "But you see the black circles and the yellow circles are separated. This brings loneliness.”\n" +
                "\n" +
                "\tAnother change that was welcomed with a sigh of relief happened in 2011.\n" +
                "\tAfter years of bloodshed, there was a general election and for the first time, Nubans were allowed to vote. There were rumours of ceasefire following the Comprehensive Peace Agreement signed in Naivasha, Kenya. One man from Dafur named Abadulaziz Adam Alhilo won the election as governor for South Kordofan state but the Sudan government disputed his win. \n" +
                "\tFresh war broke out.\n" +
                "\tThe NPC targeted churches, schools and hospitals. In Gwaddi’s school, the Mu2 Antonov aircraft dropped a bomb. In the course of the blast Gwaddi  escaped through the window and ran up the hills together with some other pupils. According to his memoir:\n" +
                "\t“I learnt my cousins and twelve other children plus our teacher, Rhoda was killed in the blast. Hani’s two brothers died. The first born son of Khamis lost his life.”\n" +
                "\tA massacre followed afterwards. In his memoir he says: \n" +
                "“I witnessed the dead bodies being eaten by pigs and dogs.”\n" +
                "And:\n" +
                "“Most people sought refuge in the caves up mountains. Pregnant women had to give birth right there in the caves.”\n" +
                "\n" +
                "\tWar and famine seem to work hand in hand. In the course of the bloody conflict, there was no sorghum and there was no enough rain. Most people lost their children due to famine. People fed on leaves of trees, grass and wild fruits to survive. More people died at home from hunger and at war. And the SPLA, now declared a rebel group by the Khartoum government, needed more soldiers.\n" +
                "To counter this, Gwaddi notes in his memoir:\n" +
                "“We were forced to marry young and make more children. Boys from thirteen years of age and above were forcefully recruited into the military.  Younger children were forced us to carry water and food and repair the soldiers’ huts in the barracks.  \n" +
                "Women carried bullets in their baskets for the  soldiers.”\n" +
                "\n" +
                "\tFor the most part, the outside world didn’t know about the war. The war the world knew about was the one in Darfur and parts of South Sudan, and Syria, and Nigeria, and Afghanistan. It took the Catholic church and other faith-based organizations to intervene because the government blocked all aid from humanitarian agencies like the UN. It was then journalists, filmmakers, writers and human rights activists exposed the terror Gwaddi’s people are living through.\n" +
                "\tFor Gwaddi, in 2014, he was one of the pupils selected to fly to Kakuma, Kenya as a refugee. \n" +
                "\tIn his memoir, his joy of flying on a plane soon turned sour:\n" +
                "“I paid 70 Sudanese dinars for the flight up to Juba where I got stranded for a few days since there was another bloody war betwwen Dinka and Nuwer.  \n" +
                "So I took to Yei town. I found  many Nubian people in Hai Gabat. We stayed there for several days until we sought help from Samaritan Purse headquarters, another humanitarian agency, came to our rescue. From there I was flown to Kenya.”\n" +
                "\n" +
                "\tFrom 2013, while in Kakuma, he completed his high school education. He trained in Community Managed Disaster Risk Reduction (MDRR), The International Institute of Rural Reconstruction and Community Water Management (CWM) conducted by several humanitarian institutions in Kakuma Refugee camp, Northern Kenya, and several other courses.\n" +
                "\n" +
                "\tIn 2017, Gwaddi returned to his homeland and was given a post as the program manager to oversee all educational and health programs run in the region by the few organizations left in the region. \n" +
                "\n" +
                "\t\t\t\t\t*\n" +
                "\tNow it’s 2018 and there’s relative peace since a ceasefire was declared a year ago. \n" +
                "\tFellow Nubans who had left to neighboring countries are returning home, with the hope of rebuilding their homeland. As a result, they feel that any foreign worker in their midst should pack and go. Even those who have assisted them for a long time, like one award-winning American doctor—the only doctor in the whole region, and has sponsored all the nurses working with him in the same hospital—are no longer needed. \n" +
                "\tThis goes for all foreign personnel left to assist in various sectors from education, church, health and food distribution. For the expats, there’s the unsettling fear of xenophobia and can be read in their faces. Aware of the infamous cases of xenophobia in Zimbabwe and South Africa, most of them are already packing. \n" +
                "\tWith this current wave of change, the majority tribe, Tira has taken over most jobs. A rival tribe, Toro just like the rest of the other 90 plus tribes living in the vast Nuba mountains, feels sidelined. \n" +
                "\tFor Gwaddi, he sees this as the same post-independence narrative in Africa: Gikuyu/Luo in Kenya; Dinka/Nuwer in South Sudan; Hutu/Tutsi in Rwanda.\n" +
                "Gwaddi’s greatest worry is not the pain and anguish of the past, but what the future holds for his people. Tribalism is lurking in the shadows. In a community where every male has a gun and grenades in his house, Gwaddi, from his office in Kauda sighs and hopes this post-independence narrative won’t infiltrate his homeland. \n" +
                "\tRaised Catholic, there’s a crucifix of Jesus on the opposite wall. He looks up and silently prays that his people reconcile and unite towards building a solid community that is not divided by tribe or the fear of foreigners. \n");
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
                Intent intent = new Intent(Gwaddi.this, Contents.class);
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