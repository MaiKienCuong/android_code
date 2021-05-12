package com.maikiencuong.sprinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<AoThun> aoThuns;

    public CustomAdapter(Context context, ArrayList<AoThun> aoThuns) {
        this.context = context;
        this.aoThuns = aoThuns;
    }

    @Override
    public int getCount() {
        return aoThuns.size();
    }

    @Override
    public Object getItem(int position) {
        return aoThuns.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.custom_list_view, parent, false);

        TextView textViewTen = convertView.findViewById(R.id.textviewTen);
        TextView textViewGia = convertView.findViewById(R.id.textViewGia);
        ImageView imageView = convertView.findViewById(R.id.imageView);

        textViewTen.setText(aoThuns.get(position).getTen());
        textViewGia.setText(aoThuns.get(position).getGia() + "$");
        imageView.setImageResource(aoThuns.get(position).getImage());

        return convertView;
    }
}
