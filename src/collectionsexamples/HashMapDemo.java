package collectionsexamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap m=new HashMap();
	//	HashMap<Integer,String>m=new HashMap<Integer,String>();
m.put(101,"john");
m.put(102,"David");
m.put(103,"scott");
m.put(104,"maryd");
m.put(101,"David");
System.out.println(m);//{101=David, 102=David, 103=scott, 104=maryd}
HashMap[] Array = null;
Array[0]=m;

System.out.println(m.get(101));
System.out.println(m.remove(101));
System.out.println(m);
System.out.println(m.get(101));
System.out.println(m.containsKey(101));
System.out.println(m.containsValue("xyz"));
System.out.println(m.isEmpty());
System.out.println(m.keySet());

//iterator can access like entryset? will try
//iterator
	Set s1=m.keySet();//for this the hashmap need not be generics can be object type
	
	java.util.Iterator itr1=s1.iterator();
	
	while(itr1.hasNext())
	{
		Object o= itr1.next();
		System.out.println("Key is:"+o);
	}


System.out.println(m.values());
System.out.println(m.entrySet());//[102=David, 103=scott, 104=maryd]
for(Object k:m.keySet())
{
	System.out.println(k);
}

for(Object v:m.values())
{
	System.out.println(v);
}

for(Object i:m.keySet())
{
	System.out.println(i+" "+m.get(i));
}


//entry methods
//below i wrote not used i think--can use i guess
for(Object kv:m.entrySet())
{
	System.out.println(kv);
}
	/*102=David
			103=scott
			104=maryd
*/
	//need to declare hashmap like this 
//	HashMap<Integer,String>m=new HashMap<Integer,String>();
	/*for(Map.Entry entry:m.entrySet())
	{
		System.out.println(entry.getKey()+"    "+entry.getValue());
	}
	*/
	//iterator
	Set s=m.entrySet();//for this the hashmap need not be generics can be object type
	//because here in while loop it will return of type object and we will be typecasting to entry type
	//where as in for each loop , ie m.entryset will return of type Map.Entry 
	//where as the itr.next returns of type object
	java.util.Iterator itr=s.iterator();
	
	while(itr.hasNext())
	{
		Map.Entry entry=(Entry) itr.next();
				System.out.println(entry.getKey()+" "+entry.getValue());
	}


	}

}
