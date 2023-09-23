package com.example.practical_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class pra_ass_pro7_todo extends AppCompatActivity {
    private EditText todoEditText;
    private Button addButton;
    private LinearLayout todoListLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pra_ass_pro7_todo);
        todoEditText = findViewById(R.id.todoEditText);
        addButton = findViewById(R.id.addButton);
        todoListLayout = findViewById(R.id.todoListLayout);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String taskTitle = todoEditText.getText().toString().trim();
                if (!taskTitle.isEmpty()) {
                    // Create a new TextView for the task
                    TextView taskTextView = new TextView(pra_ass_pro7_todo.this);
                    taskTextView.setText(taskTitle);
                    taskTextView.setTextSize(18); // Set text size in SP
                    taskTextView.setTypeface(null, Typeface.BOLD); // Set text style (bold)
                    taskTextView.setPadding(10,10,10,10);
                    // Add the TextView to the LinearLayout
                    todoListLayout.addView(taskTextView);
                    // Clear the EditText
                    todoEditText.setText("");
                }
                else{
                    //Show Toast to type in a todo Item
                    Toast.makeText(pra_ass_pro7_todo.this, "Please type in a todo Item...!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}