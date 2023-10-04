
public class overloading {

	public static void main(String[] args) {
	
		
		overloading overload=new overloading();
		
		overload.add();
		overload.add(1.0f);
		//overload.add(1, 2);


		
		
	}
	
	
	public void add()
	{
		System.out.println("this is default add method");
	}
	
	
	public int add(int a)
	{
		int b=1;
		System.out.println(a+b);
		return a+b;
	}
	
	public void add(float a)
	{
		System.out.println(a);
	}

}
