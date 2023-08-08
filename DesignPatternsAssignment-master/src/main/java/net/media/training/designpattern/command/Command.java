package net.media.training.designpattern.command;

public class Command {
    private Operations command;
    public void setCommand(Operations command) {
        this.command = command;
    }
    public void executed(){
        command.execute();
    }
}
