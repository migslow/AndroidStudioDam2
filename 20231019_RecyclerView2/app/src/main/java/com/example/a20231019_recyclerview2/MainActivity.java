package com.example.a20231019_recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MyRecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> animalNames = new ArrayList<>();
        animalNames.add("Caballo");
        animalNames.add("Vaca");
        animalNames.add("Pollo");
        animalNames.add("Oveja");
        animalNames.add("Abeja");
        animalNames.add("Gallina");
        animalNames.add("Oca");
        animalNames.add("Perro");

        ArrayList<String> animalSound = new ArrayList<>();
        animalSound.add("Hiiiiiiiiiii");
        animalSound.add("Muuuuuuuu");
        animalSound.add("Pio Pio");
        animalSound.add("Beeeee");
        animalSound.add("Zzzzzzzzzzzzzzz");
        animalSound.add("co co co");
        animalSound.add("cua cua");
        animalSound.add("Guau Guao");

        // Seteamos el RecyclearView
        RecyclerView recyclerView = findViewById(R.id.rvAnimal);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, animalNames, animalSound);
        recyclerView.setAdapter(adapter);



    }
}