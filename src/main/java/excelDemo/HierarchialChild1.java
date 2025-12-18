package excelDemo;

public class HierarchialChild1 extends HierarchialParent
{
	public void m2()
	{
		System.out.println("to java");
	}

	public static void main(String[] args) 
	{
		HierarchialChild1 obj=new HierarchialChild1();
		obj.m1();
		obj.m2();
		

	}

}
