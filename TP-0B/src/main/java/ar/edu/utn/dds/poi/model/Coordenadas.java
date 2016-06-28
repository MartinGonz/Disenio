package ar.edu.utn.dds.poi.model;

public class Coordenadas {
	private double latitud;
	private double longitud;
	
	public Coordenadas(double latitud, double longitud){
		if(esValida(latitud,longitud)){
			this.latitud = latitud;
			this.longitud = longitud;
		}
		else{
			System.out.print("No es una coordenada válida");
		}
	}
	
	public double getLatitud(){
		return latitud;
	}
	
	public double getLongitud(){
		return longitud;
	}
	
	public boolean esValida(double latitud, double longitud){
		if(latitud <= 90 && latitud >= -90 && longitud <= 180 && longitud >= -180){
			return true;
		}
		return false;
	}
}
