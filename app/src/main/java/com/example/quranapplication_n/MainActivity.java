package com.example.quranapplication_n;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView pText;
    TextView aText;
    Button search;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pText = findViewById(R.id.parahText);
        aText = findViewById(R.id.ayatText);
        search = findViewById(R.id.buttonSearch);
        display = findViewById(R.id.buttonSearch);



    }
}