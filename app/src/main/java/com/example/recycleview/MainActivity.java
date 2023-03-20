package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.net.wifi.WifiManager;
import android.os.Bundle;

import com.example.recycleview.recycler.EmailAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> arrayList;
    EmailAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initList();
    }

    private void initList() {
        arrayList = new ArrayList<>();
        arrayList.add("Cheff@mail.com");
        arrayList.add("College@mail.com");
        arrayList.add("Partner@mail.com");
        arrayList.add("Intern@mail.com");
        arrayList.add("Friend@mail.com");
        arrayList.add("Proffessor@mail.com");
        adapter = new EmailAdapter(arrayList);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
    }
}