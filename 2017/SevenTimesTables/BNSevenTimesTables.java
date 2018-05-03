/*
loop thru all arrays, printing each output on its own line

check each element for 0 mod 7

if yes, print
*/

public class BNSevenTimesTables{
	public static void main(String[] args){
		int[] array1 = {6,32,70,62,147,626326,10326722};
		int[] array2 = {4,41132,61334,712349,98765436};

		int[][] container = {array1, array2};
		func(2, container);
	}

	public static void func(int numArrs, int[][] nums){
		for(int i = 0; i < numArrs; i++){
			for(int curr : nums[i]){
				if(curr % 7 == 0){
					System.out.print(curr + " ");
				}
			}
			System.out.println();
		}
	}
}