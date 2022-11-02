package collection2;

import java.util.Comparator;

import collection.Employee;

public class ComparatorBal implements Comparator<collection2.Account>{
	 public int compare(Account e1,Account e2)
	    {
	        System.out.println("comparing e1.balance:"+e1.getBalance()+" and e2.balance:"+e2.getBalance());
	        return (int)(e1.getBalance() - e2.getBalance());
}
}