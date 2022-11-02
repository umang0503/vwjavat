package collection2;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import collection.ComparatorImpl;
import collection.Employee;

public class Accounttreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Comparator<collection2.Account> c = new ComparatorAccount();

		SortedSet<collection2.Account> s = new TreeSet<collection2.Account>(c);
		collection2.Account ob2 = new collection2.Account("Rahul Kumar",1002,1000.0);
		   collection2.Account ob3 = new collection2.Account("Umang Mehta",1003,2500.0);
		   collection2.Account ob4 = new collection2.Account("Prateek Joshi",1004,2300.0);
		   collection2.Account ob5 = new collection2.Account("Prateek Joshi",1001,2000.0);
		   s.add(ob2);
		   s.add(ob3);
		   s.add(ob4);
		   s.add(ob5);
     System.out.println(s);
		   
	}

}
