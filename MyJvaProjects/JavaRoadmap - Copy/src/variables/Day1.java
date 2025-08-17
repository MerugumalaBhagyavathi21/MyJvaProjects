package variables;

public class Day1 {
	
	int y;
	static int z=300;
	

	public static void main(String[] args) {
		// x is a local variable
		int x = 11;
        System.out.println(x); 
		
		System.out.println(20+x);

		
		//instance or object creation
		Day1 obj1=new Day1 ();
		System.out.println(obj1.y);
		
		System.out.println(Day1 .z);
		//System.out.println(z);
		
	}

}
