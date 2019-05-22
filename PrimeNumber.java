import java.util.Scanner;

public class PrimeNumber{

    public static void main(String[] args){
 
     Scanner input = new Scanner(System.in);

    int number, count = 0;
    System.out.print("Enter first integer: ");
    int x = input.nextInt();
    int y = x/2;

        //System.out.print("Enter first integer: ");
         //int y = input.nextInt();
        
    //count = PrimeNumber1(number);
    if(x % y != 0){
       System.out.println(x + " is a prime number");
    }
     if(x == 0 && y != 0){
       System.out.println(x + " is a prime number");
     }
    else{
       System.out.println(y + " is not a prime number");
    }
    } 
}