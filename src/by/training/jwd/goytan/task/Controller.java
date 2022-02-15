package by.training.jwd.goytan.task;

import java.util.Scanner;

public class Controller {
    public static final String END = "END";
    private final MathCalc calc;
    private final Scanner scanner;
    private final Output view;
    private final InputVar input;

    public Controller() {
        this.calc = new MathCalc();
        this.scanner = new Scanner(System.in);
        this.view = new Output();
        this.input = new InputVar();
    }

    /**
     * #1
     * Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
     * Сумма двух первых цифр заданного четырехзначного числа
     * равна сумме двух его последних цифр.
     */
    public void sumOfDigits() {
        view.titleFourDigit();
        for (; ; ) {
            view.enterNumber();
            String stringInt = scanner.nextLine();
            if (!stringInt.equals(END)) {
                int number = input.inputFourDigit(view, scanner, stringInt);
                view.sumOfDigits(calc.sumOfDigits(number));
            } else {
                break;
            }
        }
    }

    /**
     * #2
     * Вычислить значение выражения по формуле (все переменные принимают
     * действительные значения):
     */

    public void resultOfExpression() {
        view.titleValueOfExpression();
        double result;
        String string = "";
        while (!string.equals(END)) {
            double[] arrayDouble = input.inputDoubles(view, scanner);
            if (VarValidator.isCorrectVariable(arrayDouble)) {
                result = calc.resultOfExpression(arrayDouble);
                view.resultOfExpression(result);
            } else {
                view.noSolution();
            }
            view.stopOrContinue();
            string = scanner.nextLine();
        }
    }

    /**
     * #6
     * Написать программу нахождения суммы большего и меньшего из трех чисел.
     */

    public void sumMinMax() {
        view.titleSum();
        String string = "";
        while (!string.equals(END)) {
            int[] integers = input.inputIntegers(view, scanner);
            view.sumMinMax(calc.sumMinMax(integers));
            view.stopOrContinue();
            string = scanner.nextLine();
        }
    }


    public Scanner getScanner() {
        return scanner;
    }

    public Output getView() {
        return view;
    }
}
