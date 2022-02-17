package JavaAssign;

import org.omg.Messaging.SyncScopeHelper;

public class Addition {
	
	public int addition(int a,int b){
		System.out.println("Addition of  two numbers is "+(a*b));
		int c=a*b;
		return c;
	}
	
//	public void chkEvenOdd(int i){
//		if(i%2==0){
//			System.out.println("Even");
//			
//		}else{
//			System.out.println("Odd");
//		}
//	}
	
	
	
	public void  age(int i){
		if(i>18){
			System.out.println("Eligible for voting");
		}else{
			System.out.println("Not eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Addition a=new Addition();
		a.addition(10, 20);
		
		
		
//		a.chkEvenOdd(20);
		a.age(9);
	}

}
