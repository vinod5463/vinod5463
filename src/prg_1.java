import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


class emp implements Comparable 
{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	emp(String name,int age)
	{
		this.age=age;
		this.name=name;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		emp e=(emp)o;
		if(e.age>this.age)
		{
			return 1;
		}
		else if(e.age<this.age)
		{
			return -1;
			
		}
		else
		{
			return 0;
		}
	}
}

class ename implements Comparator<emp>
{

	@Override
	public int compare(emp o1,emp o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}
public class prg_1 
{
 public static void main(String args[])
 {   Map<String, Integer>map=new HashMap<String, Integer>();
	 emp e1=new emp("vinod1",10);
	 emp e2=new emp("vinod2",40);
	 emp e3=new emp("vinod3",30);
	 emp e4=new emp("vinod4",20);
	 emp e5=new emp("vinod0",50);
	 map.put("v1",10);
	 map.put("v2",20);
	 map.put("v3", 30);
	 map.put("v4",40);
	 
	 for(Map.Entry m:map.entrySet())
	 {
		 System.out.println(m.getKey()+"==>"+m.getValue());
	 }
	 
    Set<String>key=map.keySet();
    
    for(String n:key)
    {
    	System.out.println(n);
    }
    
    Collection<Integer>i=map.values();
    System.out.println(i);
	 ArrayList al=new ArrayList();
	 al.add(e1);
	 al.add(e5);
	 al.add(e4);
	 al.add(e3);
	 al.add(e2);
	 
	 Collections.sort(al);
	 
	// Collections.sort(al,new ename());
	 Iterator it=al.iterator();
	 
	 while(it.hasNext())
	 {
		 emp e=(emp)it.next();
		 System.out.println(e.name+"---"+e.age);
	 }
 }
}
