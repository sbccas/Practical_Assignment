package com.example.practical_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class pra_ass_pro5_register extends AppCompatActivity {
    private EditText nameEditText, emailEditText, mobileEditText, usernameEditText, passwordEditText;
    private RadioGroup genderRadioGroup;
    private Button registerButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pra_ass_pro5_register);

        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        mobileEditText = findViewById(R.id.mobileEditText);
        genderRadioGroup = findViewById(R.id.genderRadioGroup);
        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        registerButton = findViewById(R.id.registerButton);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get user inputs
                String name = nameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String mobile = mobileEditText.getText().toString();
                String gender = getSelectedGender();
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Perform validation
                if (name.isEmpty() ) {
                    // Input is empty, show an error message
                    nameEditText.setError("Name cannot be empty");
                }
                else if (email.isEmpty())
                {
                    emailEditText.setError("Email cannot be empty");
                }
                else if (mobile.isEmpty())
                {
                    mobileEditText.setError("Mobile cannot be empty");
                }
                else if (gender.isEmpty())
                {   // No RadioButton selected, show an error message
                    Toast.makeText(pra_ass_pro5_register.this, "Please select a gender..!", Toast.LENGTH_SHORT).show();
                }
                else if(username.isEmpty())
                {
                    usernameEditText.setError("Username cannot be empty");
                }
                else if (password.isEmpty())
                {
                    passwordEditText.setError("Password cannot be empty");
                }
                else
                {
                    // Remove the error message if it was previously displayed
                    nameEditText.setError(null);
                    emailEditText.setError(null);
                    mobileEditText.setError(null);
                    usernameEditText.setError(null);
                    passwordEditText.setError(null);

                    // Display a registration successful toast
                    Toast.makeText(pra_ass_pro5_register.this, "Registration Successful", Toast.LENGTH_SHORT).show();

                    // Create an Intent to navigate to the next screen (display collected information)
                    Intent intent = new Intent(pra_ass_pro5_register.this, pra_ass_pro5_display_info.class);
                    intent.putExtra("name", name);
                    intent.putExtra("email", email);
                    intent.putExtra("mobile", mobile);
                    intent.putExtra("gender", gender);
                    intent.putExtra("username", username);

                    startActivity(intent);
                }

            }
        });
    }
    private String getSelectedGender() {
        int selectedId = genderRadioGroup.getCheckedRadioButtonId();
        if (selectedId != -1) {
            // If RadioButton selected, send Gender Text else Empty Text
            RadioButton selectedRadioButton = findViewById(selectedId);
            return selectedRadioButton.getText().toString();
        }
        return "";
    }
}