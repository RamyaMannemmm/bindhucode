import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions {

	public static void main(String[] args) throws FileNotFoundException {

		
		/*try {
			FileInputStream file=new FileInputStream(new File("c://programfiles"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			FileInputStream file=new FileInputStream(new File("c://source"));

		}*/
		
		try {
			int i=1/0;
			System.out.println(i);
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithematic divide by zero occured pls dont pass 0 as divident");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
