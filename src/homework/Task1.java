package homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("введіть годину");
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        if (hour == 0 || hour <= 23) {
            if (hour >= 9 || hour <= 18) {
                System.out.println("я на роботі");
            } else {
                System.out.println("я вдома");
            }
        } else {
            System.out.println("ви ввели некоректну годину,в добі 24 години )),введіть годину щераз,");
            hour = scanner.nextInt();
            if (hour == 0 || hour <= 23) {
                if (hour >= 9 || hour <= 18) {
                    System.out.println("я на роботі");
                } else {
                    System.out.println("я вдома");
                }
            }
        }
    }
}


