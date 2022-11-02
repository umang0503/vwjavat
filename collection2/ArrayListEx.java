package collection2;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List lst = new ArrayList();
     List<String> names = new ArrayList<String>();
     names.add("Umang");
     names.add("Rahul");
     names.add("Vaibhav");
    System.out.println(names.get(0));
    System.out.println(names);
    
     lst.add(100);
     lst.add(10);
     lst.add(1);
     System.out.println(lst);   //lst.toString();
     
     System.out.println(lst.size());
     
     int no = (int) lst.get(0); //  new Integer(100).intvalue() -- auto-unboxing - unbox Integer object to its primitive value
     System.out.println("value at index position 0:"+no);
     
     System.out.println(lst); 
     System.out.println(lst.size());
     
      lst.remove(0);
      
      System.out.println(lst);   
      System.out.println(lst.size());
      
      lst.set(0,130);
      System.out.println(lst); 
      System.out.println(lst.size());
      
	}

}
