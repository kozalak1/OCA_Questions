package OCA_Questions;

public class SwitchCase {

	public static void main(String[] args) {
		
		char colorCode='y';
				
		switch (colorCode) {
		
		case 'r':
			int color = 100;
			break;
			
		case 'b' :
			color = 10;
			break;
				
		case 'y':
			color = 1;
			break;
						
		}
			
		System.out.println(color); // bu satırda compilation hatası verdi, çünkü color variable olarak tanımlanmadı 
	}
		// What's the result?
}
