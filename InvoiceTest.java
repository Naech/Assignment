import java.util.Scanner;

public class InvoiceTest{
    

    public static void main(String args[]){
       Invoice invoice = new Invoice(" ", " ", 0, 0.0);

       Scanner input = new Scanner(System.in);

       System.out.print("Enter Invoice Number: ");
       String PartNumber = input.nextLine();
       invoice.setPartNumber(PartNumber);

       System.out.print("Enter Invoice Description: ");
       String PartDescription = input.nextLine();
       invoice.setPartDescription(PartDescription);
      
       System.out.print("Enter Quantity: ");
       int ItemQuantity = input.nextInt();
       if(ItemQuantity >= 0){
       invoice.setItemQuantity(ItemQuantity);
       }

       System.out.print("Enter Price: ");
       double Price = input.nextDouble();
       if(Price >= 0.0){
       invoice.setPrice(Price);
       }

       System.out.println(invoice.getInvoiceAmount());
       

    }
}