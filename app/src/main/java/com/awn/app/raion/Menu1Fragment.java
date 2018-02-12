package com.awn.app.raion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import io.nlopez.smartadapters.SmartAdapter;

public class Menu1Fragment extends Fragment {
    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 3;
    private static final Integer[] IMAGES= {R.drawable.slider1,R.drawable.slider2,R.drawable.slider3};
    private ArrayList<Integer> ImagesArray = new ArrayList<Integer>();
    ListView menuListView;
    TextView judul;

    int save;

    public static Menu1Fragment newInstance() {

        Bundle args = new Bundle();

        Menu1Fragment fragment = new Menu1Fragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_menu1, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);

        menuListView = (ListView) view.findViewById(R.id.lv);
        judul = (TextView) view.findViewById(R.id.judul);

        List<MenuBerita> menus = new ArrayList<>();
        menus.add(new MenuBerita("Fisip UB Gelar Enterpreneur Day", R.drawable.newss,"12 views"));
        menus.add(new MenuBerita("Kerjasama Dual Degree FT dengan UTS Australia", R.drawable.news2,"13 views"));
        menus.add(new MenuBerita("FTP Juara Umum Rektor Cup 2017", R.drawable.news3,"22 views"));

        SmartAdapter.items(menus).map(MenuBerita.class, BeritaView.class).into(menuListView);

        menuListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), Berita1.class);
                intent.putExtra("no", i);
                intent.putExtra("tag", "other");
                startActivity(intent);

                //Toast.makeText(getContext(), "Berita " + i, Toast.LENGTH_SHORT).show();
            }
        });
    }



    private void init(View view) {
        for(int i=0;i<IMAGES.length;i++)
            ImagesArray.add(IMAGES[i]);

        mPager = (ViewPager) view.findViewById(R.id.pager);


        mPager.setAdapter(new SlidingImage_Adapter(getContext(),ImagesArray));

        final CirclePageIndicator indicator = (CirclePageIndicator)
                view.findViewById(R.id.indicator);

        indicator.setViewPager(mPager);

        final float density = getResources().getDisplayMetrics().density;

        //Set circle indicator radius
        indicator.setRadius(5 * density);

        NUM_PAGES =IMAGES.length;

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 0000, 3000);



        // Pager listener over indicator
        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                currentPage = position;
                if (currentPage == 0){
                    judul.setText("Tim Tahu Telor UB Ciptakan Aplikasi untuk Panggil Pedagang Keliling");
                } else if (currentPage == 1){
                    judul.setText("Kerjasama Dual Degree FT dengan UTS Australia");
                } else if (currentPage == 2){
                    judul.setText("FTP Juara Umum Rektor Cup 2017");
                }

                //Toast.makeText(getContext(), "Collapsed"+currentPage, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onPageScrolled(int pos, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int pos) {

            }



        });
    }
}