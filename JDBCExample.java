package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample {

	static PreparedStatement ps = null;
	static ResultSet rs = null;

	public static void createTable(PreparedStatement ps, Connection connection) throws SQLException {
		ps = connection.prepareStatement(
				"create table employee(name varchar(20), id int primary key, dept varchar(10))");
		ps.execute();
		System.out.println("created");
	}

	public static void insertValues(PreparedStatement ps, Connection connection) throws SQLException {
		ps = connection.prepareStatement("insert into webtechdb.employee values(?, ?, ?)");
		ps.setString(1, "Souvik");
		ps.setInt(2, 150);
		ps.setString(3, "Developer");
		ps.execute();
		System.out.println("Values inserted");

	}

	public static void retieveValues(ResultSet rs, Connection connection) throws SQLException {
		String query = "select * from employee";
		PreparedStatement ps = connection.prepareStatement(query);
		rs = ps.executeQuery();

		System.out.println("Data: ");
		System.out.println("=========================================");
		while (rs.next()) {
			System.out.println("Name:      " + rs.getString(1));
			System.out.println("ID:        " + rs.getInt(2));
			System.out.println("DEPT:	   " + rs.getString(3));
			System.out.println("=========================================");

		}

	}

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:mysql://localhost:3306/webtechdb";
		Connection connection = DriverManager.getConnection(url, "root", "Souvik#1234");
		System.out.println("Database Connected Successfully....\n");

//			createTable(ps, connection);
//			insertValues(ps, connection);
			retieveValues(rs, connection);
		connection.close();
	}
}
