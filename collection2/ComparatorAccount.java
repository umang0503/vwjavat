package collection2;

import java.util.Comparator;

public class ComparatorAccount implements Comparator<collection2.Account> {
	 public int compare(Account e1,Account e2)
	    {
	        System.out.println("comparing e1.balance:"+e1.getAcctNo()+" and e2.balance:"+e2.getAcctNo());
	        return (int)(e1.getAcctNo() - e2.getAcctNo());

}}
