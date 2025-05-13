package Inheritance;

public class HierB extends HierA{
int g=78;
public void seven()
{
	System.out.println("HierB");
}
public static void main(String[] args)
{
	HierB hie1=new HierB();
	hie1.six();
	hie1.seven();
	System.out.println(hie1.f);
	System.out.println(hie1.g);
}
}
