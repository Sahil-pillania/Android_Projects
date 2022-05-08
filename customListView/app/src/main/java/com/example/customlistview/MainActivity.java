package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] arr  = {"Item 1","Item 2", "Item 3", "Item 4", "Item 5", "Item 6","Item 7","Item 8", "Item 9", "Item 10", "Item 11", "Item 12","Item 13","Item 14", "Item 15", "Item 16", "Item 17", "Item 18"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        SahilAdapter ad = new SahilAdapter(this, R.layout.my_layout, arr);
        listView.setAdapter(ad);


    }
}