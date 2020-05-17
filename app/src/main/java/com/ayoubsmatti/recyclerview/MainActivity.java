package com.ayoubsmatti.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.Listitem;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Listitem> listitems;
    private RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerviewID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listitems = new ArrayList<>();
        for (int x =0 ; x<10 ; x++){
            Listitem listitem = new Listitem(
                    "ayoub"+(x+1),
                    "saber ayoub smatti"
            );
            listitems.add(listitem);
        }
        adapter= new MyAdapter(this,listitems);
        recyclerView.setAdapter(adapter);
    }
}
