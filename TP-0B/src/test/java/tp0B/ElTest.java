package tp0B;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class ElTest {

	private ParadaColectivo parada1;
	private ParadaColectivo parada2;
	
	@Before
	public void inicializarEscenario(){
		parada1 = new ParadaColectivo("Parada1", "Una parada preciosa", -34.674809, -58.503274, "Calle 1", 12, "Calle2", "Calle 3", 0, 0, 0, 0, "Cheapsick", "London", "England", "UK");
		parada2 = new ParadaColectivo("Parada2", "Una parada horrible", -34.683985, -58.516964, "Calle 9", 12, "Calle8", "Calle 7", 0, 0, 0, 0, "Queens", "Manhattan", "New York", "USA");
	}
	
	@Test
	public void parada1EstaAMenosde1000MtsDeParada2(){
		boolean estaAMenosDeMilMetros = parada1.estaAMenosDe(1000, parada2);
		Assert.assertFalse(estaAMenosDeMilMetros);
		
	}
	
	public void esParadaDeColectivo(){
		String tipoDePOI = parada1.getTipo();
		Assert.assertEquals("Parada de colectivo", tipoDePOI);
	}

}
