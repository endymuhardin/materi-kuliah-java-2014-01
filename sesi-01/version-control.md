# Penggunaan Git #

## Membuat Repository Lokal ##

* Perintah : `git init <nama-folder>`
* Contoh : `git init pemrograman-4`
* Hasil : akan terbentuk folder `pemrograman-4`. Di dalamnya ada hidden folder bernama `.git`

## Menambah file ke staging area ##

* Perintah : `git add namafile`, atau `git add .` untuk menambah semua file/folder secara rekursif
* Hasil : file akan didaftarkan di staging area

## Melihat kondisi/posisi file ##

* Perintah : `git status`
* Output:

    # On branch master
    # Untracked files:
    #   (use "git add <file>..." to include in what will be committed)
    #
    #	sesi-01/

* Penjelasan : ada satu folder yang belum di-manage oleh Git
* Output:

    # On branch master
    # Changes to be committed:
    #   (use "git reset HEAD <file>..." to unstage)
    #
    #	new file:   sesi-01/version-control.md
    #

* Penjelasan : ada satu file yang sudah terdaftar di staging area (changes to be committed)
