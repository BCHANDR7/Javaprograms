package Polymorphism;

public class Methoverload {
public void meth1()
{
	System.out.println("Method overload1");
}
private int meth1(int a)
{
	System.out.println(a);
	return a;
}
void meth1(String str)
{
	System.out.println(str);
	
}
public static void meth1(char ch)
{
	System.out.println(ch);
}
public final static void meth1(float f, int b)
{
	System.out.println(f);
	System.out.println(b);
}
public static void main (String[] args)
{
	Methoverload me=new Methoverload();
	me.meth1();
	me.meth1(25);
	me.meth1("str");
	meth1('d');
	meth1(2.3f,58);
	
}
}
