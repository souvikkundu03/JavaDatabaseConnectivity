package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws SQLException{
		PreparedStatement ps = null;
		ResultSet rs = null;
		CallableStatement cs = null;
		try {
			System.out.println("Hello..........");
			String url = "jdbc:mysql://localhost:3306/webtechdb";
			Connection connection = DriverManager.getConnection(url, "root", "Souvik#1234");
			System.out.println("Connected");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
