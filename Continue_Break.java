package OCA_Questions;

public class Continue_Break {

	public static void main(String[] args) {
		
		String [] arr = {"A", "B", "C", "D" };
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // A ve boşluk yazdırır
			if (arr[i].equals("C")) {  // if body çalışmaz
			continue;
		}
			System.out.println("Work done"); 	// Work done yazdırır 	
			break;								// kod kırılır, döngüden çıkar
		}

	}
			// What's the result?
			// A Work done
}
