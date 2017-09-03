package com.sample.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = (ListView) findViewById(R.id.my_list);

        List<String> values = new ArrayList<>();
        values.add("Android");
        values.add("Windows Mobile");
        values.add("WebOS");
        values.add("Ubuntu");
        values.add("Windows7");


        final ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this, R.layout.simple_list_item, values);
        listView.setAdapter(adapter);
    }
}
