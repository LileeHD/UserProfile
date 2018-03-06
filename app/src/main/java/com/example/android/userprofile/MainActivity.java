package com.example.android.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView profilePic = findViewById(R.id.profile_picture);
        profilePic.setImageResource(R.drawable.avatar);

        TextView name = findViewById(R.id.name);
        name.setText("Lilee");


        TextView birthday = findViewById(R.id.birthday);
        birthday.setText("March 20th");

        TextView country = findViewById(R.id.country);
        country.setText("France");
    }
}
