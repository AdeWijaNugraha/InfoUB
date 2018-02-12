package com.awn.app.raion;

/**
 * Created by adewijanugraha on 28/03/17.
 */

public class MenuSchedule {

    private String matkul, kode, kelas, jam;

    private int ImageResourceId;

    public MenuSchedule(String matkul, String kode, String kelas, String jam, int imageResourceId) {
        this.matkul = matkul;
        this.kode = kode;
        this.kelas = kelas;
        this.jam = jam;
        ImageResourceId = imageResourceId;
    }

    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public int getImageResourceId() {
        return ImageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        ImageResourceId = imageResourceId;
    }
}
