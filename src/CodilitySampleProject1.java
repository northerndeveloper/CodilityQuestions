import java.util.Arrays;

public class CodilitySampleProject1 {
	

	public  static int solution(int[] A) {
        // write your code in Java SE 8
		
		if(A.length == 0) {
			return 1; //TODO you have to handle 0 element as well ??? burada 0 gelebileceğini gösteren bir ebare yok dlayıısyla sayıda da bu hatayı handle ediyor olabilmen laızm //
			//Bunun içinde eğer hata oluşucak bir şey varsa ki kesinlikle ilk eleman 0 olamaz o zaman direk 1 olarak return olman lazım !! 
		}
		
		if(A.length == 1) { // eğer tek bir eleman geliyorsa bunu da düşünmen lazım mesela eleman sayısı eğer 1 ise 
			if(A[0] == 2) { // o zaman elemana bakıyorsun ilk eleman eğer 2 ise o zaman bunun bir öncesi eleman olan 1 ile return olman lazım !!! 
				return 1;
			} 
			
		}
		
		
		Arrays.sort(A);
		
		int startUpElement = A[0]; //burdan sornaki hadise tamamen normal hadisedir. Yani normal olarak sayıların yanlış geldiğ ve senin bunu hesaplayıp handle ettiğin durumdur
		//yani böylee eğer burada normal olarak sayılar unordered geliyorsa exception case leri hariç bunları düzenleyip yazdığın durumdur 
		for(int i=1; i< A.length; i++) {
			startUpElement++;
				if(A[i] != startUpElement){
				return startUpElement;
			}
			
		}
		
		 if(A[0] == 1) { // burada eğer ilk eleman 1 geliyorsa o zaman ise onu 2 olarak alıcağın exceptional case durumlardır.
			 //Codility de her zaman olarak exceptional case leri düşünüp onları da hesaba katman gerekmektedir .
			return A[A.length-1]+1;
		}
		return A[0]-1; // eğer bunların hiç birisi olmuyosa o zaman sayının bir altını alıp işe devam edebilirsin meseka 3 gelmiştir. Bir sonrakisinin 2 olduğunu düşünerek devam edebilirsin
	
	}
	
	
	public static void main(String[] args) {
		
		int A[] = {1,2,3,4,5};
		System.out.println(CodilitySampleProject1.solution(A));
		
	}
	
	//REVIEW 
	
	//Codility de yapman gereken ilk durum ki bu sana %20 kazandırır test case in  doğru çalışmasıdır . Aama hiç bir şekilde bu yeterli değildir
	//Codility de asıl durum exceptional case in başarılı olarak çalışmasıdır. Dolayısıyla senin exceptional case i başarılı olarak çalıştırman birinci önceliktir !! 
	//Exceptional case lerden meseala hiç SAYI GELMEMESİ, TEK SAYI GELMESİ , İKİ SAYI GELMESİ, SAYININ EN ÜST DURUMDAN VE EN ALT DURUMDAN BAŞLAYACAK ŞEKİLDE OLMASI durumdur
	//Dolayısıyla birinci öncelikli olarka ilgilenmen gereken durum exceptional case leri bulup değerlendirmektedir ! Codility de mutlaka exceptional case ler ile başın derde giricektir.
	//Böylece ne kadar çaok exceptional case i halledersen o kadar daha durumda başarılı olucaksın !!
	
	
	
	

}
