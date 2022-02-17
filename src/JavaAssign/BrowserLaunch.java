package JavaAssign;

public class BrowserLaunch {
	
	String name;
	
	public boolean launchBrowser(String name){
		System.out.println("browser name is :"+name);
	
	
	if(name.equals("chrome")){
		System.out.println("launch chrome");
		return true;
	}
	else if(name.equals("safari")){
		System.out.println("launch safari");
		return true;
	}
	else if(name.equals("firefox")){
		System.out.println("launch firefox");
		return true;
	}
	else{
		System.out.println("please pass the right browser");
		return false;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserLaunch b=new BrowserLaunch();
		b.launchBrowser("safari");
		
	}
}