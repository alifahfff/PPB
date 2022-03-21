package com.example.ets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recycleView = findViewById(R.id.recyclerView);
        recycleView.setHasFixedSize(true);
        recycleView.setLayoutManager(new LinearLayoutManager(this));

        Klasmen[] klasmen = new Klasmen[]{
                new Klasmen("1 Bali United", "69"),
                new Klasmen("2 Persib", "66"),
                new Klasmen("3 Persebaya", "58"),
                new Klasmen("4 Bhayangkara", "59"),
                new Klasmen("5 Arema", "58"),
        };

        KlasmenAdapter klasmenAdapter = new KlasmenAdapter(Klasmen, MainActivity.this);
        recyclerView.setAdapter(KlasmenAdapter);
    }
}