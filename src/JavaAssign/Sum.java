package JavaAssign;

public class Sum {
	
	public int sum(int a,int b){
		System.out.println("add method");
		int c=a+b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sum ad=new Sum();
int ab=ad.sum(30,40);
System.out.println(ab);
	}

}
