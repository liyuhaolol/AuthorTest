package com.example.authortest;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SanActivity extends AppCompatActivity {

    private RecyclerView recy;
    private ListSanAdapter adapter;

    private List<SanItem> list;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_two);
        recy = findViewById(R.id.recy);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recy.setLayoutManager(linearLayoutManager);
        list = new ArrayList<>();
        list.add(new SanItem(1));
        list.add(new SanItem(3));
        list.add(new SanItem(4));
        list.add(new SanItem(5));
        list.add(new SanItem(8));
        list.add(new SanItem(9));
        list.add(new SanItem(10));
        list.add(new SanItem(10));
        list.add(new SanItem(10));
        list.add(new SanItem(10));

        adapter = new ListSanAdapter(list);
        recy.setAdapter(adapter);
    }
}
