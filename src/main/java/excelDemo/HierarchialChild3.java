package excelDemo;

public class HierarchialChild3 extends HierarchialParent1
{
  public void m2()
  {
	  System.out.println("welcome");
  }
	public static void main(String[] args) 
	{
		HierarchialChild3 hr=new HierarchialChild3();
		hr.m2();
		hr.m1();
		
		

	}

}
