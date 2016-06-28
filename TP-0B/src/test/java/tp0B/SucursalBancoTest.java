package tp0B;

import org.junit.Before;
import org.junit.Test;
import org.joda.time.DateTime;
import org.junit.Assert;

public class SucursalBancoTest {

	private SucursalBanco unBanco;
	DateTime prueba;
	
	@Before
	public void inicializarEscenario(){
		unBanco = new SucursalBanco("Banco Galicia", -34.659928, -58.468346, "Mozart", 2392);
		prueba = new DateTime(2016, 6, 26, 11, 00); //domingo
	}
	
	@Test
	public void estaDisponibleTest(){
		Assert.assertFalse(unBanco.estaDisponible(prueba));
	}
}
