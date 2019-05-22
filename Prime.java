import java.util.Scanner;

public class Prime{

    public static void main(String[] args){
       
       Scanner input = new Scanner(System.in);

       int m;
       int x;
       int flag;

       System.out.println("Enter integer: ");
       int num = input.nextInt();

       m = num/2;

       if (num == 0 || num == 1){
           System.out.println(num + " is not a prime number");
       }else{

       for(x = 1; x <= m; x++){

           if(num % x == 0){
               System.out.println(x + " is not a prime number");
               flag = 0;
               break;
           }
       }
       if (flag == 1){
           System.out.println(x + " is a prime number");
       }
       }
    }
}