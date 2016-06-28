package ar.edu.utn.dds.poi.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.joda.time.DateTime;

public class SucursalBanco extends POI {
	
	private List<Intervalo> intervalos = new ArrayList<Intervalo>();
	
//	public SucursalBanco(String nombre, String descripcion, double latitud, double longitud, String calle, int numero,
//			String calle1, String calle2, int piso, int depto, int unidad, int codigoPostal, String localidad,
//			String barrio, String provincia, String pais) {
//		super(nombre, descripcion, latitud, longitud, calle, numero, calle1, calle2, piso, depto, unidad, codigoPostal,
//				localidad, barrio, provincia, pais);
//		// TODO Auto-generated constructor stub
//	}
	
	public SucursalBanco(String nombre, double latitud, double longitud, String calle, int numero){
		super(nombre, latitud, longitud, calle, numero);
		setTipo("Sucursal de banco");
		inicializarIntervalos();
	}
	
	public void agregarIntervalo(String dia, int horaDesde, int minutoDesde, int horaHasta, int minutoHasta){
		Intervalo intervalo = new Intervalo(dia, horaDesde, minutoDesde, horaHasta, minutoHasta);
		intervalos.add(intervalo);
	}
	
	public void inicializarIntervalos(){
		agregarIntervalo("lunes", 10, 00, 15, 00);
		agregarIntervalo("martes", 10, 00, 15, 00);
		agregarIntervalo("miércoles", 10, 00, 15, 00);
		agregarIntervalo("jueves", 10, 00, 15, 00);
		agregarIntervalo("viernes", 10, 00, 15, 00);
	}
	
	public boolean estaDisponible(DateTime momento){
		boolean disponible = false;
		Iterator<Intervalo> iter = intervalos.iterator();
		Intervalo intervalo;
		while (iter.hasNext()){
			intervalo = iter.next();
			disponible = intervalo.contiene(momento);
			if(disponible)
				return disponible;
		}
		return disponible;
	}

}
