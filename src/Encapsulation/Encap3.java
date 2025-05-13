package Encapsulation;

public class Encap3 {
private int num;
private String name;
private int num2=10;
public int getAge()
{
	return num;
}
public void setAge(int age, String name)
{
	num=age;
	this.name=name;
}

public String getName() {
	return name;
}

	public static void main(String[] args) {
	Encap3 en2=new Encap3();
	en2.setAge(28,"str");
	System.out.println("Age: "+en2.getAge());
	System.out.println("Name: "+en2.getName());
	System.out.println(en2.num2);
	}

}
