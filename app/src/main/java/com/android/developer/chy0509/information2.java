package com.android.developer.chy0509;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

class information2 extends AppCompatActivity {

    Button button;
    Button webbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information2);
        setTitle("봉구스 밥버거 정보");

        RatingBar rb = (RatingBar) findViewById(R.id.ratingBar1);
        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                TextView tv = (TextView) findViewById(R.id.tv);
                tv.setText("평점 : " + String.valueOf(rating));
            }
        });

        button = (Button) findViewById(R.id.ratbtn);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "평점을 주었습니다.",
                        Toast.LENGTH_SHORT).show();
            }
        });

        webbtn = (Button) findViewById(R.id.webbtn);
        webbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:010-1234-5678");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }


        });
    }
}




