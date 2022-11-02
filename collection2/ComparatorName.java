package collection2;

import java.util.Comparator;

public class ComparatorName implements Comparator<collection2.Account> {
	public int compare(Account e1,Account e2)
    {
        System.out.println("comparing e1.Name:"+e1.getAccountHolderName()+" and e2.name:"+e2.getAccountHolderName());
        return (int)(e1.getAccountHolderName().charAt(0) - (e2.getAccountHolderName().charAt(0)));
}
}