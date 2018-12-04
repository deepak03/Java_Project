package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> l1= new LinkedList<String>();
		l1.add("Test");
		l1.add("Selenium");
		l1.add("RPA");
		l1.add("RFT");
		System.out.println(l1);
		
		//addfirst
		l1.addFirst("Naveen");
		//addlast
		l1.addLast("Deepak");
		System.out.println(l1);
		//get value
		System.out.println(l1.get(3));
		//set value
		l1.set(3, "IRONMAN");
		System.out.println(l1.get(3));
		
		//Remove
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
		
		//Iteratration
			//for
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		
		   //Advance for loop
		for (String string : l1) {
			System.out.println(string); 
		}
		
	   Iterator<String> it = l1.iterator();
	   while (it.hasNext()) {
		   System.out.println(it.next()); 
		
	}
	}

}
