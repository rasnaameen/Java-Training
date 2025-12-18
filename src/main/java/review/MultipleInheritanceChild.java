package review;

public class MultipleInheritanceChild implements MultipleInheritanceParent1,MultipleInheritanceParent2
{

	public static void main(String[] args) 
	{
		MultipleInheritanceParent1 mp=new MultipleInheritanceChild();
		mp.display();
		MultipleInheritanceParent2 mp1=new MultipleInheritanceChild();
	    mp1.print();

	}

}
