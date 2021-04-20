package com.example.mongui2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class OnclickMultimedia extends AppCompatActivity {

    TextView titulo,descripcion;
    ImageView fotolugar;

    Multimedialugar lugar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onclick_multimedia);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        titulo= findViewById(R.id.TituloMultimedia);
        descripcion = findViewById(R.id.DescripcionMultimedia);
        fotolugar= findViewById(R.id.ImgMultimedia);

        lugar= (Multimedialugar) getIntent().getSerializableExtra("lugar");

        titulo.setText(lugar.getTituloportada());
        descripcion.setText(lugar.getDescripcionportada());
        fotolugar.setImageResource(lugar.getFotoportada());



    }
}