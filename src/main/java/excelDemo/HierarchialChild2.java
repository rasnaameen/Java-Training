package excelDemo;

public class HierarchialChild2 extends HierarchialParent
{
	public void m3()
	{
		System.out.println("selenium");
	}

	public static void main(String[] args) 
	{
		HierarchialChild2 obj1=new HierarchialChild2();
		obj1.m1();
		obj1.m3();
		

	}

}
