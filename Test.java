package OCA_Questions;

public class Test {

	int x, y;
	
	public Test(int x, int y) {
		initialize (x,y);
					
		
	}
	
	
	public void initialize (int x, int y) {
		
		this.x=x*x;
		this.y=y*y;
		
	}
	
		
	public static void main(String[] args) { 	// 1. ilk olarak main çalıştı
		
		int x =3, y=5;							// 2. x ve y'ye değer ataması yapıldı
		
		Test obj = new Test(x,y);				// 3. obj oluşturuldu - parametreleri x ve y
		
		System.out.println(x + " " + y);		// 4. x ve y nin değerleri yazdırıldı
		
	}
			
	// What's the result? 
	// 3 5
}
