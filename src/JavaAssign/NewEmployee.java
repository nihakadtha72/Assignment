package JavaAssign;

public class NewEmployee {
	
	String name;
	int age;
	double salary;

	public static void main(String[] args) {
		
		 NewEmployee e1=new  NewEmployee();
		 e1.name="Niha";
		 e1.age=43;
		 e1.salary=35.77;
		 
		 NewEmployee e2=new  NewEmployee();
		 e2.name="Chinni";
		 e2.age=24;
		 e2.salary=47.54;
		 
		 NewEmployee e3=new  NewEmployee();
		 e3.name="Harika";
		 e3.age=76;
		 e3.salary=27.87;
		 
		 
		System.out.println(e1.name+" "+e1.age+" "+e1.salary);
		System.out.println(e2.name+" "+e2.age+" "+e2.salary);
		System.out.println(e3.name+" "+e3.age+" "+e3.salary);
		
		
		
		e1=e2;
		
		System.out.println(e1.name+" "+e1.age+" "+e1.salary);
		System.out.println(e2.name+" "+e2.age+" "+e2.salary);
		System.out.println(e3.name+" "+e3.age+" "+e3.salary);
		
		
		e2=e3;
		
		System.out.println(e1.name+" "+e1.age+" "+e1.salary);
		System.out.println(e2.name+" "+e2.age+" "+e2.salary);
		System.out.println(e3.name+" "+e3.age+" "+e3.salary);
		

		
		e3=e1;
		
		System.out.println(e1.name+" "+e1.age+" "+e1.salary);
		System.out.println(e2.name+" "+e2.age+" "+e2.salary);
		System.out.println(e3.name+" "+e3.age+" "+e3.salary);
		
		
		 NewEmployee e4=new  NewEmployee();
			e4=null;
		System.out.println(e4.name);
	}

}
