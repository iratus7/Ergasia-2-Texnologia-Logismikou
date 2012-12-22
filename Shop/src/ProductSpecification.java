
/**
 * Αναπαριστά ένα διαθέσιμο προϊόν
 *
 */
public class ProductSpecification {
    /**
     * Κωδικός προϊόντος
     */
    private String itemID;
    /**
     * Περιγραφή του προϊόντος
     */
    private String description;
    /**
     * Τιμή μονάδος
     */
    private double price;
    /**
     * Διαθέσιμη ποσότητα
     */
    private double quantity;

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public ProductSpecification(String itemID, String description, double price, double quantity) {
        this.itemID = itemID;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getltemlD() {
        return itemID;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return toShortString() +
                " - Διαθέσιμα " + quantity;
    }

    public String toShortString() {
        return  "" + itemID +
                ". " + description+
                " (" + price + ") Euro";
    }
}

