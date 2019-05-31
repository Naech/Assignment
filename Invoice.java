

public class Invoice{
    private String PartNumber;
    private String PartDescription;
    private int ItemQuantity;
    private double Price;

    public Invoice(String PartNumber, String PartDescription, int ItemQuantity, double Price){
         this.ItemQuantity = ItemQuantity;
         this.Price = Price;
         if(ItemQuantity < 0){
             this.ItemQuantity = 0;
         }
         if(ItemQuantity > 0){
             this.ItemQuantity = ItemQuantity;
         }
         if(Price < 0){
             this.Price = 0;
         }
         if(Price > 0){
             this.Price = Price;
         }
    }

    public void setPartNumber(String PartNumber){
        this.PartNumber = PartNumber;
    }
    public String getPartNumber(){
        return PartNumber;
    }

    public void setPartDescription(String PartDescription){
        this.PartDescription = PartDescription;
    }
    public String getPartDescription(){
        return PartDescription;
    }

    public void setItemQuantity(int ItemQuantity){
        this.ItemQuantity = ItemQuantity;
    }
    public int getItemQuantity(){
        return ItemQuantity;
    }

    public void setPrice(double Price){
        this.Price = Price;
    }
    public double getPrice(){
        return Price;
    }

    public double getInvoiceAmount(){
        double calculateInvoiceAmount;
        calculateInvoiceAmount = ItemQuantity * Price;
        return calculateInvoiceAmount;
    }

       
}