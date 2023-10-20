package com.example.recyclearview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Vector;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.ViewHolder> {

    // Numero de elementos

    private int numElementos;
    private LayoutInflater inflater;
    private Vector<String> lista;

    public MiAdaptador (int numElementos){
        this.numElementos = numElementos;
    }

    public MiAdaptador (Context context, Vector<String> l){
        this.lista = l;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    // Creamos (inflamos) cada una de los ViewHolders
    @NonNull
    @Override
    public MiAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.fila, parent, false);
        return new ViewHolder(v);
    }

    // Cogemos el datos que esta en la posicion "position" y se lo pasamos al ViewHolder
    // para que lo muestre
    @Override
    public void onBindViewHolder(@NonNull MiAdaptador.ViewHolder holder, int position) {
        String s = lista.elementAt(position);
        holder.setTV(s);
    }

    // Nos devuelve el numero de elementos que hay que mostrar
    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.fila);
        }
        public void setTV(String s){
            tv.setText(s);
        }

    }


}
