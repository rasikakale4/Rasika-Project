package com.example.cics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class State extends AppCompatActivity  {

    EditText t1, t2;
    Spinner spinner, spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);

        spinner = findViewById(R.id.spinner);
        spinner1 = findViewById(R.id.spinner1);



        Button button_state = (Button) findViewById(R.id.button_state);
        button_state.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(State.this, Map.class);
                startActivity(intent);
            }
        });

    }
}