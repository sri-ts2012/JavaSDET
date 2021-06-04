package collectionsexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
//program to read and write user defined data using arraylist
public class CollectionsUserDefined {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no of student");
		int n=Integer.parseInt(s.nextLine());
		ArrayList al=new ArrayList();
		
		System.out.println("Enter the student data");
		for(int i=0;i<n;i++)
		{
			System.out.println("enter tne name");
			String name=s.nextLine();
			System.out.println("enter the rno");
			int rno=Integer.parseInt(s.nextLine());
			
			al.add(new StuData(name,rno));
			//al.add(s.nextLine());
		}
		System.out.println("--dis from the StuData");
		Iterator it=al.iterator();
		while(it.hasNext())
		{
		StuData	z=(StuData)it.next();
	z.disData();	
		}

	}

}
