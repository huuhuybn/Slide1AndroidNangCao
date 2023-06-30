package com.example.slide1androidnangcao.slide2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.slide1androidnangcao.DBHelper;
import com.example.slide1androidnangcao.R;
import com.example.slide1androidnangcao.SanPham;
import com.example.slide1androidnangcao.SanPhamDAO;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Slide2Activity extends AppCompatActivity {

    ArrayList<SanPham> sanPhams;
    RecyclerView rvList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide2);
        SanPhamDAO spDAO = new SanPhamDAO(this,
                new DBHelper(this));
        sanPhams = spDAO.getAll();
        rvList = findViewById(R.id.rvList);
        SanPhamRVAdapter sanPhamRVAdapter = new SanPhamRVAdapter(sanPhams);
        rvList.setAdapter(sanPhamRVAdapter);
       /* LinearLayoutManager ln = new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL,false);*/

        GridLayoutManager ln = new GridLayoutManager(this,4);
        rvList.setLayoutManager(ln);
    }
}