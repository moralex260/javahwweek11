package homework;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введіть число");
        int num = scanner.nextInt();
        int i = 0;
        int num1 = num;
        while (num != 0) {
            i = num % 10;
            num /= 10;
        }
        if (i == 1 || i == 0) {
            String b = String.valueOf(num1);
            System.out.println("число бінарне,перевод в десятичне" + Integer.parseInt(b, 2));
        } else {
            System.out.println("число десятичнне,перевод в бинарне" + Integer.toBinaryString(num1));
        }

    }
}
