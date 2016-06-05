package tp0B;

public class SucursalBanco extends POI {

	public SucursalBanco(String nombre, String descripcion, double latitud, double longitud, String calle, int numero,
			String calle1, String calle2, int piso, int depto, int unidad, int codigoPostal, String localidad,
			String barrio, String provincia, String pais) {
		super(nombre, descripcion, latitud, longitud, calle, numero, calle1, calle2, piso, depto, unidad, codigoPostal,
				localidad, barrio, provincia, pais);
		// TODO Auto-generated constructor stub
	}
	
	public SucursalBanco(String nombre, double latitud, double longitud, String calle, int numero){
		super(nombre, latitud, longitud, calle, numero);
	}
	
	{
		setTipo("Sucursal de banco");
	}
}
