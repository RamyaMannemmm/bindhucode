
public abstract class Abstractclass {

	
	public  String name="ramya";
	public static void main(String [] args)
	{
		subclass abstract1=new subclass();
		abstract1.m1();
		String value=abstract1.name;
		
	}
	
	public abstract void m1();
	
	public void m2()
	{
		System.out.println("this is a non abstract method");
	}
	//0-100 percent in abstract class
	
	
}
