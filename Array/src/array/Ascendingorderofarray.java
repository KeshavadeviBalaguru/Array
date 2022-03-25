package array;

public class Ascendingorderofarray {

	public static void main(String[] args) {
		
		int a[]= {20,50,30,60,35,40};
		int temp=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++) {
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Asecnding order in array:");
		for(int i=0;i<a.length;i++)
		{
			
			System.out.print(" "+a[i]+" ");
		}
	}

}
