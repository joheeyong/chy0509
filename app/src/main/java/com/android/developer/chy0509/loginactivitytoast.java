package com.android.developer.chy0509;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

class loginactivitytoast extends AppCompatActivity {


    ImageButton imgButton1;
    ImageButton imgButton2;
    ImageButton imgButton4;
    ImageButton imgButton5;
    ImageButton imgButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginativitytoast);

        Toast.makeText(getApplicationContext(), "로그인 되었습니다.", Toast.LENGTH_LONG).show();

        imgButton1 = (ImageButton)findViewById(R.id.imgbutton1);

        imgButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loginactivitytoast.this,MainActivity.class);
                startActivity(intent);
            }
        });

        imgButton2 = (ImageButton)findViewById(R.id.imgbutton2);

        imgButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loginactivitytoast.this,random.class);
                startActivity(intent);
            }
        });

        imgButton4 = (ImageButton)findViewById(R.id.imgbutton4);

        imgButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loginactivitytoast.this,itemlist.class);
                startActivity(intent);
            }
        });

        imgButton6 = (ImageButton)findViewById(R.id.imgbutton6);

        imgButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loginactivitytoast.this,information.class);
                startActivity(intent);
            }
        });


        imgButton5 = (ImageButton)findViewById(R.id.imgbutton5);

        imgButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loginactivitytoast.this,sunwi.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menus,menu);
        return super.onCreateOptionsMenu(menu);}
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.menu3:
                Intent intent = new Intent(loginactivitytoast.this, start.class);
                startActivity(intent);
                break;
            case R.id.menu4:
                intent = new Intent(loginactivitytoast.this, login.class);
                startActivity(intent);
                break;


        }
        return true;
    }


}
