package tp0B;

public class Ubicacion {
	String calle;
	int numero;
	String[] entreCalles = new String[2];
	int piso;
	int depto;
	int unidad; //tipo de dato OK?
	int codigoPostal;
	String localidad;
	String barrio;
	String provincia;
	String pais;
	
	public Ubicacion(String calle, int numero, String calle1, String calle2, int piso, int depto, int unidad,
					 int codigoPostal, String localidad, String barrio, String provincia, String pais){
		this.calle = calle;
		this.numero = numero;
		this.entreCalles[0] = calle1;
		this.entreCalles[1] = calle2;
		this.piso = piso;
		this.depto = depto;
		this.unidad = unidad;
		this.codigoPostal = codigoPostal;
		this.localidad = localidad;
		this.barrio = barrio;
		this.provincia = provincia;
		this.pais = pais;
		
	}
}
