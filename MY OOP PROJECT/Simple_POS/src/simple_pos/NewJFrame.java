package simple_pos;

import java.util.Vector;
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;


public class NewJFrame extends javax.swing.JFrame {
    public NewJFrame() {
        initComponents();
        
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(200);

        
    }
   public void addtable(int ID,String Name, int Qty,double Price){
       DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
       
       DecimalFormat df = new DecimalFormat("00.00");
          double totPrice = Price * Double.valueOf(Qty);
          
          String TotalPrice = df.format(totPrice);
          
       
       for (int row = 0; row < jTable2.getRowCount(); row ++){
           if(Name == jTable2.getValueAt(row, 1)){
              dt.removeRow(jTable2.convertRowIndexToModel(row));
           }
           
       }

       Vector v = new Vector();
       v.add(ID);
       v.add(Name);
       v.add(Qty);
       v.add(TotalPrice);
       
       
       dt.addRow(v);
       
   }
    public void cal(){
        //cal total table
        
        int numOfRow = jTable2.getRowCount();
        double tot = 0.0 ;
          for (int i=0; i< numOfRow; i++){
              
              double value = Double.valueOf(jTable2.getValueAt(i, 3).toString());
              tot += value;
          }
          DecimalFormat df = new DecimalFormat("00.00");
          total.setText(df.format(tot));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        C1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        GGG = new javax.swing.JButton();
        FGG = new javax.swing.JButton();
        ONE = new javax.swing.JLabel();
        SIX = new javax.swing.JLabel();
        TWO = new javax.swing.JLabel();
        THREE = new javax.swing.JLabel();
        FOUR = new javax.swing.JLabel();
        FIVE = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        HGF = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        CSFC = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        T = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        Bal = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        BALANCE = new javax.swing.JLabel();
        CASH = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        PAY = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        C1.setIcon(new javax.swing.ImageIcon("C:\\Users\\CL1-13\\Downloads\\CjoyBurg-removebg-preview.png")); // NOI18N
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        jPanel1.add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, 150));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simple_pos/CjoyFries-removebg-preview.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(300, 200));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 230, 150));

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\CL1-13\\Downloads\\CjoyBucketwRiceJolly-removebg-preview.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 210, 160));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simple_pos/4-pcCjoyFamBox-removebg-preview.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 230, 160));

        GGG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simple_pos/Champ-Jr.-Solo-removebg-preview.png"))); // NOI18N
        GGG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GGGActionPerformed(evt);
            }
        });
        jPanel1.add(GGG, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 200, 180));

        FGG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simple_pos/bacon-removebg-preview.png"))); // NOI18N
        FGG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FGGActionPerformed(evt);
            }
        });
        jPanel1.add(FGG, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 220, 180));

        ONE.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ONE.setText("1");
        jPanel1.add(ONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 20, 30));

        SIX.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SIX.setText("6");
        jPanel1.add(SIX, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 670, 20, -1));

        TWO.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TWO.setText("2");
        jPanel1.add(TWO, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        THREE.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        THREE.setText("3");
        jPanel1.add(THREE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 20, -1));

        FOUR.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FOUR.setText("4");
        jPanel1.add(FOUR, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 20, -1));

        FIVE.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FIVE.setText("5");
        jPanel1.add(FIVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 20, -1));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField2.setText("BURGER WITH FRIES&DRNKS");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 680, 210, -1));

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField3.setText("SOLO BURGER");
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 680, -1, -1));

        HGF.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        HGF.setText("4PC CSFC");
        jPanel1.add(HGF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, -1, -1));

        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField5.setText("FAMILY JOLLY");
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField6.setText("CSFC WITH FRIES&DRNK");
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 180, -1));

        CSFC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CSFC.setText("CSFC WITH DRINK");
        CSFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSFCActionPerformed(evt);
            }
        });
        jPanel1.add(CSFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jPanel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Qty", "Price"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton9.setText("DELETE");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        T.setColumns(20);
        T.setRows(5);
        jScrollPane1.setViewportView(T);

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));

        Bal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Bal.setText("00");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setText("TOTAL:");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setText("CASH:");

        total.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        total.setText("00");

        BALANCE.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BALANCE.setText("BALANCE:");

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton7.setText("PRINT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        PAY.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PAY.setText("PAY");
        PAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAYActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(CASH, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(BALANCE, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(PAY, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(161, 161, 161))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(total))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CASH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bal)
                            .addComponent(BALANCE))
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PAY, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
int i = Integer.valueOf(THREE.getText());
        ++i;
        THREE.setText(String.valueOf(i));
        addtable(3,"FAMILY JOLLY",i,2.59);
        cal();       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        int i = Integer.valueOf(ONE.getText());
        ++i;
        ONE.setText(String.valueOf(i));
        addtable(1,"CSFC WITH DRINK",i,2.99);
        cal();
        
        
    }//GEN-LAST:event_C1ActionPerformed

    private void CSFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSFCActionPerformed
        
    }//GEN-LAST:event_CSFCActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int i = Integer.valueOf(TWO.getText());
        ++i;
        TWO.setText(String.valueOf(i));
        addtable(2,"CSFC WITH FRIES&DRINK",i,2.58);
        cal();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       int i = Integer.valueOf(FOUR.getText());
        ++i;
        FOUR.setText(String.valueOf(i));
        addtable(4,"4PC CSFC",i,3.59);
        cal();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void GGGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GGGActionPerformed
      int i = Integer.valueOf(FIVE.getText());
        ++i;
        FIVE.setText(String.valueOf(i));
        addtable(5,"SOLO BURGER",i,3.00);
        cal();
    }//GEN-LAST:event_GGGActionPerformed

    private void FGGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FGGActionPerformed
         int i = Integer.valueOf(SIX.getText());
        ++i;
        SIX.setText(String.valueOf(i));
        addtable(6,"BURGER WITH FRIES&DRINKS",i,3.00);
        cal();
    }//GEN-LAST:event_FGGActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
  DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
  String r = dt.getValueAt(jTable2.getSelectedRow(), 0).toString();
  // remove product
  int rw= jTable2.getSelectedRow();
  dt.removeRow(rw);
  
  
  
  //remove Qty Lable
  System.out.println(r);
  switch(r){
      case "1":
          ONE.setText("0");
          break;
      case "2":
          TWO.setText("0");
          break;
       case "3":
          THREE.setText("0");
          break;
       case "4":
          FOUR.setText("0");
          break;
       case "5":
          FIVE.setText("0");
          break;
       case "6":
          SIX.setText("0");
          break;
          
          
          
       default:
           System.out.println("OVER");
          
  }
  
  
  
  
  
    }//GEN-LAST:event_jButton9ActionPerformed

    private void PAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAYActionPerformed
       double TOT = Double.valueOf(total.getText());
        double Cash = Double.valueOf(CASH.getText());
        double Balance = Cash - TOT ;
         DecimalFormat df = new DecimalFormat("00.00");
          
        
        Bal.setText(String.valueOf(df.format(Balance)));
        
    }//GEN-LAST:event_PAYActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
  // BILL Print
      try{
       T.setText("\tDappcode\n");
       T.setText(T.getText()+"                       Gladys Alboro,\n");
       T.setText(T.getText()+"                      Boulevard, Davao City,\n");
       T.setText(T.getText()+"---------------------+9411 123456789,\n");
       T.setText(T.getText()+ "Item  t \tQty \tPrice "+ "\n" );
       
      DefaultTableModel df = (DefaultTableModel)  jTable2.getModel();
      
      // get table Product details
      for (int i=0; i< jTable2.getRowCount(); i++){
          String Name = df.getValueAt(i, 1).toString();
          String Qty = df.getValueAt(i, 2).toString();
          String Price = df.getValueAt(i, 3).toString();
          
          
          T.setText(T.getText()  +"\t"+ Name+ "\t"+Qty + "\t"+ Price);
          
          
          
      }
      
        T.setText(T.getText()+"---------------------------------,\n");
         T.setText(T.getText()+"Sub Total :"+ total.getText()+"\n");
          T.setText(T.getText()+"Cash:"+ CASH   .getText()+"\n");
           T.setText(T.getText()+"Balance :"+ BALANCE.getText()+"\n");
         T.setText(T.getText()+"---------------------------------,\n");
          T.setText(T.getText()+"Thanks For Your Business.......!\n");
          T.setText(T.getText()+"---------------------------------,\n");
        
      
      } catch (Exception e){} 
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BALANCE;
    private javax.swing.JLabel Bal;
    private javax.swing.JButton C1;
    private javax.swing.JTextField CASH;
    private javax.swing.JTextField CSFC;
    private javax.swing.JButton FGG;
    private javax.swing.JLabel FIVE;
    private javax.swing.JLabel FOUR;
    private javax.swing.JButton GGG;
    private javax.swing.JTextField HGF;
    private javax.swing.JLabel ONE;
    private javax.swing.JButton PAY;
    private javax.swing.JLabel SIX;
    private javax.swing.JTextArea T;
    private javax.swing.JLabel THREE;
    private javax.swing.JLabel TWO;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
