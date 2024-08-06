package scb.com.javaft;

class Emps implements Comparable<Emps>
{
	private int eId;
	private String ename;
	private double sal;
	public Emps() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emps(int eId, String ename, double sal) {
		super();
		this.eId = eId;
		this.ename = ename;
		this.sal = sal;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emps [eId=" + eId + ", ename=" + ename + ", sal=" + sal + "]";
	}
	@Override
	public int compareTo(Emps o) {
		// TODO Auto-generated method stub
		if(this.eId == o.eId)
			return 0;
		else if(this.eId > o.eId)
			return 1;
		else
		return -1;
	}
}
