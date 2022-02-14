package com.example.yourbooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView cerpen, komik, novel, sejarah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cerpen = (CardView) findViewById(R.id.cerpen_card);
        komik = (CardView) findViewById(R.id.komik_card);
        novel = (CardView) findViewById(R.id.novel_card);
        sejarah = (CardView) findViewById(R.id.sejarah_card);

        cerpen.setOnClickListener(this);
        komik.setOnClickListener(this);
        novel.setOnClickListener(this);
        sejarah.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cerpen_card:
                i = new Intent(this, cerpen.class);
                startActivity(i);
                break;
            case R.id.komik_card:
                i = new Intent(this, komik.class);
                startActivity(i);
                break;
            case R.id.novel_card:
                i = new Intent(this, novel.class);
                startActivity(i);
                break;
            case R.id.sejarah_card:
                i = new Intent(this, sejarah.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}