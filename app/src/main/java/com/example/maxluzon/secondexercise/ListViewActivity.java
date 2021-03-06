package com.example.maxluzon.secondexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView myListView = (ListView) findViewById(R.id.listViewComponent);

        List<String> list = new ArrayList<>();
        for(int i =0;i<100; i++){
            list.add("My String No. "+ i);
        }

        myListView.setAdapter(new ArrayAdapter<>(
                this,
                R.layout.text_view_item,
                list));
    }
}
