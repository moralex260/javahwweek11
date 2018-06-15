package homework;
import java.util. Scanner;
public class Task6 {
    public static void main(String[] args) {
        System.out.println(" введіть 2 числа");
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        if((num1+num2)>=11&&(num1+num2)<=19){
            System.out.println(" додаток цих чисел="+(num1+num2));}
            else{
            System.out.println(" додаток цих чисел не входить в діапазон 11-19");
        }
        }

    }

