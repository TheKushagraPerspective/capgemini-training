package Day16.Practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(20);
		hs.add(10);
		hs.add(50);
		hs.add(null);
		hs.add(25);
		
		System.out.println(hs);
		
		
			
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(20);
		lhs.add(10);
		lhs.add(50);
		lhs.add(null);
		lhs.add(25);
		
		System.out.println(lhs);
		System.out.println(lhs.reversed());
		
		
		
			
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(20);
		ts.add(10);
		ts.add(50);
		ts.add(25);
		
		System.out.println(ts);
		System.out.println(ts.descendingSet());
		
		
		Set<String> s=new TreeSet<>();
		s.add("Sheela");
		s.add("Leela");
		s.add("Kamala");
		s.add("Vimala");
		
		System.out.println(s);
		TreeSet<String> t1=(TreeSet)s;
		System.out.println(t1.descendingSet());
		System.out.println(t1);
		
		Iterator<String> itr=t1.descendingIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		
		
		
	}
}
