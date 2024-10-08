package server.commands;

public class Show implements Command{

    @Override
    public String execute() {
        return null;
    }

    @Override
    public String getName() {
        return "show";
    }

    @Override
    public String description() {
        return "вывести в стандартный поток вывода все элементы коллекции в строковом представлении";
    }
}
