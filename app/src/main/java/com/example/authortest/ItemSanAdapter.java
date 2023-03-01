package com.example.authortest;

import android.graphics.Color;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.List;

public class ItemSanAdapter extends BaseQuickAdapter<Integer, NBViewHolder> {
    public ItemSanAdapter(@Nullable List<Integer> data) {
        super(R.layout.item_san_san, data);
    }

    @Override
    protected void convert(@NonNull NBViewHolder baseViewHolder, Integer s) {
        RelativeLayout mm = baseViewHolder.getView(R.id.mm);
        if ((baseViewHolder.getItemPosition() + 1) % 2 > 0){
            mm.setBackgroundColor(Color.parseColor("#ff7790"));
        }else {
            mm.setBackgroundColor(Color.parseColor("#9932CC"));
        }
    }
}
