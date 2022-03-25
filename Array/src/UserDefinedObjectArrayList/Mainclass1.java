package UserDefinedObjectArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

class Employee
{
	int eid;
	String ename;
	float esalary;
	static String edeptname="PKIET";
	public Employee(int eid, String ename, float esalary)
	{
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	@Override
	public String toString()
	{
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
}
	
	class MySortEmployeeId implements Comparator<Employee>
	{

		@Override
		public int compare(Employee o1, Employee o2)
		{
			if(o1.eid>o2.eid)
			return 1;
			else if(o1.eid<o2.eid)
				return -1;
			else
				return 0;
		}
		
	}
	class MySortEmployeeSalary implements Comparator<Employee>
	{

		@Override
		public int compare(Employee o1, Employee o2) {
			if(o1.esalary>o2.esalary)
				
			return 1;
			else if(o1.esalary<o2.esalary)
				return -1;
			else 
				return 0;
		}
		
	}
	class MysortEmployeeName implements Comparator<Employee>
	{

		@Override
		public int compare(Employee o1, Employee o2) {
			
			return o1.ename.compareTo(o2.ename);		
					
		}
		
	}



public class Mainclass1
{

	public static void main(String[] args) 
	{   
		Employee e3=new Employee(3,"Mani",24567.77f);
		Employee e2=new Employee(7,"Kuzhali",24678.88f);
	    Employee e1=new Employee(2,"Priya",25678.99f);
		
		
		
		Vector<Employee> elist=new Vector<Employee>();
		elist.add(e3);
		elist.add(e1);
		elist.add(e2);
		
		System.out.println(elist);
		
		Iterator<Employee> iel=elist.iterator();
		while(iel.hasNext())
		{
			Employee ob=iel.next();
			System.out.println(ob.eid+" "+ob.ename+" "+ob.esalary+" "+Employee.edeptname);
		}
		//Sort for salary
		Collections.sort(elist,new MySortEmployeeSalary());
		System.out.println("After sort");

		Iterator<Employee> iel1=elist.iterator();
		while(iel1.hasNext())
		{
			Employee ob1=iel1.next();
			System.out.println(ob1.eid+" "+ob1.ename+" "+ob1.esalary+" "+Employee.edeptname);
		}
		//Sort for Id
		Collections.sort(elist,new MySortEmployeeId());
		System.out.println("After sort");

		Iterator<Employee> iel2=elist.iterator();
		while(iel2.hasNext())
		{
			Employee ob2=iel2.next();
			System.out.println(ob2.eid+" "+ob2.ename+" "+ob2.esalary+" "+Employee.edeptname);
		}
		//Sort for Name
		Collections.sort(elist,new  MysortEmployeeName());
		System.out.println("After sort");

		Iterator<Employee> iel3=elist.iterator();
		while(iel3.hasNext())
		{
			Employee ob3=iel3.next();
			System.out.println(ob3.eid+" "+ob3.ename+" "+ob3.esalary+" "+Employee.edeptname);
		}
	
	}

}
