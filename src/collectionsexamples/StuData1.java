package collectionsexamples;

public class StuData1 implements Comparable {
//implements Comparable{
	
		String name;
		int rno;

			
			

			public StuData1(String name, int rno) {
				this.name=name;
				this.rno=rno;
			}
			
			public String toString()
			{
				return "name="+name+"\nrno="+rno;
				
			}

		/*	public void disData() {
				 System.out.println("name="+name);
				 System.out.println("rno="+rno);
				
			}*/
			
		/*	public int compareTo(Object obj)
			{
			//number comaparision
			StuData1 st=(StuData1) obj;
			if(rno==st.rno)
			
				return 0;
			else if(rno>st.rno)
				return 1;
			else return -1;*/
			
			//string compariosn
		public	int compareTo(Object obj)
		{
			StuData1 st=(StuData1) obj;
			
		  if(st.name.compareTo(name)==0)//name is this.name
	//my explanation		  //st.name is the first name from the collection objects added 
			  //so first collection object name is compared to the this.name,
			  //then collection object same name is compared to the second object of the this.name
				return 0;
			else if(st.name.compareTo(name)<0)
				return 1;
			else return -1;
			
			
		/*	//String stname=(String) obj1;
		 * if(name.compareTo(stname)==0)
				return 0;
			else if(name.compareTo(stname)>0)
				return 1;
			else return -1;
			*/
}
}

/*public int compare(Object o1, Object o2)
{
     // have to return -ve if o1 has to come before o2
     // have to return +ve if o1 has to come after o2
     // have to return 0 if o1 is equal to o2
}*/

