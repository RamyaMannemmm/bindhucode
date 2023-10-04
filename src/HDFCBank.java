
public class HDFCBank extends RBIBank{

	
	public int hdfcinsuranceamnt=100;
	
	public static void main(String[] args) {
		
		HDFCBank hdfc=new HDFCBank();
		RBIBank rbi=new RBIBank();
		System.out.println(hdfc.minimumloanpercent);
		
		hdfc.privacypolicy();
		
		System.out.println(hdfc.hdfcinsuranceamnt);
		
		hdfc.insuranceschemes();
		//rbi.insuranceschemes();
		//overrinding
		RBIBank rbi1=new HDFCBank();
		
		//HDFCBank hdfc1=new RBIBank(); //not possible
		
		rbi1.insuranceschemes();
		
	}
	
	
	public String insuranceschemes()
	{
		System.out.println("hdfc defined insurance scheme");
		return null;
	}

}
