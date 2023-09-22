package in.com.CollectionsFramework;

public class Employee2 {
	private int empId=0;
	private String name=null;
	private String phone=null;
	
	public Employee2(int empId,String name, String phone) {
		this.empId=empId;
		this.name=name;
		this.phone=phone;
		
	}
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setName(String name) {
		this.name=name;	
	}
	public String getName() {
		return name;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public String getPhone() {
		return phone;
	}
	
	@Override
	public String toString() {
		
		return empId+" "+name+" "+phone;
	}
	
}	
	
	
	


