package com.example.mongui2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import java.util.Locale;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    //ATRIBUTOS
    public CardView card1,card2;

    //METODOS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);



        card1 = (CardView) findViewById(R.id.cardv1);
        card2 = (CardView) findViewById(R.id.cardv2);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);

    }
    // metodos Onclick tarjetas del menu
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


     //Metodo para configurar el idioma

    public void cambiarIdioma(String lenguaje){

        Locale Idioma=new Locale(lenguaje);
        Locale.setDefault(Idioma);

        Configuration configuracionTelefono=getResources().getConfiguration();
        configuracionTelefono.locale=Idioma;
        getBaseContext().getResources().updateConfiguration(configuracionTelefono, getBaseContext().getResources().getDisplayMetrics());


    }

     //Metodo MenuActionBar
     public boolean onCreateOptionsMenu(android.view.Menu menu){

       getMenuInflater().inflate(R.menu.menuactionbar, menu);
       return true;
     }

     //Metodo controlador MenuActionBar

      public boolean onOptionsItemSelected(MenuItem items){

       int id=items.getItemId();

       switch (id){

           case(R.id.opcion1):
               Intent intent=new Intent(Menu.this,Perfil.class);
               startActivity(intent);

              break;

           case(R.id.opcion2):
               this.cambiarIdioma("en");
               Intent intent2=new Intent(Menu.this,Menu.class);
               startActivity(intent2);
               break;

           case(R.id.opcion3):
               this.cambiarIdioma("es");
               Intent intent3=new Intent(Menu.this,Menu.class);
               startActivity(intent3);
               break;
       }

        return super.onOptionsItemSelected(items);

      }

}