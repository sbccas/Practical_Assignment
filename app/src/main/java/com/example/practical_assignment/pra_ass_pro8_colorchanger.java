package com.example.practical_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class pra_ass_pro8_colorchanger extends AppCompatActivity {
    private RadioGroup colorRadioGroup;
    private RelativeLayout mainLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pra_ass_pro8_colorchanger);

        colorRadioGroup = findViewById(R.id.colorRadioGroup);
        mainLayout = findViewById(R.id.mainRLayout);

        colorRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                // Check which radio button is selected
                RadioButton selectedRadioButton = findViewById(i);

                // Change the background color based on the selected radio button
                if (selectedRadioButton != null) {
                    String colorName = selectedRadioButton.getText().toString();
                    if (colorName.equals("Red")) {
                        mainLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
                    } else if (colorName.equals("Blue")) {
                        mainLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));
                    } else if (colorName.equals("Green")) {
                        mainLayout.setBackgroundColor(getResources().getColor(R.color.Green));
                    } else if (colorName.equals("Yellow")) {
                        mainLayout.setBackgroundColor(getResources().getColor(R.color.Yellow));
                    }
                }

            }
        });


    }
}