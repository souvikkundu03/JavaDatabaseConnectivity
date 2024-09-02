package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/webtechdb";
			Connection connection = DriverManager.getConnection(url, "root", "Souvik#1234");
			System.out.println("connected");

		}
		 catch (Exception e) {
				e.printStackTrace();
			}
	}
}
