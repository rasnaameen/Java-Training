package excelDemo;

public class MethodOverRideChild extends MethodOverRideParent
{
	public void display()
	{
		System.out.println("Hello");
	}
	public void sum(int a,int b)
	{
		System.out.println(a-b);
	}

	public static void main(String[] args) 
	{
		MethodOverRideChild obj=new MethodOverRideChild();
		obj.display();
		obj.sum(10, 10);
		
		
		
		

	}

}
