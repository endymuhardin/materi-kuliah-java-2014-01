package com.muhardin.endy.belajar;

import java.sql.*;

public class App {
    public static void main( String[] args ) throws Exception {
		// 0. Variabel Koneksi
		String dbDriver = "com.mysql.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost/belajarjava";
		String dbUsername = "root";
		String dbPassword = "";
		
		// 1. Load library database
		Class.forName(dbDriver);
		
		// 2. Connect ke database
		Connection koneksi = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		
		// 3. Insert Data
		String sql = "insert into t_user ";
		sql += "(username, email, name) values ";
		sql += "(?, ?, ?)";
		
		PreparedStatement stm = koneksi.prepareStatement(sql);
		stm.setString(1, "ari");
		stm.setString(2, "ari.prasasti@gmail.com");
		stm.setString(3, "Ari Prasasti");
		
		stm.executeUpdate();
		
		
		// 4. Query Select
		String sqlSelect = "select *from t_user";
		PreparedStatement stmSelect = koneksi.prepareStatement(sqlSelect);
		ResultSet rs = stmSelect.executeQuery();
		while(rs.next()){
			System.out.println("ID :" +rs.getInt("id"));
			System.out.println("Username : "+rs.getString("username"));
			System.out.println("Email : "+rs.getString("email"));
			System.out.println("Nama : "+rs.getString("name"));
		}
		rs.close();
		
		
		// 5. Disconnect
		koneksi.close();
    }
}
