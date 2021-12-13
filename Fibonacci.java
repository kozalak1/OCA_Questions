package OCA_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

	/* Interview  Questions_07
     *  fibonacci dizisi
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("fibonacci dizisinin eleman sayisini giriniz : ");
        int each = scan.nextInt();

        List<Integer> fibo = new ArrayList<>(); // kullanıcının kac eleman gireceğini bilmediğimiz için list kullanıyoruz
        fibo.add(1);							
        fibo.add(1);							// ilk 2 sayı olan 1'i dogrudan list e ekliyoruz

        for (int i = 0; i < each - 2; i++) {	// Son sayıyı önceki 2 sayının toplamı ile bulacağımız için for un kapsamı dışında tuttuk
            fibo.add(fibo.get(i) + fibo.get(i + 1)); 	// 1. ve 2. sayıları sırayla topluyoruz
        }

        System.out.println(fibo);

    }
	
}
