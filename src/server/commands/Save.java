package server.commands;

public class Save implements Command{
    @Override
    public String execute() {
        return null;
    }

    @Override
    public String getName() {
        return "save";
    }

    @Override
    public String description() {
        return "сохранить коллекцию в файл";
    }
}
