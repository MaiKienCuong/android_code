package com.maikiencuong.sprinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    CustomAdapter customAdapter;
    ArrayList<AoThun> aoThuns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        listView=findViewById(R.id.lvAothun);

        aoThuns=new ArrayList<AoThun>();

        aoThuns.add(new AoThun("Áo thun cổ tròn", 100, R.drawable.image_tshirt));
        aoThuns.add(new AoThun("Áo thun cổ tim", 150, R.drawable.image_tshirt));
        aoThuns.add(new AoThun("Áo thun cotton", 200, R.drawable.image_tshirt));
        aoThuns.add(new AoThun("Áo thun Bouton", 300, R.drawable.image_tshirt));
        aoThuns.add(new AoThun("Áo thun Nomous esti", 400, R.drawable.image_tshirt));

        customAdapter=new CustomAdapter(this, R.layout.custom_list_view, aoThuns);

        listView.setAdapter(customAdapter);

    }
}