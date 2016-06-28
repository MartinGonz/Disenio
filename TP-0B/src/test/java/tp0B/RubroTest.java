package tp0B;

import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RubroTest {

	private Rubro carrousel;
	DateTime prueba;
	DateTime prueba2;
	
	@Before
	public void inicializarEscenario(){
		carrousel = new Rubro(7);
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
		prueba = new DateTime(2016, 6, 27, 11, 00); //un lunes
		prueba2 = new DateTime(2016, 6, 27, 15, 00); //un lunes
	}
	
	@Test
	public void estaDisponibleTest(){
		Assert.assertTrue(carrousel.contiene(prueba));
	}
	
	@Test
	public void cantidadIntervalosTest(){
		int cantidadIntervalos = carrousel.cantidadIntervalos();
		Assert.assertEquals(12, cantidadIntervalos);
	}
	
	@Test
	public void estaDisponible2Test(){
		Assert.assertFalse(carrousel.contiene(prueba2));	
	}
}
