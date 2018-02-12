package com.awn.app.raion;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by adewijanugraha on 28/03/17.
 */

public class Menu5Fragment extends Fragment {
    TextView nama, nim, fakultas, program, semester;

    public static Menu5Fragment newInstance() {

        Bundle args = new Bundle();

        Menu5Fragment fragment = new Menu5Fragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_menu5, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        nama = (TextView) view.findViewById(R.id.name);
        nim = (TextView) view.findViewById(R.id.isi_nim);
        fakultas = (TextView) view.findViewById(R.id.isi_faculty);
        program = (TextView) view.findViewById(R.id.isi_program);
        semester = (TextView) view.findViewById(R.id.isi_semester);

        nama.setText("Ade Wija Nugraha");
        nim.setText("155150201111020");
        fakultas.setText("Faculty of Computer Science");
        program.setText("Informatics Engineering");
        semester.setText("3");

//        getChildFragmentManager(){
//
//        }
    }
}
