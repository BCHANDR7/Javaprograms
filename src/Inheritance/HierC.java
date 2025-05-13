package Inheritance;

public class HierC extends HierA{
 int h=15;
 public void eight()
 {
	 System.out.println("Hier2");
 }
	
 public static void main(String[] args)
 {
	 HierC hie2=new HierC();

	hie2.eight();
	 System.out.println(hie2.h);
	 hie2.six();
	 System.out.println(hie2.f);
 }
}
