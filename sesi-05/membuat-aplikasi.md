# Membuat Aplikasi #

Langkah-langkah membuat aplikasi 

1. Membuat Daftar Fitur
2. Membuat UI Mockup
3. Membuat Skema Database
4. Implementasi Pemrograman
5. User Acceptance Test
6. Go Live

Tools / Software
* Text Editor
* UI Mockup : [Pencil](http://pencil.evolus.vn/)
* [MySQL Workbench](http://www.mysql.com/products/workbench/)


## Membuat Daftar Fitur ##

Untuk aplikasi bisnis, pada umumnya daftar fitur bisa dikelompokkan menjadi beberapa kategori:

* Master Data : data referensi. Misalnya kabupaten, tingkat pendidikan, kategori, customer, karyawan, dsb. Biasanya master data menjadi combo pada saat mengisi form. Identifikasi master data yang dibutuhkan biasanya diketahui pada saat membuat desain screen transaksi

* Transaksi : proses bisnis utama. Contoh: penjualan, barang masuk, peminjaman, pengembalian, dsb. Biasanya fitur transaksi ini yang pertama kita definisikan.

* Laporan : rekap transaksi. Biasanya bisa digrouping berdasarkan tanggal, produk, karyawan, supplier, customer, dsb. Selain itu biasa juga disediakan fitur search transaksi. Hasil rekap biasanya kita sediakan fitur untuk diekspor menjadi PDF, XLS, CSV, dan sebagainya.

* Konfigurasi / Personalisasi. Contohnya: ganti password, ganti email, transaksi favorit. 

* Administrasi / Utilitas. Contohnya: backup data, restore. 

## Membuat UI Mockup ##

Jenis-jenis screen:

* Form Input Sederhana
* List / Tabel 
* Form Header Detail
* Lookup Dialog

### Form Input Sederhana ###

Hal yang harus diperhatikan:

* Perhatikan penggunaan input pilihan (radio, combo, checkbox). Kalau jumlah pilihan 2-4 gunakan radio button. Kalau 5 - 10 gunakan combo. Lebih dari 10, gunakan lookup dialog.
* Validasi numerik.
* Pesan error di sebelah input field, kata-katanya singkat dan jelas.
* Validasi di sisi server supaya secure. Kita tidak bisa percaya apa yang disubmit client. Bisa saja validasi client di-disable/tidak bisa dijalankan, data diubah di tengah jalan, dan berbagai kemungkinan lainnya.
* Validasi di sisi client supaya cepat dan nyaman. User tidak perlu menunggu data dikirim ke server dan pesan error dikembalikan untuk mengetahui kesalahan dalam pengisian data

### List / Tabel ###

Hal yang harus diperhatikan:

* Pagination. First, Prev, 1,2,3, Next, Last
* Search
* Sorting
* Selection

### Form Header Detail ###

Kebiasaan yang umum dilakukan:

* Isian header

    * Tanggal (sesuai jam sistem)
    * Nomer Transaksi (auto generate, dengan format)
    * User (sesuai yang sedang login)
    * Customer / Penerima / Vendor (lookup dialog)

* Isian detail

    * pilih produk/barang dengan lookup dialog
    * quantity (diisi)
    * unit price (read-only)
    * hitung subtotal (tidak disimpan di database)
    * opsi edit/hapus

* Summary dan tambahan lain

    * total
    * diskon
    * pajak

### Lookup Dialog ###

* Muncul dari screen induk (parent)
* Digunakan untuk mencari dan memilih
* Setelah dipilih, tutup dan kembali ke screen induk

### Konfigurasi / Personalisasi ###

Hal yang biasa dipersonalisasi:

* Nama perusahaan
* Alamat perusahaan
* Nama dan jabatan PIC yang tandatangan
* Format penomoran dokumen/transaksi
* Periode pelaporan
* Password, email, alamat, foto, dan informasi pribadi user lainnya.
