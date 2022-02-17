package JavaAssign;

public class Car {
	
	String name;
	int price;
	String color;
	String brand;
	

	public static void main(String[] args) {
		
		Car c=new Car();
		c.name="BMW";
		c.price=240;
		c.color="Black";
		c.brand="520d";
		System.out.println(c.name);
		System.out.println(c.price);
		System.out.println(c.color);
		System.out.println(c.brand);
		
		System.out.println(c.name+":"+c.price+":"+c.color+":"+c.brand);
		
		Car c1=new Car();
		System.out.println(c1.name+":"+c1.price+":"+c1.color+":"+c1.brand);
		
		Car c2=new Car();
		c2.name="Audi";
		c2.brand="Q5";
		
		System.out.println(c2.name+":"+c2.price+":"+c2.color+":"+c2.brand);
		
		
		
	}

}
