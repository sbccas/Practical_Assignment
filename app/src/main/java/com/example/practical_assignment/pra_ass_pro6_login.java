package com.example.practical_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class pra_ass_pro6_login extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pra_ass_pro6_login);
        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                // Perform validation
                if (username.isEmpty() ) {
                    // Input is empty, show an error message
                    usernameEditText.setError("Username cannot be empty");
                }
                else if (password.isEmpty())
                {
                    passwordEditText.setError("Password cannot be empty");
                }
                else{
                    // Remove the error message if it was previously displayed
                    usernameEditText.setError(null);
                    passwordEditText.setError(null);
                    // Check for hardcoded username and password (demo purpose)
                    if (username.equals("amrolibca") && password.equals("123")) {
                        // Login successful, show a toast message and Move to next Activity
                        Toast.makeText(pra_ass_pro6_login.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(pra_ass_pro6_login.this, pra_ass_pro6_welcome_user.class);
                        intent.putExtra("username", username);
                        startActivity(intent);

                    } else {
                        // Login failed, show an error toast message
                        Toast.makeText(pra_ass_pro6_login.this, "Incorrect Username or Password...!", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
    }
}