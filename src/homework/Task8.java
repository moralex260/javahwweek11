package homework;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("введіть 2 числа");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
       int a=num1%10;
       int b=num2%10;
       if (a==b) {System.out.println(a+"="+b+","+(a==b));
       }
       else{if(a<b) {
           System.out.println(b +">" +a+","+(a==b));
       }
       else{System.out.println(b+"<"+a+","+(a==b));
       };
       }
       }
    }

