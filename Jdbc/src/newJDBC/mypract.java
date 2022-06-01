package newJDBC;
import java.sql.*;
import java.util.Scanner;

public class mypract 
{

	public static void main(String[] args) 
{	 
	try 
		{
			Class.forName("com.mysql.jdbc.Driver");  
			System.out.println("class loaded");
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/nilesh","root","root"); 
			System.out.println("Connection successful");
			
		    String sql="insert into infosys values(name,add,city)";
		    Scanner sc=new Scanner(System.in);
			System.out.println("Enter the name");
			String name=sc.next();
			System.out.println("Enter the address");
			String add=sc.next();
			System.out.println("Enter the city");
			String city=sc.next();
		    
		    String sql2="insert into infosys1 values(username,password)";
		    System.out.println("Enter the username");
			String username=sc.next();
			System.out.println("Enter the password");
			String password=sc.next();
		    
		    PreparedStatement st=con.prepareStatement(sql);
		    PreparedStatement st2=con.prepareStatement(sql2);
		    st.executeUpdate(sql);
		    st.executeUpdate(sql2);
		    ResultSet rs=st.executeQuery();
		    con.close();
		    st.close();
		    System.out.println("Connection close successful");
			}
			catch(Exception e)
			 {
				System.out.println(e.getMessage());
			}
}
}
	