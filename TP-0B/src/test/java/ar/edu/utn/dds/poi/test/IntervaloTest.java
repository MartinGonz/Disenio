package ar.edu.utn.dds.poi.test;

import org.junit.Before;
import org.junit.Test;

import ar.edu.utn.dds.poi.model.Intervalo;

import org.joda.time.DateTime;
import org.junit.Assert;

public class IntervaloTest {

	DateTime prueba;
	private Intervalo intervalo;
	
	@Before
	public void inicializarEscenario(){
		prueba = new DateTime(2016, 6, 27, 11, 00); //un lunes
		intervalo = new Intervalo("lunes", 10, 00, 15, 00);
	}
	
	@Test
	public void estaAquiTest(){
		Assert.assertTrue(intervalo.contiene(prueba));
	}
	
	@Test
	public void compararDia(){
		Assert.assertTrue(intervalo.compararDia(prueba));
	}
	
	@Test
	public void compararIntervalo(){
		Assert.assertTrue(intervalo.compararIntervalo(prueba));
	}

}
