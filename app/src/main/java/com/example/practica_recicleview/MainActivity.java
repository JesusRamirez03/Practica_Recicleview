package com.example.practica_recicleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import adapter.ConsoleReciclerAdapter;
import models.Console;

public class MainActivity extends AppCompatActivity {
    int [] images = {R.drawable.xbox,R.drawable.play,R.drawable.nintendo};
    List<Console> consoles = new ArrayList<>();
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getAllConsole();
        ConsoleReciclerAdapter adapter = new ConsoleReciclerAdapter(consoles,this);
        recyclerView = findViewById(R.id.myrecicler);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    //----------------------------
    public void getAllConsole(){
        String [] names = getResources().getStringArray(R.array.names_txt);
        String [] gen = getResources().getStringArray(R.array.gen_txt);
        for(int i=0; i<names.length; i++){
            consoles.add(new Console(names[i],gen[i],images[i]));
        }

    }
}