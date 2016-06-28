package tp0B;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.joda.time.DateTime;



public class CGP extends POI {

//	public CGP(String nombre, String descripcion, double latitud, double longitud, String calle, int numero,
//			String calle1, String calle2, int piso, int depto, int unidad, int codigoPostal, String localidad,
//			String barrio, String provincia, String pais) {
//		super(nombre, descripcion, latitud, longitud, calle, numero, calle1, calle2, piso, depto, unidad, codigoPostal,
//				localidad, barrio, provincia, pais);
//		// TODO Auto-generated constructor stub
//	}
	
	private List<Servicio> servicios = new ArrayList<Servicio>();
	
	public CGP(String nombre, double latitud, double longitud, String calle, int numero){
		super(nombre, latitud, longitud, calle, numero);
		setTipo("CGP");
	}
	
	public void agregarServicio(String nombreServicio){
		Servicio servicio = new Servicio(nombreServicio);
		servicios.add(servicio);
	}
	
	public void agregarIntervaloAServicio(String nombreServicio, String dia, int horaDesde, int minutoDesde, int horaHasta, int minutoHasta){
		buscarServicio(nombreServicio).agregarIntervalo(dia, horaDesde, minutoDesde, horaHasta, minutoHasta);
	}
	
	public Servicio buscarServicio(String nombreServicio){
		Iterator<Servicio> iter = servicios.iterator();
		Servicio servicio;
		while (iter.hasNext()){
			servicio = iter.next();
			if(nombreServicio.equals(servicio.getNombre()))
				return servicio;
		}
		return null;
	}
	
	public boolean recorrerServicios(DateTime momento){
		Iterator<Servicio> iter = servicios.iterator();
		Servicio servicio;
		while (iter.hasNext()){
			servicio = iter.next();
			if(servicio.contiene(momento))
				return true;
		}
		return false;
	}
	
	public boolean estaCerca(double latitud, double longitud){
		if(ciudad.estanEnLaMismaComuna(latitud, longitud, this.getCoordenadas().getLatitud(), this.getCoordenadas().getLongitud()))
			return true;
		return false;
	}
	
	public boolean estaDisponible(DateTime momento, String nombreServicio){
		if(nombreServicio.isEmpty())
			return recorrerServicios(momento);
		return buscarServicio(nombreServicio).contiene(momento);
	}
}
