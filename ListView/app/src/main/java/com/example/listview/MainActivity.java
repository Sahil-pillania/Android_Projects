package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] arr = {"This is ","Item","Item 2", "Item 3", "Item 4","This is ","Item","Item 2", "Item 3", "Item 4","This is ","Item","Item 2", "Item 3", "Item 4","This is ","Item","Item 2", "Item 3", "Item 4"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        ArrayAdapter<String> ad = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr);
        listView.setAdapter(ad);

    }
}