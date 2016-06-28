package tp0B;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.joda.time.DateTime;

public class Rubro {

	private int cercania;
	private List<Intervalo> intervalos = new ArrayList<Intervalo>();

	public Rubro(int cercania) {
		this.cercania = cercania;
	}
	
	public int getCercania(){
		return cercania;
	}
	
	public void agregarIntervalo(String dia, int horaDesde, int minutoDesde, int horaHasta, int minutoHasta){
		Intervalo intervalo = new Intervalo(dia, horaDesde, minutoDesde, horaHasta, minutoHasta);
		intervalos.add(intervalo);
	}
	
	public boolean contiene(DateTime momento){
		boolean contiene = false;
		Iterator<Intervalo> iter = intervalos.iterator();
		Intervalo intervalo;
		while (iter.hasNext()){
			intervalo = iter.next();
			contiene = intervalo.contiene(momento);
			if(contiene)
				return true;
		}
		return contiene;
	}
	
	public int cantidadIntervalos(){
		int tamanio = intervalos.size();
		return tamanio;
	}
}
