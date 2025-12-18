package excelDemo;

public interface Interface2 
{
	default void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	public abstract void m2();

}
