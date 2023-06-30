package com.example.slide1androidnangcao.slide2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.slide1androidnangcao.DBHelper;
import com.example.slide1androidnangcao.R;
import com.example.slide1androidnangcao.SanPham;
import com.example.slide1androidnangcao.SanPhamDAO;

import java.util.ArrayList;

public class SanPhamRVAdapter extends RecyclerView.Adapter<SanPhamViewHolder> {

    ArrayList<SanPham> arrayList;

    OnItemClickListener clickListener;
    public void setOnItemClickListener(OnItemClickListener onItemClick){
        onItemClick = clickListener;
    }
    public SanPhamRVAdapter(ArrayList<SanPham> arrayList) {
        this.arrayList = arrayList;
    }
    @NonNull
    @Override
    public SanPhamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item,parent,false);
        return new SanPhamViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SanPhamViewHolder holder, int position) {
        SanPham sp = arrayList.get(position);
        holder.tvInfo.setText(sp.tenSP.concat(sp.maSP));
        holder.btnDel.setOnClickListener(v -> {
            clickListener.onClickItem(position);
        });
    }
    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
