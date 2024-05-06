package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Main 
{

	public static void main(String[] args) 
	{
		HashMap <Integer, String> provincias = new HashMap<Integer, String>();
		
		provincias.put(1, "Avila");
		provincias.put(24, "León");
		provincias.put(34, "Palencia");
		provincias.put(37, "Salamanca");
		provincias.put(40, "Segovia");
		provincias.put(42, "Soria");
		provincias.put(47, "Valladolid");
		provincias.put(49, "Zamora");
		provincias.put(9, "Burgos");
		
		if(provincias.containsKey(37))
		{
			System.out.println("La provincia con codigo postal 37 es " + provincias.get(37));
		}
		
		if(provincias.containsValue("Burgos"))
		{
			System.out.println("Burgos está en la colección");
		}
		
		System.out.println(provincias);
		
		for(Integer clave : provincias.keySet())
		{
			
			System.out.println("Clave: " + clave + "\n" + "Provincia: " + provincias.get(clave));
			
		}
		
		System.out.println("Valores de la lista");
		System.out.println(provincias.values());
		System.out.println(provincias.keySet());
		System.out.println();
		for(String nombres : provincias.values())
		{
			System.out.println(nombres);
		}
		System.out.println();


		for(Map.Entry<Integer, String> mapa : provincias.entrySet())
		{
			System.out.println(mapa.getKey() + mapa.getValue());
			System.out.println();
		}
		
		Iterator<?> iter = provincias.entrySet().iterator();
		
		while(iter.hasNext())
		{
			Map.Entry<Integer, String> entrada =  (Entry<Integer, String>) iter.next();
			System.out.println(entrada.getKey() + " " + entrada.getValue());
		}
		
	}

}
