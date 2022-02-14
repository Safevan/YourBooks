package com.example.yourbooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class novel extends AppCompatActivity implements View.OnClickListener {

    public CardView book1 , book2 , book3 , book4 , book5 , book6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novel);

        book1 = (CardView) findViewById(R.id.suraukami);
        book2 = (CardView) findViewById(R.id.laut);
        book3 = (CardView) findViewById(R.id.gadiskretek);
        book4 = (CardView) findViewById(R.id.amba);
        book5 = (CardView) findViewById(R.id.orangproyek);
        book6 = (CardView) findViewById(R.id.bumimanusia);


        book1.setOnClickListener(this);
        book2.setOnClickListener(this);
        book3.setOnClickListener(this);
        book4.setOnClickListener(this);
        book5.setOnClickListener(this);
        book6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.suraukami :
                i = new Intent(this,suraukami.class);
                startActivity(i);
                break;

            case R.id.laut :
                i = new Intent(this,laut.class);
                startActivity(i);
                break;

            case R.id.gadiskretek :
                i = new Intent(this,gadiskretek.class);
                startActivity(i);
                break;

            case R.id.amba :
                i = new Intent(this,amba.class);
                startActivity(i);
                break;

            case R.id.orangproyek :
                i = new Intent(this,orangproyek.class);
                startActivity(i);
                break;

            case R.id.bumimanusia :
                i = new Intent(this,bumimanusia.class);
                startActivity(i);
                break;

        }

    }
}