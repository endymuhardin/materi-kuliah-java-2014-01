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
}