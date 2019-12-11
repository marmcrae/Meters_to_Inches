package com.example.meterstoinches;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText enterMeters = (EditText) findViewById(R.id.enterMeters);
        final TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

        Button convertButton = (Button) findViewById(R.id.convertButton);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double multiplier = 39.37;
                double result = 0.0;





                if (enterMeters.getText().equals ("")) {

                    resultTextView.setText((R.string.error_message));
                    resultTextView.setTextColor(Color.RED);
                }else {
                    double meterValue = Double.parseDouble(enterMeters.getText().toString());

                    result = meterValue * multiplier;

                    resultTextView.setText(Double.toString(result));
                }

            }
        });
    }
}
