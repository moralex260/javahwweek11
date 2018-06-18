package homework;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введіть число");
        int num = scanner.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 3; i <= num; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("число фіббоначі" + num + "номера=" + b);
    }
}
