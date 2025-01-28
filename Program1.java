package collection_Programs;	

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collection;
	import java.util.Iterator;

	public class Program1{
		public static void main(String[] args) {
			Collection<Integer> c1 = new ArrayList<>();
			c1.add(10);
			c1.add(14);
			c1.add(31);
			c1.add(21);
			c1.add(51);
			c1.add(15);
			System.out.println(c1);
			//System.out.println(c1.containsAll(c1));
			//System.out.println(c1.contains(55));
//			Object []arr  = c1.toArray();
//			System.out.println(Arrays.toString(arr)); 
//			Iterator itr= c1.iterator();
//			while(itr.hasNext()) {
//				System.out.println(itr.next());
//			}
//			Iterator itr=c1.iterator();
//			while(itr.hasNext()) {
//				int x=(Integer)itr.next();
//				if(x%2==1)
//					itr.remove();
//			}
//			System.out.println("New c1 is: "+c1);
			
		}
	}


