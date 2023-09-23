package com.example.practical_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class pra_ass_pro3 extends AppCompatActivity {
    private EditText usernameEditText;
    private Button showMessageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pra_ass_pro3);

        usernameEditText = findViewById(R.id.usernameEditText);
        showMessageButton = findViewById(R.id.showMessageButton);

        showMessageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameEditText.getText().toString();
                if (!username.isEmpty()) {
                    String message = "Good Morning, " + username + "!";
                    Toast.makeText(pra_ass_pro3.this, message, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(pra_ass_pro3.this, "Please enter your username.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}