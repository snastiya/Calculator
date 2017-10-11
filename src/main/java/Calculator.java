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
        float sum;
        sum = first + second;
        System.out.printf("%.4f", sum);
    }

}
