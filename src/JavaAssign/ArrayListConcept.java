package JavaAssign;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar=new ArrayList();
		
		System.out.println(ar.size());
		ar.add(100);
		ar.add(200);
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		ar.add("tom");
		ar.add('m');
		System.out.println(ar.size());
		ar.add(300);
		System.out.println(ar.size());
		System.out.println(ar.get(3));
		for(Object e :ar){
			System.out.println(e);
		}
		ar.remove(3);
		System.out.println(ar.size());
		
		for(Object e :ar){
			System.out.println(e);
		}
		
		for(int i=0;i<ar.size();i++){
			System.out.println(ar.get(i));
		}
		System.out.println("----------------------------------");
		System.out.println(ar);
		
		ArrayList<Object> empData=new ArrayList<Object>();
		empData.add("Tom");
		empData.add(26);
		empData.add('m');
		empData.add(56.77);
		empData.add(true);
		
		for(Object e:empData){
			System.out.println(e);
			if(e.equals('m')){
				System.out.println("male employee");
			}
		}
		
		
		}
	}


