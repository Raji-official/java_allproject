package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Iterates {
public static void main(String[] args) {
	
	
	
	
	List<Integer> ans=new ArrayList<Integer>();
	
	
	ans.add(23);
	ans.add(33);
	ans.add(43);
	ans.add(53);
	ans.add(73);
	ans.add(83);
	ans.add(93);
	System.out.println(ans);
	
//	iterator the values while  method access iterate hash next only 

//	
Iterator<Integer> iterator = ans.iterator();

while (iterator.hasNext()) {

	System.out.println( iterator.next());
	
}

System.out.println("///////////////////////////////////////////");
//list iterators privious()  and next() accessable
 ListIterator<Integer> listIterator = ans.listIterator();

System.out.println("///////////////////////////////////////////");
while (listIterator.hasPrevious()) {

	System.out.println( listIterator.previous());
	
}
	
while (listIterator.hasNext()) {

	System.out.println( listIterator.next());
	
}
	


//SET

Set<Integer> rs=new HashSet<Integer>();


rs.add(23); 
rs.add(33);
rs.add(43);
rs.add(53);
rs.add(73);
rs.add(83);
rs.add(93);
System.out.println(ans);
	
	
Iterator<Integer> setiterator = rs.iterator();

while (setiterator.hasNext()) {

System.out.println( setiterator.next());

}

System.out.println("///////////////////////////////////////////");
//set list iterate cannot be support

	
}
}
