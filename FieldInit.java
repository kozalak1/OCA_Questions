package OCA_Questions;

public class FieldInit {
	
	Character c;
	boolean b;
	float f;
	
	void printAll () {						// 4- 
		System.out.println("c= " + c);		// 5- 
		System.out.println("b= " + b);		// 6-	
		System.out.println("f= " + f);		// 7-
	}
		
	public static void main(String[] args) { // 1- program önce bu satırdan çalışmaya başlar
		
		FieldInit f = new FieldInit ();		// 2- f adında bir obje oluşturuluyor
				
		f.printAll();						// 3- f objesi metod çağırıyor
				

	}
			// What's the result?
			// c= null
			// b= false
			// f= 0.0

}
