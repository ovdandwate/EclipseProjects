package newJDBC;
import java.util.*;
import java.sql.*;

public class jdbcpract {
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the address");
		String add=sc.next();
		System.out.println("Enter the city");
		String city=sc.next();
		System.out.println("Enter the username");
		String username=sc.next();
		System.out.println("Enter the password");
		try {
		Class.forName("com.mysql.jdbc.Driver");  
		System.out.println("class loaded");
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/nilesh","root","root");    
		Statement st=con.createStatement();
	    String sql="insert into infosys values()";
	    st.executeUpdate(sql);
		}
		catch(Exception e){
			System.out.println(e);
			
		}
}
	}
