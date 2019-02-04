package com.example.thermonitor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Listactivity extends AppCompatActivity {
    String listitems [] = new String[]{"Android", "iPhone", "Windows","Blackberry", "Linux"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listactivity);
        ListView listView = (ListView)findViewById(R.id.Listactivity);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_activated_1,listitems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Listactivity.this,EmptyActivity.class);
                startActivity(intent);

            }
        });

    }
}