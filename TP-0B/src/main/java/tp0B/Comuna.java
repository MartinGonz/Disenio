package tp0B;

import org.geotools.geometry.jts.JTSFactoryFinder;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;

public class Comuna {
	
	private String nombre;
	private Polygon poligono;
	public Comuna() {
		// TODO Auto-generated constructor stub
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
}
