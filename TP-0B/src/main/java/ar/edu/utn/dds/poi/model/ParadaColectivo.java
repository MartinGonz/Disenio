package ar.edu.utn.dds.poi.model;

import org.joda.time.DateTime;

public class ParadaColectivo extends POI {
//	public ParadaColectivo(String nombre, String descripcion, double latitud, double longitud, String calle, int numero,
//			String calle1, String calle2, int piso, int depto, int unidad, int codigoPostal, String localidad,
//			String barrio, String provincia, String pais) {
//		super(nombre, descripcion, latitud, longitud, calle, numero, calle1, calle2, piso, depto, unidad, codigoPostal,
//				localidad, barrio, provincia, pais);
//		// TODO Auto-generated constructor stub
//		}
	
	public ParadaColectivo(String nombre, double latitud, double longitud, String calle, int numero){
		super(nombre, latitud, longitud, calle, numero);
		setTipo("Parada de colectivo");
		setCercania(1);
	}
	
	public boolean estaDisponible(DateTime momento){
		return true;
	}

}
	
	


