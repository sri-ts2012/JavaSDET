package collectionsexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class SortUserDefined {

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
		//	int rno=s.nextInt();//checking with this rather than above
			//if using above line then getting like this together instead of separate
			/*enter tne name
			enter the rno*/
			al.add(new StuData1(name,rno));
			//al.add(s.nextLine());
		}
		Collections.sort(al);//since its not sorted we have to sort first 
		System.out.println("--dis from the StuData");
		Iterator it=al.iterator();
		while(it.hasNext())
		{
		StuData1	z=(StuData1)it.next();
	//z.disData();	 here can avoid calling and directly write syso(z) as toString is overiden
		System.out.println(z);//because z is of type Studata and not string its not auto overriden
		//also can use z.disdata() as well
		}

	}

}
