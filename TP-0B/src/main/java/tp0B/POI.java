package tp0B;

import org.geotools.referencing.GeodeticCalculator;
import java.awt.geom.Point2D;

public abstract class POI {
	Coordenadas coordenadas;
	Ubicacion ubicacion;
	String nombre;
	String descripcion;
	String tipo;
	
	Coordenadas getCoordenadas(){
		return coordenadas;
	}
	
	Ubicacion getUbicacion(){
		return ubicacion;
	}
	
	String getNombre(){
		return nombre;
	}
	
	String getDescripcion(){
		return descripcion;
	}
	
	String getTipo(){
		return tipo;
	}
	
	public POI(String nombre, String descripcion, double latitud, double longitud,
			   String calle, int numero, String calle1, String calle2, int piso, int depto, int unidad,
			   int codigoPostal, String localidad, String barrio, String provincia, String pais){ 
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.coordenadas = new Coordenadas(latitud, longitud);
		this.ubicacion = new Ubicacion(calle, numero, calle1, calle2, piso, depto, unidad,
				 					   codigoPostal, localidad, barrio, provincia, pais);
		
	}
	
	public boolean estaAMenosDe(double metros, POI unPOI){
		double latitudOtroPOI = unPOI.getCoordenadas().latitud;
		double longitudOtroPOI = unPOI.getCoordenadas().longitud;
		final GeodeticCalculator calc = new GeodeticCalculator();
		final Point2D estePOI = new Point2D.Double(this.coordenadas.latitud, this.coordenadas.longitud);
	    final Point2D otroPOI = new Point2D.Double(latitudOtroPOI, longitudOtroPOI);
	    calc.setStartingGeographicPoint(estePOI);
	    calc.setDestinationGeographicPoint(otroPOI);
	    double distancia = calc.getOrthodromicDistance();
	    if(distancia < metros){
	    	return true;
	    }
	    return false;
	}
}
