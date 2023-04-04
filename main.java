import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
public class tour extends JFrame implements ActionListener, ItemListener
{
int jid=0;
Connection con;
JTextField itxtid;
JTextField itxtname;
JTextField itxtno;
JTextField itxtplace;
JTextField itxttotal;
JTextField txtn;
JPasswordField txtpass;
JButton ibtnInsert,ibtnModify,ibtnDelete,singup,register,home;
JLabel l1,l2,l3,il1,il2,il3,il4,il5,sl6,inl6,dl6;
JButton login,insert,delete;
JComboBox jc;
public tour()
{
l1=new JLabel("<html><i style='color:blue;'>new<br/></i></html>");
l1=new JLabel();
l2=new JLabel();
l3=new JLabel();
il1=new JLabel("<html><b style='font-size: 15px;'>Enter Your Tour Id:</b></html>");
il2=new JLabel("<html><b style='font-size: 15px;'>Enter your Name:</b></html>");
il3= new JLabel("<html><b style='font-size: 15px;'>Enter your Number:</b></html>");
il4= new JLabel("<html><b style='font-size: 15px;'>Enter your Place:</b></html>");
il5=new JLabel("<html><b style='font-size: 15px; padding:25px'>Enter Total Cost</b></html>");
sl6=new JLabel();

inl6=new JLabel();
dl6=new JLabel();
txtn= new JTextField(20);
txtn.setVisible(false);
txtpass= new JPasswordField(20);
txtpass.setVisible(false);
itxtid= new JTextField(20);
itxtname=new JTextField(20);
itxtno=new JTextField(20);
itxtplace=new JTextField(20);
itxttotal=new JTextField(20);
login = new JButton(" Login ");
jc= new JComboBox();
jc.setVisible(false);
login.setVisible(false);
//singup = new JButton("Sing Up");
home = new JButton(" Home ");
//home.setVisible(false);
register = new JButton(" Register as User ");
ibtnInsert = new JButton(" Insert Record ");
//ibtnModify = new JButton("Modify Record");
ibtnDelete = new JButton(" Delete Record ");
singup = new JButton(" Sing Up ");
insert = new JButton(" Insert ");
delete = new JButton(" Delete ");
ibtnDelete.setVisible(false);
ibtnInsert.setVisible(false);
register.setVisible(false);
il1.setVisible(false);
home.setVisible(false);
jc.setVisible(false);
il2.setVisible(false);
il3.setVisible(false);
il4.setVisible(false);
il5.setVisible(false);
itxtid.setVisible(false);
itxtname.setVisible(false);
itxtno.setVisible(false);
itxtplace.setVisible(false);
itxttotal.setVisible(false);
setLayout(new FlowLayout());
//add(sing);
add(singup);
add(insert);
add(delete);
add(home);
add(l1);
add(txtn);
add(l2);

add(txtpass);
add(login);
add(l3);
//add(register);
add(il1);
add(jc);
add(itxtid);
add(il2);
add(itxtname);
add(il3);
add(itxtno);
add(il4);
add(itxtplace);
add(il5);
add(itxttotal);
add(ibtnInsert);
//add(ibtnModify);
add(ibtnDelete);
add(sl6);
add(inl6);
add(dl6);
singup.addActionListener(this);
login.addActionListener(this);
home.addActionListener(this);
insert.addActionListener(this);
delete.addActionListener(this);
//register.addActionListener(this);
ibtnInsert.addActionListener(this);
//ibtnModify.addActionListener(this);
ibtnDelete.addActionListener(this);
jc.addItemListener(this);
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
System.out.println("Driver registered successfully");
}
catch(Exception e2)
{
System.out.println("Error in driver registration...");
}
}
public void itemStateChanged(ItemEvent e)
{
try
{
jid=Integer.parseInt(jc.getSelectedItem().toString());
Statement st1=con.createStatement();
ResultSet rs= st1.executeQuery("select name,no,place,total from details where id="+jid);
while(rs.next())

{
//name=rs.getString(1);
//no=Integer.parseInt(rs.getString(2));
//place=rs.getString(3);
//total=Integer.parseInt(rs.getString(4));
}
//txtename.setText(enm);
//txtsal.setText(Integer.toString(sal));
}
catch(SQLException e3)
{}
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource() == home){
//con=DriverManager.getConnection("jdbc:odbc:newc");
txtn.setVisible(false);

txtpass.setVisible(false);
login.setVisible(false);
home.setVisible(true);
l1.setVisible(false);
l2.setVisible(false);
l3.setVisible(false);
singup.setVisible(true);
insert.setVisible(true);
delete.setVisible(true);
register.setVisible(false);
home.setVisible(false);
ibtnDelete.setVisible(false);
ibtnInsert.setVisible(false);
//singup.setVisible(false);
register.setVisible(false);
il1.setVisible(false);
il2.setVisible(false);
il3.setVisible(false);
il4.setVisible(false);
il5.setVisible(false);
itxtid.setVisible(false);
itxtname.setVisible(false);
itxtno.setVisible(false);
itxtplace.setVisible(false);
itxttotal.setVisible(false);
jc.setVisible(false);
sl6.setVisible(false);
inl6.setVisible(false);
dl6.setVisible(false);

}

