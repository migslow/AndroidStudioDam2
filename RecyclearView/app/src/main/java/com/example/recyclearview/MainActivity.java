package com.example.recyclearview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    // VARIABLES
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private MiAdaptador adaptador;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        Vector <String> elementos = new Vector<String>();
        elementos.add("Galicia");
        elementos.add("Asturias");
        elementos.add("Cantabria");
        elementos.add("Navarra");
        elementos.add("Aragon");

        // Creamos nuestro propio adaptador
        adaptador = new MiAdaptador(this, elementos);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adaptador);

    }
}