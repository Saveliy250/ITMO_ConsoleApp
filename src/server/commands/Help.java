package server.commands;

public class Help implements Command{
    @Override
    public String execute(){
        return "help : вывести справку по доступным командам\n" +
        "info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)\n" +
        "show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении\n" +
        "insert null {element} : добавить новый элемент с заданным ключом\n" +
        "update id {element} : обновить значение элемента коллекции, id которого равен заданному\n" +
        "remove_key null : удалить элемент из коллекции по его ключу\n" +
        "clear : очистить коллекцию\n" +
        "save : сохранить коллекцию в файл\n" +
        "execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.\n" +
        "exit : завершить программу (без сохранения в файл)\n" +
        "remove_greater {element} : удалить из коллекции все элементы, превышающие заданный\n" +
        "remove_lower {element} : удалить из коллекции все элементы, меньшие, чем заданный\n" +
        "replace_if_lowe null {element} : заменить значение по ключу, если новое значение меньше старого\n" +
        "count_greater_than_type type : вывести количество элементов, значение поля type которых больше заданного\n" +
        "print_ascending : вывести элементы коллекции в порядке возрастания\n" +
        "print_field_ascending_type : вывести значения поля type всех элементов в порядке возрастания";

    }

    @Override
    public String getName() {
        return "help";
    }

    @Override
    public String description() {
        return "вывести справку по доступным командам";
    }

}
