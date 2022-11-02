package collection2;

import java.util.Comparator;
import java.util.HashMap;

public class AccountHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        HashMap<collection2.Account,Double> map = new HashMap<collection2.Account,Double>();
           collection2.Account ob1 = new collection2.Account("Prateek Joshi",1001,2000.0);
		   collection2.Account ob2 = new collection2.Account("Rahul Kumar",1002,1000.0);
		   collection2.Account ob3 = new collection2.Account("Umang Mehta",1003,2500.0);
		   collection2.Account ob4 = new collection2.Account("Prateek Joshi",1004,2300.0);
		   collection2.Account ob5 = new collection2.Account("Prateek Joshi",1001,2000.0);
	        map.put(ob1,ob1.getBalance());
	        map.put(ob2,ob2.getBalance());

	        map.put(ob3,ob3.getBalance());
	        map.put(ob4,ob4.getBalance());
	        map.put(ob5,ob5.getBalance());
	        System.out.println(map);
	}

}
