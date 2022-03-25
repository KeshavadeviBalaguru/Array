package TreeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Student
{
	int sid; 
	String sname;
	
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	
	
}
class StudentIdSort implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.sid-o2.sid;
	}
	
}
class StudentNameSort implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.sname.compareTo(o2.sname);
	}
	
}
public class TreeSetMainClass {

	public static void main(String[] args) {
		
		StudentIdSort sis=new StudentIdSort();
		TreeSet<Student> sot=new TreeSet<Student>(sis);
		Student s1=new Student(1,"EEEE");
		Student s2=new Student(5,"PPPP");
		Student s3=new Student(3,"kkkk");
		Student s4=new Student(6,"AAAA");
		sot.add(s3);
		sot.add(s1);
		sot.add(s2);
		
		Iterator<Student> sit=sot.iterator();
		while(sit.hasNext())
		{
			Student sob=sit.next();
			System.out.println("Student id= " +sob.sid+" Student Name= "+sob.sname);
		}
		System.out.println("Sorting the Name");
		StudentNameSort sns=new StudentNameSort();
		TreeSet<Student> sot1=new TreeSet<Student>(sns);
		sot1.add(s4);
		sot1.add(s3);
		sot1.add(s2);
		sot1.add(s1);
		
		Iterator<Student> sit1=sot1.iterator();
		while(sit1.hasNext())
		{
			Student sob1=sit1.next();
			System.out.println("Student id= " +sob1.sid+" Student Name= "+sob1.sname);
		}

	}

}
