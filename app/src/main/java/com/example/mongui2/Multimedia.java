package com.example.mongui2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Multimedia extends AppCompatActivity {

    ArrayList<Multimedialugar> listaMultimedia= new ArrayList<>();

    RecyclerView listado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multimedia);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        listado= findViewById(R.id.listado);
        listado.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));



        crearListadoMultimedia();

        AdaptadorMultimedia adaptador= new AdaptadorMultimedia(listaMultimedia);

        listado.setAdapter(adaptador);


    }

    private void crearListadoMultimedia() {

        listaMultimedia.add(new Multimedialugar("Iglesia"
                ,"La construcción religiosa más importante de Monguí la conforman la iglesia principal – llamada Basílica de Nuestra Señora de Monguí – y el convento, levantados en piedra de sillería entre 1694 y 1760. El templo de calicanto, que está marcado por el estilo románico, guarda la imagen de la Virgen que lleva el nombre del municipio y algunas obras del pintor Gregorio Vásquez de Arce y Ceballos."
                ,R.drawable.iglesia2));

        listaMultimedia.add(new Multimedialugar("El paramo"
                ,"El paramo de la oceta, considerado el mas belllo del mundo, un lugar que sobrepasa cualquier sinonimo de belleza, con su ciudad de piedra y sus multicolores jardines llenos de frailejones, lupinus y senesios, es definitivamente una de las ultimas maravillas medio ambientales que se encuentran en colombia."
                ,R.drawable.paramo));

        listaMultimedia.add(new Multimedialugar("Puente Calicanto"
                ,"El calicanto, un pegamento mezcla de cal, arena, sangre de res y melaza, le dio el nombre al famoso puente de Monguí que cruza el río El Morro. Esta obra de ingeniería construida en el siglo XVII es reflejo de la época de la Colonia en el centro de Colombia y sirvió para que por ella se transportaron las piedras con las que fue erigida la Basílica de Nuestra Señora de Monguí. El puente se encuentra rodeado por un barranco, desde el cual se observan tendidos de flores y especies arbóreas."
                ,R.drawable.puente));

        listaMultimedia.add(new Multimedialugar("Laguna Negra","Es un sendero donde se aprecia y se conserva el medio ambiente, un desarrollo turístico como herramienta se sensibilización de los visitantes y turistas hacia la naturaleza, utilizando la educación ambiental, la remembranza histórica y los recursos existentes, conservando el medio ambiente y mejoramiento del entorno de vida."
                ,R.drawable.laguna));

        listaMultimedia.add(new Multimedialugar("Peña De Oti"
                ,"Formacion geologica, el cual se observa en su superficie los trabajos realizados para extraer la piedra con que se construyo el claustro y la basilica. alli se encuentra la cueva del duende, patio de las brujas y un mirador de 360 grados."
                ,R.drawable.pena));



    }
}