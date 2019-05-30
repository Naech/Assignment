import java.util.Scanner;

public class InvoiceTest{
    
    private String number;
    private String description;
    private int quantity;
    private double price;

    public static void main(String args[]){
       Invoice input = new Invoice(" ", " ", 0, 0.0);

       Scanner input = new Scanner(System.in);

       System.out.print("Enter Invoice Number: ");
       number = input.nextLine();
       invoice.setPartNumber(number);

       System.out.print("Enter Invoice Description: ");
       description = input.nextLine();
       invoice.setPartDescription(description);
      
       System.out.print("Enter Quantity: ");
       quantity = input.nextInt();
       if(quantity >= 0){
           invoice.setItemQuantity(quantity);
       }

       System.out.print("Enter Price");
       price = input.nextDouble();
       if(price >= 0.0){
       invoice.setPrice(price);

       }

       System.out.printf("The Invoice: $%2.f%n);
          invoice.getInvoiceMethod();
    }
}