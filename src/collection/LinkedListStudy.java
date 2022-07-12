package collection;


import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedListStudy {

	public static void main(String[] args) 
	{
	 
		LinkedList pp=new LinkedList();

		   pp.add("xyz");
		   pp.add('G');
		   pp.add(123);
		   pp.add("xyz");
		   pp.add(null);
		   pp.add(null);
		   pp.add(25.25);
		   pp.add(true);
		   
		   System.out.println(pp);
		   
		   System.out.println(pp.getFirst());
		   System.out.println(pp.get(4));
		   System.out.println(pp.getFirst());
		   System.out.println(pp.getLast());
		   System.out.println(pp.peek());
		   System.out.println(pp);
		   System.out.println(pp.poll());
		   System.out.println(pp);
		   System.out.println(pp.pop());
		   System.out.println(pp);
		   
		   //for loop
		   //for each
		   // iterator
		   // lis titerator
		   
		  for(int i=0;i<=pp.size()-1;i++)
		  {
			   System.out.println(pp.get(i));
		  }
		 
		  
		for(Object y:pp)
		   {
			   System.out.println(y);
		   }
		   
		 LinkedHashSet<Integer> hr=new LinkedHashSet<>();
		 hr.add(10);
		 hr.add(90);
		 hr.add(80);
		 hr.add(20);
		 hr.add(5);
		 
		 System.out.println("Link hashset "+ hr);
		 
	
		 
		 
	}

	
	
	

}
