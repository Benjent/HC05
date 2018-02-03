package fr.enssat.morvan.hc_05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Views
        LinearLayout buttonView = findViewById(R.id.ButtonView);

        // Temperature
        Button button = new Button(this);
        button.setTag("temperature");
        button.setText("Température");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String tag = (String) v.getTag();
                // TODO sendCommand(tag)
            }
        });
        buttonView.addView(button);

        // Luminosity
        button = new Button(this);
        button.setTag("lumiere");
        button.setText("Lumière");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String tag = (String) v.getTag();
                // TODO sendCommand(tag)
            }
        });



    }

    sendCommand()
}
