package collection2;

import java.util.HashSet;
import java.util.Set;

public class Hashsetex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
        Set<Employee> st = new HashSet<Employee>();
        
        Employee e1 = new Employee(101,"Rahul",25000,1);
        
        st.add(e1);
        
        Employee e = new Employee(102,"Vedant",2000,2);
        
        st.add(e);
        
        st.add(new Employee(103,"Saurabh",35000,3));
        st.add(new Employee(101,"Rahul",25000,1));
        
        
        System.out.println(st);
        System.out.println(st.size());
	}

}
