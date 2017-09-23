package com.example.maxluzon.secondexercise.utils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.maxluzon.secondexercise.R;
import com.example.maxluzon.secondexercise.model.User;

import java.util.ArrayList;
import java.util.List;

public class ListViewUsersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_users);

        ListView mysListView  = (ListView) findViewById(R.id.listViewUsers);

        List<User> users = new ArrayList<>();
        for(int i =0; i< 100; i++){
            users.add(new User("Nombre "+i, "Direccion "+i));
        }

        UsersAdapters adapter = new UsersAdapters(this, users);
        mysListView.setAdapter(adapter);
    }
}
