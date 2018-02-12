package com.awn.app.raion;

/**
 * Created by adewijanugraha on 28/03/17.
 */

public class MenuEvent {

    private String menu;
    private String jam;
    private String lokasi, tanggal, bulan, tahun;

    public MenuEvent(String menu, String jam, String lokasi, String tanggal, String bulan, String tahun) {
        this.menu = menu;
        this.jam = jam;
        this.lokasi = lokasi;
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getBulan() {
        return bulan;
    }

    public void setBulan(String bulan) {
        this.bulan = bulan;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

}
