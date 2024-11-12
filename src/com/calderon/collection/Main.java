package com.calderon.collection;

import com.calderon.collection.array.ArrayPerson;
import com.calderon.collection.list.ArrayListPerson;
import com.calderon.collection.map.HashMapPerson;
import com.calderon.collection.map.HashMapPlayer;
import com.calderon.collection.set.HashSetPerson;
import com.calderon.collection.stream.MyStream;

public class Main {

	public static void main(String[] args) {
		System.out.println("START PROGRAM");

//		ArrayPerson arrayPerson = new ArrayPerson();
//		arrayPerson.init();
		
//		ArrayListPerson arrayListPerson = new ArrayListPerson();
//		arrayListPerson.init();

//		HashSetPerson hashSetPerson = new HashSetPerson();
//		hashSetPerson.init();

//		HashMapPerson hashMapPerson = new HashMapPerson();
//		hashMapPerson.init();

//		HashMapPlayer hashMapPlayer = new HashMapPlayer();
//		hashMapPlayer.init();
		
		MyStream myStream = new MyStream();
		myStream.init();
		
		System.out.println("END PROGRAM");
	}

}
