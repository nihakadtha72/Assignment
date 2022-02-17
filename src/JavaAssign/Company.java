package JavaAssign;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {
	
	public Object[] getCompInfo(String CompName){
		System.out.println("getting info for:"+CompName);
		
		Object info[]=new Object[5];
		
		if(CompName.equals("IBM")){
			info[0]="IBM";
			info[1]=1000;
			info[2]=5.5;
		    info[3]="Bangalore";
			info[4]="Tom";
		}
		else if(CompName.equals("MS")){
			info[0]="MS";
			info[1]=2000;
			info[2]=6.5;
		    info[3]="HYD";
			info[4]="Peter";
		}
		else
		{
			System.out.println("Comp name is not found");
		}
		return info;
	}
	
	
	
	public ArrayList<String> getProductList(String CompName){
		System.out.println("getting info for product list:"+CompName);
		
		ArrayList<String> proList=new ArrayList<String>();
		
		switch (CompName) {
		case "Amazon":
			proList.add("Macbook");
			proList.add("Iphone");	
			proList.add("Laptop");
			break;
		case "Flipkart":
			proList.add("frocks");
			proList.add("T-shirt");	
			proList.add("skirt");
			break;
		case "Jabong":
			proList.add("aks");
			proList.add("varanga");	
			proList.add("avaasa");
			break;
		default:
			System.out.println("Comp name is not found");
			break;
		}
		
		
		return proList;
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Company c=new Company();
		Object comp[]=c.getCompInfo("NAL");
		System.out.println(Arrays.toString(comp));
		
		
		ArrayList<String> amzList=c.getProductList("Amazon");
		System.out.println(amzList);
		
		ArrayList<String> fktList=c.getProductList("Flipkart");
		System.out.println(fktList);
		
		ArrayList<String> jbgList=c.getProductList("Jabong");
		System.out.println(jbgList);
		
	}

}
