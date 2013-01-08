
public class Main {

     public static void main(String[] args) {
         // Δημιουργία Καταστήματος
         Store store = new Store();
         // Ανακτηση ενός ταμείου
         Register r = store.getRegister();
         // Δημιουργία της κεντρικής φόρμας
         MainStoreForm f = new MainStoreForm(r);
         // Εμφάνιση της κεντρικής φόρμας
         f.setVisible(true);
    }

}
