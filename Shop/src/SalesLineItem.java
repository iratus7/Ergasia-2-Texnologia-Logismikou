/**
 * Αναπαριστά μία εγγραφή πώλησης ενός προϊόντος σε μία συναλλαγή πώλησης
 *
 */
public class SalesLineItem extends LineItem{
    public SalesLineItem(ProductSpecification product, int quantity) {
        super(product, quantity);
    }
}
