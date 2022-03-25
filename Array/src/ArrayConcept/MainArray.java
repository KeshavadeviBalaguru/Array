package ArrayConcept;

import java.util.Scanner;

public class MainArray {

	public static void main(String[] args) {

		//datatype vari_name[]=new datatype[size];
		//declaration
				/*ar[0]=34;  //ar->subscript  0->index
				ar[1]=37;
				ar[2]=56;
				ar[3]=78;
				ar[4]=12;
				*/
				/*System.out.println(ar[0]);
				System.out.println(ar[1]);
				System.out.println(ar[2]);
				System.out.println(ar[3]);
				System.out.println(ar[4]);
				*/


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int array[]=new int[size];
		//input element of the array
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the element:");
			array[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("The Elements are:");
		// To display the array element
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		//sum
		System.out.println("Sum of the Array Element:");
		int s=0;
		
		for(int i=0;i<array.length;i++) {
		s=s+array[i];
		}
		System.out.println("Sum= "+s);
		int Avg=0;
		
		System.out.println("Average of the array element is :"+(float)s/array.length);
		//find maximum of array element
				int max=array[0];
				for(int i=1;i<array.length;i++) {
					if(array[i]>max) {
						max=array[i];
					}
				}
				System.out.println("Maximum of array element is"+max);

				//find minimum of array element
						int min=array[0];
						for(int i=1;i<array.length;i++) {
							if(array[i]<min) {
								min=array[i];
							}
						}
						System.out.println("minimum of array element is"+min);

		

	}

}
