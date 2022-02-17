package JavaAssign;

public class Users {
	
	//1.No input No return
	
	public void test(){
		System.out.println("test method.............");
	}
	
	//2.No input some return
	
	public int getNumber(){
		System.out.println("get number............");
		return 100;
	}
	
	public String getTrainerName(){
		System.out.println("get trainer name");
		return "naveen";
	}

	public boolean isForgotPwdLinkExist(){
		System.out.println("Checking forgot password link");
		return true;
	}
public int add(int a,int b){
	System.out.println("sum of two numbers...........");
	int c=a+b;
	return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Users obj=new Users();
		
		obj.test();
		
		
		int num=obj.getNumber();
		System.out.println(num);
		
		
		String name=obj.getTrainerName();
		System.out.println(name);
		
		boolean flag=obj.isForgotPwdLinkExist();
		System.out.println(flag);
		
		
		if(flag){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
		
		int sum=obj.add(80, 30);
	System.out.println(sum);
	
	sum=obj.add(30,20);
		System.out.println(sum);
		
		
	}

}
