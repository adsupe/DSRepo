package ultimate.java.progs;

public class Employee {

	private Integer id;
	
	private String designation;
	
	private String name;
	
	public Employee(Integer id, String designation, String name) {
		super();
		this.id = id;
		this.designation = designation;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime*result + ((designation == null) ?0 : designation.hashCode());
        return result;
    }
	
	 public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Employee other = (Employee) obj;
	        if (id != other.id)
	            return false;
	        if (name == null) {
	            if (other.name != null)
	                return false;
	        } else if (!name.equals(other.name))
	            return false;
	        if(designation == null) {
	        	if(other.designation!=null)
	        		return false;
	        }  else if(!designation.equals(other.designation))
	        	return false;
	        return true;
	    }
}
