/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * student_register.java
 *
 * Created on 12 Jul, 2015, 6:44:06 PM
 */

package library_management;

/**
 *
 * @author abhilasha
 */import java.sql.*;
import javax.swing.JOptionPane;
public class student_register extends javax.swing.JFrame {
 Connection conn;
  Statement stmt;
ResultSet rs;
int s=0;
    /** Creates new form student_register */
    public student_register() {
        initComponents();
        setSize(500,700);
        setResizable(false);

        try
       {
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           conn=DriverManager.getConnection("jdbc:odbc:library_management");
           System.out.println("connected");
           stmt=conn.createStatement();
           rs=stmt.executeQuery("select * from student");
           while(rs.next())
           {
               s=rs.getInt("ID");
           }
jTextField1.setText(""+(s+1));
jTextField1.setEditable(false);
}

     catch(SQLException se)
     {
System.out.println(se);
     }

     catch(ClassNotFoundException ce)
     {
System.out.println(ce);
     }




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
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 24));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sign Up");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 10, 110, 38);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student id");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 70, 80, 17);

        jTextField1.setBorder(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(150, 70, 310, 14);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(150, 120, 310, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 120, 90, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirm password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 170, 130, 14);
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(150, 170, 310, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 270, 60, 14);

        jLabel7.setFont(new java.awt.Font("Traditional Arabic", 0, 24));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Student Details");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 220, 170, 36);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(150, 270, 310, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Roll no");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 320, 50, 17);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(150, 320, 310, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Class");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 370, 40, 17);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(150, 370, 310, 20);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Strengthen-basic-skills.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 440, 550, 250);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Sign up");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 400, 90, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\abhilasha\\Downloads\\wallpapers\\plain-hd-wallpapers.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String password=String.valueOf(jPasswordField1.getPassword());
String confirm_password=String.valueOf(jPasswordField2.getPassword());
String name=jTextField2.getText();
String roll_no=jTextField3.getText();
String classs=jTextField4.getText();
if(password.equals("")||confirm_password.equals("")||name.equals("")||roll_no.equals("")||classs.equals(""))
{
 JOptionPane.showMessageDialog(null,"Enter all fields");

}

else
{
if(password.equals(confirm_password))
{

       try
       {
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           conn=DriverManager.getConnection("jdbc:odbc:library_management");
           System.out.println("connected");
           stmt=conn.createStatement();

stmt.executeUpdate("insert into student(password,name,roll_no,class) values('"+password+"','"+name+"','"+roll_no+"','"+classs+"')");

   new student_home(jTextField1.getText()).setVisible(true);
       }
     catch(SQLException se)
     {
System.out.println(se);
     }

     catch(ClassNotFoundException ce)
     {
System.out.println(ce);
     }
}
else
{
    JOptionPane.showMessageDialog(null,"Enter valid Password");
    jPasswordField1.setText("");
    jPasswordField2.setText("");
}





}



// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student_register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
