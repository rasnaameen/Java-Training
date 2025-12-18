package excelDemo;

public class MultiLevelChild2 extends MultiLevelChild
{
	public void m5()
	{
		System.out.println("Rasna");
	}

	public static void main(String[] args) 
	{
		MultiLevelChild2 obj1=new MultiLevelChild2();
		obj1.m5();
		obj1.m1();
		obj1.m2();
		obj1.display();
		

	}

}
