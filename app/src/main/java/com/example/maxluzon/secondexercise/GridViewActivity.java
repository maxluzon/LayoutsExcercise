package com.example.maxluzon.secondexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class GridViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        GridView myGridView = (GridView) findViewById(R.id.gridViewComponent);

        List<String> list = new ArrayList<>();
        for(int i = 0; i< 100; i++){
            list.add(Integer.toString(i+1));
        }
        myGridView.setAdapter(
                new ArrayAdapter<>(this,
                                    R.layout.text_view_item,
                                    list));
    }
}
