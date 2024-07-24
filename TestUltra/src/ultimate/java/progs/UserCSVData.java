package ultimate.java.progs;

public class UserCSVData {

	private String userName;
	private Integer id;
	private String fname;
	private String lname;
	
	
	
	public UserCSVData(String userName, Integer id, String fname, String lname) {
		super();
		this.userName = userName;
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
}
