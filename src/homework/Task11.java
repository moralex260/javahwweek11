package homework;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введіть число");
        int result = 1;
        int i;
        int num = scanner.nextInt();
        for (i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("факториал введеного числа " + result);


    }
}
