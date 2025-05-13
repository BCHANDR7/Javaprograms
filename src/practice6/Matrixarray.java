package practice6;

public class Matrixarray {

	public static void main(String[] args) {
		int a[][]= {{1,2},{3,4}};
		int b[][]= {{5,6},{7,8}};
		int c[][]=new int[5][5];
		System.out.println("Multiply");
		for (int i=0;i<(a.length);i++)
		{
			for(int j=0;j<(a.length);j++)
			{
				c[i][j]=a[i][j] * b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Add");
		for (int i=0;i<(a.length);i++)
		{
			for(int j=0;j<(a.length);j++)
			{
				c[i][j]=a[i][j] + b[i][j];
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
