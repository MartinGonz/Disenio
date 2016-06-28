package tp0B;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class CGPTest {

	private CGP CGPprueba;
	private DateTime prueba;
	private Ciudad buenosAires;
	public Comuna comuna1; //esta el cgp aqui
	public Comuna comuna2;
	
	@Before
	public void inicializarEscenario(){
		buenosAires = new Ciudad("Buenos Aires");
		comuna1 = new Comuna("Comuna 1");
		comuna1.agregarPuntoAPoligono(-34.674504, -58.466331);
		comuna1.agregarPuntoAPoligono(-34.660244, -58.450688);
		comuna1.agregarPuntoAPoligono(-34.642109, -58.477612);
		comuna1.agregarPuntoAPoligono(-34.653844, -58.489167);
		comuna2 = new Comuna("Comuna 2");
		comuna2.agregarPuntoAPoligono(-34.564941, -58.477927);
		comuna2.agregarPuntoAPoligono(-34.556742, -58.465117);
		comuna2.agregarPuntoAPoligono(-34.565568, -58.458385);
		comuna2.agregarPuntoAPoligono(-34.575471, -58.477118);
		buenosAires.agregarComuna(comuna1);
		buenosAires.agregarComuna(comuna2);
		
		CGPprueba = new CGP("CGP Prueba", -34.659928, -58.468346, "Mozart", 2392);
		CGPprueba.ciudad = buenosAires;
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

	@Test
	public void estaCerca(){
		Assert.assertTrue(CGPprueba.estaCerca(-34.660866, -58.467713));
	}
}
