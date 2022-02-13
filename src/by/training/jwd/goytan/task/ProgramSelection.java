package by.training.jwd.goytan.task;

import java.util.Scanner;

public class ProgramSelection {
    public static final String EXIT = "Q";
    private final Controller controller;
    private final Scanner scanner;
    private final Output view;

    public ProgramSelection(Controller controller) {
        this.controller = controller;
        this.scanner = controller.getScanner();
        this.view = controller.getView();
    }

    public void programSelection() {
        view.programSelection();
        String string = scanner.nextLine();
        while (!string.equals(EXIT)) {
            while (VarValidator.isCorrectInteger(string)
                    || Integer.parseInt(string) < 1
                    || Integer.parseInt(string) > 3) {
                view.inputError();
                string = scanner.nextLine();
            }
            int select = Integer.parseInt(string);
            if (select == 1) {
                controller.sumOfDigits();
            } else if (select == 2) {
                controller.resultOfExpression();
            } else {
                controller.sumMinMax();
            }
            view.programSelection();
            string = scanner.nextLine();
        }
    }
}
