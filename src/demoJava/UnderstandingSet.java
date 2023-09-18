package demoJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UnderstandingSet {

	public static void main(String[] args) {
		/**
		 * Diferent ways to iterate sets
		 */

		
	Set<String> set = new HashSet<String>();
	
	set.add("paretWindow");
	set.add("childWindow");
	
	Iterator<String> it = set.iterator();
//	System.out.println(it.next());
//	System.out.println(it.next());
	
//	for(String element : set) {
//		System.out.println(element);
//	}
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	}

}
