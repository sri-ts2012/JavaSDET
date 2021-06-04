package collectionsexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListdemo {

	public static void main(String[] args) {
		//Declare arraylisy
		ArrayList al=new ArrayList();
		//homogenous data
		ArrayList<Integer> al1=new ArrayList<Integer>();
		
		ArrayList<String> s1=new ArrayList<String>();
		//we can imple,emt list interface and then create arraylist object
		List al2=new ArrayList();
		
	//	add new elements to the arraylist
		al.add(100);
		al.add("welcome");
		al.add("15.5");
		al.add('A');
		al.add(true);
		//print arraylist
		System.out.println(al);
		//insertion order is preserved,
		//how many objects from size()
		System.out.println("No.of elements in the arraylist:"+al.size());
		//remove, can pass index or else object
		al.remove(2);
		
		al.remove("welcome");
		System.out.println(al);
		//will add at the end but if we want to add in the middle then use indx
		//insert new element
		//add(index,object)
		al.add(1,"jav");
		System.out.println(al);
		//retireve specific element
		System.out.println(al.get(2));
		//replace element
		System.out.println(al.set(2, "element"));
		System.out.println(al);
		//search a value
		System.out.println(al.contains("element"));
		System.out.println(al.isEmpty());
		//multiple ways to retirve data from the arraylis
		//1.for loop2.foreach3.iterator
		System.out.println("reading elements using for loop");
		
		for(int i=0;i<al.size();i++)//array out of bounds when i<=al.size bcz i=0,1,2,3, but when i=5 size becomes 5 
		{
			System.out.println(al.get(i));
		}
		System.out.println("reading elements using for each loop");
		//using for each loop
		for(Object e:al)//retreving from al and store in e, as it should all kinds of elements so store in object
		
		System.out.println(e);
		
		
		//using iterator
		System.out.println("reading elements using iterator");
//iterator is parent interface  of collections , arraylist has methd called iterator(), 
		Iterator it=al.iterator();//we caputre all elements from arraylist to it variable
		while(it.hasNext())//returns tru if iterator is having element
		{
			System.out.println(it.next());//retujrns object from al, print and moves to the next element
		}
		
		
		//add All elements of one al to another al
		ArrayList al3=new ArrayList();
		al3.add("X");
		al3.add("Y");
		al3.add("Z");
		al3.add("A");
		al3.add("B");
		
		System.out.println(al3);
		
		ArrayList al3Dup=new ArrayList();
		al3Dup.addAll(al3);
		System.out.println(al3Dup);
		al3Dup.removeAll(al3);//removing elements from al3DUp not the al3
		System.out.println(al3Dup);//empty[]
		
		//sort-collections class method, sort()
		Collections.sort(al3);//its ascending order
		
		System.out.println("elements after sorting"+al3);//A,B,X,Y,Z
		
		//to sort in descending or reverse order
		
		Collections.sort(al3,Collections.reverseOrder());
		System.out.println(al3);
		
		//shuffle-collections.shuffle random 
		Collections.shuffle(al3);
		
		//to convert array to arraylist
		String[] arr={"Dog","Cat","xy"};
		for( String value:arr)
		{
			System.out.println(value);
		}
		ArrayList al4=new ArrayList(Arrays.asList(arr));//we have to use Arrays class method  and pass the array
		System.out.println(al4);
		
	/*	Dog
		Cat
		xy*///this is array
	//	[Dog, Cat, xy] this is arraylist
		
		
		
		
	}

}
