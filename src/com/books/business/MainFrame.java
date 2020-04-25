/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.books.business;


import javax.swing.BoxLayout;
import javax.swing.JFrame;




/**
 *
 * @author Kashif Ali
 */
public class MainFrame extends javax.swing.JFrame {
     
   
public static String MenuItem[]={};
public static JFrame frames[]={};
public BoxLayout box;
 

    /**
     * Creates new form F2
     */
       public MainFrame() {
        
           setExtendedState(JFrame.MAXIMIZED_BOTH);
           //setUndecorated(true);
           initComponents();
           userName.setText(LoginFrame.userModel.getUserName());
    }

//     private void addMenu(){
//         JLabel[] labels = new JLabel[MenuItem.length];
//          this.box = new BoxLayout(jPanel_Menu, javax.swing.BoxLayout.Y_AXIS);
//            for (int i = 0; i <MenuItem.length ; i++) {
//                labels[i]=new JLabel(MenuItem[i]);
//                labels[i].setBackground(new java.awt.Color(11,18,29));
//                labels[i].setFont(new java.awt.Font("Century Gothic", 0, 20));
//                labels[i].setForeground(new java.awt.Color(255, 255, 255));
//                labels[i].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//                labels[i].setMaximumSize(new java.awt.Dimension(280, 90));
//                labels[i].setPreferredSize(new java.awt.Dimension(280, 90));
//                labels[i].setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(47, 55, 67)));
//                labels[i].setToolTipText(""+i);
//                labels[i].setOpaque(true);
////                jPanel_Menu.add(labels[i]);
//                labels[i].addMouseListener(new java.awt.event.MouseAdapter(){
//                    @Override
//                    public void mouseEntered(MouseEvent e) {
//                        JLabel labels=(JLabel) e.getSource();
//                        labels.setBackground(new java.awt.Color(47, 55, 67));
//                    }
//
//                    @Override
//                    public void mouseExited(MouseEvent e) {
//                        JLabel labels=(JLabel) e.getSource();
//                        labels.setBackground(new java.awt.Color(11,18,29));
//                    }
//
//                    @Override
//                    public void mouseClicked(MouseEvent e) {
//                        JLabel labels=(JLabel) e.getSource();
//                        int a=Integer.parseInt(labels.getToolTipText());
//                        frames[a].setVisible(true);
//                    }
//                    
//                });
//             //  jPanel_Menu.setLayout(box);               
//         }
//       
//     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Center = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        usersBtn = new javax.swing.JLabel();
        csvLoaderBtn = new javax.swing.JLabel();
        previousAnalysedDataBtn = new javax.swing.JLabel();
        jPanel_UP = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        jPanel_Down = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Airbnb");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel_Center.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usersBtn.setBackground(new java.awt.Color(53, 168, 83));
        usersBtn.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        usersBtn.setForeground(new java.awt.Color(255, 255, 255));
        usersBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usersBtn.setText("Users");
        usersBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usersBtn.setOpaque(true);
        usersBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersBtnMouseClicked(evt);
            }
        });
        jPanel2.add(usersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 620, 90));

        csvLoaderBtn.setBackground(new java.awt.Color(53, 168, 83));
        csvLoaderBtn.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        csvLoaderBtn.setForeground(new java.awt.Color(255, 255, 255));
        csvLoaderBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        csvLoaderBtn.setText("Load CSV / Analyse Data");
        csvLoaderBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        csvLoaderBtn.setOpaque(true);
        csvLoaderBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                csvLoaderBtnMouseClicked(evt);
            }
        });
        jPanel2.add(csvLoaderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 620, 90));

        previousAnalysedDataBtn.setBackground(new java.awt.Color(53, 168, 83));
        previousAnalysedDataBtn.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        previousAnalysedDataBtn.setForeground(new java.awt.Color(255, 255, 255));
        previousAnalysedDataBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        previousAnalysedDataBtn.setText("View Analysed Data");
        previousAnalysedDataBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previousAnalysedDataBtn.setOpaque(true);
        previousAnalysedDataBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousAnalysedDataBtnMouseClicked(evt);
            }
        });
        jPanel2.add(previousAnalysedDataBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 620, 90));

        jPanel_Center.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel_Center, java.awt.BorderLayout.CENTER);

        jPanel_UP.setBackground(new java.awt.Color(53, 168, 83));
        jPanel_UP.setPreferredSize(new java.awt.Dimension(10, 150));
        jPanel_UP.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(140, 198, 62));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel_UP.add(jLabel5);
        jLabel5.setBounds(1300, 100, 60, 50);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Logout");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel_UP.add(jLabel1);
        jLabel1.setBounds(1290, 50, 60, 30);

        userName.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setText("jLabel7");
        jPanel_UP.add(userName);
        userName.setBounds(1140, 50, 110, 30);

        getContentPane().add(jPanel_UP, java.awt.BorderLayout.PAGE_START);

        jPanel_Down.setBackground(new java.awt.Color(53, 168, 83));
        jPanel_Down.setPreferredSize(new java.awt.Dimension(10, 40));
        jPanel_Down.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("All Right Reserved © 2020 ");
        jPanel_Down.add(jLabel2, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel_Down, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
         new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       this.dispose();
       System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void usersBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersBtnMouseClicked
        new UserFrame().setVisible(true);
    }//GEN-LAST:event_usersBtnMouseClicked

    private void csvLoaderBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csvLoaderBtnMouseClicked
        new CSVLoaderFrame().setVisible(true);
    }//GEN-LAST:event_csvLoaderBtnMouseClicked

    private void previousAnalysedDataBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousAnalysedDataBtnMouseClicked
        new AnalysedDataFrame().setVisible(true);
    }//GEN-LAST:event_previousAnalysedDataBtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
           
        
            public void run() {                

                new MainFrame().setVisible(true);
            }
        });
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel csvLoaderBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Center;
    private javax.swing.JPanel jPanel_Down;
    private javax.swing.JPanel jPanel_UP;
    private javax.swing.JLabel previousAnalysedDataBtn;
    private javax.swing.JLabel userName;
    private javax.swing.JLabel usersBtn;
    // End of variables declaration//GEN-END:variables
    
}
