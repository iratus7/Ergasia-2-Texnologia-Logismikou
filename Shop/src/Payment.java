
/**
 * Αναπαριστά τα χρήματα που δώθηκαν από τον πελάτη
 */
public class Payment {

    protected double money;

    public Payment(double money) {
        this.money = money;
    }

    /**
     * Get the value of money
     *
     * @return the value of money
     */
    public double getMoney() {
        return money;
    }

    /**
     * Set the value of money
     *
     * @param money new value of money
     */
    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Πληρωμή: \t" + money + " Euro\n";
    }



}
