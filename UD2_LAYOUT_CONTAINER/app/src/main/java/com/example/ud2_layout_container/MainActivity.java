package com.example.ud2_layout_container;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recorrer();
    }

    public void recorrer(){
        View view;

        ConstraintLayout cl;
        cl = findViewById(R.id.constaint);

        for(int i = 0; i < cl.getChildCount(); i++){
            view = cl.getChildAt(i);
            System.out.println("Objeto: " + view.toString());
        }
    }
}