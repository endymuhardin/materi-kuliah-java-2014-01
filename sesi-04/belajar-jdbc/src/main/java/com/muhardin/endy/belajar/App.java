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
		sql += "('endy', 'endy.muhardin@gmail.com', 'Endy Muhardin')";
		
		PreparedStatement stm = koneksi.prepareStatement(sql);
		stm.executeUpdate();
		
		// 4. Disconnect
		koneksi.close();
    }
}
