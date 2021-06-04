package collectionsexamples;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ways to create hashset
		HashSet hs= new HashSet();//def cap is 16 and lf is 0.75
		//HashSet hs= new HashSet(100);//initial cap is 100
		
		//HashSet hs= new HashSet(100,(float)0.9);//typecast to float the value
	//	HashSet<Integer> hs= new HashSet<Integer>();
		//add objects into hashset
		hs.add(100);
		hs.add('A');
		hs.add("Welcome");
		hs.add(true);
		hs.add(16.4);
		hs.add(null);
		hs.add(16.4);//[null, A, 100, 16.4, Welcome, true] insertion order not preserved
		hs.remove(16.4);//value 16.4 removed
		

		//nulls accepted
		System.out.println(hs);
		
		
		//to modify we cannot exisiting data we can use contains method
	System.out.println(hs.contains("Welcome"));//case sensitive
	
	System.out.println(hs.contains("welcome"));//false
	
	System.out.println(hs.isEmpty());
	
	//directly we dont have speicific element from the set as ther eis no index
			//we have to all data in a loop and retrieve the data
	//to retireve  either iterator or for each loop, no for loop as no index
	
	for(Object e:hs)
	{
		System.out.println(e);//prints the objects, as individual 
	}
	Iterator it= hs.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	}

}
