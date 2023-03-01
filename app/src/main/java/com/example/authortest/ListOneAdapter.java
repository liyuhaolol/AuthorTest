package com.example.authortest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import java.util.ArrayList;
import java.util.List;

public class ListOneAdapter extends BaseQuickAdapter<Integer, BaseViewHolder> {


    public ListOneAdapter(@Nullable List<Integer> data) {
        super(R.layout.item_list, data);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder baseViewHolder, Integer s) {
        ViewPager2 viewPager = baseViewHolder.getView(R.id.vp);
        viewPager.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);
        viewPager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        List<Integer> list = new ArrayList<>();
        int num = s/2+s%2;
        for (int i = 0; i < num;i++){
            list.add(s);
        }
        ItemTwoAdapter adapter = new ItemTwoAdapter(list);
        viewPager.setAdapter(adapter);
        baseViewHolder.setText(R.id.tiao,s+"条");
    }
}
