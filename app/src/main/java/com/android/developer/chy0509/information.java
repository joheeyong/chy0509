package com.android.developer.chy0509;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class information extends AppCompatActivity {

    ImageButton imageButton1;
    ImageButton imgButton1;
    ImageButton imgButton2;
    ImageButton imgButton4;
    ImageButton imgButton5;
    ImageButton imgButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        imageButton1 = (ImageButton)findViewById(R.id.img10);

        imageButton1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(information.this,
                        information2.class);
                startActivity(intent);

            }
        });

        imgButton1 = (ImageButton)findViewById(R.id.imgbutton1);

        imgButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(information.this,MainActivity.class);
                startActivity(intent);
            }
        });

        imgButton2 = (ImageButton)findViewById(R.id.imgbutton2);

        imgButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(information.this,random.class);
                startActivity(intent);
            }
        });

        imgButton4 = (ImageButton)findViewById(R.id.imgbutton4);

        imgButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(information.this,itemlist.class);
                startActivity(intent);
            }
        });

        imgButton6 = (ImageButton)findViewById(R.id.imgbutton6);

        imgButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(information.this,information.class);
                startActivity(intent);
            }
        });


        imgButton5 = (ImageButton)findViewById(R.id.imgbutton5);

        imgButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(information.this,sunwi.class);
                startActivity(intent);
            }
        });
    }
}
