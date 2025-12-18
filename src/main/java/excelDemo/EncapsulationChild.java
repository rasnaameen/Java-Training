package excelDemo;

public class EncapsulationChild extends EncapsulationParent
{

	public static void main(String[] args) 
	{
		EncapsulationChild obj=new EncapsulationChild();
		obj.setAccountno(100000);
		obj.setName("Rasna");
		obj.setAmount(50000);
		System.out.println(obj.getAccountno());
		System.out.println(obj.getName());
		System.out.println(obj.getAmount());
		

	}

}
