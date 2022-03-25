package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {

	
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
	    list.add("Hello");
	    list.add("Priya");
	    list.add("Are");
	    list.add("You ?");
	    
	    
	    list.add(2, "How");
	   System.out.println("Value of 1 element: "+list.get(0));
	   System.out.println(list);
	   
	   ArrayList<String> list1=new ArrayList<String>();
	   list1.add("Are");
	   list1.add("You ?");
	   System.out.println(list.contains("Are"));
	   System.out.println(list.containsAll(list1));
	   list1.addAll(list);
	   
       Collections.sort(list1);
       System.out.println(list1);
       System.out.println("BEfore shuffle");
       System.out.println(list1);

       Collections.shuffle(list1);
       System.out.println("After Shuffle"+list1);

	}

}
