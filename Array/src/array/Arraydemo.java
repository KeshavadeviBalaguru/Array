package array;

import java.util.Scanner;

public class Arraydemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int array[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the element:");
			array[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("The Elements are:");
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}

	}

}
