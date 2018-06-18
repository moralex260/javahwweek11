package homework;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введіть число");
        int num = scanner.nextInt();
        int a = 0;
        int i;
        int n;
        int b = 1;
        for (i = 3; i <= 48; i++) {
            int next = a + b;
            a = b;
            b = next;

            if (b == num) {
                System.out.println("номер числа фіббоначі" + num + "=" + i);
                break;
            }

        }
        if (b != num) {
            System.out.println("це не число фіббоначі" + "" + "-1");
        }
    }
}
