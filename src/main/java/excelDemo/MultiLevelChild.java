package excelDemo;

public class MultiLevelChild extends MultiLevelParent {
	public void m1() {
		System.out.println("to java");
	}

	public void m2() {
		System.out.println("HelloWorld");
	}

	

	public static void main(String[] args) {
		MultiLevelChild obj=new MultiLevelChild();
		obj.m1();
		obj.m2();
		obj.display();
		obj.show();
		

	}

}
