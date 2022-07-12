package collection;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetStudy1 {

	public static void main(String[] args)
	{
		HashSet hs=new HashSet();

		   hs.add("pune");
		   hs.add("pune"); //add duplicate
		   hs.add(null);
		   hs.add(null);
		   hs.add(123);
		   hs.add(34.67);
		   hs.add(true);
		   hs.add('A');
		   
		   System.out.println(hs);
		   
		   System.out.println(hs.size());
		   System.out.println(hs.contains('B'));
		   System.out.println(hs.isEmpty());
		   System.out.println(hs.remove('A'));
		   System.out.println(hs);
		   
		             Iterator it = hs.iterator(); // store in reference variable
		   
		         while(it.hasNext())
		         {
			   System.out.println(it.next());
		          }
		        
		      for(Object p:hs);
		      {
		    	  System.out.println(0);
		      }
		     
		      System.out.println("*****************");
		      hs.clear();
		      System.out.println(hs);
		      System.out.println(hs.size());
		      System.out.println(hs.isEmpty());
		      
		      
		      
		      
		      
		
	}

}
