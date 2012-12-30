import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.*;
import javax.swing.text.DateFormatter;

public class SalesForm extends JFrame {

    /**
     * Το ταμείο
     */
    private Register register;
    /**
     * Η Αρχική φόρμα
     */
    private MainStoreForm parentForm;
    // Για λόγους ευκολίας δημιουργούμε πίνακες με τις τιμές που μπορεί να  
    // επιλέξει ο χρήστης αφού θέλουμε αργότερα στον κώδικα να κάνουμε
    // παρόμοιους ελέγχους και ενέργειες για κάθε ζεύγαρι
    JComboBox[] productSelection = new JComboBox[5];
    JTextField[] productQuantity = new JTextField[5];

    /** Creates new form SalesForm */
    public SalesForm(MainStoreForm parent, Register register) {
        parentForm = parent;
        this.register = register;
        initComponents();
        //Αρχικοποιούμε τους πίνακες
        productSelection[0] = jComboBox1;
        productQuantity[0] = jTextField1;
        productSelection[1] = jComboBox2;
        productQuantity[1] = jTextField2;
        productSelection[2] = jComboBox3;
        productQuantity[2] = jTextField3;
        productSelection[3] = jComboBox4;
        productQuantity[3] = jTextField4;
        productSelection[4] = jComboBox5;
        productQuantity[4] = jTextField5;

    }

    
    private void initComponents() {

        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jLabel1 = new JLabel();
        jFormattedTextField1 = new JFormattedTextField(new Date());
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jComboBox1 = new JComboBox();
        jTextField1 = new JTextField();
        jLabel5 = new JLabel();
        jButton1 = new JButton();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jComboBox2 = new JComboBox();
        jTextField2 = new JTextField();
        jComboBox3 = new JComboBox();
        jTextField3 = new JTextField();
        jComboBox4 = new JComboBox();
        jTextField4 = new JTextField();
        jComboBox5 = new JComboBox();
        jTextField5 = new JTextField();
        jButton2 = new JButton();
        jLabel9 = new JLabel();
        jTextField6 = new JTextField();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Ημερομηνια");

        jFormattedTextField1.setEditable(false);
        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new DateFormatter()));

        jLabel2.setText("Αρ. Συναλ.");

        jLabel3.setHorizontalAlignment(SwingConstants.TRAILING);
        jLabel3.setText(""+(Store.getTransactionId()));

        jLabel4.setText("Προιόν");

        jComboBox1.setModel(new ProductsModel());

        jTextField1.setHorizontalAlignment(JTextField.CENTER);
        jTextField1.setText("0");

        jLabel5.setHorizontalAlignment(SwingConstants.TRAILING);
        jLabel5.setText("Ποσότητα");

        jButton1.setText("Ολοκλήρωση Συναλλαγής");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                makeSale(evt);
            }
        });

        jLabel6.setText("Σύνολο");

        jLabel7.setHorizontalAlignment(SwingConstants.TRAILING);
        jLabel7.setText("0.0");

        jLabel8.setText("Euro");

        jComboBox2.setModel(new ProductsModel());

        jTextField2.setHorizontalAlignment(JTextField.CENTER);
        jTextField2.setText("0");

        jComboBox3.setModel(new ProductsModel());

        jTextField3.setHorizontalAlignment(JTextField.CENTER);
        jTextField3.setText("0");

        jComboBox4.setModel(new ProductsModel());

        jTextField4.setHorizontalAlignment(JTextField.CENTER);
        jTextField4.setText("0");

        jComboBox5.setModel(new ProductsModel());

        jTextField5.setHorizontalAlignment(JTextField.CENTER);
        jTextField5.setText("0");

        jButton2.setBackground(new Color(255, 0, 0));
        jButton2.setText("Ακύρωση");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Ποσό πληρωμής");

        jTextField6.setHorizontalAlignment(JTextField.TRAILING);
        jTextField6.setText("0.00");

        jLabel10.setText("Ρέστα: 0.00 Euro");

        jLabel11.setText("Euro");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addComponent(jComboBox5, GroupLayout.Alignment.LEADING, 0, 338, Short.MAX_VALUE)
                            .addComponent(jComboBox4, GroupLayout.Alignment.LEADING, 0, 338, Short.MAX_VALUE)
                            .addComponent(jComboBox3, GroupLayout.Alignment.LEADING, 0, 338, Short.MAX_VALUE)
                            .addComponent(jComboBox2, GroupLayout.Alignment.LEADING, 0, 338, Short.MAX_VALUE)
                            .addComponent(jLabel4, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, GroupLayout.Alignment.LEADING, 0, 338, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField4)
                            .addComponent(jTextField3)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(jTextField5))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jFormattedTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }

    /**
     * Όταν πατηθεί το κουμπί Ολοκλήρωση Συναλλαγής δημιουργείται ένα αντικείμενο
     * Πώλησης και ελέγχεται αν ο χρήστης έχει επιλέξει να αγοράσει κάποια
     * προϊόντα, τα οποία προσθέτει ως γραμμές πώλησης αφού πρώτα γίνουν οι
     * απαραίτητοι έλεγχοι.
     *
     */
    private void makeSale(ActionEvent evt) {

        // Δημιουργείται το αντικείμενο πώλησης
        register.makeNewSale();

        // Έλεγχος διπλή επιλογής του ίδιου προϊόντος (ΠΡΟΑΙΡΕΤΙΚΟ)
        if (!checkProducts()) {
            //Αν βρεθεί διπλό προϊόν επιστρέφουμε στην φόρμα
            return;
        }

        // Για κάθε JCombobox επιλογήw προϊόντος ελέγχουμε αν ο χρήστης επελεξε ένα προϊόν
        for (int i = 0; i < productSelection.length; i++) {
            if (productSelection[i].getSelectedIndex() != -1) {
                //Ανακτούμε το επιλεγμένο προϊόν
                ProductSpecification p1 = (ProductSpecification) productSelection[i].getSelectedItem();

                try {
                    //Διαβάζουμε την ποσότητα που έχει βάλει ο χρήστης
                    int pos1 = Integer.parseInt(productQuantity[i].getText());
                    // Αν δεν δημιιουργηθεί πρόβλημα κατά την μετατροπή τη ποσότητα
                    // Δημιουργούμε και τοποθετούμε στην πώληση μία νέα γραμμή πώλησης
                    if (register.enterItem(p1, pos1) == false) {
                        // Αν υπήρξε πρόβλημα κατά την εισαγωγή της γραμμής πώλησης
                        // δημιουργούμε εξαίρεση για να εμφανιστεί το αντίστοιχο μήνυμα
                        // και να σταματήσει η μέθοδος
                        throw new Exception();
                    }
                } catch (Exception x) {
                    //Εμφανίζεται το αντίστοιχο μήνυμα σφάλματος
                    JOptionPane.showMessageDialog(rootPane, "Παρακαλώ βάλτε θετικές " +
                            "ακέραιες ποσότητες στα αγαθά μικρότερες από τις διαθέσιμες");
                    // Ολοκληρώνεται η μέθοδος χωρίς να ολοκληρωθεί η πώληση
                    return;
                }
            }
        }

        // Αν όλα έχουν πάει καλά μπορούμε να προχωρήσουμε στην διαδικασία πληρωμής
        try {
            // Διαβάζουμε το ποσό που έβαλε ο χρήστης
            double amount = Double.parseDouble(jTextField6.getText());
            // Ολοκληρώνουμε την πώληση εισάγοντας το ποσό που μας έδωσε ο χρήστης
            Receipt r = register.endSale(amount);
            // Αν η πώληση ολοκληρώθηκε χωρίς πρόβλημα
            if (r != null && r.isLegal()) {
                System.out.println(r);
                // Εμφανίζουμε τα στοιχεία στα αντίστοιχα πεδία και ολοκληρώνουμε
                // την φόρμα
                finalizeForm(r);
            } else {
                // Εμφανίζουμε μήνυμα ότι υπάρχει πρόβλημα και δεν μπορεί να ολοκληρωθεί
                // η πώληση
                JOptionPane.showMessageDialog(rootPane, "Δεν μπόρεσε να ολοκληρωθεί " +
                        "η συναλλαγή\n Ελέγξετε τα επιλεγμένα προϊόντα, τις ποσότητες " +
                        "και το ποσό.");
            }
        } catch (Exception x) {
            //Υπήρξε πρόβλημα με το ποσό πληρωμής και εμφανίζουμε το αντίστοιχο μήνυμα
            JOptionPane.showMessageDialog(rootPane, "Παρακαλώ βάλτε θετικές " +
                    "ακέραιες ποσότητες στο ποσό πληρωμής");
            return;
        }
    }

    /**
     * Επιστροφή στην αρχική φόρμα αν πατηθεί ακύρωση
     *
     */
    private void jButton2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Ενεργοποίησε την αρχική φόρμα
        parentForm.setEnabled(true);
        //Απελευθέρωσε την τρέχουσα φόρμα
        dispose();
    }

    /**
     * Επιστροφή στην αρχική φόρμα αν πατηθεί το Χ για το κλείσιμο της φόρμας
     *
     */
    private void formWindowClosing(WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //Ενεργοποίησε την αρχική φόρμα
        parentForm.setEnabled(true);
        //Απελευθέρωσε την τρέχουσα φόρμα
        dispose();
    }

    /**
     * Έλεγχος διπλή επιλογής του ίδιου προϊόντος
     */
    private boolean checkProducts() {
        //Δημιουργουμε ένα Set που εξασφαλίζει ότι δεν μπορούν να υπάρχουν διπλές εγγραφές
        Set selections = new HashSet(productSelection.length);
        //Για όλα τις πιθανές επιλογές του χρήστη
        for (int i = 0; i < productSelection.length; i++) {
            // Έχει εισαχθεί ήδη ο αντίστοιχος κωδικός εμφανίζεται μήνυμα λάθους
            // και επιστρέφουμε false
            if (selections.contains(productSelection[i].getSelectedIndex())) {
                JOptionPane.showMessageDialog(rootPane,
                        "Παρακαλώ επιλέξτε διαφορετικά αγαθά για κάθε γραμμή πώλησης" +
                        "ή αυξήστε τις ποσότητες στην 1η επιλογή του προϊόντος");
                return false;
            }
            //Εισάγουμε τον κωδικό του προϊόντος στο Set
            if (productSelection[i].getSelectedIndex() != -1) {
                selections.add(productSelection[i].getSelectedIndex());
            }
        }
        //Όλα πήγαν καλά και επιστρέφουμε true
        return true;
    }

    /**
     *
     * Η μέθοδος ολοκληρώνει την φόρμα ενημερώνοντας κάποια πεδία
    
     */
   
    private void finalizeForm(Receipt r) {
        // Ενημερώνει το πεδίο για το σύνολο
        jLabel7.setText(String.format("%.2f", r.getTransaction().getTotal()));
        // Θέτει το πεδίο εισαγωγής του ποσού ως αμετάβλητο από το χρήστη
        jTextField6.setEditable(false);
        // Ενημερώνει το πεδίο για τα ρέστα
        jLabel10.setText(String.format("Ρέστα: %.2f Euro", r.getTransaction().getReturnedAmount()));
        //Απενεργοποιεί το κουμπί ολοκλήρωσης της συναλλαγής
        jButton1.setEnabled(false);
        //Για λόγους λειτουργικότητας αλλάζει το κείμενο και το χρώμα του κουμπιού ακύρωσης
        jButton2.setBackground(Color.GREEN);
        jButton2.setText("Επιστροφή");
    }

    /**
     * Δημιουργούμε ένα δικό μας μοντέλο για JComboBox ώστε να μπορούμε να
     * έχουμε εσωτερικά ώς πεδίο αναφορά στα αντικείμενα του καταστήματος
     */
    class ProductsModel extends javax.swing.DefaultComboBoxModel {

        ArrayList<ProductSpecification> products = register.getProductCatalog().getProducts();

        @Override
        public int getSize() {
            return products.size();
        }

        @Override
        public Object getElementAt(int i) {
            return products.get(i);
        }
    }
    
    private JButton jButton1,jButton2;
    private JComboBox jComboBox1,jComboBox2,jComboBox3,jComboBox4,jComboBox5;
    private JFormattedTextField jFormattedTextField1;
    private JLabel jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9,jLabel10,jLabel11;
    private JScrollPane jScrollPane1;
    private JTextArea jTextArea1;
    private JTextField jTextField1, jTextField2, jTextField3, jTextField4, jTextField5, jTextField6;

  
}
