package Constructor;

public class ParameterCons2 extends ParameterCons{
ParameterCons2(float f, int b) {
	super("str",5);
	System.out.println(name);
	System.out.println(id);
	System.out.println(f);
	System.out.println(b);
}

public static void main(String[] args)
{
	ParameterCons2 pc=new ParameterCons2(2.3f, 10);
}
}
