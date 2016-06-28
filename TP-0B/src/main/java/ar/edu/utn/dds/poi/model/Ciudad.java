package ar.edu.utn.dds.poi.model;

import java.util.ArrayList;
import java.util.List;

public class Ciudad {

	private String nombre;
	
	public Ciudad(String nombre) {
		this.nombre = nombre;
	}
	
	private List<Comuna> comunas = new ArrayList<Comuna>();
	
	public void agregarComuna(Comuna comuna){
		comunas.add(comuna);
	}
	
	public Comuna getComuna(double latitud, double longitud){
		Comuna comuna;
		int i = 0;
		while(!comunas.get(i).estaAqui(latitud, longitud)){
			i++;
		}
		comuna = comunas.get(i);
		return comuna;
	}
	
	public boolean estanEnLaMismaComuna(double latitudTerminal, double longitudTerminal, 
										double latitudPOI, double longitudPOI){
		Comuna comunaTerminal = getComuna(latitudTerminal, longitudTerminal);
		Comuna comunaPOI = getComuna(latitudPOI, longitudPOI);
		if(comunaTerminal.equals(comunaPOI))
			return true;
		return false;
	}
}
