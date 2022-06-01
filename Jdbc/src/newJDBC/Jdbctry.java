package newJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbctry {

	public static void main(String[] args) throws ClassNotFoundException, SQLException { 
			Class.forName("com.mysql.jdbc.Driver");  
			System.out.println("class loaded");
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/nilesh","root","root");    
			Statement stmt=con.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Write your query");
			String b=sc.nextLine();
		    stmt.executeUpdate(b);
		    System.out.println("updated successfully");
			String a="select * from nilesh;";
			ResultSet rs=stmt.executeQuery(a);  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			con.close();
			System.out.println("Connection close");
			

	}

}
