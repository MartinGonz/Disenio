package tp0B;

import org.geotools.referencing.GeodeticCalculator;
import java.awt.geom.Point2D;

public abstract class POI {
	private Coordenadas coordenadas;
	private Ubicacion ubicacion;
	private String nombre;
	private String descripcion;
	private String tipo;
	
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
	
	void setTipo(String tipo){
		this.tipo = tipo;
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
	
	public POI(String nombre, double latitud, double longitud, String calle, int numero){
		this.nombre = nombre;
		this.coordenadas = new Coordenadas(latitud, longitud);
		this.ubicacion = new Ubicacion(calle, numero);
	}
	
	public boolean estaAMenosDe(double metros, POI unPOI){
		final GeodeticCalculator calc = new GeodeticCalculator();
		final Point2D estePOI = new Point2D.Double(this.getCoordenadas().getLatitud(), this.getCoordenadas().getLongitud()); //acá va el getCoordenadas() o directamente coordenadas?
	    final Point2D otroPOI = new Point2D.Double(unPOI.getCoordenadas().getLatitud(), unPOI.getCoordenadas().getLongitud());
	    calc.setStartingGeographicPoint(estePOI);
	    calc.setDestinationGeographicPoint(otroPOI);
	    double distancia = calc.getOrthodromicDistance();
	    if(distancia < metros){
	    	return true;
	    }
	    return false;
	}
	
	//seria un boolean. pero con el constructor esto ya no estaria cubierto?
	public void esValido(){
		
	}
}
