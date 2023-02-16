package br.ce.wcaquino.servicos;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;


public class AssertTest {
	
	@Test
	public void test () {
		
		assertTrue(true);
		assertFalse(false);
		
		int i = 5;
		Integer i2 = 5;
		
		Assert.assertEquals("bola", "bola");
		Assert.assertNotEquals("bola", "casa");
		Assert.assertTrue("bola".equalsIgnoreCase("Bola"));
		Assert.assertTrue("bola".startsWith("bo"));
		
		Usuario u1 = new Usuario("Usuario 1");
		Usuario u2 = new Usuario("Usuario 1");
		Usuario u3 = null;
		
		Assert.assertEquals(u1, u2);
		Assert.assertSame(u2, u2);
		
		Assert.assertNotNull(u2);
		Assert.assertNull(u3);
		
		
		
		
		
	}

}
