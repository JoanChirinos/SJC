/*
a bit more complicated but nothing you can't handle

interpreter translates data for the chkr

chkr is core of this code
	
	uses double loop to run thru every pair of numbers in the array

	if the target sum is satisfied, increment total

note that duplicate pairs don't count, so remove duplicate numbers in the array before processing

	remove by setting to a number higher than the target sum
*/

public class BNRonniesRibbons{
	public static void main(String[] args){
		int[] coll1 = {3,4,3,6,1,1};
		int[] coll1metadata = {7,6};

		int[] coll2 = {2,5,18,15,2,15,16,30,6,14};
		int[] coll2metadata = {20,10};

		int[][][] allColl = {{coll1metadata, coll1}, {coll2metadata, coll2}};

		int numColls = 2;

		interpreter(2, allColl);
	}

	public static void interpreter(int numColls, int[][][] collections){
		for(int i = 0; i < numColls; i++){
			int target = collections[i][0][0];
			int arrSize = collections[i][0][1];

			collections[i][1] = rmDupes(collections[i][1], target + 1);

			System.out.println(chkr(target, arrSize, collections[i][1]));
		}
	}

	public static int chkr(int target, int arrSize, int[] arr){
		int numWays = 0;

		for(int i = 0; i < arrSize; i++){
			for(int j = i+1; j < arrSize; j++){
				if(arr[i] + arr[j] == target){
					numWays++;
				}
			}
		}

		return numWays;
	}

	public static int[] rmDupes(int[] inputArr, int lim){
		for(int i = 0; i < inputArr.length; i++){
			if(count(inputArr, inputArr[i]) > 1){
				inputArr[i] = lim;
			}
		}

		return inputArr;
	}

	public static int count(int[] inputArr, int search){
		int total = 0;

		for(int i : inputArr){
			if(i == search){
				total++;
			}
		}

		return total;
	}
}