package com.example.slide1androidnangcao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

public class SanPhamDAO {

    Context context;
    DBHelper dbHelper;

    public SanPhamDAO(Context context, DBHelper dbHelper) {
        this.context = context;
        this.dbHelper = dbHelper;
    }

    public void insertSP(SanPham sp) {
        SQLiteDatabase sql = dbHelper.getReadableDatabase();
        ContentValues pair = new ContentValues();
        pair.put("maSP",sp.getMaSP());
        pair.put("tenSP",sp.getTenSP());
        pair.put("giaSP",sp.getGiaSP());
        // giá trị cột phải Y XỲ như khi khai báo ban đầu
        long kq = sql.insert("SP",null,pair);
        if (kq> 0)
            Toast.makeText(context, "OK-> Thanh Cong!!",
                    Toast.LENGTH_SHORT).show();
        else Toast.makeText(context, "KO-> Thanh Cong!!",
                Toast.LENGTH_SHORT).show();
    }
    public void updateSP(SanPham sp) {
        SQLiteDatabase sql = dbHelper.getReadableDatabase();
        ContentValues pair = new ContentValues();
        pair.put("tenSP",sp.getTenSP());
        pair.put("giaSP",sp.getGiaSP());
        // giá trị cột phải Y XỲ như khi khai báo ban đầu
        long kq = sql.update("SP",pair,"maSP = ?",new String[]{sp.getMaSP()});
        if (kq> 0)
            Toast.makeText(context, "OK-> Thanh Cong!!",
                    Toast.LENGTH_SHORT).show();
        else Toast.makeText(context, "KO-> Thanh Cong!!",
                Toast.LENGTH_SHORT).show();
    }
    public void deleteSP(SanPham sp) {
        SQLiteDatabase sql = dbHelper.getReadableDatabase();
        long kq = sql.delete("SP","maSP = ?",new String[]{sp.getMaSP()});
        if (kq> 0)
            Toast.makeText(context, "OK-> Thanh Cong!!",
                    Toast.LENGTH_SHORT).show();
        else Toast.makeText(context, "KO-> Thanh Cong!!",
                Toast.LENGTH_SHORT).show();
    }
}
