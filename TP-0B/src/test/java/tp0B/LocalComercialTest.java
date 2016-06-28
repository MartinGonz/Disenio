package tp0B;

import org.junit.Before;
import org.junit.Test;
import org.joda.time.DateTime;
import org.junit.Assert;

public class LocalComercialTest {

	private Rubro libreriaEscolar;
	private LocalComercial libreriaPapiro;
	private Rubro carrousel;
	private LocalComercial unaCalesita;
	DateTime prueba;
	
	@Before
	public void inicializarEscenario(){
		libreriaEscolar = new Rubro(5);
		libreriaPapiro = new LocalComercial("Papiro", -34.659928, -58.468346, "Mozart", 2392, carrousel);
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
		unaCalesita = new LocalComercial("Calesita Feliz", -34.659928, -58.468346, "Mozart", 2392, carrousel);
		prueba = new DateTime(2016, 6, 27, 11, 00); //un lunes
	}
	
	@Test
	public void estaDisponibleTest(){
		Assert.assertTrue(unaCalesita.estaDisponible(prueba));
	}

}
