package homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("введіть число");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 7 == 0) {
            System.out.println("подвоєне значення числа=" + (num *= num));
        } else {
            System.out.println("число не ділиться на 7 без залишку");
        }
    }
}
