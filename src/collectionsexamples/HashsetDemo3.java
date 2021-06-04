package collectionsexamples;

import java.util.HashSet;

public class HashsetDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//union, intersection, difference--union all womt be there as therw will be duplicates and hashset wont allow duplicates
		
		HashSet<Integer> set1=new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		System.out.println("Hashset"+set1);
		
		HashSet<Integer> set2=new HashSet<Integer>();
	
		set2.add(3);
		set2.add(4);
		set2.add(5);
	//	System.out.println("Hashset"+set2);
		//union -adds and eleimiates the duplicates for that use addall
		//set1.addAll(set2);//will add to set1
	//	System.out.println("union"+set1);//union[1, 2, 3, 4, 5]
		//intersection
		//keep the common ones, retainall will give the common
		//except set2 rest of the elements will be not there
		//set2 will be there 
		set1.retainAll(set2);
		System.out.println("intersection"+set1);//intersection[3, 4, 5]
		//difference
	//	set1.removeAll(set2);//1,2
		//System.out.println(set1);//[1, 2]
		//subset
	//	System.out.println(set1.containsAll(set2));
	//	System.out.println("subset"+set1);//elements 3,4,5 then true if diff even one then it is false
		
		//if set2 elements are part of set1 then returns true or else false
		
		
		
		
		
		
		
		
		

	}

}
