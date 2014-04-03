# JDBC #

Java Database Connectivity

Langkah-langkah mengakses database di Java:

1. Tambahkan library sesuai merek dan tipe database
2. Connect ke database
3. Lakukan query
4. Proses hasilnya
5. Disconnect

## Library Koneksi Database ##
Untuk bisa terkoneksi ke database, kita harus menggunakan library yang disediakan oleh database yang ingin kita gunakan. Misalnya, untuk database MySQL, kita gunakan Connector-J[sesuai dokumentasi di websitenya](http://dev.mysql.com/doc/index-connectors.html)

Di Maven, Connector-J kita tambahkan dengan deklarasi dependensi berikut

	<dependency>
		<groupId>mysql</groupId>
		<artifactId>mysql-connector-java</artifactId>
		<version>5.1.30</version>
	</dependency>

	