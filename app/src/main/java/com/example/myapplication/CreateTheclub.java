package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CreateTheclub extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create Layout
        LinearLayout facultyLayout = new LinearLayout(this);
        facultyLayout.setOrientation(LinearLayout.VERTICAL);
        facultyLayout.setGravity(Gravity.CENTER);
        facultyLayout.setBackgroundColor(Color.WHITE);
        facultyLayout.setPadding(20, 50, 20, 50);

        // Create a TextView for JoinTheclub Screen
        TextView facultyText = new TextView(this);
        facultyText.setText(getString(R.string.CreateTheClub));
        facultyText.setTextSize(24);
        facultyText.setTextColor(Color.BLACK);
        facultyText.setGravity(Gravity.CENTER);
        facultyText.setPadding(20, 20, 20, 50);
        facultyText.setBackgroundColor(Color.YELLOW);

        // ✅ Add TextView to Layout
        facultyLayout.addView(facultyText);
        facultyText.setOnClickListener(v -> {
            Intent intent = new Intent(CreateTheclub.this, MainActivity.class);
            startActivity(intent);
        });

        // ✅ Set the Layout as the Content View
        setContentView(facultyLayout);
    }
}
