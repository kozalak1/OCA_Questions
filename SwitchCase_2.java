package OCA_Questions;

public class SwitchCase_2 {

	public static void main(String[] args) {
		
		boolean opt = true;
		
				switch (opt) {
		
				case true :
				System.out.println("True");
				break;
				
				default:
				System.out.println("****");
				
		}

		System.out.println("Done");
	}
	//Q : which modification enables the code fragment to print True Done?
}	// A : 7. satırda data type'ı String yapıp aynı satırda ve 11. satırda "True" şeklinde yazarsak dogru olur.
	// Switch case'de; long,double,float ve boolean kullanılamaz. 
