/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Atttacker;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author m
 */
public class Reciever extends javax.swing.JFrame {
 public static String exe;
    String s1;
    StringBuffer buffer;
    String ipA, ipB, ipC, ipD;
    public int checkFlag = 0;
    String original;
public String source;
    /**
     * Creates new form NewJFrame
     */
    public Reciever() {
        initComponents();
         init();
         jTextArea2.setVisible(false);
       // jButton1.setEnabled(false);
        Thread t = new Thread(new connect1());
        t.start();
    }
      private void init() {
       // source = action.getSource();
        setTitle(source);
    }
 class connect1 implements Runnable {

        public void run() {
            try {
                ServerSocket ss = new ServerSocket(8401);
                Socket s = ss.accept();
                System.out.println("Receive");
                InputStream is = s.getInputStream();
                ObjectInputStream ois = new ObjectInputStream(is);
                ArrayList<String> array = (ArrayList<String>) ois.readObject();
               // System.out.println(array);
                s1 = array.get(0);
                String s2 = array.get(0);
                int d = s2.length();
                
                String aa[] = s2.split("\n");
                
                //System.out.println("size " + d / 10);
                for (int i = 1; i <= aa.length; i++) {
                    jTextArea2.append(" Packet  [" + i + "] : Received");
                    jTextArea2.append("\n");
                    Thread.sleep(3000);
                }
                jTextArea2.append("\n File Received to Destination...!");
                Thread.sleep(500);
                jTextArea1.setText(s2);
                //jButton1.setEnabled(true);
                is.close();
                ois.close();
                s.close();
                ss.close();
            } catch (Exception e) {
                System.out.println("OOPS! Errors are found -> " + e);
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Reciever");
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(190, 120, 330, 190);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(200, 160, 250, 100);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Recieved Data:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 90, 150, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/wifi_green_signal.gif"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-40, -170, 790, 710);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-767)/2, (screenSize.height-515)/2, 767, 515);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Reciever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reciever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reciever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reciever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reciever().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
