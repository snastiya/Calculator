import java.util.Scanner;

/**
 * Created by ASudarenko on 08.10.2017.
 *
 * @author ASudarenko
 */

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите исполняемую программу. " +
                "Нажмите 1 для запуска клькулятора. " +
                "Нажамите 2 для запуска поиска максимального числ в массиве");
        int ch = scanner.nextInt();

        if (ch == 1) {

/* Ввод переменных 1 */
                System.out.println("Введите первое число: ");
                float first = scanner.nextFloat();
                System.out.println("Введите второе число: ");
                float second = scanner.nextFloat();
                System.out.println("Введите действие: ");
                String operator = scanner.next();

                // float result;

                if (operator.equals("*")) {
                    System.out.printf("%.4f", (first * second));
                }
                if (operator.equals("/")) {
                    System.out.printf("%.4f", (first / second));
                }
                if (operator.equals("+")) {
                    System.out.printf("%.4f", (first + second));
                }
                if (operator.equals("-")) {
                    System.out.printf("%.4f", (first - second));
                }

                //System.out.printf("%.4f", result);
            }

         else if (ch == 2) {

                System.out.println("Введите размерность массива: ");
                int size = scanner.nextInt();
                String[] anArr = new String[size];
                int i = 0;

                Scanner in = new Scanner(System.in);

                for (String element : anArr) {

                    System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
                    anArr[i] = in.next();

                    i++;
                }

                int max = 0;
                String maxval = null;

                for (String element : anArr) {
                    if (element.length() > max) {
                        max = element.length();
                        maxval = element;
                    }
                }

                System.out.println("Самое длинное слово в массиве имеет номер: " + maxval);

            }
        }

    }



