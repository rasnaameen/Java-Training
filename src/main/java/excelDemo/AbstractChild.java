package excelDemo;

public class AbstractChild extends AbstractDemo
{
	

	public static void main(String[] args) 
	{
		/*AbstractChild obj=new AbstractChild();
		obj.m1();*/
		AbstractDemo dm=new AbstractChild();
		dm.m1();
		

	}

	@Override
	public void m1() 
	{
		System.out.println("hai");
		
	}

}
