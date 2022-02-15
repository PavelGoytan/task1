package by.training.jwd.goytan.task;

import java.util.Scanner;

public class InputVar {
    public int inputFourDigit(Output view, Scanner scanner, String string) {
        while (VarValidator.isCorrectInteger(string)
                || VarValidator.isFourDigit(string)) {
            view.inputError();
            view.enterNumber();
            string = scanner.nextLine();
        }
        return Integer.parseInt(string);
    }

    public double[] inputDoubles(Output view, Scanner scanner) {
        String[] array = {"a", "b", "c"};
        double[] arrayDouble = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            view.enterNumber(array[i]);
            String string = scanner.nextLine();
            while (!VarValidator.isCorrectDouble(string)) {
                view.inputError();
                view.enterNumber(array[i]);
                string = scanner.nextLine();
            }
            arrayDouble[i] = Double.parseDouble(string);
        }
        return arrayDouble;
    }

    public int[] inputIntegers(Output view, Scanner scanner) {
        String[] array = {"первое", "второе", "третье"};
        int[] arrayInteger = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            view.enterInteger(array[i]);
            String string = scanner.nextLine();
            while (VarValidator.isCorrectInteger(string)) {
                view.inputError();
                view.enterInteger(array[i]);
                string = scanner.nextLine();
            }
            arrayInteger[i] = Integer.parseInt(string);
        }
        return arrayInteger;
    }
}
