
/**
 * Η κλάση αναπαριστά μια απόδειξη μετά από μια συναλλαγή
 * Η απόδειξη μπορεί να είναι νόμιμη ή παράνομη ανάλογα
 * με το αν η συναλλαγή ήταν επιτυχή ή όχι
 */
public class Receipt {
    /**
     * Η σχετιζόμενη με την απόδειξη συναλλαγή
     */
    protected Transaction transaction;

    public Receipt(Transaction t) {
        transaction = t;
    }
     /**
     * Get the value of transaction
     *
     * @return the value of transaction
     */
    public Transaction getTransaction() {
        return transaction;
    }

    /**
     *
     * @return Επιστρέφει αν η απόδειξη είναι νόμιμη ή παράνομη
     */
    public boolean isLegal(){
        return transaction.isComplete();
    }

    public String toString(){
        return "*******************************\n"+
                "\t"+
                ((transaction.isComplete())?"Nόμιμη απόδειξη":"ΠΡΟΣΟΧΗ\nΠαράνομη απόδειξη")+
                "\n" + transaction +
                "Ευχαριστουμε για την προτίμηση σας\n" +
                "*******************************\n";
    }

}
