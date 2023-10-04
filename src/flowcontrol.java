
public class flowcontrol {

	public static void main(String[] args) {
		flowcontrol flow=new flowcontrol();
		
		int resulttaxpercent=flow.taxestimator(10000);
		
		System.out.println(resulttaxpercent);
		
		
		/* List<WebElement> list=driver.findWebElements(By.xpath("common xpaths"));
		 
		 
		 
		 for(List list1:list) 
		 {
			 syso(list1.getText());
		 }
		 
		 for(int i=0;i<list.size();i++)
		 {
			 syso(list1.getText());

		 }*/

		for(int i=1;i<=10;i=i+1)
		{
		 
			if(i==6)
			{
				continue;
			}
			System.out.println("this is for loop"+i+"thtime");

		 
		}
		//int j=0;
		/*while(!(value.equals(false)))
		{
			System.out.println("this is while loop"+j+"thtime");
			//j++;
			String value=driver.findELement().gettext();
		}*/
		/*int k=0;
		do
		{
			System.out.println("this is do while loop"+k+"thtime");

			k++;
			
		}while(k<10);*/
		
		
		System.out.println("you came out of for loop");
		
		switchstatement('3');
	}
		
		
		
	
	
	public int taxestimator(int salary)
	{
		int taxpercent=0;
		if(salary>50000)
		{
			taxpercent=10;
			
		}
		
		else
		{
			
		}
		if(salary<50000 && salary>10000)
		{
			taxpercent=2;
			
		}
		
		if(salary<=10000)
		{
			taxpercent=0;
		}
		
		
	 return taxpercent;
	}
	
	
	public static void switchstatement(char c)
	{
		switch(c)
		{
			case '1': System.out.println("in case 1");
			case '2': System.out.println("in case 2");
			case '3': System.out.println("in case 3");

			default : System.out.println("default case");
		
		
		
		
		}
		
		
		
		
		
		
	}
	
	
	

}
