package tp0B;

public class CGP extends POI {

//	public CGP(String nombre, String descripcion, double latitud, double longitud, String calle, int numero,
//			String calle1, String calle2, int piso, int depto, int unidad, int codigoPostal, String localidad,
//			String barrio, String provincia, String pais) {
//		super(nombre, descripcion, latitud, longitud, calle, numero, calle1, calle2, piso, depto, unidad, codigoPostal,
//				localidad, barrio, provincia, pais);
//		// TODO Auto-generated constructor stub
//	}
	
	public CGP(String nombre, double latitud, double longitud, String calle, int numero){
		super(nombre, latitud, longitud, calle, numero);
	}
	
	public boolean estaCerca(double latitud, double longitud){
		if(ciudad.estanEnLaMismaComuna(latitud, longitud, this.getCoordenadas().getLatitud(), this.getCoordenadas().getLongitud()))
			return true;
		return false;
	}
	
	{
		setTipo("CGP");
	}
}
