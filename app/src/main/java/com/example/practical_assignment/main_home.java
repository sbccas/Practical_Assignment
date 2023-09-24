package com.example.practical_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class main_home extends AppCompatActivity {
Button btndemo1, btndemo2,btndemo3, btndemo4,btndemo5,btndemo6,btndemo7,btndemo8,btndemo9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);
        btndemo1 = findViewById(R.id.btndemo1_welcome);
        btndemo2 = findViewById(R.id.btndemo2_orientation);
        btndemo3 = findViewById(R.id.btndemo3_toast);
        btndemo4 = findViewById(R.id.btndemo4_intent);
        btndemo5 = findViewById(R.id.btndemo5_register);
        btndemo6 = findViewById(R.id.btndemo6_login);
        btndemo7 = findViewById(R.id.btndemo7_todo);
        btndemo8 = findViewById(R.id.btndemo8_color);
        btndemo9 = findViewById(R.id.btndemo9_calcu);

        btndemo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),pra_ass_pro1.class);
                Toast.makeText(main_home.this, "Opening Demo 1 Happy Learning....!", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        btndemo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),pra_ass_pro2.class);
                Toast.makeText(main_home.this, "Opening Demo 2 Happy Learning....!", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        btndemo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),pra_ass_pro3.class);
                Toast.makeText(main_home.this, "Opening Demo 3 Happy Learning....!", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        btndemo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),pra_ass_pro4.class);
                Toast.makeText(main_home.this, "Opening Demo 4 Happy Learning....!", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        btndemo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),pra_ass_pro5_register.class);
                Toast.makeText(main_home.this, "Opening Demo 5 Happy Learning....!", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        btndemo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),pra_ass_pro6_login.class);
                Toast.makeText(main_home.this, "Opening Demo 6 Happy Learning....!", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        btndemo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),pra_ass_pro7_todo.class);
                Toast.makeText(main_home.this, "Opening Demo 7 Happy Learning....!", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        btndemo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),pra_ass_pro8_colorchanger.class);
                Toast.makeText(main_home.this, "Opening Demo 8 Happy Learning....!", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        btndemo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),pra_ass_pro9_calculator.class);
                Toast.makeText(main_home.this, "Opening Demo 9 Happy Learning....!", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });






    }
}