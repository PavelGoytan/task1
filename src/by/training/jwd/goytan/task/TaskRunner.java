package by.training.jwd.goytan.task;


public class TaskRunner {
    public static void main(String[] args) {
        Controller controller = new Controller();
        ProgramSelection programSelection = new ProgramSelection(controller);
        programSelection.programSelection();
    }
}


