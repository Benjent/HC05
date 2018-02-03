package fr.enssat.morvan.hc_05;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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

        // Command manager
        /*CommandManager commandManager = new CommandManager();
        final String[] commands = {"temperature", "luminositee", "vent"};
        for(String command : commands) {
            commandManager.addCommand(command);
        }
        commandManager.addCommand()*/

        // Commands
        Command CmdTemperature  = new Command("temperature", "Température");
        Command CmdLuminosity   = new Command("luminositee", "Luminositée");
        Command CmdWindSpeed    = new Command("vent", "Vent");
        Command[] commandList = {CmdTemperature, CmdLuminosity, CmdWindSpeed};

        for(Command command : commandList) {
            Button button = new Button(this);
            button.setTag(command.getCommand());
            button.setText(command.getLabel());
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final String tag = (String) v.getTag();
                    sendCommand(tag);
                }
            });
            buttonView.addView(button);
        }

    }

    void sendCommand(String command) {
        Log.v("Command","Sending command " + command + "...");
        /*Button button = new Button(this);
        button.setTag("HHH");
        button.setText("HHH");
        buttonView.addView(button);*/
        // TODO use bluetooth to send to terminal
    }
}
