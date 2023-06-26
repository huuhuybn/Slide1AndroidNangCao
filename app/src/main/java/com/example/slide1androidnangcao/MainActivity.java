package com.example.slide1androidnangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DBHelper dbHelper =
                new DBHelper(MainActivity.this);
        findViewById(R.id.btnSave).setOnClickListener(view -> {
            SanPham sp1 = new SanPham("ip12Pro1", "Iphone1", 5000);
            SanPham sp2 = new SanPham("ip12Pro2", "Iphone2", 6000);
            SanPham sp3 = new SanPham("ip12Pro3", "Iphone3", 7000);
            SanPhamDAO sanPhamDAO = new SanPhamDAO(MainActivity.this,
                    dbHelper);
            sanPhamDAO.insertSP(sp1);
        });
        
    }
}