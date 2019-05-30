

public class Invoice{
    private String PartNumber;
    private String PartDescription;
    private int ItemQuantity;
    private double Price;

    public Invoice(String PartNumber, String PartDescription, int ItemQuantity, double Price){
         PartNumber = number;
         PartDescription = description;
         ItemQuantity = quantity;
         Price = price;
    }

    public void setPartNumber(String PartNumber){
        this.PartNumber = PartNumber;
    }
    public String getPartNumber(){
        return PartNumber;
    }

    public void setpartDescription(String PartDescription){
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