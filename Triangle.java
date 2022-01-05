package OCA_Questions;

public class Triangle {
	
		static double area ;		// static variable
		int b=2, h=3; 				// instance variable ' a main method içinden ancak bir method ile ulaşılabilir, dolayısıyla bu soruda main içindeki b ve h variable 9. satırda tanımlanmış oluyor 
		
	public static void main(String[] args) {
		double p,b,h; 		// line n1
	
		if (area==0) {
			
			b=3;
			h=4;
			p=0.5;
		
		area=p * b * h;		// line n2
	
		}
		
		System.out.println("Area is " + area);
	}
		
		//Q = What's the result?
		//A = Area is 6.0
}
