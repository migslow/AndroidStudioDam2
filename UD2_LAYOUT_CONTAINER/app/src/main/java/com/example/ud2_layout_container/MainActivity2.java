package com.example.ud2_layout_container;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    TableLayout tableLayout;
    Button[][] buttons;

    int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        n = 4;
        tableLayout = findViewById(R.id.table);

        anadeHijos();
    }

    public void anadeHijos() {
        Button b;
        TableRow tr;
        buttons = new Button[n][n];

        for (int i = 0; i < n; i++) {
            tr = new TableRow(this);
            tr.setLayoutParams(new TableLayout.LayoutParams(
                    TableLayout.LayoutParams.MATCH_PARENT,
                    TableLayout.LayoutParams.MATCH_PARENT
            ));
            tr.setId(View.generateViewId());

            for (int j = 0; j < n; j++) {
                b = new Button(this);
                b.setLayoutParams(new TableRow.LayoutParams(
                        TableRow.LayoutParams.WRAP_CONTENT,
                        TableRow.LayoutParams.WRAP_CONTENT
                ));
                b.setText(i + "-" + j);
                b.setId(View.generateViewId());
                b.setBackgroundColor(Color.WHITE);
                buttons[i][j] = b;
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        cambiarColorBotones((Button) view);
                    }
                });
                tr.addView(b);
            }
            tableLayout.addView(tr);
        }
        if (buttons[0][0] != null) {
            buttons[0][0].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cambiarFondoBlanco();
                }
            });
        }

        if (buttons[n - 1][n - 1] != null) {
            buttons[n - 1][n - 1].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cambiarFondoNegro();
                }
            });

        }


    }

    public void cambiarColorBotones (Button b){
        Random random = new Random();

        int red = random.nextInt(255);
        int blue = random.nextInt(255);
        int green = random.nextInt(255);

        int color = Color.rgb(red, blue, green);
        b.setBackgroundColor(color);
    }

    public void cambiarFondoBlanco () {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (buttons[i][j] != null) {
                    buttons[i][j].setBackgroundColor(Color.WHITE);
                    buttons[i][j].setTextColor(Color.BLACK);
                }
            }
        }
    }

    public void cambiarFondoNegro () {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (buttons[i][j] != null) {
                    buttons[i][j].setBackgroundColor(Color.BLACK);
                    buttons[i][j].setTextColor(Color.WHITE);
                }
            }
        }
    }
}