if(e.getSource() == delete){
//con=DriverManager.getConnection("jdbc:odbc:newc");
txtn.setVisible(false);

txtpass.setVisible(false);
login.setVisible(false);
home.setVisible(true);
l1.setVisible(false);
l2.setVisible(false);
l3.setVisible(false);
singup.setVisible(false);
insert.setVisible(false);
delete.setVisible(false);
register.setVisible(false);
home.setVisible(true);
ibtnDelete.setVisible(true);
ibtnInsert.setVisible(false);
//singup.setVisible(false);
register.setVisible(false);
il1.setVisible(true);
jc.setVisible(true);
il2.setVisible(false);
il3.setVisible(false);
il4.setVisible(false);
il5.setVisible(false);
itxtid.setVisible(false);
itxtname.setVisible(false);
itxtno.setVisible(false);
itxtplace.setVisible(false);
itxttotal.setVisible(false);
try
{

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

System.out.println("Driver registered successfully");
con=DriverManager.getConnection("jdbc:odbc:newc");

Statement st= con.createStatement();
ResultSet rs1= st.executeQuery("select id from details");

while(rs1.next())
{
String a=rs1.getString(1);
jc.addItem(a);
}
}
catch(Exception e2)
{
System.out.println("Error in driver registration...");
}
}

if(e.getSource() == singup){
//con=DriverManager.getConnection("jdbc:odbc:newc");

txtn.setVisible(true);
txtpass.setVisible(true);
login.setVisible(true);
home.setVisible(true);
insert.setVisible(false);
delete.setVisible(false);
ibtnDelete.setVisible(false);
ibtnInsert.setVisible(false);
singup.setVisible(false);
register.setVisible(false);
il1.setVisible(false);
il2.setVisible(false);
il3.setVisible(false);
il4.setVisible(false);
il5.setVisible(false);
itxtid.setVisible(false);
itxtname.setVisible(false);
itxtno.setVisible(false);
itxtplace.setVisible(false);
itxttotal.setVisible(false);
l1.setText("<html><b style='font-size: 15px; padding:25px'>Enter User ID<b></html>");
l2.setText("<html><b style='font-size: 15px; padding:25px'>Enter Password<b></html>");
l1.setVisible(true);
l2.setVisible(true);
l3.setVisible(true);

}
if(e.getSource() == insert){
il1.setVisible(true);

il2.setVisible(true);
il3.setVisible(true);
il4.setVisible(true);
il5.setVisible(true);
itxtid.setVisible(true);
itxtname.setVisible(true);
itxtno.setVisible(true);
itxtplace.setVisible(true);
itxttotal.setVisible(true);
ibtnInsert.setVisible(true);
home.setVisible(true);
singup.setVisible(false);
insert.setVisible(false);
delete.setVisible(false);

}
if(e.getSource() == login){

txtn.setVisible(true);
txtpass.setVisible(true);
login.setVisible(true);
home.setVisible(true);
ibtnDelete.setVisible(false);
ibtnInsert.setVisible(false);
singup.setVisible(false);
register.setVisible(false);
il1.setVisible(false);
il2.setVisible(false);
il3.setVisible(false);
il4.setVisible(false);
il5.setVisible(false);
itxtid.setVisible(false);
itxtname.setVisible(false);
itxtno.setVisible(false);
itxtplace.setVisible(false);
itxttotal.setVisible(false);
l1.setText("Enter User ID");
l2.setText("Enter Password");
l1.setText("Enter User ID");
l2.setText("Enter Password");
String uid= txtn.getText();
String pwd1=txtpass.getText();

try
{
con=DriverManager.getConnection("jdbc:odbc:newc"); 
PreparedStatement ps= con.prepareStatement("select count(*) from login where userid=? and password=?");
ps.setString(1,uid);
ps.setString(2,pwd1);
ResultSet rs=ps.executeQuery();
int n=0;
while(rs.next())
{
n=Integer.parseInt(rs.getString(1));
}
if(n!=0)
sl6.setText("Logged in successfully");
else
sl6.setText("Not a valid user");
con.close();
}
catch(SQLException e1)
{}
}

if(e.getSource() == ibtnInsert){
try
{
int id=Integer.parseInt(itxtid.getText());
String name=itxtname.getText();
int no=Integer.parseInt(itxtno.getText());
int total=Integer.parseInt(itxttotal.getText());
con=DriverManager.getConnection("jdbc:odbc:newc");
PreparedStatement ps= con.prepareStatement("insert into details values(?,?,?,?,?)");
ps.setInt(1,id);
ps.setString(2,name);
ps.setInt(3,no);
ps.setString(4,place);
ps.setInt(5,total);
ps.executeUpdate();
inl6.setVisible(true);
inl6.setText("Record Sucessfully inserted");
con.close();
}
catch(SQLException e1)
{
inl6.setText("Error in inserting Rechord");
}
}
if(e.getSource() == ibtnDelete){
try
{

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

System.out.println("Driver registered successfully");
con=DriverManager.getConnection("jdbc:odbc:newc");

Statement st= con.createStatement();
ResultSet rs1= st.executeQuery("select id from details");

while(rs1.next())
{
String a=rs1.getString(1);
jc.addItem(a);
}
}
catch(Exception e2)
{
System.out.println("Error in driver registration...");
}
try
{
con=DriverManager.getConnection("jdbc:odbc:newc");
l3.setVisible(true);
l3.setText("Select your tour ID");
dl6.setVisible(true);

PreparedStatement ps= con.prepareStatement("delete from details where id=?");
ps.setInt(1,jid);
ps.executeUpdate();
dl6.setText("Record Sucessfully deleted");
con.close();
}
catch(SQLException e1)
{
dl6.setText("Error in deleting Rechord");
}
}
}
public static void main(String args[])
{
tour f1= new tour();
f1.setSize(285,430);
f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f1.getContentPane().setBackground(Color.PINK);
f1.setVisible(true);
}
}