package Wrapper;

public class Wrap {

	public static void main(String[] args) {
int a=10;
String name= String.valueOf(a);
System.out.println("Name: "+name);
String as=Integer.toString(a);
System.out.println("as: "+as);
String su=String.format("%d",a);
System.out.println("su: "+su);

String s="123";
int i=Integer.valueOf(s);
System.out.println(i);

int j=Integer.parseInt(s);
System.out.println(i);



	}

}
