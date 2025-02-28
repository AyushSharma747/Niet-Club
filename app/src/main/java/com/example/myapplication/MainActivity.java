package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get TextView references
        TextView JOINC = findViewById(R.id.JOINC);
        TextView CREATEC = findViewById(R.id.CREATEC);

        // Click Listener for JOINC (Create a Club)
        JOINC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JoinTheclub.class);
                startActivity(intent);
            }
        });

        // Click Listener for CREATEC (Join the Club)
        CREATEC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CreateTheclub.class);
                startActivity(intent);
            }
        });
    }
}
