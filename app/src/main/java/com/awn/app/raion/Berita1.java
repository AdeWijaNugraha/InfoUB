package com.awn.app.raion;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by adewijanugraha on 31/03/17.
 */

public class Berita1 extends AppCompatActivity{

    TextView text, title, author, date;
    String tag;
    ImageView gambar;
    int nomer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.berita1);

        text = (TextView) findViewById(R.id.news_text);
        title = (TextView) findViewById(R.id.news_title);
        author = (TextView) findViewById(R.id.news_author);
        date = (TextView) findViewById(R.id.news_date);
        gambar = (ImageView) findViewById(R.id.news_image);

        Bundle bundle = getIntent().getExtras();
        nomer = bundle.getInt("no");
        tag = bundle.getString("tag");

        if (tag.equalsIgnoreCase("headline")){
            switch (nomer){
                case 0 :
                    gambar.setImageResource(R.drawable.news1);
                    text.setText("Indonesia adalah salah satu negara di dunia yang penduduknya memiliki " +
                            "mata pencarian sebagai pedagang keliling, mulai dari menjajakan makanan, " +
                            "produk rumah tangga hingga jasa perbaikan barang. Meski demikian hingga saat " +
                            "ini belum ada sistem yang dapat mendukung untuk meningkatkan pemasaran pedagang " +
                            "keliling tersebut. Untuk itu tiga mahasiswa Fakultas Ilmu Komputer Universitas " +
                            "Brawijaya (FILKOM UB) yang menamakan dirinya Tim Tahu Telor membuat sebuah " +
                            "aplikasi yang dapat mendukung pemasaran pedagang keliling dengan nama Toko " +
                            "Bergerak Online atau disingkat TOBAGO. Mereka bertiga adalah mahasiswa Program " +
                            "Studi Teknik Informatika angkatan 2014, yaitu Defara Fikry Akmal (Project Manager)," +
                            " Aditya Wisnu Jati Kusumo (User Experience Designer/UXD) dan Ahmad Kamil Almasyhur " +
                            "(Programmer).");
                    date.setText("24 March 2017 12:00");
                    author.setText("By : PasetyaUB");
                    title.setText("Tim Tahu Telor UB Ciptakan Aplikasi untuk Panggil Pedagang Keliling");
                    break;
                case 1 :
                    gambar.setImageResource(R.drawable.news2);
                    text.setText("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
                    date.setText("02 April 2017 08:30");
                    author.setText("By : PasetyaUB");
                    title.setText("Kerjasama Dual Degree FT dengan UTS Australia");
                    break;
                case 2 :
                    gambar.setImageResource(R.drawable.news3);
                    text.setText("Indonesia adalah salah satu negara di dunia yang penduduknya memiliki " +
                            "mata pencarian sebagai pedagang keliling, mulai dari menjajakan makanan, " +
                            "produk rumah tangga hingga jasa perbaikan barang. Meski demikian hingga saat " +
                            "ini belum ada sistem yang dapat mendukung untuk meningkatkan pemasaran pedagang " +
                            "keliling tersebut. Untuk itu tiga mahasiswa Fakultas Ilmu Komputer Universitas " +
                            "Brawijaya (FILKOM UB) yang menamakan dirinya Tim Tahu Telor membuat sebuah " +
                            "aplikasi yang dapat mendukung pemasaran pedagang keliling dengan nama Toko " +
                            "Bergerak Online atau disingkat TOBAGO. Mereka bertiga adalah mahasiswa Program " +
                            "Studi Teknik Informatika angkatan 2014, yaitu Defara Fikry Akmal (Project Manager)," +
                            " Aditya Wisnu Jati Kusumo (User Experience Designer/UXD) dan Ahmad Kamil Almasyhur " +
                            "(Programmer).");
                    date.setText("07 April 2017 16:00");
                    author.setText("By : PasetyaFilkom");
                    title.setText("FTP Juara Umum Rektor Cup 2017");
                    break;
            }
        } else {
            switch (nomer) {
                case 0:
                    gambar.setImageResource(R.drawable.newss);
                    text.setText("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
                    date.setText("30 March 2017 12:00");
                    author.setText("By : PasetyaFilkom");
                    title.setText("Fisip UB Gelar Enterpreneur Day");
                    break;
                case 1:
                    gambar.setImageResource(R.drawable.news2);
                    text.setText("Indonesia adalah salah satu negara di dunia yang penduduknya memiliki " +
                            "mata pencarian sebagai pedagang keliling, mulai dari menjajakan makanan, " +
                            "produk rumah tangga hingga jasa perbaikan barang. Meski demikian hingga saat " +
                            "ini belum ada sistem yang dapat mendukung untuk meningkatkan pemasaran pedagang " +
                            "keliling tersebut. Untuk itu tiga mahasiswa Fakultas Ilmu Komputer Universitas " +
                            "Brawijaya (FILKOM UB) yang menamakan dirinya Tim Tahu Telor membuat sebuah " +
                            "aplikasi yang dapat mendukung pemasaran pedagang keliling dengan nama Toko " +
                            "Bergerak Online atau disingkat TOBAGO. Mereka bertiga adalah mahasiswa Program " +
                            "Studi Teknik Informatika angkatan 2014, yaitu Defara Fikry Akmal (Project Manager)," +
                            " Aditya Wisnu Jati Kusumo (User Experience Designer/UXD) dan Ahmad Kamil Almasyhur " +
                            "(Programmer).");
                    date.setText("24 March 2017 12:00");
                    author.setText("By : PasetyaFilkom");
                    title.setText("Kerjasama Dual Degree FT dengan UTS Australia");
                    break;
                case 2:
                    gambar.setImageResource(R.drawable.news3);
                    text.setText("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
                    date.setText("24 March 2017 12:00");
                    author.setText("By : PasetyaFilkom");
                    title.setText("FTP Juara Umum Rektor Cup 2017");
                    break;
            }

        }
    }
}
