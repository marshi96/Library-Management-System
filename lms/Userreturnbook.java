/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class Userreturnbook extends javax.swing.JFrame {

    /**
     * Creates new form Userreturnbook
     */
    Connection conn;
    ResultSet rs=null;
    Statement st;
    PreparedStatement pst;
    DefaultTableModel dm;
    public Userreturnbook() {
        initComponents();
        this.setLocationRelativeTo(null);
        tableload();
    }
      public void tableload()
    {
        Userlogin a=new Userlogin();
        String x=a.getuser();
        
        conn=DB.ConnectDB();
        Statement st;
        try{
            st = conn.createStatement();
            String s="select * from issuedbooks where uname='"+x+"'";
            rs=st.executeQuery(s);
            table.setModel(DbUtils.resultSetToTableModel(rs));
        
         
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"table"+ e);
        }
        finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e)
            {
                
        }}
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
        txtid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtdate = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Search here.....");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        txtid.setBackground(new java.awt.Color(204, 204, 204));
        txtid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtidKeyReleased(evt);
            }
        });
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 210, 20));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 100, 30));

        btnexit.setBackground(new java.awt.Color(0, 153, 153));
        btnexit.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnexit.setForeground(new java.awt.Color(255, 255, 255));
        btnexit.setText("X");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel1.add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 50, 30));

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("-");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 50, 30));

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 650, 150));

        jLabel2.setForeground(new java.awt.Color(255, 204, 204));
        jLabel2.setText("Select a row and press return button...");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 480, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\if_search_173095.png")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 20, -1));

        txtdate.setForeground(new java.awt.Color(255, 204, 255));
        jPanel1.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 120, 20));

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 670, 340));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Date Returned : ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\imageedit_1_4846743229.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 390));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                Date date=new Date();
                String t=sdf.format(date);
                Calendar calendar = Calendar.getInstance();

// get a java date (java.util.Date) from the Calendar instance.
// this java date will represent the current date, or "now".
java.util.Date currentDate = calendar.getTime();

// now, create a java.sql.Date from the java.util.Date
java.sql.Date datee = new java.sql.Date(currentDate.getTime());
        int y=JOptionPane.showConfirmDialog(null, "do you want to RETURN this book?","Return",JOptionPane.YES_NO_OPTION);
        if(y==0)
        {
          conn=DB.ConnectDB();
        Userlogin a=new Userlogin();
        String x=a.getuser();
        dm=(DefaultTableModel)table.getModel();
        try{
            int selected=table.getSelectedRow();
            
            String value=(table.getModel().getValueAt(selected, 0).toString());
            
            st=conn.createStatement();
            String s="select * from issuedbooks where uname='"+x+"'";
            pst=conn.prepareStatement(s);
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                java.sql.Date DOI=rs.getDate("date");
                //String B
                try{
           
                String s2="insert into userdate(bookid,uname,date,dater) values (?,?,?,?)";
                pst=conn.prepareStatement(s2);
                pst.setString(1,value);
                 pst.setString(2,x);
                 pst.setDate(3, DOI);
                  pst.setDate(4, datee);
            pst.execute();
           
          
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"usrdate"+ e);
        }
               
               String s1="delete from issuedbooks where bookid=?";
               //ResultSet rs1=st.executeQuery(s1);
               PreparedStatement pst=conn.prepareStatement(s1);
               pst.setString(1, value);
               pst.executeUpdate();
               dm.removeRow(selected);
                txtdate.setText(sdf.format(date));
                          
                   JOptionPane.showMessageDialog(Userreturnbook.this,"book returned successfully!");
             
               
               
            }else
            {
                JOptionPane.showMessageDialog(Userreturnbook.this,"can't delete plz select a row!!");
            }
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "You should select a row!");
        }  
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
         Userreturnbook ob=new Userreturnbook();
        ob.setVisible(false);
        ob.pack();
        ob.setLocationRelativeTo(null);//center
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        Userhome b=new Userhome();
        b.setVisible(true);
        b.pack();
        b.setLocationRelativeTo(null);//center
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_btnexitActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setState(login.ICONIFIED);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyReleased
        // TODO add your handling code here:
        dm=(DefaultTableModel)table.getModel();
        String search=txtid.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(dm);
        table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txtidKeyReleased
int xx,xy;
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
         int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        setOpacity((float)0.8);
        xx=evt.getX();
        xy=evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
        setOpacity((float)1.0);
    }//GEN-LAST:event_formMouseReleased

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
            java.util.logging.Logger.getLogger(Userreturnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Userreturnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Userreturnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Userreturnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Userreturnbook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JLabel txtdate;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}