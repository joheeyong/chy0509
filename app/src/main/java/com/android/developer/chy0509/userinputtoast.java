package com.android.developer.chy0509;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

class userinputtoast extends AppCompatActivity {

    ImageButton imgButton1;
    ImageButton imgButton2;
    ImageButton imgButton4;
    ImageButton imgButton5;
    ImageButton imgButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinputtoast);
        Toast.makeText(getApplicationContext(), "회원가입 되었습니다.", Toast.LENGTH_LONG).show();


        imgButton1 = (ImageButton) findViewById(R.id.imgbutton1);

        imgButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(userinputtoast.this, MainActivity.class);
                startActivity(intent);
            }
        });

        imgButton2 = (ImageButton) findViewById(R.id.imgbutton2);

        imgButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(userinputtoast.this, random.class);
                startActivity(intent);
            }
        });

        imgButton4 = (ImageButton) findViewById(R.id.imgbutton4);

        imgButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(userinputtoast.this, itemlist.class);
                startActivity(intent);
            }
        });

        imgButton6 = (ImageButton) findViewById(R.id.imgbutton6);

        imgButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(userinputtoast.this, information.class);
                startActivity(intent);
            }
        });


        imgButton5 = (ImageButton) findViewById(R.id.imgbutton5);

        imgButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(userinputtoast.this, sunwi.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu1:
                Intent intent = new Intent(userinputtoast.this, login.class);
                startActivity(intent);
                break;
            case R.id.menu2:
                intent = new Intent(userinputtoast.this, userinput.class);
                startActivity(intent);
                break;


        }
        return true;
    }
}