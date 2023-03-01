package com.example.authortest;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ErActivity extends AppCompatActivity {

    private RecyclerView recy;
    private ListTwoAdapter adapter;

    private List<Integer> list;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_two);
        recy = findViewById(R.id.recy);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recy.setLayoutManager(linearLayoutManager);
        list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);

        adapter = new ListTwoAdapter(list);
        recy.setAdapter(adapter);
    }
}
