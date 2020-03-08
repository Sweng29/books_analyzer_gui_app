/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payroll.business;

import com.payroll.dao.LeaveDAO;
import com.payroll.daoimpl.LeaveDAOImpl;
import com.payroll.models.Leave;
import com.payroll.utility.CommonMethods;
import java.sql.ResultSet;

/**
 *
 * @author Kashif Alei
 */
public class LeaveFrame extends javax.swing.JFrame {

    Integer selectedRow = -1;
    
    /**
     * Creates new form LeaveFrame
     */
    private LeaveDAOImpl leaveDAO = new LeaveDAOImpl();
    public LeaveFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        populateLeaves();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        deleteLeave = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        leaveSearch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        leaveTable = new javax.swing.JTable();
        updateLeaveBtn = new javax.swing.JLabel();
        resetBtn = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        statusCombo = new javax.swing.JComboBox<>();

        deleteLeave.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        deleteLeave.setText("Delete User");
        deleteLeave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteLeaveActionPerformed(evt);
            }
        });
        jPopupMenu1.add(deleteLeave);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(53, 168, 83));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Leaves");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(525, 525, 525)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 581, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Search Leaves");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 40, -1, 26));

        leaveSearch.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        leaveSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveSearchActionPerformed(evt);
            }
        });
        leaveSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                leaveSearchKeyReleased(evt);
            }
        });
        jPanel2.add(leaveSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 40, 220, -1));

        leaveTable.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        leaveTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        leaveTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leaveTable.setRowHeight(20);
        leaveTable.setSelectionBackground(new java.awt.Color(11, 18, 29));
        leaveTable.setSelectionForeground(new java.awt.Color(140, 198, 62));
        leaveTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leaveTableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                leaveTableMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                leaveTableMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(leaveTable);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 75, 980, 580));

        updateLeaveBtn.setBackground(new java.awt.Color(53, 168, 83));
        updateLeaveBtn.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        updateLeaveBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateLeaveBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateLeaveBtn.setText("Update Status");
        updateLeaveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateLeaveBtn.setOpaque(true);
        updateLeaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateLeaveBtnMouseClicked(evt);
            }
        });
        jPanel2.add(updateLeaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 150, 40));

        resetBtn.setBackground(new java.awt.Color(53, 168, 83));
        resetBtn.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        resetBtn.setForeground(new java.awt.Color(255, 255, 255));
        resetBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resetBtn.setText("Reset");
        resetBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetBtn.setOpaque(true);
        resetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetBtnMouseClicked(evt);
            }
        });
        jPanel2.add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 150, 40));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Status.");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 90, 30));

        statusCombo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        statusCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Status", "Approved", "Pending" }));
        statusCombo.setToolTipText("");
        jPanel2.add(statusCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 210, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1370, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void leaveSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveSearchActionPerformed

    }//GEN-LAST:event_leaveSearchActionPerformed

    private void leaveSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_leaveSearchKeyReleased
        CommonMethods.searchFromTable(leaveTable, leaveSearch);
    }//GEN-LAST:event_leaveSearchKeyReleased

    private void leaveTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaveTableMouseClicked
        updateLeaveBtn.setEnabled(true);
        selectedRow = leaveTable.getSelectedRow();

        if (selectedRow > -1) {
            selectedRow = (Integer) leaveTable.getValueAt(leaveTable.getSelectedRow(), 0);
            String status = (String) leaveTable.getValueAt(leaveTable.getSelectedRow(), 4);
            status = status.substring(0,1).toUpperCase()+status.substring(1,status.length());
            statusCombo.setSelectedItem(status);
        }

    }//GEN-LAST:event_leaveTableMouseClicked

    private void leaveTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaveTableMouseReleased
        if (evt.isPopupTrigger()) {
            jPopupMenu1.show(leaveTable, evt.getX(), evt.getY());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_leaveTableMouseReleased

    private void updateLeaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateLeaveBtnMouseClicked
        if (updateLeaveBtn.isEnabled()) {
           
            if (selectedRow > -1 && statusCombo.getSelectedIndex() != 0) {
                Leave leave = leaveDAO.findById(selectedRow);
                String leaveStatus = statusCombo.getSelectedItem().toString().toLowerCase();
                leave.setLeaveStatus(leaveStatus);
                int check = new LeaveDAOImpl().updateLeaveForAdmin(leave);
                System.out.println(leave.getLeaveId() + " " + leave.getUserName());
                if (check > 0) {
                    populateLeaves();
                    clearFields();
                    new MessageForm("Success", "Leave has been updated successfully.", "info.png").setVisible(true);
                    selectedRow = -1;
                } else {
                    new MessageForm("Error", "Could not update the leave, try again.", "error.png").setVisible(true);
                }

            } else {
                new MessageForm("Error", "Please select record", "error.png").setVisible(true);
            }

        }else
        {
            new MessageForm("Error", "Please select record", "error.png").setVisible(true);
        }
    }//GEN-LAST:event_updateLeaveBtnMouseClicked

    private void resetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetBtnMouseClicked
        clearFields();
    }//GEN-LAST:event_resetBtnMouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked

    }//GEN-LAST:event_jPanel2MouseClicked

    private void deleteLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteLeaveActionPerformed
        if (selectedRow > -1) {
            Integer id = selectedRow;//(Integer) userTable.getValueAt(userTable.getSelectedRow(), 0);
            int check = leaveDAO.delete(id);
            if (check > 0) {
                populateLeaves();
                clearFields();
                new MessageForm("Success", "Leave has been deleted successfully.", "info.png").setVisible(true);
            } else {
                new MessageForm("Error", "Could not delete the leave, try again.", "error.png").setVisible(true);
            }
        } else {
            new MessageForm("Error", "Please select record", "error.png").setVisible(true);
        }
    }//GEN-LAST:event_deleteLeaveActionPerformed

    private void leaveTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaveTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_leaveTableMouseEntered

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
            java.util.logging.Logger.getLogger(LeaveFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeaveFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeaveFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeaveFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeaveFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem deleteLeave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField leaveSearch;
    private javax.swing.JTable leaveTable;
    private javax.swing.JLabel resetBtn;
    private javax.swing.JComboBox<String> statusCombo;
    private javax.swing.JLabel updateLeaveBtn;
    // End of variables declaration//GEN-END:variables

    private void populateLeaves() {
        ResultSet resultSet = new LeaveDAOImpl().findAll();
        CommonMethods.fillTables(resultSet, leaveTable, jScrollPane2, this);
    }
    
    private void clearFields()
    {
        this.statusCombo.setSelectedIndex(0);
        leaveTable.clearSelection();
        selectedRow = -1;
    }
}
