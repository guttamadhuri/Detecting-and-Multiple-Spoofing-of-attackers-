/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Atttacker;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author raje
 */
public class Attacker3 extends javax.swing.JFrame {

    /**
     * Creates new form Attacker3
     */
    public Attacker3() {
        initComponents();
        FillCombo();
    }

    private void FillCombo() {
        try {
            Connection con = Spoofing.getConnection();
            Statement st = con.createStatement();
            String sql = "select * from node";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String name = rs.getString("node_name");
                jComboBox1.addItem(name);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Attacker3.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cluster_3 Attacker");
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Cluster");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 50, 60, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Node");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 100, 50, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("IP Address");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 150, 70, 20);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Update IP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(70, 220, 110, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(200, 220, 80, 30);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Display");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(340, 40, 120, 30);

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(120, 40, 200, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(120, 140, 200, 30);

        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(120, 90, 200, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/crystal clear (8).jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-10, -10, 2970, 320);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(60, 80, 480, 300);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/Textures_wallpapers_379.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-70, -20, 2470, 530);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-573)/2, (screenSize.height-442)/2, 573, 442);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTextField1.getText().equals("") || jTextField2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter The Missing Fields");
        } else {
            try {
                String getUser = jComboBox1.getSelectedItem().toString();
                Connection con = Spoofing.getConnection();
                Statement st = con.createStatement();
                int i = st.executeUpdate("update node set ip_address='" + jTextField2.getText() + "',status='Updated' where node_name='" + getUser + "'");
                PreparedStatement stmt = null;
                Connection conn = Spoofing.getConnection();
                stmt = conn.prepareStatement("insert into spoof (attacked_node,ip_address,cluster,date) values(?,?,?,?)");
                Date cdate = new Date();
                stmt.setString(1, jComboBox1.getSelectedItem().toString());
                stmt.setString(2, jTextField2.getText());
                stmt.setString(3, jTextField1.getText());
                stmt.setString(4, "" + cdate);
                stmt.execute();
                int clicked = 0;
                clicked++;
                PreparedStatement stmt1 = null;
                Connection conn1 = Spoofing.getConnection();
                stmt1 = conn1.prepareStatement("insert into hits (cluster,no_of_hits) values(?,?)");
                stmt1.setString(1, jTextField1.getText());
                stmt1.setString(2, "" + clicked);
                System.out.println(clicked);
                stmt1.execute();
                if (i != 0) {
                    JOptionPane.showMessageDialog(null, "IP Updated");

                }
            } catch (SQLException ex) {
                Logger.getLogger(Attacker3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            InetAddress addr = InetAddress.getLocalHost();
            String ad = addr.getHostAddress();
            System.out.println("IP IS :" + addr.getHostAddress());
            String getI = JOptionPane.showInputDialog("Enter your IP address");
            System.out.println("GET II:" + getI);
            if (ad.trim().equals(getI.trim())) {
                jTextField2.setText("127.0.0.1");

            } else {

                JOptionPane.showMessageDialog(null, "IP Error!");
            }
        } catch (UnknownHostException ex) {
            Logger.getLogger(Attacker1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1
        jTextField1.setText("Cluster 3");
    }//GEN-LAST:event_jTextField1

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField2.setText(null);
        jTextField1.setText(null);
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
            java.util.logging.Logger.getLogger(Attacker3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attacker3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attacker3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attacker3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attacker3().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
