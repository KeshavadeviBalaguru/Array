package array;

public class MultidimensionalOneLine {

	public static void main(String[] args) {
		int matrix[][]= {{22,33}, {44,55}};

		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			 System.out.println("\n\n");
		}
    
	}

}
