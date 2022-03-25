package array;

public class Example1 {

	public static void main(String[] args) {
		String studentsName[]= {"Abi","Akshaya","Keerthana","Priya","Maha"};
		System.out.println("The students names are:");
		for(String name:studentsName)
		{
			System.out.println(name);
		}
		System.out.println("-------------------");
		System.out.println("The length of the elements are:");
		System.out.println(studentsName.length);	

	}

}
