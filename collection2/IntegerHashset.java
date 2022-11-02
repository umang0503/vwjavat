package collection2;

import java.util.HashSet;
import java.util.Set;

public class IntegerHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> st = new HashSet<Integer>();
		st.add(1);
		st.add(2);
		st.add(3);
		st.add(1);
  System.out.println(st);
  
 System.out.println(st.size());
 st.remove(3);
 System.out.println(st);
 System.out.println(st.contains(1));

	}

}
