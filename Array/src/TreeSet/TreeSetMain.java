package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMain {
	public static void main(String[] args) {
		/*TreeSet<Integer> tob=new TreeSet<Integer>();
		tob.add(33);
		tob.add(21);
		tob.add(87);
		System.out.println(tob);
		
		
		Iterator<Integer> iob=tob.iterator();
		while(iob.hasNext())
		{
			System.out.println(iob.next());
		}
		System.out.println("Descending Order");
		Iterator<Integer> iob1=tob.descendingIterator();
		while(iob1.hasNext())
		{
			System.out.println(iob1.next());
		}*/
		TreeSet<String> tob=new TreeSet<String>();
		tob.add("Abi");
		tob.add("Kavi");
		tob.add("Praveen");
		System.out.println(tob);
		
		
		Iterator<String> iob=tob.iterator();
		while(iob.hasNext())
		{
			System.out.println(iob.next());
		}
		System.out.println("Descending Order");
		Iterator<String> iob1=tob.descendingIterator();
		while(iob1.hasNext())
		{
			System.out.println(iob1.next());
		}
	}

}
