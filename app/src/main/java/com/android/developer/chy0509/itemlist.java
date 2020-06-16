package com.android.developer.chy0509;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

class itemlist extends AppCompatActivity {

    ListView listView;
    MyBaseAdapter adapter;
    ImageButton imgButton1;
    ImageButton imgButton2;
    ImageButton imgButton4;
    ImageButton imgButton5;
    ImageButton imgButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itemlist);

        imgButton1 = (ImageButton)findViewById(R.id.imgbutton1);

        imgButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(itemlist.this,MainActivity.class);
                startActivity(intent);
            }
        });

        imgButton2 = (ImageButton)findViewById(R.id.imgbutton2);

        imgButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(itemlist.this,random.class);
                startActivity(intent);
            }
        });

        imgButton4 = (ImageButton)findViewById(R.id.imgbutton4);

        imgButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(itemlist.this,itemlist.class);
                startActivity(intent);
            }
        });

        imgButton6 = (ImageButton)findViewById(R.id.imgbutton6);

        imgButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(itemlist.this,information.class);
                startActivity(intent);
            }
        });


        imgButton5 = (ImageButton)findViewById(R.id.imgbutton5);

        imgButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(itemlist.this,sunwi.class);
                startActivity(intent);
            }
        });


        // 리스트뷰 객체 참조
        listView = (ListView) findViewById(R.id.listView);

        // 어댑터 객체 생성
        adapter = new MyBaseAdapter(this);

        // 아이템 데이터 만들기
        Resources res = getResources();
        final String[] nation = getResources().getStringArray(R.array.nation);
        String[] explain = getResources().getStringArray(R.array.explain);
        String[] population = getResources().getStringArray(R.array.population);
        final String[] capital = getResources().getStringArray(R.array.capital);
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation00), nation[0], population[0], explain[0]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation01), nation[1], population[1], explain[1]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation02), nation[2], population[2], explain[2]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation03), nation[3], population[3], explain[3]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation04), nation[4], population[4], explain[4]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation05), nation[5], population[5], explain[5]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation06), nation[6], population[6], explain[6]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation07), nation[7], population[7], explain[7]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation08), nation[8], population[8], explain[8]));
        adapter.addItem(new ItemDataBox(res.getDrawable(R.drawable.nation09), nation[9], population[9], explain[9]));

        // 리스트뷰에 어댑터 설정
        listView.setAdapter((ListAdapter) adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ItemDataBox currentItem = (ItemDataBox) adapter.getItem(position);
                String[] currentData = currentItem.getData();

                Toast.makeText(getApplicationContext(), nation[position] + ": "+ capital[position], Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu3_information, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}