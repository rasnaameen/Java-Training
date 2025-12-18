package excelDemo;

public class AbstractChildDemo extends AbstractParent
{

	public static void main(String[] args) 
	{
		/*AbstractChildDemo obj=new AbstractChildDemo();
		obj.m1();
		obj.sum(10, 10);*/
		AbstractParent ab=new AbstractChildDemo();
		ab.m1();
		ab.sum(10, 10);
	

	}

	@Override
	public void m1() {
		System.out.println("welcome");
		
	}

	@Override
	public void sum(int a, int b)
	{
		
		System.out.println(a+b);
		
	}

}
