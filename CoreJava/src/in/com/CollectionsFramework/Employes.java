package in.com.CollectionsFramework;

public class Employes implements Comparable<Employes> {
private int empid=0;
private String name=null;
private String phone=null;


 public Employes(int empid, String name, String phone) {
	 this.empid=empid;
	 this.name=name;
	 this.phone=phone;
	 
 }
 public void setEmpid(int empid) {
	 this.empid=empid;
 }
 public int getEmpid() {
	 return empid;
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
 public String getPhone () {
	 return phone;
 }
@Override
public int compareTo(Employes o) {
	
	return  this.empid-o.empid;
}
 @Override
	public String toString() {
		
		return empid+" "+name+" "+phone;
	}
 
}
