
public class accessmodifiers {

	protected static int cardnumber=123456;
	static int value=1234; //default access modifier
	private static final int value2=12;
	
	public static void main(String[] args) {

		
		//accessmodifiers.value2=14;
		System.out.println(accessmodifiers.value2);

		
	}
	
	protected static void m1()
	{
		System.out.println("this is protected method");
	}
	
	
	
	

}
