package folders.invoicePackage;
public class Invoice {

    private String partNumber;
    private String partDescription;
    private int purchasedItemsCount;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int purchasedItemsCount, double pricePerItem) {

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        if (purchasedItemsCount >= 0) this.purchasedItemsCount = purchasedItemsCount;
        if (pricePerItem > 0.00) this.pricePerItem = pricePerItem;

    }

    public void setPartNumber(String partNumber) { this.partNumber = partNumber; }
    public void setPartDescription(String partDescription) { this.partDescription = partDescription; }
    public void setPurchasedItemsCount(int purchasedItems) { this.purchasedItemsCount = purchasedItems; }
    public void setPricePerItem(double pricePerItem) { this.pricePerItem = pricePerItem; }

    public String getPartNumber() { return this.partNumber; }
    public String getPartDescription() { return this.partDescription; }
    public int getPurchasedItemsCount() { return this.purchasedItemsCount; }
    public double getPricePerItem() { return pricePerItem; }

    public void getInvoiceAmount() {
        System.out.println("Invoice amount is " + purchasedItemsCount * pricePerItem + " dollars");
    }
}
