package Exceptionhandling;

public class Excep {
	


	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(5);
	try {
		int a=100/0;
		System.out.println(a);
	}
	catch (Exception e) {
		System.out.println(e);
	}
System.out.println("str");

try {
	String s="str";
	System.out.println(s.length());
} catch (Exception e) {
	System.out.println(e);
}
try {
	String s="abc";
	int i=Integer.parseInt(s);
} catch (Exception e) {
	System.out.println(e);
}
finally {
	System.out.println("Execption: ");
}
	}

}
