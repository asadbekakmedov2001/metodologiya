package com.example.metodologiya;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity implements UserAdapterAC2.SelectedUser {



    Toolbar toolbar;
    RecyclerView recyclerView;
    List<com.example.metodologiya.ModelRcycler> modelRcyclers = new ArrayList<>();
    TextView textViewSelectedChapterName;

    int getChemgeItemPosition;


    ConstraintLayout constraintLayout;
    UserAdapterAC2 userAdapter;
    ImageView imageViewc2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent = getIntent();
        imageViewc2 = findViewById(R.id.imageViewac2);

        // ruyhatni eloni va sozlanmasi
        recyclerView = findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));



        // tool bar sozlanmasi
//        toolbar = findViewById(R.id.toolBAr);
//        this.setSupportActionBar(toolbar);
//        this.getSupportActionBar().setTitle("");
        // tanlangan chapter nomini activity2 da sarlavhaga yozish
        textViewSelectedChapterName = findViewById(R.id.textViewSelectedChapterName);
        getChemgeItemPosition = intent.getIntExtra("swimmers",1);


        //backround uchun liner layoutni aniqlash
        constraintLayout = findViewById(R.id.constraintLayout1);
        constraintLayout.setBackgroundColor(getResources().getColor(R.color.teal_200));


        switch (getChemgeItemPosition){
            case 0: {

                textViewSelectedChapterName.setText("ILMIY TADQIQOT METODOLOGIYASI FANIDAN MA'RUZA MASHG'ULOTLAR TOP'LAMI");

                modelRcyclers.add(new ModelRcycler("1-mavzu: FAN VA UNING JAMIYATDAGI O‘RNI.","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/maruza1.docx"));
                modelRcyclers.add(new ModelRcycler("2-mavzu: IJОD VА ILMIY TADQIQOT BILISH FAOLIYATINING MAHSULI","IR0gAxJe5xQ"));
                modelRcyclers.add(new ModelRcycler("3-mavzu: ILMIY TADQIQOTNING NAMOYON BO‘LISH JIHATLARI. ILMIY TADQIQOTNING NAMOYON BO‘LISH SHAKLLARI.","tKFHgKTPgbk"));
                modelRcyclers.add(new ModelRcycler("4-mavzu: ILMIY TADQIQOT TIPLARI.","QoSmI_blx1Q"));
                modelRcyclers.add(new ModelRcycler("5-mavzu: ILMIY  TАDQIQОTDА DАLILLАRNING RОLI.","8xvpfy63gPw"));
                modelRcyclers.add(new ModelRcycler("6-mavzu: ILMIY INFORMATSIYANI IZLASH, JAMLASH VA QAYTA ISHLASH. ILMIY ISHLAR VA ILMIY ISHNI YOZISH.","LMop0DT2W_A"));
                modelRcyclers.add(new ModelRcycler("7-mavzu: ILMIY ISHLARNI BADIIY JIHATDAN RASMIYLASHIRISH VA HIMOYA QILISH. ILMIY GRANT UCHUN MATERIALLARNI TAYYORLASH METODOLOGIYASI.","EFuvSv_BGN8"));
                modelRcyclers.add(new ModelRcycler("8-mavzu: ILMIY TADQIQOTDA MUAMMO VA MUAMMOLI VAZIYATINING O‘ZARO ALOQASI.","yeB9X9dO_p0"));
                modelRcyclers.add(new ModelRcycler("9-mavzu: ILMIY TADQIQOTGA AXBOROT VA AXBOROT TEXNOLOGIYALARINING TA’SIRI.","jcVqTXFpAJA"));
                modelRcyclers.add(new ModelRcycler("10-mavzu: ILMIY TADQIQOT METODIDA TUSHUNISH VA TUSHUNTIRISHNING AHAMIYATI.",""));
                modelRcyclers.add(new ModelRcycler("11-mavzu: ILMIY  TАDQIQОTDА INTUITSIYANING RОLI.",""));
                modelRcyclers.add(new ModelRcycler("12-mavzu: OLIMNING PROFESSIONAL VA  IJTIMOIY MAS’ULIYATI.",""));
                modelRcyclers.add(new ModelRcycler("13-mavzu: ILMIY INFORMATSIYANI IZLASH, JAMLASH VA QAYTA ISHLASH. ILMIY ISHLAR VA ILMIY ISHNI YOZISH",""));
                modelRcyclers.add(new ModelRcycler("14-mavzu: ILMIY ISHLARNI BADIIY JIHATDAN RASMIYLASHIRISH VA HIMOYA QILISH. ILMIY GRANT UCHUN MATERIALLARNI TAYYORLASH METODOLOGIYASI.",""));
                modelRcyclers.add(new ModelRcycler("15-mavzu: Ilmiy grant. Uni yozish metodologiyasi.",""));

            }break;
            case 1: {

                textViewSelectedChapterName.setText("HIKOYALAR");

                modelRcyclers.add(new ModelRcycler("Ibratli hikoya Duoning kuchi","pTWwjHcs41Q"));
                modelRcyclers.add(new ModelRcycler("Ibratli hikoya Ota va bola suhbati","PTfPFu6QzA8"));
                modelRcyclers.add(new ModelRcycler("Ikki chelak nok multfilm","6XEST2Vuq7M"));
                modelRcyclers.add(new ModelRcycler("Och ko'z xo'roz multfilm","Q_1zK4WbgcA"));
                modelRcyclers.add(new ModelRcycler("Onangizni qadrlang multfilm","S1djLvuIlhI"));
                modelRcyclers.add(new ModelRcycler("To'g'rivoy bilan Egrivoy multfilm","KYofXUmAFCo"));
                modelRcyclers.add(new ModelRcycler("Uddaburon shogird multfilm","aZEkG6BPleY"));
                //modelRcyclers.add(new ModelRcycler("Umid tabassumi Ayblashga shoshilmang","Ef1uNOKbsVI"));
                modelRcyclers.add(new ModelRcycler("Umid tabassumi Yaqinlaringizni qadrlang","CPb8zevf4Gc"));
                modelRcyclers.add(new ModelRcycler("Umid tabassumi Ona mehri","IssCGlJzpQw"));

            }break;

            case 2: {

                textViewSelectedChapterName.setText("MAQOLLAR");

                modelRcyclers.add(new ModelRcycler("Maqollardan parchalar","https://github.com/asadbekakmedov2001/kundalik/raw/main/app/src/main/assets/maqol.pdf"));
                modelRcyclers.add(new ModelRcycler("Maqollar videosi 1-qism","nSnUGpTBtpM"));
                modelRcyclers.add(new ModelRcycler("Maqollar videosi 2-qism","0j7if_X7SRU"));
                modelRcyclers.add(new ModelRcycler("Maqollar videosi 3-qism","YodzbYAIyMg"));


            }break;

            case 4: {

                textViewSelectedChapterName.setText("TOPISHMOQLAR");

                modelRcyclers.add(new ModelRcycler("Topishmoqlardan parchalar","https://github.com/asadbekakmedov2001/kundalik/raw/main/app/src/main/assets/topishmoqlar.pdf"));
                modelRcyclers.add(new ModelRcycler("Topishmoqlar videosi 1-qism","gdSrRcgaPgo"));
                modelRcyclers.add(new ModelRcycler("Topishmoqlar videosi 2-qism","LZtAjiAqtxI"));
                modelRcyclers.add(new ModelRcycler("Topishmoqlar videosi 3-qism","odCcBaYeCqw"));
                modelRcyclers.add(new ModelRcycler("Topishmoqlar videosi 4-qism","t7mbKT4pQK0"));
                modelRcyclers.add(new ModelRcycler("Topishmoqlar videosi 5-qism","Z9Z7hb4XEoU"));

            }break;
            case 5: {

                textViewSelectedChapterName.setText("ERTAKLAR MASHG'ULOT ISHLANMALARI");

                modelRcyclers.add(new ModelRcycler("O'n ikki oy ertagi","https://github.com/asadbekakmedov2001/kundalik/raw/main/app/src/main/assets/12oy_ertagi.pdf"));
                modelRcyclers.add(new ModelRcycler("Bog'bon ertagi","https://github.com/asadbekakmedov2001/kundalik/raw/main/app/src/main/assets/bogbon.pdf"));
                modelRcyclers.add(new ModelRcycler("Do'stlik ertagi","https://github.com/asadbekakmedov2001/kundalik/raw/main/app/src/main/assets/dustlik.pdf"));
                modelRcyclers.add(new ModelRcycler("Mehmon keldi(Sumalak)","https://github.com/asadbekakmedov2001/kundalik/raw/main/app/src/main/assets/mehmon_keldi.pdf"));
                modelRcyclers.add(new ModelRcycler("Non isi(Rivoyat)","https://github.com/asadbekakmedov2001/kundalik/raw/main/app/src/main/assets/non_isi.pdf"));
                modelRcyclers.add(new ModelRcycler("Oltin tarvuz","https://github.com/asadbekakmedov2001/kundalik/raw/main/app/src/main/assets/oltin_tarvuz.pdf"));
                modelRcyclers.add(new ModelRcycler("Dan xodimi (Yo‘l va bolalar) ","https://github.com/asadbekakmedov2001/kundalik/raw/main/app/src/main/assets/yol_va_bolalar.pdf"));
                modelRcyclers.add(new ModelRcycler("O‘zbek xalq ertagi Zumrad va Qimmat ","https://github.com/asadbekakmedov2001/kundalik/raw/main/app/src/main/assets/zumrad_va_qimmat.pdf"));

            }break;


        }

        userAdapter  = new UserAdapterAC2(modelRcyclers,  this);
        recyclerView.setAdapter(userAdapter);



    }

    @RequiresApi(api = Build.VERSION_CODES.P)




    @Override
    public void selectedUser(ModelRcycler modelRcycler) {

            startActivity(new Intent(MainActivity2.this, MainActivity3.class).putExtra("data",modelRcycler.getLoadUrl()));


    }
}