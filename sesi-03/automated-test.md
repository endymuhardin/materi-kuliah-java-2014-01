# Automated Test #

Tujuan:
* supaya tidak perlu memeriksa hasil test secara manual
* menjalankan test berulang-ulang

Manfaat:
* test sekali ditulis, terus dijalankan
* regression : bug pada penambahan/perubahan source code
* refactoring : mengubah struktur source code tanpa mengubah fungsi/fitur

Library Automated Testing
* Java : JUnit dan TestNG
* JavaScript : Jasmine dan Karma
* PHP : PHPUnit

## Maven Command ##

* Compile : `mvn clean package`
* Run : `mvn exec:java -Dexec.mainClass=nama.class.lengkap.dengan.package`
* Compile + Run : `mvn clean package exec:java -Dexec.mainClass=nama.class.lengkap.dengan.package`


