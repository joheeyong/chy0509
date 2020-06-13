package com.android.developer.chy0509;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class loginacitvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menus,menu);
        return super.onCreateOptionsMenu(menu);}
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.menu3:
                Intent intent = new Intent(loginacitvity.this, start.class);
                startActivity(intent);
                break;
            case R.id.menu4:
                intent = new Intent(loginacitvity.this, start.class);
                startActivity(intent);
                break;


        }
        return true;
    }
}
