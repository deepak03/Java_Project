package ListConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "JIRA");
		hm.put(4, "RFT");
		System.out.println(hm.get(2));
		System.out.println(hm.get(4));
		
		for (Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + ""+ m.getValue());
		}
		System.out.println(hm);
		hm.remove(3);
		System.out.println(hm);
	}

}
