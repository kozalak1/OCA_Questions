package OCA_Questions;

public class ReturnType_Arrays {

	public static void main(String[] args) {
		
		
	        int numbers[]={12,13,42,32,15,156,23,51,12};
	        int[] keys=findMax(numbers);
	    }

			/* line n1 */ {
	  
	        int[] keys=new int[3];
	         /* code goes here*/
	     return keys;
	    }

	}
	// Q : Which method signature do you use at line n1?
 	// A : static int[] findMax(int[] max)
	
	/* main method static oldugundan static bir metodla gidebiliriz;
	 * return type int olmalı ve mutlaka ARRAY olmalı ; neticede "keys" adında int bir array döndürüyor
	 */