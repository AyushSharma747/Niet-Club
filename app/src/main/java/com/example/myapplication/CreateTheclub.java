package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CreateTheclub extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_the_club); // Load XML layout

        // Get UI elements
        EditText nameField = findViewById(R.id.nameField);
        EditText branchField = findViewById(R.id.branchField);
        EditText erpField = findViewById(R.id.erpField);
        EditText yearField = findViewById(R.id.yearField);
        EditText emailField = findViewById(R.id.emailField);
        EditText phoneField = findViewById(R.id.phoneField);
        TextView joinButton = findViewById(R.id.joinButton);

        // Button click event
        joinButton.setOnClickListener(v -> {
            Intent intent = new Intent(CreateTheclub.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
