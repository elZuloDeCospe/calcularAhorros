package hashMap2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main 
{
	static String nombre;
	static int dorsal;
	static HashMap<Integer, String> jugadores = new HashMap<Integer, String>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int eleccion = 0;
		do
		{
			menu();
			eleccion = sc.nextInt();
			
			switch(eleccion)
			{
				case 1:
					altaJugador();
					break;
					
				case 2:
					eliminarJugador();
					break;
					
				case 3:
					consultarPorDorsal();
					break;
					
				case 4: 
					modificarNombre();
					break;
					
				case 5:
					consultaEntrySet();
					break;
					
				case 6:
					consultaIterator();
					break;
					
				case 7:
					consultaKeySet();
					break;
					
				case 8:
					salir();
					break;
					
				default: System.out.println("Error dato introducido erroneo");
			}
		}while(eleccion != 8);
	}
	private static void menu()
	{
		System.out.println("MENU");
		System.out.println("1.-Dar alta jugador");
		System.out.println("2.-Eliminar jugador por dorsal");
		System.out.println("3.-Consultar jugador por dorsal");
		System.out.println("4.-Modificar jugador");
		System.out.println("5.-Consultar jugador por foreach con entrySet");
		System.out.println("6.-Consultar jugador por iterator");
		System.out.println("7.-Consultar jugador por foreach con keySet");
		System.out.println("8.-Salir");
	}
	
	private static void altaJugador() 
	{
		
		System.out.println("numero de dorsal");
		dorsal = sc.nextInt();
		if(jugadores.containsKey(dorsal))
		{
			System.err.println("Error, el dorsal ya existe");
		}
		else
		{
			System.out.println("Nombre del jugador");
			nombre = sc.next();
			jugadores.put(dorsal, nombre);
		}
		
		
	}
	private static void eliminarJugador() 
	{
		System.out.println("Numer de dorsal a eliminar");
		dorsal = sc.nextInt();
		if(jugadores.containsKey(dorsal))
		{
			jugadores.remove(dorsal);
		}
		else
		{
			System.out.println("Error, ese dorsal no existe");
		}
		
	}
	private static void consultarPorDorsal() 
	{
		System.out.println("Numero de dorsal a consultar");
		dorsal = sc.nextInt();
		if(jugadores.containsKey(dorsal))
		{
			System.out.println(jugadores.get(dorsal));
		}
	}
	
	
	
	private static void modificarNombre() 
	{
		System.out.println("Elige un dorsal para modificar su nombre");
		dorsal = sc.nextInt();
		if(jugadores.containsKey(dorsal))
		{
			System.out.println("introduce el nuevo nombre");
			nombre = sc.next();
			jugadores.put(dorsal, nombre);
		}
		
	}
	private static void consultaEntrySet() 
	{
		for (Map.Entry<Integer, String> map : jugadores.entrySet()) 
		{
            System.out.println(map.getKey() + " " + map.getValue());
        }
        System.out.println("");	
	}
	private static void consultaIterator() 
	{
		System.out.println("Visualizar con Iterator");
        Iterator<?> iter = jugadores.entrySet().iterator();

        while (iter.hasNext()) {
            HashMap.Entry<Integer, String> entrada = (Entry<Integer, String>) iter.next();
            System.out.println(entrada.getKey() + " " + entrada.getValue());
        }    
        System.out.println("");
	}
	private static void consultaKeySet() 
	{
		for (Integer clave : jugadores.keySet()) {
            System.out.println(clave + "\t" + jugadores.get(clave));
        }
        System.out.println("");
	}

	private static void salir() 
	{
		System.out.println("Cerrando programa");
	}	
}