import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class collections {

	public static void main(String[] args) {

		/*List<Integer> list=new ArrayList<Integer>();
		
		
		list.add(1);
		list.add(2);
		
		System.out.println(list);
		
		for(int list1:list)
		{
			System.out.println(list1);
		}
		
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));

		}*/
		
		
	/*	Set<String> set1=new TreeSet<String>();
		
		set1.add("ramya");
		set1.add("mannem");
		set1.add("ashu");
		
		System.out.println(set1);
		
	}*/
	
	//username-ramya, password-123
		
		Map<String,String>map1=new HashMap<String,String>();
		
		map1.put("username", "ramya");
		
		map1.put("password", "ramya@123");
		
		
		
		System.out.println(map1);
		
		System.out.println(map1.get("username"));
	
		for(Map.Entry<String, String> value : map1.entrySet())
		{
			System.out.println(value.getKey());
			System.out.println(value.getValue());
		}
		int i=0;
		while(i<10)
		{
			i=1;
			System.out.println(i);
		}
	

}
	
}
