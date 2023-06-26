package com.example.slide1androidnangcao;

public class SanPham {
    String maSP;
    String tenSP;
    float giaSP;
    // khởi tạo pt set get bằng cách nào ?????

    public SanPham(String maSP, String tenSP, float giaSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaSP = giaSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public float getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(float giaSP) {
        this.giaSP = giaSP;
    }
}
