/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * login.java
 *
 * Created on 12 Jul, 2015, 5:42:48 PM
 */

package library_management;

/**
 *
 * @author abhilasha
 */import java.sql.*;
import javax.swing.JOptionPane;
public class login extends javax.swing.JFrame {
Connection conn;
Statement stmt;
ResultSet rs;
int c=0;
    /** Creates new form login */
    public login() {
        initComponents();
        setSize(1736,1131);
        setResizable(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log in");
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 36));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin Login:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 360, 260, 56);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 440, 120, 22);

        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(200, 440, 230, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 520, 110, 22);

        jPasswordField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(200, 520, 230, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Log in");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 600, 100, 29);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 1, 36));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Student Login:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(990, 360, 270, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Student id");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(930, 430, 110, 22);

        jTextField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(1070, 430, 240, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(930, 500, 110, 22);

        jPasswordField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(1070, 500, 240, 20);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Log in");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1120, 590, 100, 29);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Not a Member? Get Registered");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(890, 650, 230, 17);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Register");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1120, 650, 100, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/find-books.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1390, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String user_id=jTextField1.getText();
         String password=String.valueOf(jPasswordField1.getPassword());
         if(user_id.equals("")||password.equals(""))
         {
             JOptionPane.showMessageDialog(null,"Enter all fields");
         }
         else
         {
     try
       {
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           conn=DriverManager.getConnection("jdbc:odbc:library_management");
           System.out.println("connected");
           stmt=conn.createStatement();
         rs=stmt.executeQuery("select * from admin_login");

         while(rs.next())
         {
           String a=rs.getString("user_id");
            String b="";

           if(user_id.equals(a))
           {
           c=1;
          b=rs.getString("password");
           }
        if(c==1)
        {
            if(password.equals(b))
            {

            }
            else c=2;
        }

         }

     if(c==0)
     {
         JOptionPane.showMessageDialog(null,"User id entered does not exist");
     }
     else if(c==2)
     {
         JOptionPane.showMessageDialog(null,"Enter correct Password");
     }

     else if(c==1)
     {
        // System.out.println("login");
         new admin_home().setVisible(true);
         dispose();
     }
     }
     catch(SQLException se)
     {
System.out.println(se);
     }

     catch(ClassNotFoundException ce)
     {
System.out.println(ce);
     }
         } // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
new student_register().setVisible(true);
setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     String user_id=jTextField2.getText();
     System.out.println(user_id);
         String password=String.valueOf(jPasswordField2.getPassword());
         if(user_id.equals("")||password.equals(""))
         {
             JOptionPane.showMessageDialog(null,"Enter all fields");
         }
         else
         {
     try
       {
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           conn=DriverManager.getConnection("jdbc:odbc:library_management");
           System.out.println("connected");
           stmt=conn.createStatement();
         rs=stmt.executeQuery("select * from student");

         while(rs.next())
         {
           String a=String.valueOf(rs.getInt("ID"));
            String b="";

           if(user_id.equals(a))
           {
           c=1;
          b=rs.getString("password");
        
           }
        if(c==1)
        {
            if(password.equals(b))
            {

            }
            else c=2;
        }

         }

     if(c==0)
     {
         JOptionPane.showMessageDialog(null,"User id entered does not exist");
     }
     else if(c==2)
     {
         JOptionPane.showMessageDialog(null,"Enter correct Password");
     }

     else if(c==1)
     {
         System.out.println("login");
         new student_home(user_id).setVisible(true);
         dispose();
     }
     }
     catch(SQLException se)
     {
System.out.println(se);
     }

     catch(ClassNotFoundException ce)
     {
System.out.println(ce);
     }
         } // TODO add your handling code here:  // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
