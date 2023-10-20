package com.example.a20231019_recyclerview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.viewHolder> {

    // Variables
    private List<String> animales;
    private List<String> sonidos;
    private LayoutInflater inflater;

    // private ItemClickListener listener;

    // Constructor
    public MyRecyclerViewAdapter(Context c, List<String> an, List<String> so){
        this.animales = an;
        this.sonidos = so;
        this.inflater = LayoutInflater.from(c);
    }

    // Infla cada fila del xml cuando sea necesario
    @NonNull
    @Override
    public MyRecyclerViewAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.fila, parent, false);
        return new viewHolder(v);
    }

    // Enlaza los datos al textView de cada fila
    @Override
    public void onBindViewHolder(@NonNull MyRecyclerViewAdapter.viewHolder holder, int position) {
        // Cogemos el dato que hay en animal en la posicion "position"
        String s = animales.get(position);
        // Ponemos el dato en el ViewHolder
        holder.setTvAnimales(s);
        // Cogemos el datos que hay en sonido en la posicion "position"
        s = sonidos.get(position);
        // Ponemos el dato en el ViewHolder
        holder.setTvSonidos(s);
    }

    @Override
    public int getItemCount() {
        return animales.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        // Variables
        private TextView tvAnimales;
        private TextView tvSonidos;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            tvAnimales = itemView.findViewById(R.id.tvAnimalName);
            tvSonidos = itemView.findViewById(R.id.tvAnimalSound);
        }

        public void setTvAnimales(String tvAnimales) {
            this.tvAnimales.setText(tvAnimales);
        }

        public void setTvSonidos(String tvSonidos) {
            this.tvSonidos.setText(tvSonidos);
        }

        public String getTvAnimales() {
            return tvAnimales.getText().toString();
        }

        public String getTvSonidos() {
            return tvSonidos.getText().toString();
        }
    }
}
