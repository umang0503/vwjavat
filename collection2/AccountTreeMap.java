package collection2;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

import collection.ComparatorImpl;
import collection.Employee;

import customexception.Account;

public class AccountTreeMap {
	public static void main(String[] args) {
	      Comparator<collection2.Account> c = new ComparatorBal();
    
	      Comparator<collection2.Account> c2 = new ComparatorName();
	      System.out.println("Sorted using balance");

      meth(c);
      System.out.println("Sorted using names");
      meth(c2);
		
	}
	public static void meth(Comparator<collection2.Account> c)
	{   SortedMap<collection2.Account,Double> smp = new TreeMap<collection2.Account,Double>(c);
		collection2.Account ob1 = new collection2.Account("Prateek Joshi",1001,2000.0);
		   collection2.Account ob2 = new collection2.Account("Rahul Kumar",1002,1000.0);
		   collection2.Account ob3 = new collection2.Account("Umang Mehta",1003,2500.0);
		   collection2.Account ob4 = new collection2.Account("Prateek Joshi",1004,2300.0);
		   collection2.Account ob5 = new collection2.Account("Prateek Joshi",1001,2000.0);
	        smp.put(ob1,ob1.getBalance());
	        smp.put(ob2,ob2.getBalance());

	        smp.put(ob3,ob3.getBalance());
	        smp.put(ob4,ob4.getBalance());
	        smp.put(ob5,ob5.getBalance());

System.out.println(smp);
	}
}
