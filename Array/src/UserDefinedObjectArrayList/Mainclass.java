package UserDefinedObjectArrayList;

import java.util.ArrayList;
import java.util.Iterator;

class Student
{
	int sid;
	String sname;
	float sfees;
	public Student(int sid, String sname, float sfees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfees = sfees;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + "]";
	}
	
}

public class Mainclass {

	public static void main(String[] args) {
		
		Student s1=new Student(1,"Abi",2345.98f);
		Student s2=new Student(2,"Akshya",1234.55f);
		Student s3=new Student(3,"keerthana",4567.32f);
		
		
		ArrayList<Student> slist=new ArrayList<Student>();
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		
		System.out.println(slist);
		
		Iterator<Student> sit=slist.iterator();
		while(sit.hasNext())
		{
			Student sob=sit.next();
			System.out.println(sob.sid+" "+sob.sname+" "+sob.sfees);
		}
		
	
		

	}

}
