package assignment2;

import java.util.ArrayList;
import java.util.List;

import customexception.Account;

public class AccountArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List<Account> lst=new ArrayList<Account>();
   Account ob1 = new Account("Prateek Joshi",1001,2000);
   Account ob2 = new Account("Rahul Kumar",1002,2000);
   Account ob3 = new Account("Umang Mehta",1003,2000);
   Account ob4 = new Account("Prateek Joshi",1004,2000);
   Account ob5 = new Account("Prateek Joshi",1001,2000);

 lst.add(ob1);
 lst.add(ob2);
 lst.add(ob3);
 lst.add(ob4);
 lst.add(ob4);

 System.out.println(lst);
 System.out.println(lst.indexOf(ob1));
 System.out.println(lst.indexOf(ob3));
System.out.println(lst.size());
System.out.println(lst.lastIndexOf(ob4));
lst.remove(4);
System.out.println(lst.get(0));

	}

}
