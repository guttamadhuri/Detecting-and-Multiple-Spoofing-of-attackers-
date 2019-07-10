/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Atttacker;

//import Tables.hits;
//import Tables.nodes;
//import Tables.spoof;

import Tables.hits;
import Tables.nodes;
import Tables.spoof;
import Tdatabase.hits1;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
/**
 *
 * @author raje
 */
public class Router extends javax.swing.JFrame {
     private Vector<Vector<String>> data; //used for data from database
    private Vector<String> header; //used to store data header
     private Vector<Vector<String>> data2; //used for data from database
    private Vector<String> header2; //us
     private Vector<Vector<String>> data3; //used for data from database
    private Vector<String> header3; //us
    
    
    
 ObjectOutputStream oos,oos1,oos2;
        OutputStream os,os1,os2;
          ArrayList<String> array = new ArrayList<String>();
          
          String data1,ipaddr;
   Thread t = new Thread(new connect());
    Thread t1 = new Thread(new connect1());

    /**
     * Creates new form Router
     */
    public Router(String get ,String ipA) {
         try {
        //get data from database
      hits1 dbengine = new hits1();
      data = dbengine.getEmployee1();
      
       header = new Vector<String>();
      header.add("N_2"); //Empid
      header.add("N_3"); // employee name
        header.add("N_4"); //Empid
      header.add("N_5"); // employee name
        header.add("N_6"); //Empid
      header.add("N_7"); // employee name
     // initComponents();
    } catch (Exception ex) {
        Logger.getLogger(Router.class.getName()).log(Level.SEVERE, null, ex);
    }
   
         try {
        //get data from database
      hits1 dbengine = new hits1();
      data2 = dbengine.getEmployee2();
      
       header2 = new Vector<String>();
      header2.add("N_8"); //Empid
      header2.add("N_9"); // employee name
        header2.add("N_10"); //Empid
      header2.add("N_11"); // employee name
        header2.add("N_12"); //Empid
      header2.add("N_13"); // employee name
            header2.add("N_14"); // employee name

     // initComponents();
    } catch (Exception ex) {
        Logger.getLogger(Router.class.getName()).log(Level.SEVERE, null, ex);
    }
        
         try {
        //get data from database
      hits1 dbengine = new hits1();
      data3 = dbengine.getEmployee3();
      
       header3 = new Vector<String>();
      header3.add("N_15"); //Empid
      header3.add("N_16"); // employee name
        header3.add("N_17"); //Empid
      header3.add("N_18"); // employee name
        header3.add("N_19"); //Empid
      header3.add("N_20"); // employee name
            

     // initComponents();
    } catch (Exception ex) {
        Logger.getLogger(Router.class.getName()).log(Level.SEVERE, null, ex);
    }
         
         
         
         
         
         
         
         
         
         
         
         
        
         
        
        
         data1 = get;
        ipaddr = ipA;
        //jPanel1.setVisible(false);
        initComponents();
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jLabel2.setVisible(true);
        jLabel1.setVisible(true);
        jLabel3.setVisible(true);
        jLabel53.setVisible(true);
        
        jLabel5.setVisible(true);
        jLabel72.setVisible(false);
        
        jLabel73.setVisible(false);
        jLabel74.setVisible(false);
        jLabel75.setVisible(false);
        jLabel76.setVisible(false);
        jLabel77.setVisible(false);
jLabel78.setVisible(false);
jLabel79.setVisible(false);
jLabel80.setVisible(false);
jLabel81.setVisible(false);
jLabel82.setVisible(false);
jLabel83.setVisible(false);
jLabel84.setVisible(false);
jLabel85.setVisible(false);
jLabel86.setVisible(false);
jLabel87.setVisible(false);
jLabel88.setVisible(false);
jLabel89.setVisible(false);
jLabel90.setVisible(false);
jLabel91.setVisible(false);
jLabel92.setVisible(false);
jLabel93.setVisible(false);
jLabel94.setVisible(false);
jLabel95.setVisible(false);
jLabel96.setVisible(false);
jLabel97.setVisible(false);
jLabel98.setVisible(false);
jLabel99.setVisible(false);
jLabel100.setVisible(false);

        t.start();

    }


    class connect1 implements Runnable {

