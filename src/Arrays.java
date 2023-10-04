
public class Arrays {

	public static void main(String[] args) {

		int [] array= {1,2,6,4,3}; //static initiallization
		
		int [] array1=new int[10]; //dynamic initillatization
		
		String [] array2= {"ramya","mannem"};
		
		for(int i=0;i<10;i++) //array assignment
		{
			
			array1[i]=i+1;
			
		}
		
		//System.out.println(array1);
		
		for(int i=0;i<10;i++) //-> 0-9
		{
			
			//System.out.println(array1[i]);
			
		}
		
		//array[6]=10;
		
		twodimensionarray();
	}
	
	
	public static void twodimensionarray()
	{
		
		int [][] phonenumbers=new int[3][3];
		int k=0;
		
		for(int i=0;i<3;i++) //colmn traversing i->0
		{
			for(int j=0;j<3;j++) //row traversing j-0
			{
				
				phonenumbers[j][i] =++k;
				
			}
		}
		
		
		for(int i=0;i<3;i++) //colmn traversing i->0
		{
			for(int j=0;j<3;j++) //row traversing j-0
			{
				System.out.println(phonenumbers[j][i] );
				//
				
			}
		}
		
		
	}

}
