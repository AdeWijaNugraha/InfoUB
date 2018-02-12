package com.awn.app.raion;

/**
 * Created by adewijanugraha on 29/03/17.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class ExpandableListAdapterSchedule extends BaseExpandableListAdapter {

    private Context _context;
    private List<MenuGroupSchedule> _listDataHeader; // header titles
    // child data in format of header title, child title
    private HashMap<MenuGroupSchedule, List<MenuSchedule>> _listDataChild;

    public ExpandableListAdapterSchedule(Context context, List<MenuGroupSchedule> listDataHeader,
                                         HashMap<MenuGroupSchedule, List<MenuSchedule>> listChildData) {
        this._context = context;
        this._listDataHeader = listDataHeader;
        this._listDataChild = listChildData;
    }

    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .get(childPosititon);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

        MenuSchedule menu = (MenuSchedule) getChild(groupPosition, childPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_itemschedule, null);
        }

        TextView matkul = (TextView) convertView
                .findViewById(R.id.sch_matkul);
        TextView kode = (TextView) convertView
                .findViewById(R.id.sch_kode);
        TextView kelas = (TextView) convertView
                .findViewById(R.id.sch_kelas);
        TextView jam = (TextView) convertView
                .findViewById(R.id.sch_jam);
        ImageView icon = (ImageView) convertView.findViewById(R.id.sch_button);

        matkul.setTypeface(null, Typeface.BOLD);
        icon.setImageResource(menu.getImageResourceId());
        matkul.setText(menu.getMatkul());
        kode.setText(menu.getKode());
        jam.setText(menu.getJam());
        kelas.setText(menu.getKelas());
        return convertView;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this._listDataHeader.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return this._listDataHeader.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {

        MenuGroupSchedule menu = (MenuGroupSchedule) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_groupschedule, null);
        }

        TextView lblListHeader = (TextView) convertView
                .findViewById(R.id.menu_hari);
        ImageView icon = (ImageView) convertView.findViewById(R.id.icon_hari);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        lblListHeader.setText(menu.getMenu());
        icon.setImageResource(menu.getImageResourceId());

        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
