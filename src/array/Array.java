package array;

public class Array {

	public static void main(String[] args) {
	int a[];
	a=new int[4];
	a[0]=2;
	a[1]=3;
	a[2]=4;
	a[3]=5;
	//a[4]=6;
	for(int b:a)
	{
		System.out.println(b);
	}
	
	for(int i=0;i<(a.length);i++)
	{
		System.out.println(a[i]);
	}
	}

}
