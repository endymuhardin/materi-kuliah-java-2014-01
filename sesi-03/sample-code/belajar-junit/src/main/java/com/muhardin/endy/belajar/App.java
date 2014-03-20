package com.muhardin.endy.belajar;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        
        Kalkulator k = new Kalkulator();
        Integer hasil = k.tambah(3,4);
        System.out.println("Hasil : "+hasil);
    }
}
