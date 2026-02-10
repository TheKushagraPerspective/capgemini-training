package Day14.Question;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ListInterface {
    public static void main(String[] args) {
        List list = new LinkedList();
        
        list.add(10);
        list.add("Kush loves Kushi");
        list.add(30);

        Set s=new HashSet<>(list);
        System.out.println(s);

        ListIterator iterator = list.listIterator();

        while(iterator.hasNext()) {
            Object obj = iterator.next();
            if(obj instanceof Integer && (Integer)obj == 10) {
                iterator.add(25);
            }
            System.out.println(obj);
        }
        System.out.println(list);
    }   
}
