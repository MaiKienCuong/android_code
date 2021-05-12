package com.maikiencuong.sprinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<AoThun> aoThuns;
    private FragmentContent fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        aoThuns = new ArrayList<AoThun>();
        aoThuns.add(new AoThun("Áo thun cổ tròn", 100, R.drawable.image_tshirt));
        aoThuns.add(new AoThun("Áo thun cổ tim", 150, R.drawable.image_tshirt));
        aoThuns.add(new AoThun("Áo thun cotton", 200, R.drawable.image_tshirt));
        aoThuns.add(new AoThun("Áo thun Bouton", 300, R.drawable.image_tshirt));
        aoThuns.add(new AoThun("Áo thun Nomous esti", 400, R.drawable.image_tshirt));

        fragment = FragmentContent.newInstance(aoThuns);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment, fragment).commit();

    }
}