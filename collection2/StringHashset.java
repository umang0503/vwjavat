package collection2;

import java.util.HashSet;
import java.util.Set;

public class StringHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> st = new HashSet<String>();
		st.add("Umang");
		st.add("Vedant");
		st.add("Aditya");
		st.add("Varun");
  System.out.println(st);
  
 System.out.println(st.size());
 st.remove("Vedant");
 System.out.println(st);
 System.out.println(st.contains("Aditya"));
	}

}
