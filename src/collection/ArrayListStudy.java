package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayListStudy {


	public static void main(String[] args)
	{
	ArrayList a=new ArrayList<>();
	
	a.add("Velocity");//array list
	a.add('A');
	a.add(123);
	a.add(true);
	a.add(123.345);
	a.add("Velocity");
	a.add(null);
	a.add(123);
	a.add(null);
	
	System.out.println(a);
	System.out.println(a.size());
	System.out.println(a.isEmpty());
	System.out.println(a.contains(123));
	System.out.println(a.get(2));
	System.out.println(a.indexOf(123));
	
	    System.out.println(a.indexOf("Velocity"));
	    System.out.println(a.lastIndexOf("Velocity"));
	    
	    System.out.println(a.remove(1));
	    System.out.println(a);
	    
	    for(int i=0;i<=a.size()-1;i++) //individual elements are shown in for loop.
	    {
	    	System.out.println(a.get(i));
	    }
	    
	    System.out.println("============41=======");
	    
	   Iterator it = a.iterator();
	   while(it.hasNext())   // iterator method use
	   {
		   System.out.println(it.next());
	   }
	   System.out.println("======================");
	   
        ListIterator itr = a.listIterator();   //listIterator method use
             while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
             System.out.println("========55==============");
      	   
         
             while(itr.hasPrevious())
            		 {
            	    System.out.println(itr.previous());
            		 }
             
	   System.out.println("*********55***********");
	   
	   for(Object h:a)
	   {
		   System.out.println(h);
	   }
	   System.out.println("===========61===============");
	     ArrayList<Integer> ai=new ArrayList<>();
	     
	     ai.add(12);
	     ai.add(23);
	     ai.add(34);
	     ai.add(50);
	     ai.add(21);
	     
	       System.out.println(ai);
	       
	       for(Integer q:ai)
	       {
	    	   System.out.println(q);
	       }
	       
	       ArrayList<Character> as=new ArrayList<>();
	       
	       as.add('k');
	       as.add('f');
	       as.add('a');
	       as.add('d');
	       as.add('e');
	  
	       System.out.println(as);
	       
	       for(Character r:as)
	       {
	    	   System.out.println(r);
	       }
	       
	  	 Collections.sort(as);
		 System.out.println(as);
	       
	       
	       
	    
	
	}
	}


	
