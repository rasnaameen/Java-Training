package excelDemo;

public class InheritanceChild extends InheritanceParent
{
	public void show()
	{
		System.out.println("to java");
	}


	public static void main(String[] args) 
	{
		InheritanceChild obj=new InheritanceChild();
		obj.show();
		obj.display();
		obj.print();
		
		
		
		
		

	}
}


