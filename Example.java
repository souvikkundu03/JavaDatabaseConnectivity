package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;

public class Example {

	public static void main(String[] args) throws SQLException {
		PreparedStatement ps = null;
//		ResultSet rs = null;
		try {
			String url = "jdbc:mysql://localhost:3306/webtechdb";
			Connection connection = DriverManager.getConnection(url, "root", "Souvik#1234");
			System.out.println("connected");
			
			ps = connection.prepareStatement("insert into webtechdb.student values(?, ?, ?)");
			ps.setString(1, "Biryani");
			ps.setInt(2, 101);
			ps.setInt(3, 200);
			ps.executeUpdate();
			System.out.println("Values inserted");
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
