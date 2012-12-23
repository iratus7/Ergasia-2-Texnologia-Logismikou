
import java.util.*;

/**

 * Αναπαριστά τα διαθέσιμα προϊόντα ενός καταστήματος
 * παρέχοντας μεθόδους για την αναζήτηση και εκτύπωση τους
 *
 */
public class ProductCatalog { 

    /**
     * Η εσωτερική δομή για την αποθήκευση των διαθέσιμων προϊόντων
     */
    private ArrayList<ProductSpecification> prodCat;

    public ProductCatalog() {
        prodCat = new ArrayList<ProductSpecification>();
    }

     /**
     * Μέθοδος για να προσθέσουμε ένα προϊόν
     */
    public void addProduct(ProductSpecification prodSpec) {
        prodCat.add(prodSpec);
    }

    /**
     * Μέθοδος για την εκτύπωση όλων των προϊόντων
     */
    public void displayProducts() {
        Iterator itr = prodCat.iterator();
        while (itr.hasNext()) {
            ProductSpecification ps = (ProductSpecification) itr.next();
            System.out.println(ps);
        }
    }

    /**
     * Μέθοδος που επιστρέφει το προϊόν που αντιστοιχεί στον κωδικό itemId
     * Αν δεν βρεθεί προϊόν επιστρέφεται null.
     */
    public ProductSpecification findProduct(String itemId) {
        Iterator itr = prodCat.iterator();
        while (itr.hasNext()) {
            ProductSpecification ps = (ProductSpecification) itr.next();
            if (ps.getltemlD().equals(itemId)) {
                return ps;
            }
        }
        return null;
    }

     /**
     * Μέθοδος που επιστρέφει τα διαθέσιμα προϊόντα
     */
    public ArrayList<ProductSpecification> getProducts() {
        return prodCat;
    }
}
