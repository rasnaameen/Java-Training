package excelDemo;

public class InterfaceChild implements Interface1,Interface2
{

	public static void main(String[] args) 
	{
		Interface1 im=new InterfaceChild();
		im.m1();
		Interface2 im2=new InterfaceChild();
		im2.m2();

	}

	@Override
	public void m2()
	{
		System.out.println("hai");
		
	}

	@Override
	public void m1() 
	{
		System.out.println("Hello");
		
	}

}
