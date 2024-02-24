package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collection_demo {
public static void main(String[] args) {
	
	
	

		
	
	List<Integer> data=new ArrayList<Integer>();
	data.add(2);
	data.add(45);
	data.add(33);
	data.add(32);
	data.add(25);
	

	
	System.out.println(data);
	data.remove(2);
	System.out.println(data);
	
	int indexOf = data.indexOf(45);
	System.out.println(indexOf);
	
	Integer get = data.get(2);
	System.out.println(get);
	data.set(2, 99);
	
	System.out.println(data);
	
	
	List<Integer> data1=new ArrayList<Integer>();
	System.out.println(data1);
	
	data1.addAll(data);
	System.out.println("addall"+data1);
	
	data1.removeAll(data);
	System.out.println("removeall"+data1);
	data1.add(88);
	data1.add(45);
	data1.add(2);
	data1.add(77);
	System.out.println(data1);
	
	boolean contains = data1.contains(data);
	System.out.println(contains);
	data1.retainAll(data);
	System.out.println(data1);
	
	
//	set collection 

	  Integer[] A = {22, 45,33, 66, 55, 34, 77};  
      Integer[] B = {33, 2, 83, 45, 3, 12, 55};  
      Set<Integer> set1 = new HashSet<Integer>();    
      set1.addAll(Arrays.asList(A));    
      Set<Integer> set2 = new HashSet<Integer>();    
      set2.addAll(Arrays.asList(B));   
      
      System.out.println(set1);
      System.out.println(set2);
  
   
      Set<Integer> union_data = new HashSet<Integer>(set1);    
      union_data.addAll(set2);    
      System.out.print("Union of set1 and set2 is:");    
      System.out.println(union_data);    
  
     
      Set<Integer> intersection_data = new HashSet<Integer>(set1);    
      intersection_data.retainAll(set2);       
      System.out.println(intersection_data);    
  
      
      Set<Integer> difference_data = new HashSet<Integer>(set1);    
      difference_data.removeAll(set2);    
      System.out.print("Difference of set1 and set2 is:");    
      System.out.println(difference_data);    
	
      int size = difference_data.size();
      System.out.println(size);
      
      difference_data.add(100); 
      difference_data.add(100);
      difference_data.add(200);
      System.out.println(difference_data);
	
	
	
//	tree set
	
	
      
      Set<String> tree_1 = new TreeSet <String>();    
      
//      tree_1.add("suzuki");
//      tree_1.add("ktm");
//      tree_1.add("bullet");
//      tree_1.add("bulser");
      Set<String> tree = new TreeSet <String>();    
      
      tree.add("raji");
      tree.add("tharun");
      tree.add("murugan");
      tree.add("manoj");
      System.out.println(tree);
      
      System.out.println(tree_1);  
	
	
      tree_1.addAll(tree);        
      System.out.println(tree); 
      System.out.println(tree_1);  
      
      tree.add("suresh");
      tree_1.retainAll(tree);       
      System.out.println(tree); 
      System.out.println(tree_1); 
      
	tree.removeAll(tree_1);
	System.out.println(tree);
	
	
	
	
	
	
}

}
