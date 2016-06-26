package tp0B;

public class LocalComercial extends POI {

	public LocalComercial(String nombre, String descripcion, double latitud, double longitud, String calle, int numero,
			String calle1, String calle2, int piso, int depto, int unidad, int codigoPostal, String localidad,
			String barrio, String provincia, String pais) {
		super(nombre, descripcion, latitud, longitud, calle, numero, calle1, calle2, piso, depto, unidad, codigoPostal,
				localidad, barrio, provincia, pais);
		// TODO Auto-generated constructor stub
	}
	
	Rubro rubro;
	
	public LocalComercial(String nombre, double latitud, double longitud, String calle, int numero, Rubro rubro){
		super(nombre, latitud, longitud, calle, numero);
		this.rubro = rubro;
	}
	
	{
		setTipo("Local comercial");
		setCercania(rubro.getCercania());
	}
}
