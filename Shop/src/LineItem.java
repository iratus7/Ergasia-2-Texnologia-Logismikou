
/* Αφηρημένη κλάση που αναπαριστά μια εγγραφή σε μία συναλλαγή*/

public abstract class LineItem {

    /**
     * Το προϊόν που συμμετείχε στην συναλλαγή
     */
    protected ProductSpecification product;

    /**
     * Η ποσότητα του προϊόντος
     */
    protected int quantity;

    public LineItem(ProductSpecification product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    /**
     *
     *  Επιστρέφει το κόστος της εγγραφής
     */
    public double getSubtotal(){
        return product.getPrice()*quantity;
    }

    /**
     * @return the value of product
     */
    public ProductSpecification getProduct() {
        return product;
    }

    /**
     * Set the value of product
     *
     * @param product new value of product
     */
    public void setProduct(ProductSpecification product) {
        this.product = product;
    }

    /**
     * Get the value of quantity
     *
     * @return the value of quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Set the value of quantity
     *
     * @param quantity new value of quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "\t"+quantity +"x "+ product.toShortString() + "\t" +
                getSubtotal() + " Euro\n";
    }

}
