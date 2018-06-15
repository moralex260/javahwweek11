package homework;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        System.out.println("введіть 1-ше число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("введіть 2-ге число");
        int b = scanner.nextInt();
        System.out.println("введіть 3-тє число");
        int c = scanner.nextInt();
        int max;
        int less;
        if (a >= b) {
            max = a;
        } else {
            max = b;
        }
        ;
        if (c >= max) {
            max = c;
            ; }
         if (a <= b) {
            less = a;
        } else {
            less = b;
        }
        ;
        if (c <= less) {
            less = c;
        }
        System.out.println("мінімальне число"+less);
            System.out.println("максимальне число" + max);

}
}
