package ar.edu.utn.dds.poi.model;

public class Ubicacion {
	private String calle;
	private int numero;
	private String[] entreCalles = new String[2];
	private int piso;
	private int depto;
	private int unidad; //tipo de dato OK?
	private int codigoPostal;
	private String localidad;
	private String barrio;
	private String provincia;
	private String pais;
	
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
	
	public Ubicacion(String calle, int numero){
		this.calle = calle;
		this.numero = numero;
	}
	
	String getCalle(){
		return calle;
	}
	
	int getNumero(){
		return numero;
	}
}
