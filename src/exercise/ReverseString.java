package exercise;

public class ReverseString {

	public static void main(String[] args) {
		String name="str";
		String a="";
		char c;
		for(int i=0;i<name.length();i++)
		{
			c=name.charAt(i);
			a=c+a;
		}
		System.out.println(a);
	}

}
