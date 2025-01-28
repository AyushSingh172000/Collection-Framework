package collection_Programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program9 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(23); c1.add(45.5); c1.add(50); c1.add("ayush");
		c1.add("tokyo"); c1.add(20); c1.add("kalmuha"); c1.add(22);
		c1.add(12); c1.add(55); c1.add(8);
		sumofEven(c1);
	}
	public static void sumofEven(Collection c) {
		System.out.println(c);
		int sum=0;
		Iterator itr = c.iterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			if(o instanceof Integer && (Integer)o%2==0)
				sum=sum+(Integer)o;
		}
		System.out.println("Sum of Even Integer is: "+sum);
	}

}
