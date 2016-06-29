package ar.edu.utn.dds.poi.test;


import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import ar.edu.utn.dds.poi.model.LocalComercial;
import ar.edu.utn.dds.poi.model.MotorBusqueda;
import ar.edu.utn.dds.poi.model.POI;
import ar.edu.utn.dds.poi.model.Rubro;

public class BuscadorTest<calesita2> {
	
	private MotorBusqueda busPrueba;
	private Rubro carrousel;
	private LocalComercial calesita1;
	private LocalComercial calesita2;
	private POI[] pois = new POI[2];
	
	
	@Before
	public void inicializarEscenario(){
		carrousel = new Rubro(7);
		calesita1 = new LocalComercial("Calesita Feliz", -34.659928, -58.468346, "Mozart", 2392, carrousel);
		calesita2 = new LocalComercial("Otra Calesita Feliz",-35,-58,"Hola",2500,carrousel);
		pois[0] = (calesita1);
		pois[1] = (calesita2);		
		String clave = new String();
		clave = "Otra";
		
	}

	@Test
	public void busquedaPrueba(){
		Assert.assertEquals(busPrueba.Busqueda(pois),(pois[2]));
		}
	
	
}
