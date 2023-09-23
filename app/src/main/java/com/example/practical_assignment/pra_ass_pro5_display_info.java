package com.example.practical_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class pra_ass_pro5_display_info extends AppCompatActivity {
    private TextView infoTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pra_ass_pro5_display_info);
        infoTextView = findViewById(R.id.infoTextView);

        // Retrieve the collected information from the Intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        String mobile = intent.getStringExtra("mobile");
        String gender = intent.getStringExtra("gender");
        String username = intent.getStringExtra("username");

        // Display the collected information
        String infoText = "Name: " + name + "\n" +
                "Email: " + email + "\n" +
                "Mobile: " + mobile + "\n" +
                "Gender: " + gender + "\n" +
                "Username: " + username;

        infoTextView.setText(infoText);
    }
}