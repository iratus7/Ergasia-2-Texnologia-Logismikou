
import java.util.GregorianCalendar;

/**
 * Κλαση ελέγχου που αναλαμβάνει την επικοινωνία του γραφικού ενδιάμεσου
 * χρήστη με τις κλάσεις οντοτήτων. Αναπατιστά ένα ταμείο του καταστήματος
 *
 */
public class Register {
    /**
     * Το κατάστημα που ανήκει το ταμείο
     */
    Store belongingStore;

    /**
     * Η τρέχουσα συναλλαγή
     */
    Transaction t;

    /**
     * Αν το ταμείο είναι καταλυμένο
     */
    protected boolean ocuppied=false;

    /**
     * Get the value of ocuppied
     *
     * @return the value of ocuppied
     */
    public boolean isOcuppied() {
        return ocuppied;
    }

    /**
     * Set the value of ocuppied
     *
     * @param ocuppied new value of ocuppied
     */
    public void setOcuppied(boolean ocuppied) {
        this.ocuppied = ocuppied;
    }

    public int getTransactionId() {
        return Store.getTransactionId();
    }

    public Register(Store belongingStore) {
        this.belongingStore = belongingStore;
    }

    /**
     * Ξεκινά την δημιουργία μιας νέας πώλησης
     */
    public void makeNewSale(){
        t = new Sale();
        t.setDate(GregorianCalendar.getInstance());
    }

     /**
     * Δημιουργεί μια γραμμή πώλησης και την προσθέτει στην τρέχουσα πώληση
     */
    public void enterItem(String itemID, int quantity){
        ProductSpecification ps = belongingStore.getProductCatalog().findProduct(itemID);
        SalesLineItem sli = new SalesLineItem(ps,quantity);
        t.add(sli);
    }

    /**
     * Ολοκληρώνει την τρέχουσα πώληση
     * με την προσθήκη του ποσού που έδωσε ο πελάτης
     */
    public Receipt endSale(double amount){
        ((Sale)t).makePayment(amount);
        return endSale();
    }

     /**
     * Ολοκληρώνει την τρέχουσα επιστροφή
     */
    public Receipt endSale(){
        t.becomeComplete();
        if(t.isComplete()){
            belongingStore.addTransaction(t);
            return new Receipt(t);
        }
        else
            return null;
    }

     /**
     * Ξεκινά την δημιουργία μιας νέας επιστροφής
     */
    public void makeNewReturn(){
        t = new Return();
        t.setDate(GregorianCalendar.getInstance());
    }

     /**
     * Επιστρέφει τον κατάλογο με τα διαθέσιμα προϊόντα
     */
    public ProductCatalog getProductCatalog() {
        return belongingStore.getProductCatalog();
    }

     /**
     * Επιστρέφει την πώληση με κωδικό id
     */
    public Sale retreiveSale(int id) {
        return belongingStore.retreiveSale(id);
    }

    /**
     * Μέθοδος για να απελευθερώνεται το ταμείο.
     */
    public void release(){
        setOcuppied(false);
    }

     /**
     * Προσθέτει μια γραμμή πώλησης στην τρέχουσα πώληση
     */
    public void enterItem(ReturnLineItem returnLineItem) {
        t.add(returnLineItem);
    }

     /**
     * Δημιουργεί μια γραμμή πώλησης και την προσθέτει στην τρέχουσα πώληση
     */
    public boolean enterItem(ProductSpecification p1,int quantity) {
        SalesLineItem s1 = createSalesLine(p1,quantity);
        if (s1!=null){
          t.add(s1);
          return true;
        }
        else
            return false;
    }

    /**
     * Βοηθητική μέθοδος για την δημιουργία μια γραμμή πώλησης
     * Αν δεν ικανοποιείται το κριτήριο της διαθέσιμης ποσότητας επιστρέφεται null
     */
    private SalesLineItem createSalesLine(ProductSpecification p,int quantity){
        if(quantity<=0 || quantity>p.getQuantity())
                return null;
        else
            return new SalesLineItem(p,quantity);
    }

    /**
     *
     * @return Το κατάστημα που ανήκει το ταμείο.
     */
    public Store getBelongingStore() {
        return belongingStore;
    }

}
