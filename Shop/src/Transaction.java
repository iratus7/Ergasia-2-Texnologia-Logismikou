import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;

/**
 * Αναπαριστά μια συναλλαγή
 */
public class Transaction {

    /**
     * Ο κωδικός συναλλαγής
     */
    protected int id = -1;
    /**
     * Η κατάσταση της συναλλαγής. Γίνεται true μόνο όταν ολοκληρωθεί
     */
    protected boolean complete=false;
    /**
     * Η ημερομηνία της συναλλαγής
     */
    protected Calendar date;
    /**
     * Οι εγγραφές προϊόντων και ποσοτήτων
     */
    ArrayList<LineItem> entries = new ArrayList<LineItem>();

  
    public ArrayList<LineItem> getEntries() {
        return entries;
    }

    /**
     * Επιστρέφει αν μια εγγραφή έχει ολοκληρωθεί
     */
    public boolean isComplete() {
        return complete;
    }

    /**
     * Set the value of complete
     */
    protected void setComplete(boolean complete) {
        this.complete = complete;
    }

    /**
     * Ελέγχει αν υπάρχουν εγγραφές προϊόντων και ποσοστήτων
     * και ολοκληρώνει την συναλλαγή
     */
    public void becomeComplete() {
        if (entries.size()>0)
            setComplete(true);
    }

    /**
     * Προσθέτει μια γραμμή προϊόντων στην δομή δεδομένων
     */
    public boolean add(LineItem e) {
        return entries.add(e);
    }

    /**
     * Αναζητά και επιστρέφει μία γραμμή προϊόντος
     */
    public LineItem getEntry(ProductSpecification p){
        for (int i=0;i<entries.size();i++){
            if(entries.get(i).getProduct().equals(p))
                return entries.get(i);
        }
        return null;
    }

    /**
     * Επιστρέφει το συνολικό ποσό της συναλλαγής
     */
     public double getTotal(){
        double sum=0.0;
        for (int i=0;i<entries.size();i++){
            sum+= entries.get(i).getProduct().getPrice() *
                  entries.get(i).getQuantity();
        }
        return sum;
    }


    /**
     * Get the value of date
     *
     * @return the value of date
     */
    public Calendar getDate() {
        return date;
    }

    /**
     * Set the value of date
     *
     * @param date new value of date
     */
    public void setDate(Calendar date) {
        this.date = date;
    }


    public Transaction() {
    }

    public Transaction(int id) {
        this.id=id;
    }

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String ret = "Kωδικός:"+id+"\n";
        ret+= "Ημερομηνία: "+DateFormat.getDateInstance().format(date.getTime())+"\n";
        for (Iterator<LineItem> it = entries.iterator(); it.hasNext();) {
            ret+=it.next();
        }
        return ret;
    }

     /**
     *
     * @return Επιστρέφει το ποσό επιστροφής
     */
    public double getReturnedAmount(){
        return 0.0;
    }
}
