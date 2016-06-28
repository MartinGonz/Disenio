package ar.edu.utn.dds.poi.test;

import org.junit.Before;
import org.junit.Test;

import ar.edu.utn.dds.poi.model.SucursalBanco;

import org.joda.time.DateTime;
import org.junit.Assert;

public class SucursalBancoTest {

	private SucursalBanco unBanco;
	private DateTime momento1;
	private DateTime momento2;
	private double latitudCerca;
	private double longitudCerca;
	private double latitudLejos;
	private double longitudLejos;
	//para el banco la cercanía es de 5 cuadras
	
	@Before
	public void inicializarEscenario(){
		latitudCerca = -34.661765; //tres cuadras alejado del banco
		longitudCerca = -58.470755;
		latitudLejos = -34.668401; // más de 7 cuadras alejado del banco
		longitudLejos = -58.476634;
		unBanco = new SucursalBanco("Banco Galicia", -34.659928, -58.468346, "Mozart", 2392);
		momento1 = new DateTime(2016, 6, 27, 11, 00); //lunes
		momento2 = new DateTime(2016, 6, 26, 11, 00); //domingo
	}
	
	@Test
	public void estaCercaTest1(){
		Assert.assertTrue(unBanco.estaCerca(latitudCerca, longitudCerca));
	}
	
	@Test
	public void estaCercaTest2(){
		Assert.assertFalse(unBanco.estaCerca(latitudLejos, longitudLejos));
	}
	
	@Test
	public void estaDisponibleTest1(){
		Assert.assertTrue(unBanco.estaDisponible(momento1));
	}
	
	@Test
	public void estaDisponibleTest2(){
		Assert.assertFalse(unBanco.estaDisponible(momento2));
	}
}
