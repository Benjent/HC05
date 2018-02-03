package fr.enssat.morvan.hc_05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by benjent on 03/02/18.
 */

public class MainActivity extends AppCompatActivity {

    LinearLayout buttonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Views
        buttonView = findViewById(R.id.ButtonView);

        Button button = new Button(this);
        button.setTag("TODO");
        button.setText("Go to meteo");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String tag = (String) v.getTag();
                // Create an Intent to MeteoActivity
                Intent myIntent = new Intent(MainActivity.this, MeteoActivity.class);

                // Put the VideoMedata object as an extra
                //myIntent.putExtra(VIDEO_METADATA_MESSAGE, videoMetadata);

                // Start the VideoViewActivity
                startActivity(myIntent);
            }
        });
        buttonView.addView(button);
    }
}
