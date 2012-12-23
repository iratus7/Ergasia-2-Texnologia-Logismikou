import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ProductsForm extends JFrame {

    /**
     * Το ταμείο
     */
    private Register register;
    /**
     * Η Αρχική φόρμα 
     */
    private MainStoreForm parentForm;

    /** Creates new form ProductsForm */
    ProductsForm(MainStoreForm parent, Register register) {
        parentForm = parent;
        this.register = register;
        initComponents();
    }

   
    private void initComponents() {

        jScrollPane1 = new JScrollPane();
        jList1 = new JList();
        jLabel1 = new JLabel();
        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jTextField4 = new JTextField();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        
        /*
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                formWindowClosing(evt);
            }σ
        });
         */
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jList1.setModel(new ProductListModel());
        jList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jList1.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setText("Διαθέσιμα προϊόντα");

        jPanel1.setBackground(new Color(255, 255, 51));

        jLabel2.setText("Κωδικός");

        jLabel3.setText("Περιγραφή");

        jLabel4.setText("Τιμή");

        jTextField1.setHorizontalAlignment(JTextField.RIGHT);
        jTextField1.setText("-");

        jTextField2.setHorizontalAlignment(JTextField.CENTER);
        jTextField2.setText("Περιγραφή");

        jTextField3.setHorizontalAlignment(JTextField.TRAILING);
        jTextField3.setText("0.0");

        jLabel5.setText("Euro");

        jLabel6.setText("Διαθέσιμη ποσότητα");

        jTextField4.setHorizontalAlignment(JTextField.TRAILING);
        jTextField4.setText("0");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(93, 93, 93)
                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jButton1.setText("Αποθήκευση αλλαγών");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Αποθήκευση Νέου Προϊόντος");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new Color(255, 0, 0));
        jButton3.setText("Επιστροφή");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

       GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                        .addGap(111, 111, 111))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(5, 5, 5)
                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }

    /**
     * Με την επιλογή κάποιου προϊόντος από την λίστα προϊόντων
     * ενημερώνονται τα αντίστοιχα JTextField ωστε ο χειριστής
     * να μπορέσει να πραγματοποιήσει αλλαγές
     *
     */
    private void jList1ValueChanged(ListSelectionEvent evt) {
        ProductSpecification p1 = (ProductSpecification) jList1.getSelectedValue();
        jTextField1.setText(p1.getltemlD());
        jTextField2.setText(p1.getDescription());
        jTextField3.setText("" + p1.getPrice());
        jTextField4.setText("" + p1.getQuantity());
    }

    /**
     * Με την επιλογή του κουμπιού Αποθήκευσης μεταβολών τα στοιχεία του επιλεγμένου
     * προϊόντος ενημερώνονται από τις τιμές που έχει δώσει ο χρήστης
     *
     */
    private void jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Ανακτάται η αναφορά στο αντικείμενο του προϊόντος
        ProductSpecification p1 = (ProductSpecification) jList1.getSelectedValue();
        //Θέτουμε ως κωδικό προϊόντος το περιεχόμενο του jTextField1
        p1.setItemID(jTextField1.getText());
        //Θέτουμε ως περιγραφή προϊόντος το περιεχόμενο του jTextField2
        p1.setDescription(jTextField2.getText());

        try {
            // Μετατρέπουμε το κείμενο που έδωσε ο χρήστης σε πραγματικούς αριθμούς
            // για τιμή και ποσότητα προϊόντος
            double price = Double.parseDouble(jTextField3.getText());
            double quantity = Double.parseDouble(jTextField4.getText());
            //Ελέγχουμε αν η τιμή και η ποσότητα έχουν θετική τιμή
            if (price > 0 && quantity > 0) {
                //Θέτουμε ως τιμή προϊόντος το περιεχόμενο του jTextField3
                p1.setPrice(price);
                //Θέτουμε ως διαθέσιμη ποσότητα προϊόντος το περιεχόμενο του jTextField4
                p1.setQuantity(quantity);

            //Ενεργοποίησε την αρχική φόρμα
            parentForm.setEnabled(true);
            //Απελευθέρωσε την τρέχουσα φόρμα
            dispose();
            } else 
                throw new Exception();
        } catch (Exception x) {
            //Επειδή ο χρήστης μπορεί να έχει δώσει μη επιτρεπτεί τιμή
            JOptionPane.showMessageDialog(rootPane, "Παρακαλώ βάλτε θετικό πραγματικό " +
                    "αριθμό για το κόστος και την διαθέσιμη ποσότητα");
        }
    }

     /**
     * Με την επιλογή του κουμπιού Αποθήκευσης νέου προιόντος δημιουργείται νέο
      * προϊόν με τα στοιχεία που έχει δώσει ο χρήστης και εισάγεται στο κατάστημα
     */
    private void jButton2ActionPerformed(ActionEvent evt) {
        try {
            // Μετατρέπουμε το κείμενο που έδωσε ο χρήστης σε πραγματικούς αριθμούς 
            // για τιμή και ποσότητα προϊόντος
            double price = Double.parseDouble(jTextField3.getText());
            double quantity = Double.parseDouble(jTextField4.getText());

            //Ελέγχουμε αν ο κωδικός προϊόντος που έδωσε ο χρήστης στο jTextField1 υπάρχει ήδη
            if (register.getProductCatalog().findProduct(jTextField1.getText()) != null) {
                JOptionPane.showMessageDialog(rootPane, "Ο κωδικός του προϊόντος υπάρχει ήδη");
                return;
            }
            //Ελέγχουμε αν η τιμή και η ποσότητα έχουν θετική τιμή
            if (price <= 0 && quantity <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Παρακαλώ βάλτε θετικό πραγματικό " +
                    "αριθμό για το κόστος και την διαθέσιμη ποσότητα");
                return;
            }
            // Όλα τα στοιχεία είναι σωστά άρα μπορούμε να δημιουργήσουμε το νέο προϊόν
            ProductSpecification p1 = new ProductSpecification(jTextField1.getText(),
                    jTextField2.getText(), price, quantity);
            // Εισάγουμε το νέο προϊόν στο μοντέλο στο κατάστημα
            register.getBelongingStore().addProduct(p1);
            // Θα ήταν ισοδύναμο να εισάγουμε το αντικείμενο στο μοντέλο
            // της λίστας γιατί και τα δύο δείχνουν στο ίδιο ArrayList!!!
            //((ProductListModel) jList1.getModel()).addProduct(p1);

            //Ενεργοποίησε την αρχική φόρμα
            parentForm.setEnabled(true);
            //Απελευθέρωσε την τρέχουσα φόρμα
            dispose();
        } catch (NumberFormatException x) {
            JOptionPane.showMessageDialog(rootPane, "Παρακαλώ βάλτε πραγματικό αριθμό για κόστος και ποσότητα");
        }
    }
    /**
     * Επιστροφή στην αρχική φόρμα αν πατηθεί η ακύρωση
     *
     */
    private void jButton3ActionPerformed(ActionEvent evt) {
            //Ενεργοποίησε την αρχική φόρμα
            parentForm.setEnabled(true);
            //Απελευθέρωσε την τρέχουσα φόρμα
            dispose();
    }

     /**
     * Επιστροφή στην αρχική φόρμα αν πατηθεί το Χ για το κλείσιμο της φόρμας
     *
     */
    private void formWindowClosing(WindowEvent evt) {
            //Ενεργοποίησε την αρχική φόρμα
            parentForm.setEnabled(true);
            //Απελευθέρωσε την τρέχουσα φόρμα
            dispose();
    }

    /**
     * Δημιουργούμε ένα εξειδικευμένο μοντέλο λίστας ώστε να μπορούμε να
     * διαθέτουμε αναφορά στην δομή του καταστήματος
     */
    class ProductListModel extends AbstractListModel {

        ArrayList<ProductSpecification> products = register.getProductCatalog().getProducts();

        public int getSize() {
            return products.size();
        }

        public Object getElementAt(int i) {
            return products.get(i);
        }

        public void addProduct(ProductSpecification x) {
            products.add(x);
            fireContentsChanged(this, products.size() - 1, products.size() - 1);
        }
    }

    
    private JButton jButton1, jButton2, jButton3;
    private JLabel jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6;
    private JList jList1;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTextField jTextField1, jTextField2, jTextField3, jTextField4;


}
