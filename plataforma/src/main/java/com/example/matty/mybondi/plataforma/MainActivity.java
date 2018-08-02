package com.example.matty.mybondi.plataforma;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.Arrays;
import java.util.List;
import Database.MyBondiDB;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyBondiDB db = Room.databaseBuilder(getApplicationContext(),
                MyBondiDB.class, "MyBondiDB").build();

        final Spinner origen = findViewById(R.id.spinner);
        Spinner destino = findViewById(R.id.spinner2);

        List<String> list = Arrays.asList("Elige un origen", "Trelew", "Rawson", "Puerto Madryn",
                "Playa Union", "Gaiman", "Dolavon");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        origen.setAdapter(arrayAdapter);
        destino.setAdapter(arrayAdapter);

        origen.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "El origen seleccionado es " + String.valueOf(origen.getSelectedItem()), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}