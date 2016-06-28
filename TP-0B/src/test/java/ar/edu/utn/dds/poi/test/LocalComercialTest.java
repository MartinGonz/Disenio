package ar.edu.utn.dds.poi.test;

import org.junit.Before;
import org.junit.Test;

import ar.edu.utn.dds.poi.model.LocalComercial;
import ar.edu.utn.dds.poi.model.Rubro;

import org.joda.time.DateTime;
import org.junit.Assert;

public class LocalComercialTest {

	private Rubro carrousel;
	private LocalComercial unaCalesita;
	private DateTime momento1;
	private DateTime momento2;
	private double latitudCerca;
	private double longitudCerca;
	private double latitudLejos;
	private double longitudLejos;
	
	@Before
	public void inicializarEscenario(){
		latitudCerca = -34.661765; //tres cuadras alejado de la calesita 
		longitudCerca = -58.470755;
		latitudLejos = -34.668401; // más de 7 cuadras alejado de la calesita
		longitudLejos = -58.476634;
		carrousel = new Rubro(7); //cercania = 7 cuadras
		carrousel.agregarIntervalo("lunes", 10, 00, 13, 00);
		carrousel.agregarIntervalo("lunes", 17, 00, 20, 30);
		carrousel.agregarIntervalo("martes", 10, 00, 13, 00);
		carrousel.agregarIntervalo("martes", 17, 00, 20, 30);
		carrousel.agregarIntervalo("miércoles", 10, 00, 13, 00);
		carrousel.agregarIntervalo("miércoles", 17, 00, 20, 30);
		carrousel.agregarIntervalo("jueves", 10, 00, 13, 00);
		carrousel.agregarIntervalo("jueves", 17, 00, 20, 30);
		carrousel.agregarIntervalo("viernes", 10, 00, 13, 00);
		carrousel.agregarIntervalo("viernes", 17, 00, 20, 30);
		carrousel.agregarIntervalo("sábado", 10, 00, 13, 00);
		carrousel.agregarIntervalo("sábado", 17, 00, 20, 30);
		unaCalesita = new LocalComercial("Calesita Feliz", -34.659928, -58.468346, "Mozart", 2392, carrousel);
		momento1 = new DateTime(2016, 6, 27, 11, 00); //un lunes
		momento2 = new DateTime(2016, 6, 27, 15, 00);
	}
	
	@Test
	public void estaCercaTest1(){
		Assert.assertTrue(unaCalesita.estaCerca(latitudCerca, longitudCerca));
	}
	
	@Test
	public void estaCercaTest2(){
		Assert.assertFalse(unaCalesita.estaCerca(latitudLejos, longitudLejos));
	}
	
	@Test
	public void estaDisponibleTest1(){
		Assert.assertTrue(unaCalesita.estaDisponible(momento1));
	}
	
	@Test
	public void estaDisponibleTest2(){
		Assert.assertFalse(unaCalesita.estaDisponible(momento2));
	}
}
