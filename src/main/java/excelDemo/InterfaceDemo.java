package excelDemo;

public interface InterfaceDemo 
{
	public abstract void m1();
	default void sum(int a,int b)
	{
		System.out.println(a+b);
		
	}
	static void diff(int c,int d)
	{
		System.out.println(c-d);
	}

}
