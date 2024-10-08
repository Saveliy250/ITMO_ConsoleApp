package server.commands;

public interface Command {
    String execute();
    String getName();
    String description();
}
