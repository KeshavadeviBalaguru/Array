package array;

public class SmallestNumber {

	public static void main(String[] args) {
		int a[]= {13,65,15,23,9};
		int min=a[0];
		for(int i=0;i<a.length;i++)
        {
		if(a[i]>min) {
			min=a[i];
		}
		
		}
		{
			System.out.println("Minimum Value is:");
			System.out.println(min);
		}

	}

}
