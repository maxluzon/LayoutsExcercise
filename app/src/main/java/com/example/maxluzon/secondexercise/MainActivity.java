package com.example.maxluzon.secondexercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.maxluzon.secondexercise.utils.ListViewUsersActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.home_linear_layout_vertical).setOnClickListener(this);
        findViewById(R.id.home_linear_layout_horizontal).setOnClickListener(this);
        findViewById(R.id.home_relative_layout).setOnClickListener(this);
        findViewById(R.id.home_table_layout).setOnClickListener(this);
        findViewById(R.id.home_frame_layout).setOnClickListener(this);
        findViewById(R.id.home_list_view).setOnClickListener(this);
        findViewById(R.id.home_grid_view).setOnClickListener(this);
        findViewById(R.id.home_list_view_users).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.home_linear_layout_vertical:
                intent = new Intent(MainActivity.this, LinearLayoutVerticalActivity.class);
                break;
            case R.id.home_linear_layout_horizontal:
                intent = new Intent(MainActivity.this, LinearLayoutHorizontalActivity.class);
                break;
            case R.id.home_relative_layout:
                intent = new Intent(MainActivity.this, RelativeLayoutActivity.class);
                break;
            case R.id.home_table_layout:
                intent = new Intent(MainActivity.this, TableLayoutActivity.class);
                break;
            case R.id.home_frame_layout:
                intent = new Intent(MainActivity.this, FrameLayoutActivity.class);
                break;
            case R.id.home_list_view:
                intent = new Intent(MainActivity.this, ListViewActivity.class);
                break;
            case R.id.home_grid_view:
                intent = new Intent(MainActivity.this, GridViewActivity.class);
                break;

            case R.id.home_list_view_users:
                intent = new Intent(MainActivity.this, ListViewUsersActivity.class);
                break;
        }

        if (intent!= null){
            startActivity(intent);
        }

    }
}
