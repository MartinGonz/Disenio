package tp0B;

import java.util.ArrayList;
import java.util.List;

import org.geotools.geometry.jts.JTSFactoryFinder;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.LinearRing;

public class Comuna {
	
	private String nombre;
	private Polygon poligono;
	private List<Coordinate> listaCoordenadas = new ArrayList<Coordinate>();
	private Coordinate[] coords;
	
	public Comuna(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public boolean estaAqui(double latitud, double longitud){
	    GeometryFactory geometryFactory = JTSFactoryFinder.getGeometryFactory();
	    Coordinate coord = new Coordinate(latitud, longitud);
	    Point terminal = geometryFactory.createPoint(coord);
		if(poligono.contains(terminal))
			return true;
		return false;
	}
	
	public void agregarPuntoAPoligono(double latitud, double longitud){
		Coordinate coordenada = new Coordinate(latitud, longitud);	
		listaCoordenadas.add(coordenada);
		crearPoligono();	
	}
	
	public void crearPoligono(){
		GeometryFactory geometryFactory = JTSFactoryFinder.getGeometryFactory();
		cargarArray();
		LinearRing ring = geometryFactory.createLinearRing( coords );
		LinearRing holes[] = null; // use LinearRing[] to represent holes
		poligono = geometryFactory.createPolygon(ring, holes );
	}
	
	public void cargarArray(){
		int tamanio = listaCoordenadas.size();
		coords = new Coordinate[tamanio];
		int i = 0;
		while(i < tamanio){
			coords[i] = listaCoordenadas.get(i);
			i++;
		}
	}
	
//	Ejemplo de como crear un poligono
//	
//	GeometryFactory geometryFactory = JTSFactoryFinder.getGeometryFactory();
//
//	Coordinate[] coords  =
//	   new Coordinate[] {new Coordinate(4, 0), new Coordinate(2, 2),
//	                     new Coordinate(4, 4), new Coordinate(6, 2), new Coordinate(4, 0) };
//
//	LinearRing ring = geometryFactory.createLinearRing( coords );
//	LinearRing holes[] = null; // use LinearRing[] to represent holes
//	Polygon polygon = geometryFactory.createPolygon(ring, holes );
}
