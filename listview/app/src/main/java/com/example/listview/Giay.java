package com.example.listview;

public class Giay {
    private String tenmon;
    private String mota;
    private int hinh;

    public Giay(String tenmon, String mota, int hinh){
        this.tenmon = tenmon;
        this.mota = mota;
        this.hinh = hinh;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
