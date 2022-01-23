package OCA_Questions;

public class MD_Arrays_01 {

	public static void main(String[] args) {
		
		int [][] n = { {1,3} ,  {2, 4} };
		for (int i = n.length-1; i >=0; i--) {
			for (int y : n [i]) {
				System.out.print(y);
			}
		}
		
		}		// What is the result?
				// 2413 // ancak şıklarda bu sonuc yok
	
	/* foreach sıra garantisi vermiyor ama genelde de sırası ile işlem yapıyor. Ben bir kere bile @Haluk Bilgin hoca dan sıradan yapmaz diye bir ifade duymadım. @mehmetbulutluoz hocam ders de sıradan calıusma sartı yokjtur ama genelde sıralı calısır dedi. @Filiz hanım'ın dedigi gibi sıra sartı yoksa digerlerinin olma sartı var diyemeyiz.Cunku ilk for dongusu belli bir sıradan getirir. foreach'e gelen ilk eleman n[1] oldugu icin 24 ya da 42 console yazdırır.n[0] elemanları geldiginde 13 ya da 31 yazdırır. Yani sonuclar 4231, 4213, 2431, 2413 bu dort sonuc da olur. foreach sıra dan calısmaya baglı olmadıgı icin. Ben eclipse de yazdirdim 2413 cıktı. Ama sıklarda 4 ihtimalden biri oldugu icin Cevap==> D diyebiliriz. Ama ben2413 derdim sıklarda olsaydı.Sanırım bu soruda foeach'in sıradan calısıp calısmadıgı bilgisi sorgulanmak istenmis.  Hocaları etiketledim ekstra trick bir bilgi varsa paylasırlar diye dusunuyorum...*/
	}


