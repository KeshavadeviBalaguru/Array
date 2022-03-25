package ArrayList;

import java.util.ArrayList;

public class MainArray {

	public static void main(String[] args) {
	    ArrayList<String> List=new ArrayList<String>();
	    List.add("Hello");
	    List.add("Praveen");
	    List.add("Are");
	    List.add("You ?");
	    
	    List.add(2, "How");
	   System.out.println("Value of 1 element: "+List.get(0));
	   System.out.println(List);
	   System.out.println("-------------------------------------");
	   ArrayList<Integer> iob=new ArrayList<Integer>();
	   iob.add(12);
	   iob.add(45);
	   iob.add(23);
	   iob.add(70);
	   
	   iob.add(2, 67);
	   System.out.println("Value of 3rd element  is: "+iob.get(3));
	   System.out.println(iob);
	   System.out.println("----------------------------------");
	   ArrayList<Float> iob1=new ArrayList<Float>();
	   iob1.add(55.6f);
	   iob1.add(66.7f);
	   iob1.add(99.0f);
	   iob1.add(88.9f);
	   iob1.add(3, 77.8f);
	   System.out.println("Vlaue odf 0 element is:"+iob1.get(0));
	   System.out.println(iob1);
	   iob1.clear();//remove all the element
	  
	   
	   
	   
	  

	}

}
