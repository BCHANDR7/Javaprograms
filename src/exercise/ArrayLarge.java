package exercise;

public class ArrayLarge {

	public static void main(String[] args) {
	int a[]= {2,5,1,30,21};
	int b=a[0];
	for(int i=0;i<=(a.length-1);i++)
	{
		if(b<a[i])
		{
			b=a[i];
		}
	}
	System.out.println(b);

	}

}
