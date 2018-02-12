//package com.awn.app.raion;
//
///**
// * Created by adewijanugraha on 29/03/17.
// */
//
//import android.os.Bundle;
//import android.support.annotation.Nullable;
//import android.support.v4.app.Fragment;
//import android.support.v7.app.AppCompatActivity;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.AdapterView;
//import android.widget.ListView;
//import android.widget.Toast;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import io.nlopez.smartadapters.SmartAdapter;
//
///**
// * Created by adewijanugraha on 28/03/17.
// */
//
//public class Menu1Fragmentnone extends Fragment {
//
//    public static Menu1Fragmentnone newInstance() {
//
//        Bundle args = new Bundle();
//
//        Menu1Fragmentnone fragment = new Menu1Fragmentnone();
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    ListView menuListView;
//
//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_menu1, container, false);
//    }
//
//    @Override
//    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//        menuListView = (ListView) view.findViewById(R.id.menu1_listView);
//
//        List<Menu> menus = new ArrayList<>();
//        menus.add(new Menu("Art", R.drawable.art));
//        menus.add(new Menu("Culture", R.drawable.culture));
//        menus.add(new Menu("Game", R.drawable.game));
//        menus.add(new Menu("Music", R.drawable.music));
//        menus.add(new Menu("Pet", R.drawable.pet));
//        menus.add(new Menu("Social", R.drawable.social));
//        menus.add(new Menu("Sport", R.drawable.sport));
//        menus.add(new Menu("Study", R.drawable.study));
//
//        SmartAdapter.items(menus).map(Menu.class, MenuView.class).into(menuListView);
//
//        menuListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getContext(), "Position = " + i, Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//}
