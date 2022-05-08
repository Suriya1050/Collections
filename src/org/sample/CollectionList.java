package org.sample;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {
	
	public static void main(String[] args) {
		
		// parent interface refName = new childclass();
		
		List li = new ArrayList();
		
		li.add("Name");
		li.add(34.56);
		li.add(123468590l);
		li.add(true);
		li.add('A');
		li.add(88.988478289f);
		
		System.out.println(li);
		
		int s = li.size();
		System.out.println(s);
		
	}

}
