package com.example.maxluzon.secondexercise.utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.maxluzon.secondexercise.R;
import com.example.maxluzon.secondexercise.model.User;
import java.util.List;

public class UsersAdapters extends ArrayAdapter<User> {

    public UsersAdapters(Context context, List<User> users) {
        super(context, 0,users);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        User user = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.user_item, parent, false);
        }

        //nuestro user_item.xml
        TextView name = convertView.findViewById(R.id.userName);
        TextView address = convertView.findViewById(R.id.userAddress);

        name.setText(user.name);
        address.setText(user.address);

        return convertView;
    }
}
