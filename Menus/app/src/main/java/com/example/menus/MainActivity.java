package com.example.menus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        String s = "";
        if(item.getItemId() == R.id.uno){
            s = "UNO";
        } else if (item.getItemId() == R.id.dos) {
            s = "DOS";
        } else if (item.getItemId() == R.id.tres) {
            s = "TRES";
        } else if (item.getItemId() == R.id.cuatro) {
            s = "CUATRO";
        } else if (item.getItemId() == R.id.cinco) {
            s = "CINCO";
        } else if (item.getItemId() == R.id.seis) {
            s = "SEIS";
        }

        tv.setText(s);
        /*
        switch (item.getItemId()){
            case R.id.uno:
                s = "1";
                break;
            case R.id.dos:
                s = "2";
                break;
            case R.id.tres:
                s = "3";
                break;
            case R.id.cuatro:
                s = "4";
                break;
            case R.id.cinco:
                s = "5";
                break;
            case R.id.seis:
                s = "6";
                break;
        }
        */

        return true;
    }

}