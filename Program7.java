package collection_Programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program7 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(23); c1.add(45.5); c1.add(50); c1.add("ayush");
		c1.add("tokyo"); c1.add(20); c1.add("kalmuha"); c1.add(22);
		c1.add(12); c1.add(55); c1.add(8);
		toremoveevenInteger(c1);
	}
	public static void toremoveevenInteger(Collection c) {
		System.out.println(c);
		int count=0;
		Iterator itr = c.iterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			if(o instanceof Integer && (Integer)o%2==0) {
				System.out.println("Even Number is: "+o);
				count++;
			}
		}
		System.out.println("Count is: "+ count);
	}

}
