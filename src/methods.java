
public class methods {

	public static void main(String[] args) {
		methods method=new methods();
		int result=method.add(3,4);
		System.out.println(result);
		methods.method1();
		
	}
	
	
	public void main()
	{
		System.out.println("this is second main method");

	}
	
	public int add(int number1,int number2)
	{
		System.out.println(number1+number2);
		return number1+number2;
	}
	
	
	public static void method1()
	{
		System.out.println("this is static method");
	}

}
