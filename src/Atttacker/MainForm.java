/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Atttacker;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author m
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainForm");
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Node Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 40, 100, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Connect");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(100, 250, 90, 30);

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(180, 40, 200, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("IP Address");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 120, 100, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Cluster Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 190, 100, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(180, 120, 200, 30);

        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(180, 190, 200, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(230, 250, 80, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/Free-Yellow-Grunge-Background-PSD.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(-10, -10, 530, 320);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 60, 450, 300);

        jPanel2.setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/internet-world-europe-view-3d-665x411.jpg"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(-20, -20, 500, 410);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(520, 50, 480, 390);

        jPanel3.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(255, 0, 51));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Detection And Localization of Multiple Spoofing Attackers Using Wireless Sensor Networks");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 0, 940, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 10, 960, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/Textures_wallpapers_379.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, -6, 1920, 500);

        setSize(new java.awt.Dimension(1010, 475));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.equals("")) {
            JOptionPane.showMessageDialog(null, "Fill The Fields");
        } else {
            try {
                InetAddress addr = InetAddress.getLocalHost();
                String ad = addr.getHostAddress();
                System.out.println("IP IS :" + addr.getHostAddress());
                String getI = JOptionPane.showInputDialog("Enter Cluster Topology Address");
                System.out.println("GET II:" + getI);
                if (ad.trim().equals(getI.trim())) {
                    PreparedStatement stmt = null;
                    Connection conn = Spoofing.getConnection();
                    stmt = conn.prepareStatement("insert into node (node_name,ip_address,cluster_name,status) values(?,?,?,?)");
                    stmt.setString(1, jTextField1.getText());
                    stmt.setString(2, jTextField2.getText());
                    stmt.setString(3, jTextField3.getText());
                    stmt.setString(4, "Connected");
                    stmt.execute();
                    new Router("","").setVisible(true);
                } else {

                    JOptionPane.showMessageDialog(null, "IP Error!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnknownHostException ex) {
                Logger.getLogger(Attacker1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1
        jTextField1.setText("destination");
    }//GEN-LAST:event_jTextField1

    private void jTextField3(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3
        jTextField3.setText("Topology");
    }//GEN-LAST:event_jTextField3

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
