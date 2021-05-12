package com.maikiencuong.sprinner;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class FragmentContent extends Fragment {

    private ArrayList<AoThun> aoThuns;
    private ListView listView;
    private CustomAdapter adapter;

    public FragmentContent() {
    }

    public static FragmentContent newInstance(ArrayList<AoThun> aoThuns) {
        FragmentContent fragment = new FragmentContent();
        Bundle args = new Bundle();
        args.putSerializable("aothuns", aoThuns);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            aoThuns = (ArrayList<AoThun>) getArguments().getSerializable("aothuns");
        }
        if (aoThuns == null)
            aoThuns = new ArrayList<>();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_content, container, false);
        listView = view.findViewById(R.id.lvAothun);
        adapter = new CustomAdapter(view.getContext(), aoThuns);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(view.getContext(), parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(view.getContext(), MainActivity2.class);
                Bundle b=new Bundle();
                b.putSerializable("item", (Serializable) parent.getItemAtPosition(position));
                intent.putExtras(b);
                startActivity(intent);
            }
        });

        return view;
    }
}