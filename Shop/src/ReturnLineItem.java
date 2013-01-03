
/**
 * Αναπαριστά μία εγγραφή επιστροφής ενός προϊόντος σε
 * μια επιστροφή
 */
public class ReturnLineItem extends LineItem{

    /**
     * Η σχετιζόμενη εγγραφή αγοράς του προϊόντος
     */
    private SalesLineItem returnedItem;
    /**
     * Η σχετιζόμενη αιτιολόγηση επιστροφής του συγκεκριμένου προϊόντος
     */
    private FaultSpecification fault;

    /**
     * Get the value of returnedItem
     *
     * @return the value of returnedItem
     */
    public SalesLineItem getReturnedItem() {
        return returnedItem;
    }

    /**
     * Set the value of returnedItem
     *
     * @param returnedItem new value of returnedItem
     */
    public void setReturnedItem(SalesLineItem returnedItem) {
        this.returnedItem = returnedItem;
    }

    public ReturnLineItem(SalesLineItem returnedItem, FaultSpecification fault, int quantity) {
        //Αποθηκεύουμε την ποσότητα με αρνητικό πρόσημο για να ενημερωθεί σωστά
        // η διαθέσιμη ποσότητα του καταστήματος. Έγινε η παραδοχή ότι
        // το επιστρεφόμενο προϊόν μπορεί να επαναπωληθεί
        super(returnedItem.getProduct(), -quantity);
        //Αφαίρεσε από το πωληθέντα προϊόντα την αντίστοιχη ποσότητα
        returnedItem.setQuantity(returnedItem.getQuantity()-quantity);
        this.returnedItem = returnedItem;
        this.fault =  fault;
    }

}