        public void run() {
            try {            
                Thread.sleep(100);
                jLabel76.setVisible(true);
                jLabel51.setVisible(false);
                Thread.sleep(200);
                jLabel8.setVisible(false);
                jLabel78.setVisible(true);
                Thread.sleep(300);
                jLabel2.setVisible(false);
                jLabel72.setVisible(true);
                Thread.sleep(400);
                jLabel1.setVisible(false);
                jLabel79.setVisible(true);
                Thread.sleep(500);
                jLabel3.setVisible(false);
                jLabel73.setVisible(true);
                  Thread.sleep(500);
                jLabel53.setVisible(false);
                jLabel80.setVisible(true);
        Thread.sleep(600);
                jLabel5.setVisible(false);
                jLabel74.setVisible(true);
                  Thread.sleep(700);
                jLabel52.setVisible(false);
                jLabel81.setVisible(true);
                
                Thread.sleep(500);
                jLabel7.setVisible(false);
                jLabel75.setVisible(true);
                Thread.sleep(500);
                jLabel49.setVisible(false);
                jLabel82.setVisible(true);
                Thread.sleep(500);
                jLabel9.setVisible(false);
                jLabel77.setVisible(true);
                 Thread.sleep(500);
                 
                 //JOptionPane.showConfirmDialog(null, this);
             JOptionPane.showConfirmDialog(null, "Do You want To connect");
                                          
                                    String message = "IP Spoofer Found in Cluster1 Do You Want To Connect??";
                                   String title = "Really Want to Continue?";
                                   // display the JOptionPane showConfirmDialog
                                   int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
                                    if (reply == JOptionPane.YES_OPTION) {
                                        
                                    if(reply==JOptionPane.NO_OPTION)
                                            {
                 
                 
                 
                 
                 }else{
                                 JOptionPane.showMessageDialog(null,this);
                                    }
                 
                 
                 
                 
                 
                 
                jLabel58.setVisible(false);
                jLabel83.setVisible(true);
                 Thread.sleep(500);
                jLabel10.setVisible(false);
                jLabel84.setVisible(true);
                 Thread.sleep(500);
                jLabel57.setVisible(false);
                jLabel85.setVisible(true);
                 Thread.sleep(500);
                jLabel11.setVisible(false);
                jLabel86.setVisible(true);
                 Thread.sleep(500);
                jLabel60.setVisible(false);
                jLabel87.setVisible(true);
                 Thread.sleep(500);
                jLabel15.setVisible(false);
                jLabel88.setVisible(true);
                 Thread.sleep(500);
                jLabel62.setVisible(false);
                jLabel89.setVisible(true);
                 Thread.sleep(500);
                jLabel13.setVisible(false);
                jLabel90.setVisible(true);
                 Thread.sleep(500);
                jLabel16.setVisible(false);
                jLabel91.setVisible(true);
                 Thread.sleep(500);
                jLabel19.setVisible(false);
                jLabel93.setVisible(true);
                 Thread.sleep(500);
                jLabel65.setVisible(false);
                jLabel94.setVisible(true);
                 Thread.sleep(500);
                jLabel18.setVisible(false);
                jLabel92.setVisible(true);
                 Thread.sleep(500);
                jLabel67.setVisible(false);
                jLabel95.setVisible(true);
                 Thread.sleep(500);
                jLabel17.setVisible(false);
                jLabel96.setVisible(true);
                 Thread.sleep(500);
                jLabel70.setVisible(false);
                jLabel97.setVisible(true);
                 Thread.sleep(500);
                jLabel21.setVisible(false);
                jLabel98.setVisible(true);
                 Thread.sleep(500);
                jLabel69.setVisible(false);
                jLabel99.setVisible(true);
                 Thread.sleep(500);
                jLabel22.setVisible(false);
                jLabel100.setVisible(true);
                 Thread.sleep(500);
                
                jLabel100.setVisible(false);
                 Thread.sleep(500);
                
                jLabel100.setVisible(true);
                 Thread.sleep(500);
                
                jLabel100.setVisible(false);
                  Thread.sleep(500);
                
                jLabel100.setVisible(true);
              new Reciever().setVisible(true);  
                          
            // TODO add your handling code here:
            array.add(0, data1.toString());
           // array.add(1, txtLC.getText());
           // array.add(2, txtHC.getText());
            Socket s2 = null;
            String ip = ipaddr;
            
            s2 = new Socket(ip, 8401);
                    os2 = s2.getOutputStream();
                    oos2 = new ObjectOutputStream(os2);
                    oos2.writeObject(array);
                    oos2.close();
                    os2.close();
                    s2.close();
        
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    }else{
                                        JOptionPane.showMessageDialog(null,"error");
                                    }
                  
                  
            
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
            } catch (IOException ex) {
                Logger.getLogger(Router.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(Router.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                
                
        }
                    
          
    }

    class connect implements Runnable {

        public void run() {
            //try {
                // Thread.sleep(500);
                // jLabel2.setVisible(true);
                // jLabel2.setVisible(false);
                // Thread.sleep(500);
                //jLabel33.setVisible(true);
                //  jLabel3.setVisible(false);
                //Thread.sleep(1000);
                //jLabel4.setVisible(true);
              //  Thread.sleep(1000);
                //jLabel59.setVisible(false);



                // jLabel21.setVisible(true);
                //  Thread.sleep(1000);
                // jLabel24.setVisible(true);
                
              
                
                
             //    try {
           
            //array.add(0, data.toString());
        
           // Socket s2 = null;
           // String ip = ipaddr;
            
           // s2 = new Socket(ip, 8401);
            //        os2 = s2.getOutputStream();
           //         oos2 = new ObjectOutputStream(os2);
                //    oos2.writeObject(array);
                //    oos2.close();
                 //   os2.close();
                 //   s2.close();
     //   } catch (UnknownHostException ex) {
      //      Logger.getLogger(Rout.class.getName()).log(Level.SEVERE, null, ex);
      //  } catch (IOException ex) {
      //      Logger.getLogger(Rout.class.getName()).log(Level.SEVERE, null, ex);
      //  }
        //    }
        //    catch (InterruptedException ex) {
        //        Logger.getLogger(Rout.class.getName()).log(Level.SEVERE, null, ex);
        ///    }    
            }
    
   }
            
        
                
                
                
            
    

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 600));
        getContentPane().setLayout(null);

