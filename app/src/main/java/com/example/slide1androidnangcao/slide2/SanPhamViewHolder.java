package com.example.slide1androidnangcao.slide2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.slide1androidnangcao.R;

public class SanPhamViewHolder extends RecyclerView.ViewHolder {

    public final TextView tvInfo;
    public SanPhamViewHolder(@NonNull View itemView) {
        super(itemView);
        tvInfo = itemView.findViewById(R.id.tvMaSP);
    }
}
