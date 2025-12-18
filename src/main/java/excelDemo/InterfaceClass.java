package excelDemo;

public class InterfaceClass implements InterfaceDemo
{
	

	public static void main(String[] args) 
	{
		InterfaceDemo dm=new InterfaceClass();
		dm.m1();
		dm.sum(10, 10);
		InterfaceDemo.diff(10, 10);
		
		

	}

	@Override
	public void m1() {
		System.out.println("Heloo");
		
	}

}