        jToolBar1.setRollover(true);
        getContentPane().add(jToolBar1);
        jToolBar1.setBounds(0, 0, 1016, 10);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Cluster-1 Status");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 40, 140, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle red.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 70, 50, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle red.png"))); // NOI18N
        jLabel3.setText(" ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 160, 50, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle red.png"))); // NOI18N
        jLabel4.setText(" ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 230, 50, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle red.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(210, 80, 48, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle red.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(220, 230, 50, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle red.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(280, 160, 48, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/north_east_arrow_u2197_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 120, 40, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle red.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(400, 160, 48, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle red.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(460, 90, 50, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle red.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(520, 160, 48, 40);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle red.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(470, 220, 48, 50);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle red.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(660, 150, 48, 40);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle red.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(590, 70, 48, 50);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle red.png"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(600, 230, 50, 40);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/1382094115_Stock Index Down.png"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(550, 260, 32, 50);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle red.png"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(510, 430, 48, 40);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle red.png"))); // NOI18N
        getContentPane().add(jLabel18);
        jLabel18.setBounds(440, 360, 48, 40);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle red.png"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(370, 430, 48, 40);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle red.png"))); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(440, 490, 48, 50);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle red.png"))); // NOI18N
        getContentPane().add(jLabel21);
        jLabel21.setBounds(570, 360, 48, 50);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle red.png"))); // NOI18N
        getContentPane().add(jLabel22);
        jLabel22.setBounds(640, 430, 48, 48);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle red.png"))); // NOI18N
        getContentPane().add(jLabel23);
        jLabel23.setBounds(580, 500, 48, 40);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setText("Source");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(10, 190, 50, 20);

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setText("Node 2");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(80, 110, 41, 20);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setText("Node 3");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(70, 270, 60, 20);

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel27.setText("CH-1");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(150, 200, 32, 17);

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel28.setText("Node 5");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(240, 60, 50, 20);

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel29.setText("Node 6");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(230, 270, 41, 17);

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel30.setText("Node 7");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(300, 210, 41, 17);

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel31.setText("Node 8");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(430, 200, 41, 17);

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel32.setText("Node 9");
        getContentPane().add(jLabel32);
        jLabel32.setBounds(480, 70, 60, 20);

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel33.setText("Node 10");
        getContentPane().add(jLabel33);
        jLabel33.setBounds(470, 270, 48, 17);

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel34.setText("CH-2");
        getContentPane().add(jLabel34);
        jLabel34.setBounds(540, 200, 32, 17);

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel35.setText("Node 12");
        getContentPane().add(jLabel35);
        jLabel35.setBounds(650, 90, 70, 20);

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel36.setText("Node 14");
        getContentPane().add(jLabel36);
        jLabel36.setBounds(680, 190, 48, 17);

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel37.setText("Node 13");
        getContentPane().add(jLabel37);
        jLabel37.setBounds(630, 270, 48, 17);

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel38.setText("Node 15");
        getContentPane().add(jLabel38);
        jLabel38.setBounds(370, 470, 48, 17);

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel39.setText(" Node 16");
        getContentPane().add(jLabel39);
        jLabel39.setBounds(450, 330, 60, 20);

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel40.setText("Node 17");
        getContentPane().add(jLabel40);
        jLabel40.setBounds(440, 550, 48, 17);

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel41.setText("Node 19");
        getContentPane().add(jLabel41);
        jLabel41.setBounds(590, 340, 60, 20);

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel42.setText("Node 20");
        getContentPane().add(jLabel42);
        jLabel42.setBounds(590, 540, 48, 17);

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel43.setText("Destination");
        getContentPane().add(jLabel43);
        jLabel43.setBounds(630, 470, 90, 20);

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel44.setText("CH-3");
        getContentPane().add(jLabel44);
        jLabel44.setBounds(520, 480, 40, 17);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 255));
        jButton2.setText("Cluster-2 Status");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(440, 30, 170, 30);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 255));
        jButton3.setText("Cluster-3 Status");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(500, 600, 170, 30);

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 51, 51));
        jLabel45.setText("Cluster 1");
        getContentPane().add(jLabel45);
        jLabel45.setBounds(230, 30, 70, 20);

        jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 51, 51));
        jLabel46.setText("Cluster 2");
        getContentPane().add(jLabel46);
        jLabel46.setBounds(640, 30, 70, 30);

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 0, 51));
        jLabel47.setText("Cluster 3");
        getContentPane().add(jLabel47);
        jLabel47.setBounds(350, 380, 70, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/south_east_arrow_u2198_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 120, 50, 30);

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/llllllllll.PNG"))); // NOI18N
        getContentPane().add(jLabel49);
        jLabel49.setBounds(370, 150, 40, 30);

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/north_east_arrow_u2197_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel48);
        jLabel48.setBounds(110, 210, 40, 40);

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/south_east_arrow_u2198_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel50);
        jLabel50.setBounds(30, 200, 40, 50);

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle red.png"))); // NOI18N
        getContentPane().add(jLabel51);
        jLabel51.setBounds(0, 150, 48, 50);

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/south_east_arrow_u2198_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel52);
        jLabel52.setBounds(250, 130, 50, 30);

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/north_east_arrow_u2197_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel53);
        jLabel53.setBounds(180, 120, 48, 30);

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/south_east_arrow_u2198_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel54);
        jLabel54.setBounds(180, 200, 48, 48);

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/south_east_arrow_u2198_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel55);
        jLabel55.setBounds(440, 210, 40, 30);

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/north_east_arrow_u2197_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel56);
        jLabel56.setBounds(250, 200, 48, 30);

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/south_east_arrow_u2198_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel57);
        jLabel57.setBounds(490, 130, 48, 30);

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/north_east_arrow_u2197_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel58);
        jLabel58.setBounds(430, 130, 48, 30);

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/north_east_arrow_u2197_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel59);
        jLabel59.setBounds(500, 200, 48, 30);

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/south_east_arrow_u2198_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel60);
        jLabel60.setBounds(570, 190, 48, 48);

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/north_east_arrow_u2197_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel61);
        jLabel61.setBounds(560, 110, 40, 40);

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/north_east_arrow_u2197_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel62);
        jLabel62.setBounds(640, 190, 48, 40);

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/south_east_arrow_u2198_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel63);
        jLabel63.setBounds(640, 120, 48, 30);

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/south_east_arrow_u2198_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel64);
        jLabel64.setBounds(410, 480, 40, 30);

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/north_east_arrow_u2197_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel65);
        jLabel65.setBounds(400, 400, 48, 30);

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/north_east_arrow_u2197_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel66);
        jLabel66.setBounds(470, 480, 40, 40);

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/south_east_arrow_u2198_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel67);
        jLabel67.setBounds(490, 400, 48, 30);

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/south_east_arrow_u2198_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel68);
        jLabel68.setBounds(540, 480, 48, 40);

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/south_east_arrow_u2198_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel69);
        jLabel69.setBounds(600, 400, 48, 40);

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/north_east_arrow_u2197_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel70);
        jLabel70.setBounds(550, 400, 40, 30);

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/north_east_arrow_u2197_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel71);
        jLabel71.setBounds(620, 480, 48, 40);

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle_green.png"))); // NOI18N
        getContentPane().add(jLabel72);
        jLabel72.setBounds(110, 70, 50, 50);

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle_green.png"))); // NOI18N
        getContentPane().add(jLabel73);
        jLabel73.setBounds(180, 160, 48, 50);

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle_green.png"))); // NOI18N
        getContentPane().add(jLabel74);
        jLabel74.setBounds(250, 80, 48, 48);

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle_green.png"))); // NOI18N
        getContentPane().add(jLabel75);
        jLabel75.setBounds(320, 160, 48, 50);

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle_green.png"))); // NOI18N
        getContentPane().add(jLabel76);
        jLabel76.setBounds(40, 150, 48, 50);

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle_green.png"))); // NOI18N
        getContentPane().add(jLabel77);
        jLabel77.setBounds(440, 150, 48, 60);

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/north_east_arrow_u2197_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel78);
        jLabel78.setBounds(70, 130, 48, 30);

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/south_east_arrow_u2198_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel79);
        jLabel79.setBounds(140, 120, 48, 40);

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/north_east_arrow_u2197_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel80);
        jLabel80.setBounds(210, 130, 50, 30);

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/south_east_arrow_u2198_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel81);
        jLabel81.setBounds(280, 120, 48, 40);

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/1382027991_gtk-go-back-rtl.png"))); // NOI18N
        getContentPane().add(jLabel82);
        jLabel82.setBounds(370, 190, 40, 30);

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/north_east_arrow_u2197_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel83);
        jLabel83.setBounds(470, 130, 48, 30);

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle_green.png"))); // NOI18N
        getContentPane().add(jLabel84);
        jLabel84.setBounds(500, 80, 48, 50);

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/south_east_arrow_u2198_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel85);
        jLabel85.setBounds(530, 120, 48, 40);

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle_green.png"))); // NOI18N
        getContentPane().add(jLabel86);
        jLabel86.setBounds(560, 150, 50, 50);

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/south_east_arrow_u2198_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel87);
        jLabel87.setBounds(600, 190, 48, 30);

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle_green.png"))); // NOI18N
        getContentPane().add(jLabel88);
        jLabel88.setBounds(640, 220, 48, 50);

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/north_east_arrow_u2197_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel89);
        jLabel89.setBounds(670, 200, 48, 30);

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle_green.png"))); // NOI18N
        getContentPane().add(jLabel90);
        jLabel90.setBounds(700, 140, 50, 50);

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/11.PNG"))); // NOI18N
        getContentPane().add(jLabel91);
        jLabel91.setBounds(530, 300, 32, 30);

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle_green.png"))); // NOI18N
        getContentPane().add(jLabel92);
        jLabel92.setBounds(480, 350, 50, 50);

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle_green.png"))); // NOI18N
        getContentPane().add(jLabel93);
        jLabel93.setBounds(410, 420, 50, 50);

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/north_east_arrow_u2197_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel94);
        jLabel94.setBounds(440, 400, 48, 30);

        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/south_east_arrow_u2198_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel95);
        jLabel95.setBounds(520, 400, 40, 30);

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle_green.png"))); // NOI18N
        getContentPane().add(jLabel96);
        jLabel96.setBounds(550, 430, 50, 48);

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/north_east_arrow_u2197_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel97);
        jLabel97.setBounds(580, 410, 48, 30);

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle_green.png"))); // NOI18N
        getContentPane().add(jLabel98);
        jLabel98.setBounds(610, 360, 48, 50);

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/south_east_arrow_u2198_icon_48x48.png"))); // NOI18N
        getContentPane().add(jLabel99);
        jLabel99.setBounds(640, 400, 48, 30);

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/circle_green.png"))); // NOI18N
        getContentPane().add(jLabel100);
        jLabel100.setBounds(680, 420, 48, 60);

        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            data,header));
    jScrollPane1.setViewportView(jTable1);

    jPanel1.add(jScrollPane1);
    jScrollPane1.setBounds(10, 10, 300, 110);

    getContentPane().add(jPanel1);
    jPanel1.setBounds(20, 290, 320, 140);

    jPanel2.setLayout(null);

    jTable2.setModel(new javax.swing.table.DefaultTableModel(
        data2,header2));
