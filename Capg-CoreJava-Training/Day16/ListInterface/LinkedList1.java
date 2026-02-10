package Day16.ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedList1 {
	public static void main(String[] args) {
//		LinkedList Practice
		LinkedList ll = new LinkedList();
		ll.add(30);
		ll.add(10);
		ll.add(50);
		ll.add(null);
		ll.add(100);
		ll.add(null);
		
		System.out.println(ll);
		System.out.println("----------------------------------------------------------------------------");
		
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");

		
		ListIterator litr = ll.listIterator();
		while(litr.hasNext()) {
			System.out.print(litr.next() + " ");
		}
		System.out.println();
		while(litr.hasPrevious()) {
			System.out.print(litr.previous() + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		
		
		ListIterator litr2 = ll.listIterator(2);
		while(litr2.hasNext()) {
			System.out.print(litr2.next() + " ");
		}

		System.out.println();
		while(litr2.hasPrevious()) {
			System.out.print(litr2.previous() + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		
		
		Iterator itr2 = ll.descendingIterator();
		while(itr2.hasNext()) {
			System.out.print(itr2.next() + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		
		
		System.out.println(ll.reversed());
		System.out.println("----------------------------------------------------------------------------");
		
		Collections.reverse(ll);
		System.out.println(ll);
		System.out.println("----------------------------------------------------------------------------");
		
		
//    	collections.sort() can not sort the list if it contains null values, so we need to remove the null values first
		ll.removeIf(e -> e == null);
		Collections.sort(ll);
		System.out.println(ll);
		System.out.println("----------------------------------------------------------------------------");
		
	}
}
