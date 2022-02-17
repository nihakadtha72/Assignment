package JavaAssign;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a[]=new int[4];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
  
	System.out.println(a);
	System.out.println("-------------------------------");
	System.out.println(Arrays.toString(a));
	
	
	for(int i=0;i<=3;i++){
		System.out.println(a[i]);
	}
	
	System.out.println(a.length);
	
	
	for(int e:a){
		System.out.println(e);
	}
	
	
	for(int k=0;k<=a.length-1;k++){
		System.out.println(a[k]);
	}
	}

}
