/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * book_return.java
 *
 * Created on 13 Jul, 2015, 8:07:17 PM
 */

package library_management;

/**
 *
 * @author abhilasha
 */
import java.util.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class book_return extends javax.swing.JFrame {

    Connection conn;
    Statement stmt;
    ResultSet rs;
int c=0;int s=0;
boolean flag=false;
    /** Creates new form book_return */
    public book_return() {
        initComponents();
        setSize(400,430);
        setResizable(false);
             GregorianCalendar g=new  GregorianCalendar();
     jTextField5.setText(  g.get(Calendar.DATE)+"/"+g.get(Calendar.MONTH)+"/"+g.get(Calendar.YEAR));

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 18));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student id");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 70, 100, 29);

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 36));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Return Book");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 10, 210, 50);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(130, 70, 220, 20);

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 18));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Book id");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 110, 62, 29);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(130, 110, 220, 20);

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 1, 18));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Book Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 160, 110, 29);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(130, 160, 220, 20);

        jLabel6.setFont(new java.awt.Font("Traditional Arabic", 1, 18));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Author Name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 210, 110, 29);

        jLabel7.setFont(new java.awt.Font("Traditional Arabic", 1, 18));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Return Date");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 259, 110, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(130, 210, 220, 20);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(130, 260, 220, 20);

        jButton1.setFont(new java.awt.Font("Traditional Arabic", 1, 18));
        jButton1.setText("Return");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(130, 360, 100, 40);

        jLabel8.setFont(new java.awt.Font("Traditional Arabic", 1, 18));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fine");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 310, 50, 29);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(130, 310, 220, 20);

        jButton2.setFont(new java.awt.Font("Traditional Arabic", 1, 18));
        jButton2.setText("Check Fine");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(250, 360, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/twitter-background-17.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String student_id=jTextField1.getText();

int book_id=Integer.parseInt(jTextField2.getText());
String book_name=jTextField3.getText();
String author_name=jTextField4.getText();
String fine=jTextField6.getText();


   try
       {
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           conn=DriverManager.getConnection("jdbc:odbc:library_management");
           System.out.println("connected");
           stmt=conn.createStatement();
           rs=stmt.executeQuery("select * from book_issue");
            while(rs.next())
            {
                String s_id=rs.getString("student_id");
                System.out.print(s_id);
                int b_id=Integer.parseInt(rs.getString("book_id"));
                System.out.print(b_id);
                String b_name=rs.getString("book_name");
                System.out.print(b_name);
                String auth_name=rs.getString("author_name");
                String fn=rs.getString("fine");
                System.out.println();
                if(s_id.equals(student_id)&&b_id==book_id&&b_name.equalsIgnoreCase(book_name)&&auth_name.equalsIgnoreCase(author_name))//&&fine.equalsIgnoreCase(fn))
                {
System.out.println("abac");
                    s=rs.getInt("ID");
                    System.out.println(s);
                    c=1;
                   stmt.executeUpdate("delete * from book_issue where ID="+s);
            // if(fn.equals(fine))
             //   {
              //      flag=true;
              //  }
                }


if(c==1)
    break;


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

System.out.println(c);
if(c==1)

{

  try
       {
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           conn=DriverManager.getConnection("jdbc:odbc:library_management");
           System.out.println("connected");
           stmt=conn.createStatement();
         rs=stmt.executeQuery("select * from book");
         while(rs.next())
         {
             int id=rs.getInt("ID");
             if(id==book_id)
             {
                int qty=Integer.parseInt(rs.getString("quantity"));
                qty++;
                String quantity=String.valueOf(qty);
                    stmt.executeUpdate("update book set quantity="+"'"+quantity+"'"+" where ID="+id);
             }





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

}

else
    JOptionPane.showMessageDialog(null,"Error,please check all details again and re-enter");

 /*if((c==0&&flag==true)||(c==0&&flag==false))
{
    JOptionPane.showMessageDialog(null,"No issued book record found");
}
else if(flag==false)
{
    JOptionPane.showMessageDialog(null,"Fine payment not done");
}*/




// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     String student_id=jTextField1.getText();

int book_id=Integer.parseInt(jTextField2.getText());
String book_name=jTextField3.getText();
String author_name=jTextField4.getText();
String fine=jTextField6.getText();


   try
       {
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           conn=DriverManager.getConnection("jdbc:odbc:library_management");
           System.out.println("connected");
           stmt=conn.createStatement();
           rs=stmt.executeQuery("select * from book_issue");
            while(rs.next())
            {
                String s_id=rs.getString("student_id");
               // System.out.print(s_id);
                int b_id=Integer.parseInt(rs.getString("book_id"));
                 // System.out.print(b_id);
                String b_name=rs.getString("book_name");
               // System.out.print(b_name);
                String auth_name=rs.getString("author_name");

                if(s_id.equals(student_id)&&b_id==book_id&&b_name.equalsIgnoreCase(book_name)&&auth_name.equalsIgnoreCase(author_name))//&&fine.equalsIgnoreCase(fn))
                {
System.out.println("abac");
String issue_date=rs.getString("issue_date");
//System.out.println(issue_date);
  int d1=0,m1=0;
               GregorianCalendar g=new  GregorianCalendar();
   String ar1=(  g.get(Calendar.DATE)+"/"+g.get(Calendar.MONTH)+"/"+g.get(Calendar.YEAR));
           // System.out.println(ar1);
  int length1=ar1.length();
   String year1=ar1.substring(length1-4,length1);
    int y1=Integer.parseInt(year1);
      System.out.println(y1);
      for(int i=0;i<length1-5;i++)
            {
                char ch1;

                ch1=ar1.charAt(i);
                if(ch1=='/')
                {
                    String day1=ar1.substring(0,i);
                    d1=Integer.parseInt(day1);
                   System.out.println(d1);
                    String month1=ar1.substring(i+1,length1-5);
                      m1=Integer.parseInt(month1);
                       System.out.println(m1);
                }
      }


            float f=0;

             String ar=issue_date;

            int length=ar.length();

            String year=ar.substring(length-4,length);
          int y=Integer.parseInt(year);


            for(int i=0;i<length-5;i++)
            {
                char ch;

                ch=ar.charAt(i);
                if(ch=='/')
                {
                    String day=ar.substring(0,i);
                   int d=Integer.parseInt(day);
                    String month=ar.substring(i+1,length-5);
                     int m=Integer.parseInt(month);
                    try
{
      Calendar calendar1=Calendar.getInstance();
       Calendar calendar2=Calendar.getInstance();
       calendar1.set(y,m,d);
        calendar2.set(y1,m1,d1);
       long miliSecondForDate1=calendar1.getTimeInMillis();
        System.out.println(miliSecondForDate1);
          long miliSecondForDate2=calendar2.getTimeInMillis();
        long diffInMilis=miliSecondForDate2-miliSecondForDate1;
         System.out.println(diffInMilis);
       long diffInDays=diffInMilis/(24*60*60*1000);
        System.out.println(diffInDays);


        f=2*diffInDays;
        if(f<0)
            f=0;

      System.out.println(f);


        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
                }
            }


jTextField6.setText(""+f);
                }
            }
   }
             catch(SQLException se)
     {
System.out.println(se);
     }

     catch(ClassNotFoundException ce)
     {
System.out.println(ce);
     }// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new book_return().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

}