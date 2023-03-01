package com.example.authortest;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import java.util.ArrayList;
import java.util.List;

import spa.lyh.cn.lib_utils.PixelUtils;

public class ListSanAdapter extends BaseQuickAdapter<SanItem, BaseViewHolder> {


    public ListSanAdapter(@Nullable List<SanItem> data) {
        super(R.layout.item_san, data);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder baseViewHolder, SanItem s) {
        RecyclerView recy = baseViewHolder.getView(R.id.recy);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) recy.getLayoutParams();
        Button zk = baseViewHolder.getView(R.id.zk);
        recy.setLayoutManager(new LinearLayoutManager(getContext()));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.num;i++){
            list.add(s.num);
        }
        ItemSanAdapter adapter = new ItemSanAdapter(list);
        recy.setAdapter(adapter);
        baseViewHolder.setText(R.id.tiao,s.num+"条");
        if (s.num <= 2){
            zk.setVisibility(View.GONE);
        }else {
            zk.setVisibility(View.VISIBLE);
        }
        if (s.open == 0){
            zk.setText("展开");
            layoutParams.height = PixelUtils.dip2px(getContext(),100);
            recy.setLayoutParams(layoutParams);
        }else {
            zk.setText("收起");
            layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT;
            recy.setLayoutParams(layoutParams);
        }
        zk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s.open == 0){
                    s.open = 1;
                    zk.setText("收起");
                    layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT;
                    recy.setLayoutParams(layoutParams);
                }else {
                    s.open = 0;
                    zk.setText("展开");
                    layoutParams.height = PixelUtils.dip2px(getContext(),100);
                    recy.setLayoutParams(layoutParams);
                }
            }
        });
    }
}
