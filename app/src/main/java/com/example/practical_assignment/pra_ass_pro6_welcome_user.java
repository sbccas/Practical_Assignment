package com.example.practical_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class pra_ass_pro6_welcome_user extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pra_ass_pro6_welcome_user);
        TextView welcomeTextView = findViewById(R.id.welcomeTextView);
        // Retrieve the username from the Intent
        String username = getIntent().getStringExtra("username");
        // Display the welcome message with the username
        welcomeTextView.setText("Welcome " + username);
    }
}