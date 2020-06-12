package com.android.developer.chy0509;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class random extends AppCompatActivity {

    LinearLayout back;
    ImageButton imgButton1;
    ImageButton imgButton2;
    ImageButton imgButton4;
    ImageButton imgButton5;
    ImageButton imgButton6;
    ImageButton imgbutton;

    int[] img = {R.drawable.ghdzhd, R.drawable.kfc, R.drawable.vkfl, R.drawable.gksthx, R.drawable.rlaqkq, R.drawable.tlswjs, R.drawable.duqrl, R.drawable.dltkr, R.drawable.kfc, R.drawable.ehalsh, R.drawable.spsp, R.drawable.vlwkgkt, R.drawable.spsp, R.drawable.rychs, R.drawable.hosick, R.drawable.yuak, R.drawable.piz, R.drawable.bo, R.drawable.ash, R.drawable.nol, R.drawable.moms, R.drawable.rot, R.drawable.mac,R.drawable.hansin,R.drawable.bback,R.drawable.bibs,R.drawable.googbab,R.drawable.backyear};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
        setTitle("랜덤 식당");

        {
            back = (LinearLayout) findViewById(R.id.layout);

            Random ram = new Random();
            int num = ram.nextInt(img.length);

            back.setBackgroundResource(img[num]);
        }
        {
            back = (LinearLayout) findViewById(R.id.layout2);

            Random ram2 = new Random();
            int num = ram2.nextInt(img.length);

            back.setBackgroundResource(img[num]);
        }
        {
            back = (LinearLayout) findViewById(R.id.layout3);

            Random ram3 = new Random();
            int num = ram3.nextInt(img.length);

            back.setBackgroundResource(img[num]);
        }
        {
            back = (LinearLayout) findViewById(R.id.layout4);

            Random ram4 = new Random();
            int num = ram4.nextInt(img.length);

            back.setBackgroundResource(img[num]);
        }

        imgButton1 = (ImageButton) findViewById(R.id.imgbutton1);

        imgButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(random.this, MainActivity.class);
                startActivity(intent);
            }
        });

        imgButton2 = (ImageButton) findViewById(R.id.imgbutton2);

        imgButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(random.this, random.class);
                startActivity(intent);
            }
        });

        imgButton4 = (ImageButton) findViewById(R.id.imgbutton4);

        imgButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(random.this, itemlist.class);
                startActivity(intent);
            }
        });

        imgButton6 = (ImageButton) findViewById(R.id.imgbutton6);

        imgButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(random.this, information.class);
                startActivity(intent);
            }
        });


        imgButton5 = (ImageButton) findViewById(R.id.imgbutton5);

        imgButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(random.this, sunwi.class);
                startActivity(intent);
            }
        });
        imgbutton = (ImageButton) findViewById(R.id.randombtn);
        imgbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(random.this,
                        random.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu3, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu5:
                Intent intent = new Intent(random.this, start.class);
                startActivity(intent);
                break;
        }
        return true;
    }
}