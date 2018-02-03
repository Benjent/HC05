package fr.enssat.morvan.hc_05;

/**
 * Created by benjent on 02/02/18.
 */

public class Command {

    private String command;
    private String label;

    public Command(String command, String label) {
        this.command    = command;
        this.label      = label;
    }

    public String getCommand() {
        return command;
    }

    public String getLabel() {
        return label;
    }
}
