package tp0B;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.joda.time.DateTime;

public class Servicio {
	
	private String nombre;
	private List<Intervalo> intervalos = new ArrayList<Intervalo>();

	public Servicio(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void agregarIntervalo(String dia, int horaDesde, int minutoDesde, int horaHasta, int minutoHasta){
		Intervalo intervalo = new Intervalo(dia, horaDesde, minutoDesde, horaHasta, minutoHasta);
		intervalos.add(intervalo);
	}
	
	public boolean contiene(DateTime momento){
		Iterator<Intervalo> iter = intervalos.iterator();
		Intervalo intervalo;
		while (iter.hasNext()){
			intervalo = iter.next();
			if(intervalo.contiene(momento))
				return true;
		}
		return false;
	}
}
