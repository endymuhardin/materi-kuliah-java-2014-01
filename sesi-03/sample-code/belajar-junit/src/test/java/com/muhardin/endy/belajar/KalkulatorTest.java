package com.muhardin.endy.belajar;

import org.junit.Test;
import static org.junit.Assert.*;

public class KalkulatorTest {
	@Test
	public void testTambah(){
		Kalkulator k = new Kalkulator();
        Integer hasil = k.tambah(3,4);
		assertEquals(new Integer(7), hasil);
	}
	
	@Test
	public void testKurang(){
		Kalkulator k = new Kalkulator();
		Integer hasil = k.kurang(3,4);
		assertEquals(new Integer(-1), hasil);
	}
}