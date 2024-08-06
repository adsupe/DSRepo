package scb.com.javaft;

import java.util.Comparator;

class Students
{
	int rollNo;
	String nmae;
	double marks;
	public Students(int rollNo, String nmae, double marks) {
		super();
		this.rollNo = rollNo;
		this.nmae = nmae;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", nmae=" + nmae + ", marks=" + marks + "]";
	}
}
class RollnoComparator implements Comparator<Students>
{
 
	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		if(o1.rollNo>o2.rollNo)
		{
		return 1;
		}
		else if(o1.rollNo<o2.rollNo)
		{
			return -1;
		}
		else
			return 0;
	}
 
	
	}
class NameComparator implements Comparator<Students>
{
 
	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return o1.nmae.compareTo(o2.nmae);
	}
 
	
}
 
class MarkComparator implements Comparator<Students>
{
 
	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		if(o1.marks >o2.marks)
			return 1;
		else if(o1.marks<o2.marks)
			return -1;
		else
			return 0;
	}
}
