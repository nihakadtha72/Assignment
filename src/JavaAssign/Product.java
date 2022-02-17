package JavaAssign;

public class Product {
	
	public int product(int a,int b){
		System.out.println("The product of two numbers :");
		int c=a*b;
		return c;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Product	p=new Product();
	int i=p.product(10,30);
	System.out.println(i);
 	}

}
