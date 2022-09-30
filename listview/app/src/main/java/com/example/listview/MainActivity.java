package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView;
        ArrayList<Giay> arrayList;
        AdapterGiay adapter;

        listView = findViewById(R.id.listviewgiay);
        arrayList = new ArrayList<>();

        arrayList.add(new Giay("Yeezy 1", "ĐƠN GIÁ: 300.000 VNĐ", R.drawable.yeezy1));
        arrayList.add(new Giay("Yeezy 2", "ĐƠN GIÁ: 350.000 VNĐ", R.drawable.yeezy2));
        arrayList.add(new Giay("Yeezy 3", "ĐƠN GIÁ: 150.000 VNĐ", R.drawable.yeezy3));
        arrayList.add(new Giay("Yeezy 4", "ĐƠN GIÁ: 1000.000 VNĐ", R.drawable.yeezy4));

        adapter = new AdapterGiay(MainActivity.this,R.layout.layout_giay,arrayList);
        listView.setAdapter(adapter);
    }
}