package collection_Programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program8 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(23); c1.add(45.5); c1.add(50); c1.add("ayush");
		c1.add("tokyo"); c1.add(20); c1.add("kalmuha"); c1.add(22);
		c1.add(12); c1.add(55); c1.add(8);
		printSum(c1);
		
	}
	public static void printSum(Collection c) {
		System.out.println(c);
		Iterator itr = c.iterator();
		int sum=0;
		while(itr.hasNext()) {
			Object o = itr.next();
			if(o instanceof Integer)
				sum=sum+(Integer)o;
		}
		System.out.println("Total Sum is: "+sum);
	}

}
