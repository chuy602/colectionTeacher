package com.calderon.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapPerson {
	
	public void init( ) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Casillas");		
		map.put(15, "Ramos");
		map.put(3, "Pique");		
		map.put(5, "Puyol");
		map.put(11, "Capdevila");	
		map.put(14, "Xabi Alonso");
		map.put(16, "Busquets");	
		map.put(8, "Xavi Hernandez");
		map.put(18, "Pedrito");		
		map.put(6, "Iniesta");
		map.put(7, "Villa");

		this.showHashMapPerson(map);
		
		map.put(100, "Villa");
		map.put(7, "Villano");
		this.showHashMapPerson(map);
		
		this.showSomeMethodsFromMap(map);

	}

	private void showSomeMethodsFromMap(Map<Integer, String> map) {
		System.out.println("********* Trabajando con los métodos de Map *********");
		System.out.println("Mostramos el numero de elementos que tiene el map: map.size() = "+ map.size());
		System.out.println("Vemos si el map esta vacio : map.isEmpty() = "+map.isEmpty());
		System.out.println("Obtenemos un elemento del Map pasandole la clave 6: map.get(6) = "+map.get(6));
		System.out.println("Borramos un elemento del Map el 18 (porque fue sustituido): map.remove(18)"+map.remove(18));
		System.out.println("Vemos que pasa si queremos obtener la clave 18 que ya no existe: map.get(18) = "+map.get(18));
		System.out.println("Vemos si existe un elemento con la clave 18: map.containsKey(18) = "+map.containsKey(18));
		System.out.println("Vemos si existe un elemento con la clave 1: map.containsKey(1) = "+map.containsKey(1));
		System.out.println("Vemos si existe el valor 'Villa' en el Map: map.containsValue(\"Villa\") = "+map.containsValue("Villa"));
		System.out.println("Vemos si existe el valor 'Ricardo' en el Map: map.containsValue(\"Ricardo\") = "+map.containsValue("Ricardo"));
		System.out.println("Borramos todos los elementos del Map: map.clear()");map.clear();
		System.out.println("Comprobamos si lo hemos eliminado viendo su tamaño: map.size() = "+map.size());
		System.out.println("Lo comprobamos tambien viendo si esta vacio map.isEmpty() = "+map.isEmpty());		
	}

	private void showHashMapPerson(Map<Integer, String> map) {
		System.out.println();
		// Imprimimos el Map con un Iterador
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()){
		  Integer key = it.next();
		  System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
		}		
	}

}
