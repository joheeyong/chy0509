package com.android.developer.chy0509;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class information extends AppCompatActivity {

    ImageButton asdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_information);

        asdf = (ImageButton) findViewById (R.id.img10);

        asdf.setOnClickListener (new View.OnClickListener () {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (information.this,
                        information2.class);
                startActivity (intent);

            }
        });
    }
}