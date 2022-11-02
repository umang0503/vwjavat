package collection2;

import java.util.LinkedList;
import java.util.Queue;

public class LinklistObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<collection2.Account> q=new LinkedList<collection2.Account>();
		collection2.Account ob2 = new collection2.Account("Rahul Kumar",1002,1000.0);
		   collection2.Account ob3 = new collection2.Account("Umang Mehta",1003,2500.0);
		   collection2.Account ob4 = new collection2.Account("Prateek Joshi",1004,2300.0);
		   collection2.Account ob5 = new collection2.Account("Prateek Joshi",1001,2000.0);
		   q.offer(ob2);
	        q.offer(ob3);
	        q.offer(ob4);
	        q.offer(ob5);
		   System.out.println(q.size());
	        System.out.println("peek:"+q.peek());
	        System.out.println(q.size());
	        
	        System.out.println("poll:"+q.poll());
	        System.out.println(q.size());
	        
	        System.out.println("poll:"+q.poll());
	        System.out.println(q.size());
	}

}
