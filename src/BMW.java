
public class BMW implements Car{

	public static void main(String[] args) {

		Car car=new BMW();
		car.m1();
		car.m2();
		System.out.println(car.noofwheels);
		
		
	}

	public void m1() {

		
		System.out.println("this is method 1");
	}

	public void m2() {
		System.out.println("this is method 2");		
	}

}
