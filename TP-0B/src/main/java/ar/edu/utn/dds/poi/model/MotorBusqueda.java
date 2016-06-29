/*package ar.edu.utn.dds.poi.model;


import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class MotorBusqueda {
	
	Scanner input= new Scanner(System.in);
	Matcher mat1,mat2,mat3;
	
	public POI[] Busqueda(Scanner input, POI[] pois){
		
		Pattern pat = Pattern.compile(input.next());
		POI[] arraypois = new POI[pois.length];
		for(POI poi:arraypois){
			if(poi.getTipo().equals("Local comercial")){
				mat1 = pat.matcher(poi.getNombre());
            	mat2 = pat.matcher(poi.getTipo());
            	mat3 = pat.matcher(poi.getDescripcion());
            	if (!mat1.matches()||!mat2.matches()||!mat3.matches()){
            		
            	}
            		
            	
			}
		}
		return pois; 
		
	}
			
			

}
*/


package ar.edu.utn.dds.poi.model;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MotorBusqueda {

 Matcher mat1,mat2,mat3;
 String clave = new String();
 
    public  POI[] Busqueda(POI[] pois){
     
    POI[] poisBuscados = new POI[pois.length];
    int nro = 0;
     //Scanner input= new Scanner(System.in);
     //Pattern pat = Pattern.compile(input.next());
    Pattern pat = Pattern.compile(clave);
       //POI[] poisEncontrados = new POI[];
        for (POI poi:pois){
         //if (poi.getTipo().equals("Local comercial")){
          //poi = new LocalComercial(poi.getNombre(), poi.getDescripcion(), , null, 0, null);
             mat1 = pat.matcher(poi.getNombre());
             mat2 = pat.matcher(poi.getTipo());
             mat3 = pat.matcher(poi.getDescripcion());
         
             if (mat1.matches()||mat2.matches()||mat3.matches()){
              poisBuscados[nro] = poi;
         }
        }
        //}
        return poisBuscados;
    }
}