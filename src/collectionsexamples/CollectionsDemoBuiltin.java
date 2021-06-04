package collectionsexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CollectionsDemoBuiltin {
//program to read integer elements and display sum of elements
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no of student");
		int n=Integer.parseInt(s.nextLine());
		//ArrayList al=new ArrayList();
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Enter the elememts");
		for(int i=0;i<n;i++)
		{
			al.add(s.nextInt());
			
		}
		System.out.println("display before sorting");
		System.out.println(al);
		Collections.sort(al);
		
		System.out.println("display after sorting");
		System.out.println(al);
		System.out.println("enter the key element to be searched");
		Integer key=s.nextInt();
		int k=Collections.binarySearch(al, 20);
		if(k>=0)
		{
			System.out.println("Element foudn at position "+k);
		}else
			System.out.println("element not foudn");
			int sum=0;
			java.util.Iterator<Integer> it=al.iterator();
			while(it.hasNext())
			{
			Integer z=(Integer)it.next();
		sum=sum+z;	
			}
			
		System.out.println("sum is "+sum);
		

	}

}
