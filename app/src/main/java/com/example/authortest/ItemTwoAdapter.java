package com.example.authortest;

import android.view.View;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import java.util.List;

public class ItemTwoAdapter extends BaseQuickAdapter<Integer, NBViewHolder> {
    public ItemTwoAdapter(@Nullable List<Integer> data) {
        super(R.layout.item_two, data);
    }

    @Override
    protected void convert(@NonNull NBViewHolder baseViewHolder, Integer s) {
        RelativeLayout two = baseViewHolder.getView(R.id.two);
        int index = baseViewHolder.getItemPosition();
        int a = s/2;
        int b = s%2;
        int c = a + b -1;

        if (c == index){
            if (b > 0){
                two.setVisibility(View.GONE);
            }else {
                two.setVisibility(View.VISIBLE);
            }
        }else {
            two.setVisibility(View.VISIBLE);
        }
    }
}
