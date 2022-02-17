package JavaAssign;

public class Employee {
 
	
	private String name;
	private int age;
	private double salary;
	private boolean isactive;
	private char gender;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String getInfo(){
		return name+":"+age+":"+salary+":"+isactive+":"+gender;
	}
	public void setInfo(String name, int age, double salary, boolean isactive, char gender) {
		
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.isactive=isactive;
		this.gender=gender;
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
