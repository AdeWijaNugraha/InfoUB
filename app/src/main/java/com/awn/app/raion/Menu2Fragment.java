package com.awn.app.raion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.content.Intent;
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
import android.widget.ImageButton;
import android.widget.Toast;

public class Menu2Fragment extends Fragment {

    ExpandableListAdapterEvent listAdapterEvent;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<MenuEvent>> listDataChild;
    ImageButton maps;

    public static Menu2Fragment newInstance(String fakultas) {

        Bundle args = new Bundle();
        args.putString("fakultas", fakultas);

        Menu2Fragment fragment = new Menu2Fragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_menu2, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final String faculty = getArguments().getString("fakultas");

        expListView = (ExpandableListView) view.findViewById(R.id.lvExpEvent);
        maps = (ImageButton) view.findViewById(R.id.maps);

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MapsActivities.class);
                intent.putExtra("fakultas", faculty);
                startActivity(intent);


                //Toast.makeText(getContext(), "Maps", Toast.LENGTH_SHORT).show();
            }
        });

        prepareListData();
        listAdapterEvent = new ExpandableListAdapterEvent(getContext(), listDataHeader, listDataChild);

        expListView.setAdapter(listAdapterEvent);

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
//                Toast.makeText(getContext(),
//                        listDataHeader.get(groupPosition) + " Expanded",
//                        Toast.LENGTH_SHORT).show();
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
        listDataHeader.add("Now");
        listDataHeader.add("Coming Soon");



        // Adding child data
        List<MenuEvent> now = new ArrayList<>();
        now.add(new MenuEvent("Wisuda","08.00 am","Gedung Samantha Krida","8","April","2017"));

        List<MenuEvent> coming = new ArrayList<>();
        coming.add(new MenuEvent("Big Data Seminar","08.00 am","Ballroom UB Hotel","25","April","2017"));
        coming.add(new MenuEvent("Trining IPK 4","07.00 am","Gedung Samantha Krida","30","April","2017"));
        coming.add(new MenuEvent("Microsoft Imagine Cup","07.30 am","Gedung Samantha Krida","10","May","2017"));

        // Header, Child data
        listDataChild.put(listDataHeader.get(0), now);
        listDataChild.put(listDataHeader.get(1), coming);
    }
}