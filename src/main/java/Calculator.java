import java.util.Scanner;
/**
 * Created by ASudarenko on 08.10.2017.
 * @author ASudarenko
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

/* Ввод переменных 1 */
        System.out.println("Введите первое число: ");
        float first = scanner.nextFloat();
        System.out.println("Введите второе число: ");
        float second = scanner.nextFloat();
        System.out.println("Введите действие: ");
        String operator = scanner.next();

       // float result;

        if (operator.equals("*")){
            System.out.printf("%.4f",(first * second));
        }
        if (operator.equals("/")){
            System.out.printf("%.4f",(first / second));
        }
        if (operator.equals("+")){
            System.out.printf("%.4f",(first + second));
        }
        if (operator.equals("-")){
            System.out.printf("%.4f",(first - second));
        }

        //System.out.printf("%.4f", result);
    }

}
