package duke;

public class Duke {

    public static void main(String[] args) {
        // load in the TaskList
        TaskList taskList = new TaskList(new Storage());
        Parser parser = new Parser(taskList);
        Ui.initialize(parser);
        Storage.save(taskList);

    }


}

