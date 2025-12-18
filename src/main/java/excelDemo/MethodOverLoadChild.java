package excelDemo;

public class MethodOverLoadChild extends MethodOverLoadParent
{
	public void display(int a,int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) 
	{
		MethodOverLoadChild obj=new MethodOverLoadChild();
		obj.display(10);
		obj.display(10, 10);
		
		

	}

}
