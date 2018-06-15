package homework;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("введіть 2 числа");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
boolean d=true;
boolean e=false;
       if (num1%num2==0){System.out.println(d+", "+"результат ділення цих чисел="+num1/num2);}
       else { float a= (float)num1;
       float b=(float)num2;
       float c=a/b;;
       System.out.println(e+" ,"+"результат ділення цих чисел="+c);}


    }
}
