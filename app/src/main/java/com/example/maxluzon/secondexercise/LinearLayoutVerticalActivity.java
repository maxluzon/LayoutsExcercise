package com.example.maxluzon.secondexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LinearLayoutVerticalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout_vertical);

        View fullNameView = findViewById(R.id.full_name);
        if(fullNameView instanceof TextView){
            ((TextView) fullNameView).setText(R.string.linear_vertical_full_name);
        }

        View organizationNameView = findViewById(R.id.organization_name);
        if(organizationNameView instanceof TextView){
            ((TextView) organizationNameView).setText(R.string.linear_vertical_organization_name);
        }

        View welcomeQuoteName = findViewById(R.id.welcome_quote);
        if(welcomeQuoteName instanceof TextView){
            ((TextView) welcomeQuoteName).setText(getString(R.string.linear_vertical__welcome_quote));
        }
    }
}
