
public class variables {

	public static String collegename="vnr"; //static variable 
	public String groupsname="pls assign value"; //instance variable - object level variables 
	public final float pi=3.14f;
	
	public static void main(String[]args)
	{
		int age=0;
		System.out.println(age);
		final variables var=new variables(); //reference varaible
		System.out.println(collegename);
		
		
		var.groupsname="cse";
		var.collegename="mvsr";
		System.out.println(var.groupsname);
		
		variables var1=new variables();

		//var1.groupsname="eee";
		System.out.println(var1.collegename);

		System.out.println(var1.groupsname);
		
		variables var2=new variables();
		var2.groupsname="ece";
		System.out.println(var2.collegename);

		System.out.println(var2.groupsname);
		
		
		
	}
	
	public void method()
	{
		
		//System.out.println(var.collegename);

		
	}
	
	
	
	
}
