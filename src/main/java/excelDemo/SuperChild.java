package excelDemo;

public class SuperChild extends SuperParent
{
	String color="black";
	public void display()
	{
		System.out.println(super.color);
	}
	public void eat()
	{
		System.out.println("eating bread");
		super.eat();
	}
	public SuperChild()
	{
		super();
		System.out.println("welcome");
		
	}
	public SuperChild(int a)
	{
		System.out.println(a);
		
	}
	
	
	public static void main(String[] args)
	{
		SuperChild obj=new SuperChild();
		obj.display();
		obj.eat();
		SuperChild obj2=new SuperChild(10);

}
}
