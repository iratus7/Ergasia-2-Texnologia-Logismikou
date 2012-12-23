import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class MainStoreForm extends JFrame {
	
    //Το ενεργό ταμείο για τον συγκεκριμενο πελάτη
    private Register register;
    // Αναφορά στην φόρμα μεταβολής στοιχείων διαθέσιμων προϊόντων
    ProductsForm pf;
    // Αναφορά στην φόρμα πώλησης προϊόντων
    SalesForm sf;
    // Αναφορά στην φόρμα επιστροφής προϊόντων
    ReturnsForm rf;

    /** Creates new form MainStoreForm */
    public MainStoreForm(Register s) {
        register = s;
        initComponents();
    }
   
    private void initComponents() {

        jLabel1 = new JLabel();
        jPanel1 = new JPanel();
        jButton1 = new JButton();
        jButton3 = new JButton();
        jButton2 = new JButton();
        jButton4 = new JButton();

       // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Ο τίτλος της γραφικης διεπαφης
        jLabel1.setFont(new Font("Tahoma", 1, 18));
        jLabel1.setForeground(new Color(255, 0, 0));
        jLabel1.setText("Καλώς ήρθατε στο Ηλεκτρονικό μας Κατάστημα");
        jLabel1.setMaximumSize(new Dimension(400, 14));

        // Τα 4 κουπιά της εφαρμογής στην αρχική οθόνη
        jButton1.setText("1.Εισαγωγή/μεταβολή στοιχείων διαθέσιμων προϊόντων");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("2.Επιστροφή προϊόντων");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("3.Πραγματοποίηση πώλησης");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("4.Έξοδος");
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                .addContainerGap())
        ); 
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(253, 253, 253))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    // Εμφανίζει την φόρμα μεταβολής/εισαγωγής προϊόντων
    private void jButton1ActionPerformed(ActionEvent evt) {
             
            pf= new ProductsForm(this, register);
        //Απενεργοποιούμε της αρχικής φόρμα
            this.setEnabled(false);
        //Εμφανίζουμε τη φόρμα μεταβολής στοιχείων προιόντων.
            pf.setVisible(true);
    }

    // Παρόμοια με παραπάνω για την εμφάνιση της φόρμας πώλησης προϊόντων
    private void jButton2ActionPerformed(ActionEvent evt) {
            sf = new SalesForm(this, register);
            this.setEnabled(false);
            sf.setVisible(true);
    }

    // Έξοδος από την εφαρμογή
    private void jButton4ActionPerformed(ActionEvent evt) {
        dispose();
    }

    // Παρόμοια με παραπάνω για την εμφάνιση της φόρμας επιστροφής προϊόντων
    private void jButton3ActionPerformed(ActionEvent evt) {
        
        rf = new ReturnsForm(this, register);
        this.setEnabled(false);
        rf.setVisible(true);
    }


    
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JLabel jLabel1;
    private JPanel jPanel1;
  

}
