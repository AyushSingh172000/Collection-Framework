package collection_Programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program2 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(23); c1.add(45.5); c1.add(50); c1.add("ayush");
		c1.add("tokyo"); c1.add(20); c1.add("kalmuha");
		removeString(c1);
		
	}
	public static void removeString(Collection c) {
		System.out.println("Collection before removing the string: ");
		System.out.println(c);
		Iterator itr = c.iterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			if(o instanceof String)
				itr.remove();
		}
		System.out.println("Collection After removing String is: ");
		System.out.println(c);
		
	}

}
