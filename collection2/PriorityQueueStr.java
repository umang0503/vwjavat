package collection2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new PriorityQueue<String>();
		q.offer("Umang");
        q.offer("Aditya");
        q.offer("Paras");
        q.offer("Prashant");
        q.offer("Vivek");
        System.out.println(q);

        System.out.println(q.size());
        System.out.println("peek:"+q.peek());
        System.out.println(q);
        System.out.println("poll:"+q.poll());
        System.out.println(q);
        
        System.out.println("poll:"+q.poll());
        System.out.println(q.size());
        q = new LinkedList<String>();
        System.out.println(q);
        q.offer("Umang");
        q.offer("Aditya");
        q.offer("Paras");
        q.offer("Prashant");
        q.offer("Vivek");
        System.out.println(q.size());
        System.out.println("peek:"+q.peek());
        System.out.println(q.size());

	}

}
