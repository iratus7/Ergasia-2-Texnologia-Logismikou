
/**
 * Αναπαριστά μία συναλλαγής πώλησης 
 */
public class Sale extends Transaction{

    /**
     * Η σχετιζόμενη πληρωμή του πελάτη
     */
    Payment payment;

    public Sale() {
    }

    public Sale(int id) {
        super(id);
    }

    public void makePayment(double amount){
        payment = new Payment(amount);
    }

    /**
     * Μία πώληση θεωρείται ολοκληρωμένη αν υπάρχουν εγγραφές
     * και ο πελάτης έχει δώσει ποσό μεγαλύτερο ή ίσο με το απαιτούμενο
     */
    @Override
    public void becomeComplete() {
        if(payment.getMoney()>=getTotal() && entries.size()>0)
            setComplete(true);
        else
           setComplete(false);
    }

    @Override
    public String toString() {
        return "\t*ΠΩΛΗΣΗ*\n"+
                super.toString()+"\n"+
                payment+
                "Ρέστα:"+ String.format("\t%.2f Euro\n",getReturnedAmount());
    }

    /**
    * Επιστρέφει το ποσό που πρέπει να επιστρέψει ο ταμίας στον πελάτη
    */
    @Override
    public double getReturnedAmount(){
        return payment.getMoney()-getTotal();
    }
}
