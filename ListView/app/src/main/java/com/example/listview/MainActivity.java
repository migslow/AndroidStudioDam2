package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    TextView resultado;
    ListView l;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Relacionamos las variables con su correspondiente elto de Layout
        resultado = findViewById(R.id.resultado);
        l = findViewById(R.id.listView);

        //Creamos el array con los datos seleccionables
        String[] elementos = {"Galicia", "Asturias", "Cantabria", "Nvarra", "Aragón"};

        //Creamos el adaptador de texto (String)
        ArrayAdapter<String> adaptador;

        //Creamos el adaptador
        adaptador = new ArrayAdapter<>(this, R.layout.fila, elementos);

        //y le ponemos el click listener
        l.setOnItemClickListener(this);

        //Le damos el adaptador a la lista
        l.setAdapter(adaptador);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        resultado.setText("Has elegido: " + adapterView.getItemAtPosition(position).toString());
    }
}