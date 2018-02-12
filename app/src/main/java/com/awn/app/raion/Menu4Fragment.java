package com.awn.app.raion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

public class Menu4Fragment extends Fragment {

    ExpandableListAdapterSchedule listAdapter;
    ExpandableListView expListView;
    List<MenuGroupSchedule> listDataHeader;
    HashMap<MenuGroupSchedule, List<MenuSchedule>> listDataChild;

    public static Menu4Fragment newInstance() {

        Bundle args = new Bundle();

        Menu4Fragment fragment = new Menu4Fragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_menu3, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        expListView = (ExpandableListView) view.findViewById(R.id.lvExp);

        prepareListData();
        listAdapter = new ExpandableListAdapterSchedule(getContext(), listDataHeader, listDataChild);

        expListView.setAdapter(listAdapter);

        // Listview Group click listener
        expListView.setOnGroupClickListener(new OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                for(int i = 0; i < listDataHeader.size(); i++) {
                    if(i != groupPosition) expListView.collapseGroup(i);
                }

            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
//                Toast.makeText(getContext(),
//                        listDataHeader.get(groupPosition) + " Collapsed",
//                        Toast.LENGTH_SHORT).show();

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
                //Toast.makeText(getContext(), listDataChild.get(listDataHeader.get(groupPosition)).get(childPosition), Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();

        // Adding child data
        listDataHeader.add(new MenuGroupSchedule("Monday", R.drawable.mon));
        listDataHeader.add(new MenuGroupSchedule("Tuesday", R.drawable.tue));
        listDataHeader.add(new MenuGroupSchedule("Wednesday", R.drawable.wed));
        listDataHeader.add(new MenuGroupSchedule("Thursday", R.drawable.thu));
        listDataHeader.add(new MenuGroupSchedule("Friday", R.drawable.fri));

        // Adding child data
        List<MenuSchedule> mon = new ArrayList<>();
        mon.add(new MenuSchedule("Desain & Analisis Algoritma","CIF62240","Filkom - A2.23","09.30 - 11.59",R.drawable.schedule_list));
        mon.add(new MenuSchedule("Pemrograman Web","CIF62246","Filkom - F3.11","12.50 - 15.19",R.drawable.schedule_list));

        List<MenuSchedule> tue = new ArrayList<>();
        tue.add(new MenuSchedule("Jaringan Komputer","CCE61153","Filkom - E1.5","09.30 - 11.59",R.drawable.schedule_list));
        tue.add(new MenuSchedule("Analisis & Perancangan Sistem","CIF62245","Filkom - C1.13","12.50 - 15.19",R.drawable.schedule_list));

        List<MenuSchedule> wed = new ArrayList<>();
        wed.add(new MenuSchedule("Jaringan Komputer","CCE61153","Filkom - B1.9","08.40 - 10.19",R.drawable.schedule_list));
        wed.add(new MenuSchedule("Kecerdasan Buatan","CIF62242","Filkom - F2.8","15.20 - 17.49",R.drawable.schedule_list));

        List<MenuSchedule> thu = new ArrayList<>();
        thu.add(new MenuSchedule("Analisis & Perancangan Sistem","CIF62245","Filkom - F2.1","08.40 - 10.19",R.drawable.schedule_list));

        List<MenuSchedule> fri = new ArrayList<>();
        fri.add(new MenuSchedule("Analisis & Perancangan Sistem","CIF62245","Filkom - E1.3","09.30 - 11.09",R.drawable.schedule_list));
        fri.add(new MenuSchedule("Pemrograman Web","CIF62246","Filkom - A2.22","12.50 - 14.29",R.drawable.schedule_list));
        fri.add(new MenuSchedule("Kecerdasan Buatan","CIF62242","Filkom - F2.9","16.10 - 17.49",R.drawable.schedule_list));

        // Header, Child data
        listDataChild.put(listDataHeader.get(0), mon);
        listDataChild.put(listDataHeader.get(1), tue);
        listDataChild.put(listDataHeader.get(2), wed);
        listDataChild.put(listDataHeader.get(3), thu);
        listDataChild.put(listDataHeader.get(4), fri);
    }
}
