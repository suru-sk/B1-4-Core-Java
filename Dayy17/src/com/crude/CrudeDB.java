package com.crude;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudeDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL="jdbc:mysql://127.0.0.1:3306/Sample";
		String dbUserName="root";
		String dbPassword="Sinsouhit3";
		try
		{
			Connection c=DriverManager.getConnection(dbURL,dbUserName,dbPassword);
			String sql = "delete from Employee user_name=?,password=? where user_id=?";
			
			PreparedStatement p=c.prepareStatement(sql);
			p.setString(1, "101");
			
			int rows=p.executeUpdate();
			if(rows>0)
			{
				System.out.print("An Exisiting userupdated successfully");
			}
			c.close();
			/*String sql = "select * from Employee";
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery(sql);
			
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String pass=rs.getString(3);
				String email=rs.getString("email");
				String res="User: %d: %s - %s - %s";
				System.out.println(String.format(res,id, name, pass, email));
			}
			c.close();
		}*/
			PreparedStatement p1= c.prepareStatement(sql);
			p1.setString(1, "101");
			p1.setString(2, "Soujan Poojari");
			p1.setString(3, "souj123");
			p1.setString(4, "soujansp5@gmail.com");
			int row = p1.executeUpdate();
			if(row>0) {
				System.out.println("New user Added");
			}
			 c.close();
				
				
				
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
			
}
}