package JavaAssign;

public class Student {
	
	String name;
	//WAF
	//getStudentMarks
	//input param:name (String)
	//return :marks(int)
	
	public int getStudentMarks(String Studentname){
		System.out.println("getting student marks"+Studentname);
		
		if(Studentname.equals("Anne")){
			return 90;
		}
		else if(Studentname.equals("Benny")){
			return 95;
		}
		else if(Studentname.equals("jency")){
			return 100;
		}
		else if(Studentname.equals("Danny")){
			return 10;
		}
		else{
			System.out.println("Please pass the right student name");
			return -1;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student();
		int marks=s.getStudentMarks("sri");
		System.out.println(marks);
		
		
		if(marks==-1){
			System.out.println("dont generate the marks sheet");
		}
		
	}

}
