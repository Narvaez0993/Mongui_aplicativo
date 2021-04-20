package com.example.mongui2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    public CardView card1,card2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        card1 = (CardView) findViewById(R.id.cardv1);
        card2 = (CardView) findViewById(R.id.cardv2);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent x;

        switch (v.getId()){

            case R.id.cardv1:
                x = new Intent(this,Multimedia.class);
                startActivity(x);
                break;

            case R.id.cardv2:
                x = new Intent(this,info_mongui.class);
                startActivity(x);
                break;



    }
}

}