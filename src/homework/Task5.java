package homework;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        System.out.println("введіть 2 числа");
        Scanner scanner=new Scanner(System.in);
          int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        if(num1>num2) {
            System.out.println("різниця чисел=" + (num1 - num2));
        }
            else{System.out.println("добуток чисел ="+(num1*num2));
        }
    }

}
