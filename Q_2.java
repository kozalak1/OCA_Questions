package OCA_Questions;

public class Q_2 {

	public static void main(String[] args) {
			
		
		String strs []= {"A", "B"};
		
		int idx=0;
		
		for (String s : strs) {
			strs[idx].concat("element"+idx); // Aelement0Belement1
			
			idx++; // 2
		}

		for (idx = 0; idx < strs.length; idx++) {
		
			System.out.print(strs[idx]);
		}
		
	}
				// What's the result?
}				// AB
