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
import android.widget.Toast;

public class Menu3Fragment extends Fragment {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<Menu> listDataHeader;
    HashMap<Menu, List<String>> listDataChild;

    public static Menu3Fragment newInstance() {

        Bundle args = new Bundle();

        Menu3Fragment fragment = new Menu3Fragment();
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
        listAdapter = new ExpandableListAdapter(getContext(), listDataHeader, listDataChild);

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
                //Toast.makeText(getContext(), listDataHeader.get(groupPosition) + listDataChild.get(listDataHeader.get(groupPosition)).get(childPosition), Toast.LENGTH_SHORT).show();
                if (listDataChild.get(listDataHeader.get(groupPosition)).get(childPosition).equalsIgnoreCase("Filosofi Lambang")){
                    Intent intent = new Intent(getActivity(), Filosofi.class);
                    intent.putExtra("childPosition", "Filosofi");
                    startActivity(intent);
                } else if (listDataChild.get(listDataHeader.get(groupPosition)).get(childPosition).equalsIgnoreCase("Department")){
                    Intent intent = new Intent(getActivity(), Filosofi.class);
                    intent.putExtra("childPosition", "Department");
                    startActivity(intent);
                } else if (listDataChild.get(listDataHeader.get(groupPosition)).get(childPosition).equalsIgnoreCase("Struktur Organisasi")){
                    Intent intent = new Intent(getActivity(), Filosofi.class);
                    intent.putExtra("childPosition", "Struktur Organisasi");
                    startActivity(intent);
                } else if (listDataChild.get(listDataHeader.get(groupPosition)).get(childPosition).equalsIgnoreCase("Event")){
                    Intent intent = new Intent(getActivity(), Filosofi.class);
                    intent.putExtra("childPosition", "Event");
                    startActivity(intent);
                }
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
        listDataHeader.add(new Menu("BEM Filkom", R.drawable.bem));
        listDataHeader.add(new Menu("Raion", R.drawable.raion));
        listDataHeader.add(new Menu("Poros", R.drawable.poros));
        listDataHeader.add(new Menu("Optiik", R.drawable.optiik));
        listDataHeader.add(new Menu("Display", R.drawable.display));
        listDataHeader.add(new Menu("BIOS", R.drawable.bios));
        listDataHeader.add(new Menu("AMD", R.drawable.amd));
        listDataHeader.add(new Menu("K-Risma", R.drawable.krisma));


        // Adding child data
        List<String> bem = new ArrayList<>();
        bem.add("Filosofi Lambang");
        bem.add("Department");
        bem.add("Struktur Organisasi");
        bem.add("Event");

        List<String> raion = new ArrayList<>();
        raion.add("Filosofi Lambang");
        raion.add("Department");
        raion.add("Struktur Organisasi");
        raion.add("Event");

        List<String> poros = new ArrayList<>();
        poros.add("Filosofi Lambang");
        poros.add("Department");
        poros.add("Struktur Organisasi");
        poros.add("Event");

        List<String> optiik = new ArrayList<>();
        optiik.add("Filosofi Lambang");
        optiik.add("Department");
        optiik.add("Struktur Organisasi");
        optiik.add("Event");

        List<String> display = new ArrayList<>();
        display.add("Filosofi Lambang");
        display.add("Department");
        display.add("Struktur Organisasi");
        display.add("Event");

        List<String> bios = new ArrayList<>();
        bios.add("Filosofi Lambang");
        bios.add("Department");
        bios.add("Struktur Organisasi");
        bios.add("Event");

        List<String> amd = new ArrayList<>();
        amd.add("Filosofi Lambang");
        amd.add("Department");
        amd.add("Struktur Organisasi");
        amd.add("Event");

        List<String> krisma = new ArrayList<>();
        krisma.add("Filosofi Lambang");
        krisma.add("Department");
        krisma.add("Struktur Organisasi");
        krisma.add("Event");

        // Header, Child data
        listDataChild.put(listDataHeader.get(0), bem);
        listDataChild.put(listDataHeader.get(1), raion);
        listDataChild.put(listDataHeader.get(2), poros);
        listDataChild.put(listDataHeader.get(3), optiik);
        listDataChild.put(listDataHeader.get(4), display);
        listDataChild.put(listDataHeader.get(5), bios);
        listDataChild.put(listDataHeader.get(6), amd);
        listDataChild.put(listDataHeader.get(7), krisma);
    }
}
