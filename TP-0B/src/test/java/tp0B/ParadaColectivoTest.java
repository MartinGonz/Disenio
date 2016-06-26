package tp0B;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class ParadaColectivoTest {

	private ParadaColectivo paradaMozart;
	private ParadaColectivo paradaSaraza;
	private double latitud;
	private double longitud;
	
	@Before
	public void inicializarEscenario(){
		paradaMozart = new ParadaColectivo("Parada Mozart", -34.659928, -58.468346, "Mozart", 2392);
		paradaSaraza = new ParadaColectivo("Parada Saraza", -34.660866, -58.467713, "Saraza", 4202);
		latitud = -34.660866;
		longitud = -58.467713;
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
	public void estaCercaTest(){
		Assert.assertTrue(paradaMozart.estaCerca(latitud, longitud));
	}

}
