package com.calderon.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.calderon.collection.person.Player;

public class HashMapPlayer {
	
	public void init( ) {
		Map<String, Player> playerMap = new HashMap<String, Player>();
		System.out.println("********* HashMap con Objetos y como Clave un String *********");
		playerMap.put("Casillas", new Player("1A", "Casillas", 25, 1, "Portero"));
		playerMap.put("Ramos", new Player("2B", "Ramos", 25, 15, "Lateral Derecho"));
		playerMap.put("Pique", new Player("3C", "Pique", 26, 13, "Central"));
		playerMap.put("Puyol", new Player("4D", "Puyol", 27, 5, "Central"));
		playerMap.put("Capdevila", new Player("5E", "Capdevila", 28, 11, "Lateral Izquierdo"));
		playerMap.put("Xabi", new Player("6F", "Xabi Alonso", 29, 14, "Medio Centro"));
		playerMap.put("Busquets", new Player("7G", "Busquets", 30, 16, "Medio Centro"));
		playerMap.put("Xavi", new Player("8H", "Xavi Hernandez", 31, 8, "Centro Campista"));
		playerMap.put("Pedrito", new Player("9I", "Pedrito", 32, 18, "Interior Izquierdo"));
		playerMap.put("Iniesta", new Player("10J", "Iniesta", 33, 6, "Interior Derecho"));
		playerMap.put("Villa", new Player("11K", "Villa", 34, 7, "Delantero"));

		this.showHashMapPlayer(playerMap);
		
		this.showSomeMethodsFromMap(playerMap);

	}

	private void showSomeMethodsFromMap(Map<String, Player> map) {
		System.out.println("********* Trabajando con los métodos de Map *********");
		System.out.println("Mostramos el numero de elementos que tiene el map: map.size() = "+ map.size());
		System.out.println("Vemos si el map esta vacio : map.isEmpty() = "+map.isEmpty());
		System.out.println("Obtenemos un elemento del Map pasandole la clave Iniesta: map.get(\"Iniesta\") = "+map.get("Iniesta"));
		System.out.println("Borramos un elemento del Map el Pedrito (porque fue sustituido): map.remove(\"Pedrito\")"+map.remove("Pedrito"));
		System.out.println("Vemos que pasa si queremos obtener la clave \"Pedrito\" que ya no existe: map.get(\"Pedrito\") = "+map.get("Pedrito"));
		System.out.println("Vemos si existe un elemento con la clave \"Pedrito\": map.containsKey(\"Pedrito\") = "+map.containsKey("Pedrito"));
		System.out.println("Vemos si existe un elemento con la clave \"Casillas\": map.containsKey(\"Casillas\") = "+map.containsKey("Casillas"));
		System.out.println("Borramos todos los elementos del Map: map.clear()");map.clear();
		System.out.println("Comprobamos si lo hemos eliminado viendo su tamaño: map.size() = "+map.size());
		System.out.println("Lo comprobamos tambien viendo si esta vacio map.isEmpty() = "+map.isEmpty());		
	}

	private void showHashMapPlayer(Map<String, Player> map) {
		System.out.println();
		// Imprimimos el Map con un Iterador
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()){
		  String key = it.next();
//		  System.out.println("Clave: " + key + " -> Valor: " + map.get(key).toString());
		  System.out.println("Clave: " + key + " -> Dorsal: " + map.get(key).getDorsal() + " -> Demarcación: " + map.get(key).getDemarcation());
		}		
	}

}
