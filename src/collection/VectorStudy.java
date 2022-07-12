package collection;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args)
	{
	       Vector v=new Vector();
            
	       v.add("nagpur");
	       v.add('p');
	       v.add("nagpur");
	       v.add(null);
	       v.add(null);
	       v.add(15);
	       v.add(1.5);
	       v.add(54345);
	       
	       System.out.println(v.elementAt(3));
	       System.out.println(v.get(5));
	       System.out.println(v);
	       System.out.println(v.remove(1.5));
	       System.out.println(v);
	       System.out.println("=========================");
	       
	       ListIterator lit = v.listIterator();
	       while(lit.hasNext())
	       {
	    	   System.out.println(lit.next());
	       }
	       System.out.println("*************************");
	       
	      Enumeration ve = v.elements();
	      while(ve.hasMoreElements())
	      {
	    	  System.out.println(ve.nextElement());
	      }
	      
	}

}
