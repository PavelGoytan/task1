package by.training.jwd.goytan.task;

import java.util.Scanner;

public class InputVar {
    public static double[] getDoubles(Output view, Scanner scanner) {
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

    public static int[] getIntegers(Output view, Scanner scanner) {
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
