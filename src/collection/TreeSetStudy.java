package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) 
	{
         TreeSet t=new TreeSet();
         
            t.add(90);
            t.add(60);
            t.add(40);
            t.add(101);
           // t.add(null);
           // t.add("pune");
            
            System.out.println(t);
            
        //    for(int i=0;i<=t.size()-1;i++)
            //	{
            
            //	System.out.println(((Object) t).get(i));
            
            //	}
            
            for(Object v:t)
            {
            	System.out.println(v);
            }
         System.out.println("***using iterator***********");   
            Iterator it = t.iterator();
     	   while(it.hasNext())   // iterator method use
     	   {
     		   System.out.println(it.next());
     	   }
           
     	   TreeSet<Integer> number=new TreeSet<>();
     	 number.add(5);
     	 System.out.println(number);
     	   number.addAll(t);
            		System.out.println(number);
            		
            	System.out.println("********using while loop");	
            		Iterator<Integer> it1=t.iterator();
            		
            		while(it1.hasNext())
            		{
            			System.out.println(it1.next());
            		}
            System.out.println("================================");
            		System.out.println(t.size());
            		System.out.println(t.isEmpty());
            		System.out.println(t.contains(90));
            		System.out.println(t.pollFirst());
            
            		System.out.println(t.remove(60));
            	System.out.println(t);
            		
            		
	}

}
