package com.example.mongui2;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorMultimedia extends RecyclerView.Adapter<AdaptadorMultimedia.viewHolder> {

    ArrayList<Multimedialugar> listaMultimedia;

    public AdaptadorMultimedia(ArrayList<Multimedialugar> listaMultimedia) {
        this.listaMultimedia = listaMultimedia;
    }

    @NonNull
    @Override
    public AdaptadorMultimedia.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vistaListado = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_multimedia,null,false);

        return new viewHolder(vistaListado);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorMultimedia.viewHolder holder, int position) {

        holder.actualizarDatosMultimedia(listaMultimedia.get(position));

    }

    @Override
    public int getItemCount() {
        return listaMultimedia.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView adapTitulo,adapDescripcion;
        ImageView adapImg;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            adapTitulo = itemView.findViewById(R.id.Rnombre);
            adapDescripcion = itemView.findViewById(R.id.Rdescripcion);
            adapImg = itemView.findViewById(R.id.Rimagen);



        }

        public void actualizarDatosMultimedia(Multimedialugar Dato) {

             adapTitulo.setText(Dato.getTituloportada());
             adapDescripcion.setText(Dato.getDescripcionportada());
             adapImg.setImageResource(Dato.getFotoportada());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(),OnclickMultimedia.class);
                    intent.putExtra("lugar",Dato);
                    itemView.getContext().startActivity(intent);
                }
            });

        }
    }
}
