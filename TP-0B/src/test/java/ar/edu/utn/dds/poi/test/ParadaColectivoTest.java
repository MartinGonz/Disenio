package ar.edu.utn.dds.poi.test;

import org.junit.Before;
import org.junit.Test;

import ar.edu.utn.dds.poi.model.ParadaColectivo;

import org.joda.time.DateTime;
import org.junit.Assert;

public class ParadaColectivoTest {

	private ParadaColectivo paradaMozart;
	private ParadaColectivo paradaSaraza;
	private double latitudCerca;
	private double longitudCerca;
	private double latitudLejos;
	private double longitudLejos;
	private DateTime momento;
	
	@Before
	public void inicializarEscenario(){
		paradaMozart = new ParadaColectivo("Parada Mozart", -34.659928, -58.468346, "Mozart", 2392);
		paradaSaraza = new ParadaColectivo("Parada Saraza", -34.660866, -58.467713, "Saraza", 4202);
		latitudCerca = -34.660079; //un par de metros alejados de la parada mozart
		longitudCerca =  -58.468108;
		latitudLejos = -34.661765; //tres cuadras alejado de la parada mozart
		longitudLejos = -58.470755;
		momento = new DateTime(2016, 6, 26, 11, 00); //domingo
	}
	
	@Test
	public void paradaMozartEstaAMenosde1000MtsDeParadaSaraza(){
		boolean estaAMenosDeMilMetros = paradaMozart.estaAMenosDe(1000, paradaSaraza);
		Assert.assertTrue(estaAMenosDeMilMetros);
		
	}
	
	@Test
	public void esParadaDeColectivo(){
		String tipoDePOI = paradaMozart.getTipo();
		Assert.assertEquals("Parada de colectivo", tipoDePOI);
	}
	
	@Test
	public void paradaMozartEsValida(){
		boolean validez = paradaMozart.esValido();
		Assert.assertTrue(validez);
		
	}
	
	@Test
	public void estaCercaTest1(){
		Assert.assertTrue(paradaMozart.estaCerca(latitudCerca, longitudCerca));
	}
	
	@Test
	public void estaCercaTest2(){
		Assert.assertFalse(paradaMozart.estaCerca(latitudLejos, longitudLejos));
	}
		
	@Test
	public void estaDisponibleTest(){
		Assert.assertTrue(paradaMozart.estaDisponible(momento));
	}
	
}