jScrollPane2.setViewportView(jTable2);

jPanel2.add(jScrollPane2);
jScrollPane2.setBounds(10, 10, 300, 100);

getContentPane().add(jPanel2);
jPanel2.setBounds(20, 430, 320, 130);

jPanel3.setLayout(null);

jTable3.setModel(new javax.swing.table.DefaultTableModel(
    data3,header3));
    jScrollPane3.setViewportView(jTable3);

    jPanel3.add(jScrollPane3);
    jScrollPane3.setBounds(10, 10, 300, 110);

    getContentPane().add(jPanel3);
    jPanel3.setBounds(20, 560, 320, 130);

    jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/projects-background.jpg"))); // NOI18N
    getContentPane().add(jLabel101);
    jLabel101.setBounds(-40, 10, 1300, 560);

    jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Atttacker/projects-background.jpg"))); // NOI18N
    getContentPane().add(jLabel102);
    jLabel102.setBounds(-50, 560, 1420, 130);

    jMenu1.setText("File");
    jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
    jMenu1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenu1ActionPerformed(evt);
        }
    });

    jMenuItem1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
    jMenuItem1.setText("No of Attacker Hits");
    jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem1ActionPerformed(evt);
        }
    });
    jMenu1.add(jMenuItem1);

    jMenuItem2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
    jMenuItem2.setText("View Spoofing Attackers");
    jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem2ActionPerformed(evt);
        }
    });
    jMenu1.add(jMenuItem2);

    jMenuItem3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
    jMenuItem3.setText("View Node IP Address");
    jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem3ActionPerformed(evt);
        }
    });
    jMenu1.add(jMenuItem3);

    jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
    jMenuItem4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
    jMenuItem4.setText("Exit");
    jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem4ActionPerformed(evt);
        }
    });
    jMenu1.add(jMenuItem4);

    jMenuBar1.add(jMenu1);

    jMenu2.setText("Assign IP Address");
    jMenu2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

    jMenuItem5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
    jMenuItem5.setText("Cluster 1");
    jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem5ActionPerformed(evt);
        }
    });
    jMenu2.add(jMenuItem5);

    jMenuItem6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
    jMenuItem6.setText("Cluster 2");
    jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem6ActionPerformed(evt);
        }
    });
    jMenu2.add(jMenuItem6);

    jMenuItem7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
    jMenuItem7.setText("Cluster 3");
    jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem7ActionPerformed(evt);
        }
    });
    jMenu2.add(jMenuItem7);

    jMenuBar1.add(jMenu2);

    setJMenuBar(jMenuBar1);

    java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    setBounds((screenSize.width-801)/2, (screenSize.height-746)/2, 801, 746);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new spoof().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        close();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        System.exit(0);
        close();
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new hits().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new nodes().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new Cluster1().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new Cluster2().setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        new Cluster3().setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   jPanel1.setVisible(true);
   jPanel2.setVisible(false);
   jPanel3.setVisible(false);
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jPanel2.setVisible(true);
   jPanel1.setVisible(false);
   jPanel3.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jPanel3.setVisible(true);
   jPanel2.setVisible(false);
   jPanel1.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Router.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Router.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Router.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Router.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Router("","").setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
