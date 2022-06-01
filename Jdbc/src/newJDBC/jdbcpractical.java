package newJDBC;

import java.sql.*;
import java.util.*;

public class jdbcpractical {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");  
		System.out.println("class loaded");
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/nilesh","root","root");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username");
		String a=sc.next();
		
		String sql="insert into one ()";
		PreparedStatement st=con.prepareStatement(sql);
		st.setString(1,a);
		st.execute();
		con.close();
		System.out.println("insert record successful");
        st.close();
	}

}
