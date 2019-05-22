import java.util.Scanner;

public class OpAssign{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter operator: ");
        String Operator = input.nextLine();

        System.out.println("Enter first integer: ");
        int firstInt = input.nextInt();

        System.out.println("Enter second integer: ");
        int secondInt = input.nextInt();
        int power=1;

        int addition = firstInt + secondInt;
        int subtraction = firstInt - secondInt;
        int multiplication = firstInt * secondInt;
        int division = firstInt / secondInt;
        int modulus = firstInt % secondInt;
        

        switch (Operator) {
            case "+":
            System.out.print(addition);
            break;

            case "-":
            System.out.print(subtraction);
            break;

            case "*":
            System.out.print(multiplication);
            break;

            case "/":
            System.out.print(division);
            break;

            case "%":
            System.out.print(modulus);
            break;

            case "^":
            
        for (int k = 1; k < secondInt; k++){
             power =  power * firstInt;
            break;
        }
            System.out.print(power);
        }
            
    }
}