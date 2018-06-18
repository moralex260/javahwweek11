package homework;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("введіть дробне число");
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        if (num > 0 && num < 1) {
            System.out.println(num == num);
        } else {
            System.out.println(num != num);
        }
    }
}
