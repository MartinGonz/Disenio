package tp0B;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class CGPTest {

	private CGP CGPprueba;
	private DateTime prueba;
	
	@Before
	public void inicializarEscenario(){
		CGPprueba = new CGP("CGP Prueba", -34.659928, -58.468346, "Mozart", 2392);
		CGPprueba.agregarServicio("rentas");
		CGPprueba.agregarIntervaloAServicio("rentas", "lunes", 10, 00, 17, 00);
		CGPprueba.agregarServicio("multas");
		CGPprueba.agregarIntervaloAServicio("multas", "martes", 14, 00, 18, 00);
		prueba = new DateTime(2016, 6, 27, 11, 00); //un lunes
	}
	
	@Test
	public void estaDisponibleTest(){
		Assert.assertTrue(CGPprueba.estaDisponible(prueba, ""));
	}
	
	@Test
	public void estaDisponibleTest2(){
		Assert.assertFalse(CGPprueba.estaDisponible(prueba, "multas"));
	}

}
