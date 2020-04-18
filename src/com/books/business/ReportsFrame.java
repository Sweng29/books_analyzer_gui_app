/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.books.business;

import com.books.dao.GenericDAO;
import com.books.daoimpl.AnalysedDataDAOImpl;
import com.books.daoimpl.BookDetailDAOImpl;
import com.books.models.AnalysedData;
import com.books.models.BookDetail;
import com.books.utility.CommonMethods;
import java.awt.Color;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kashif Alei
 */
public class ReportsFrame extends javax.swing.JFrame {

    private BookDetailDAOImpl bookDetailDAO;
    public ReportsFrame() {
        initComponents();
        bookDetailDAO = new BookDetailDAOImpl();
        populateAttendanceTable();
        this.setLocationRelativeTo(null);
    }
    
    public ReportsFrame(ResultSet resultSet) {
        initComponents();
        bookDetailDAO = new BookDetailDAOImpl();
        populateAttendanceTable(resultSet);
        this.setLocationRelativeTo(null);
    }
    
    public ReportsFrame(ArrayList<AnalysedData> analysedDataList)
    {
        initComponents();
        bookDetailDAO = new BookDetailDAOImpl();
        this.setLocationRelativeTo(null);
        
        String col[] = {"ID","Keyword","Profitable Books", "Analysis Date"};
        
        System.err.println("Recieved : "+analysedDataList.size());
        
        Comparator<AnalysedData> comparator = new Comparator<AnalysedData>() {
            @Override
            public int compare(AnalysedData o1, AnalysedData o2) {
                Integer book1 = Integer.parseInt(o1.getProfitableBooks());
                Integer book2 = Integer.parseInt(o2.getProfitableBooks());
                return book1.compareTo(book2);
            }
        };
        
        Collections.sort(analysedDataList,comparator);
        Collections.reverse(analysedDataList);
        fillTablesWithList(analysedDataList,col,analysedDataTable, jScrollPane2, this);        
        
        //analysedDataTable.setModel(tableModel);
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        analysedDataTable = new javax.swing.JTable();
        saveAnalysedDataBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(53, 168, 83));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reports");

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
                .addGap(552, 552, 552)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 554, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addContainerGap())
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

        analysedDataTable.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        analysedDataTable.setModel(new javax.swing.table.DefaultTableModel(
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
        analysedDataTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        analysedDataTable.setRowHeight(20);
        analysedDataTable.setSelectionBackground(new java.awt.Color(11, 18, 29));
        analysedDataTable.setSelectionForeground(new java.awt.Color(140, 198, 62));
        analysedDataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                analysedDataTableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                analysedDataTableMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(analysedDataTable);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 75, 1340, 580));

        saveAnalysedDataBtn.setBackground(new java.awt.Color(53, 168, 83));
        saveAnalysedDataBtn.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        saveAnalysedDataBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveAnalysedDataBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saveAnalysedDataBtn.setText("Save Analysed Data");
        saveAnalysedDataBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveAnalysedDataBtn.setOpaque(true);
        saveAnalysedDataBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveAnalysedDataBtnMouseClicked(evt);
            }
        });
        jPanel2.add(saveAnalysedDataBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1370, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void analysedDataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_analysedDataTableMouseClicked
        
    }//GEN-LAST:event_analysedDataTableMouseClicked

    private void analysedDataTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_analysedDataTableMouseReleased
      
    }//GEN-LAST:event_analysedDataTableMouseReleased

    private void saveAnalysedDataBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveAnalysedDataBtnMouseClicked
        saveRecord();
    }//GEN-LAST:event_saveAnalysedDataBtnMouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        
    }//GEN-LAST:event_jPanel2MouseClicked

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
            java.util.logging.Logger.getLogger(ReportsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable analysedDataTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel saveAnalysedDataBtn;
    // End of variables declaration//GEN-END:variables

    private void populateAttendanceTable() {
//        ResultSet resultSet = new AttendanceDAOImpl().findAll();
//        CommonMethods.fillTables(resultSet, attendanceTable, jScrollPane2, this);
    }

    private void clearFields() {
        analysedDataTable.clearSelection();
        populateAttendanceTable();
    }

    private void populateAttendanceWithSearchResults(ResultSet resultSet) {
//        CommonMethods.fillTables(resultSet, attendanceTable, jScrollPane2, this);
    }

    private void searchReports() {
        if(saveAnalysedDataBtn.isEnabled()){
            ResultSet resultSet = null;
            if(resultSet!=null)
            {
                populateAttendanceWithSearchResults(resultSet);
            }else
            {
                new MessageForm("Error","No record found.","error.png").setVisible(true);
            }
        }
    }

    private void populateAttendanceTable(ResultSet resultSet) {
        CommonMethods.fillTables(resultSet, analysedDataTable, jScrollPane2, this);
    }

    private void saveRecord() {
        List<AnalysedData> analysedDataList = new ArrayList<AnalysedData>();
        // Iterate table get data and store 10 by 10 records.
        DefaultTableModel dm2 = (DefaultTableModel) analysedDataTable.getModel();
        int count = 0;
        for(int row = 0;row < dm2.getRowCount();row++) {
	    AnalysedData analysedData = new AnalysedData();
            count++;
            for(int col = 0;col < dm2.getColumnCount();col++) {
                String value = dm2.getValueAt(row, col).toString();
                switch(col){
                    case 0:
                        analysedData.setAnalysedDataId(Integer.parseInt(value));
                        break;
                    case 1:
                        analysedData.setKeyword(value);
                        break;
                    case 2:
                        analysedData.setProfitableBooks(value);
                        break;
                    case 3:
                        analysedData.setAnalysisDate(value);
                        break;
                }
	    }
            analysedDataList.add(analysedData);
            if(count==10)
            {
               saveBatch(analysedDataList);
               count = 0;
               analysedDataList.clear();
            }
	}
        if(count>0)
        {
            saveBatch(analysedDataList);
            count = 0;
            analysedDataList.clear();
        }
        new MessageForm("Success","Record saved successfully.","info.png").setVisible(true);
    }

    private void saveBatch(List<AnalysedData> analysedDataList) {
        for (Iterator<AnalysedData> iterator = analysedDataList.iterator(); iterator.hasNext();) {
            AnalysedData next = iterator.next();
            new AnalysedDataDAOImpl().save(next);
        }
    }

    private void fillTablesWithList(ArrayList<AnalysedData> analysedDataList,String [] columns,JTable analysedDataTable, JScrollPane jScrollPane2, ReportsFrame aThis) {
        DefaultTableModel dtm = new DefaultTableModel(columns,0) ;
        
        analysedDataTable.setDefaultEditor(Object.class, null);

        //dtm = (DefaultTableModel) DbUtils.resultSetToTableModel(rs);

        for(int i=0;i<analysedDataList.size();i++)
        {
            Object [] obj = {analysedDataList.get(i).getAnalysedDataId(),analysedDataList.get(i).getKeyword(),analysedDataList.get(i).getProfitableBooks(),analysedDataList.get(i).getAnalysisDate()};
            dtm.addRow(obj);
        }
        
        analysedDataTable.setModel(dtm);

        analysedDataTable.getColumnModel().getColumn(0).setWidth(0);
        analysedDataTable.getColumnModel().getColumn(0).setMinWidth(0);
        analysedDataTable.getColumnModel().getColumn(0).setMaxWidth(0);

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(11, 18, 29));
        headerRenderer.setForeground(new Color(140, 198, 62));

        for (int i = 0; i < analysedDataTable.getModel().getColumnCount(); i++) {
            analysedDataTable.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        analysedDataTable.setShowHorizontalLines(true);
        analysedDataTable.setShowVerticalLines(true);
        this.getContentPane().setBackground(Color.WHITE);
        jScrollPane2.getViewport().setBackground(Color.WHITE);
    }
  
}
