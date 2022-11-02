package collection2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import collection.Employee;

public class AccountHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set<collection2.Account> st = new HashSet<collection2.Account>();
           collection2.Account ob2 = new collection2.Account("Rahul Kumar",1002,1000.0);
		   collection2.Account ob3 = new collection2.Account("Umang Mehta",1003,2500.0);
		   collection2.Account ob4 = new collection2.Account("Prateek Joshi",1004,2300.0);
		   collection2.Account ob5 = new collection2.Account("Prateek Joshi",1004,2300.0);
		   
		   st.add(ob2);
		   st.add(ob3);
		   st.add(ob4);
		   st.add(ob5);
		   System.out.println(st);
		   Iterator<collection2.Account> itr = st.iterator();
	         
	          while(itr.hasNext())
	          {
	              collection2.Account ex = itr.next();
	              System.out.println(ex.getBalance());
	              System.out.println(ex);
	          }
	          System.out.println("Printing Employees of ArrayList using forEach method added in java 8");
	          st.forEach(ex-> 
	                {
	                   System.out.println(ex);
	                    double sal  = ex.getBalance();     
	                    System.out.println(sal);
	                    
	                   
	                }
	          
	            );
	          
	          
	          st.forEach(ex-> System.out.println(ex));

	}

}
