/*
i could have used a doubly linked list and linked the two ends together, but i was lazy
so i just used an incrementing variable that would "mod" itself

interpreter does what it always does, no need to explain that

looper is the core of the code

total counts ticks

i is the number that the dial is currently pointing at

i represented moving the lock back and forth by just incrementing i up and down

	occasionally you would encounter the -1 or 40 = i case, in which you would just add/subtract 40
	and continue incrementing until you hit the next number
*/

public class BNLockTicks{
	public static void main(String[] args){
		int[] arr1 = {0,30,0,35};
		int[] arr2 = {9,19,6,32};
		int[] arr3 = {35,0,10,5};
		int[] arr4 = {0,39,0,38};
		int[] arr5 = {4,5,6,7};
		int[] arr6 = {7,6,5,4};

		int[][] all = {arr1, arr2, arr3, arr4, arr5, arr6};
		interpreter(6, all);
	}

	public static int looper(int first, int second, int third, int fourth){
		int total = 0;
		int i = first;

		total += 80;

		while(i != second){
			i--;
			if(i < 0){
				i += 40;
			}
			total++;
		}

		total += 40;

		while(i != third){
			i++;
			if(i >= 40){
				i -= 40;
			}
			total++;
		}

		while(i != fourth){
			i--;
			if(i < 0){
				i += 40;
			}
			total++;
		}

		return total;
	}

	public static void interpreter(int numCases, int[][] cases){
		for(int i = 0; i < numCases; i++){
			System.out.println(looper(cases[i][0], cases[i][1], cases[i][2], cases[i][3]));
		}
	}
}