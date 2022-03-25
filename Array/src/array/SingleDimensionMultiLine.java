package array;

public class SingleDimensionMultiLine {

	public static void main(String[] args) {
		int BookNumbers[]=new int[4];
		
		BookNumbers[0]=201;
		BookNumbers[1]=202;
		BookNumbers[2]=203;
		BookNumbers[3]=204;
		System.out.println("The BookNumbers are:");
		
		for(int booknumber:BookNumbers)
		{
			System.out.println(booknumber);
		}
		

	}

}
