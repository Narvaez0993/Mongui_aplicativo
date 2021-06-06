package com.example.mongui2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class Multimedia extends AppCompatActivity {

    ArrayList<Multimedialugar> listaMultimedia= new ArrayList<>();

    RecyclerView listado;
    FirebaseFirestore baseDatos = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multimedia);



        listado= findViewById(R.id.listado);
        listado.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));



        crearListadoMultimedia();




    }

    private void crearListadoMultimedia() {

        baseDatos.collection("lugares")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {

                        if(task.isSuccessful()){

                            for(QueryDocumentSnapshot document: task.getResult()){

                                String tituloportada=document.get("titulo").toString();
                                String descripcionportada=document.get("descripcion").toString();
                                String fotourl=document.get("foto").toString();


                                listaMultimedia.add(new Multimedialugar(tituloportada,descripcionportada,fotourl));

                                AdaptadorMultimedia adaptador= new AdaptadorMultimedia(listaMultimedia);

                                listado.setAdapter(adaptador);



                            }

                        }else{

                            Toast.makeText(getApplicationContext(),"Error consultando datos",Toast.LENGTH_SHORT).show();

                        }


                    }
                });



    }
}