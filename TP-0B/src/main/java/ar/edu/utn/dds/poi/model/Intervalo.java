package ar.edu.utn.dds.poi.model;

import java.time.LocalTime;
import org.joda.time.DateTime;
import org.joda.time.Interval;

public class Intervalo {
	
	String dia;
	LocalTime horarioDesde; 
	LocalTime horarioHasta; 
		
	public Intervalo(String dia, int horaDesde, int minutoDesde, int horaHasta, int minutoHasta) {
		this.horarioDesde = LocalTime.of(horaDesde, minutoDesde);
		this.horarioHasta = LocalTime.of(horaHasta, minutoHasta);
		this.dia = dia;
	}
	
	public boolean contiene(DateTime momento){
		if(compararDia(momento))
			return compararIntervalo(momento);
		return false;
	}
	
	public boolean compararDia(DateTime momento){
		DateTime.Property pDoW = momento.dayOfWeek();
		String diaSemana = pDoW.getAsText();
		if(dia.equals(diaSemana))
			return true;
		return false;
	}
	
	public boolean compararIntervalo(DateTime momento){
		DateTime desde = new DateTime(momento.getYear(), momento.getMonthOfYear(), momento.getDayOfMonth(), horarioDesde.getHour(), horarioDesde.getMinute());
		DateTime hasta = new DateTime(momento.getYear(), momento.getMonthOfYear(), momento.getDayOfMonth(), horarioHasta.getHour(), horarioHasta.getMinute()); 
		Interval intervalo = new Interval(desde, hasta);
		if(intervalo.contains(momento))
			return true;
		return false;
	}
}
