/**
 * Αναπαριστά μία συναλλαγή επιστροφής προϊόντων
 */
public class Return extends Transaction{

    public Return(int id) {
        super(id);
    }

    public Return() {
    }

    @Override
    public String toString() {
        return "\t*Επιστροφή*\n"+
                super.toString()+"\n"+
                "Επιστρ. ποσό: "+ getReturnedAmount() + "Euro\n";
    }

    /**
     *
     * @return Επιστρέφει το ποσό επιστροφής
     */
    public double getReturnedAmount(){
        return -getTotal();
    }

}
