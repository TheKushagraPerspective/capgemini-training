package Day16.ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {
	public static void main(String[] args) {
//		ArrayList Practice
		ArrayList al = new ArrayList();
		al.add(30);
		al.add(10);
		al.add(50);
		al.add(null);
		al.add(100);
		al.add(null);
		
		System.out.println(al);
		System.out.println("----------------------------------------------------------------------------");
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");

		
		ListIterator litr = al.listIterator();
		while(litr.hasNext()) {
			System.out.print(litr.next() + " ");
		}
		System.out.println();
		while(litr.hasPrevious()) {
			System.out.print(litr.previous() + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		
		
		ListIterator litr2 = al.listIterator(2);
		while(litr2.hasNext()) {
			System.out.print(litr2.next() + " ");
		}

		System.out.println();
		while(litr2.hasPrevious()) {
			System.out.print(litr2.previous() + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		
		System.out.println(al.reversed());
		System.out.println("----------------------------------------------------------------------------");
		
		Collections.reverse(al);
		System.out.println(al);
		System.out.println("----------------------------------------------------------------------------");
		
		
//		collections.sort() can not sort the list if it contains null values, so we need to remove the null values first
		al.removeIf(e -> e == null);
		Collections.sort(al);
		System.out.println(al);
		System.out.println("----------------------------------------------------------------------------");
	}
}
