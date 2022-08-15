package folders.invoicePackage;

public class InvoiceTest {

    public static void main(String[] args) {

        Invoice a = new Invoice("L2", "sdks", 2, 5.00);
        Invoice b = a;

        b.setPricePerItem(43.00);

        System.out.println(a.getPricePerItem());





    }
}
