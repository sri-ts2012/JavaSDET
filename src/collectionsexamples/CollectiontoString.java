package collectionsexamples;

public class CollectiontoString {
//getting error1
//added to see changes
	//this is the comment added from branch created
	
	public static void main(String[] args) {
		for (String li : list3) {

			System.out.println(li);
		//	String[] s1=li.split("\n");
		String li1=	li.substring(1, 3);//will this work?
			System.out.println(li1);
			System.out.println("from for each method"+li1);
		
		String str[] = new String[list3.size()];



or this is the way below
String str[] = new String[list3.size()];
	//	System.out.println(
				
				
		//System.out.println(list3.get(1));
		 for (int j = 0; j < list3.size(); j++) { 
			  
	            // Assign each value to String array 
	            str[j] = list3.get(j);
	            System.out.println(str[j]);
	          String[] s=str[j].split("\n");
	          //as split as per new line so we are getting each line in one string after split,so name in one and price in another :-)
	        //i thought i gave space ||s
	          System.out.println("length is "+s.length);
	         
	        	  System.out.println(s[1]+s[2]);
	          
	            
	            
	            
		 }
		}
		 
		 //first list is copied to string array using , str[j] = list3.get(j);ie maruti suzuki swift is str[0],baleno is str[1]
		 //again the each indexed string having 6 items is split as per space giving another string array of name s
		 //in that each s, we need first and 2 index (name and price)
		 
		// System.out.println("printing the array"+str[1]);
		
		 //4.4
		// Maruti Suzuki Baleno
		// ? 5.88 Lakhonwards
		// Show price in my city
		// Avg. Ex-Showroom price
		// Get Best Offer//
		/* System.out.println(str[1]);
         System.out.println(str[2]);*/
	}

}
