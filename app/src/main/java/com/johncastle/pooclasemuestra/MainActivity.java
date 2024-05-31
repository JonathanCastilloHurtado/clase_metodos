package com.johncastle.pooclasemuestra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    //this is a monolith


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String specie="GATO";
        String name="fluffy";
        String action="maulla";
        String skills="trepa";


        Log.d("PRINT",specie);
        Log.d("PRINT",name);
        Log.d("PRINT",action);
        Log.d("PRINT",skills);
    }
}
