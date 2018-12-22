import java.util.HashSet;
import java.util.Set;

public class Permutation {


	public static void main(String[] args) {

		int[] A = {1,2,3,4};
		
		System.out.println(solution(A));
	}



	public static int solution(int[] A) {
		// write your code in Java SE 8

		if(A.length == 1 && A[0] != 1) { // eğer tek eleman ise herhangi bir sonuç vermemeli  // bence genelde bu tip codiility lerde doğru olursa sonuçla dönmesi en mantıklısı !!
			return 0;
		}
		
		if(!checkIfDuplicate(A)) {
			return 0;
		}
		
		int count = 1;
		for(int n : A ) {
            

			if(!contains(A, count)){ 
				return 0;
			}

		}

     return 1; 

	}

	
	 public static boolean contains(int[] arr, int item) {
	      for (int n : arr) {
	         if (item == n) {
	            return true;
	         }
	      }
	      return false;
	   }
	 
	 
	 public static boolean checkIfDuplicate(int[] A) {
		 
		 Set<Integer> variables = new HashSet<Integer>();
		 
		 for(int n : A) {
			 if(!variables.add(n)) {
				 return false;
			 }
		 }
		 
		 return true;
	 }
	
	
}
