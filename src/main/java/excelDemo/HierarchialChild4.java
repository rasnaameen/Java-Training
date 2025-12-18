package excelDemo;

public class HierarchialChild4 extends HierarchialParent1
{
	public void m3()
	{
		System.out.println("to java");
	}

	public static void main(String[] args) 
	{
		HierarchialChild4 hr1=new HierarchialChild4();
		hr1.m1();
		hr1.m3();
				

	}

}
