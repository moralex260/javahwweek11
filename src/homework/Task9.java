package homework;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введіть число");
        int num1 = scanner.nextInt();
        int a;
        int i = 0;
        int j = 0;
        while (num1 != 0) {
            i = num1 % 10;
            num1 /= 10;
            if (i == 5) {
                j = j + 1;
            }
        }

        System.out.println("в цьому числі цифра 5 зустрічається" + j + "разів");

    }
}

