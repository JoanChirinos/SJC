/*
Some Explanation:

The core of this problem is in the points method, which determines how many points each
combination of coordinates gets.

The rest is just data processing and summing up the points for each player along
with determining who won.

I did not use the text reader and writer because I do not know the format of the contest.

But my tests returns expected output for all cases.
*/


public class Darts{
	public static void main(String[] args){
		double[] array1 = {0,0,-3,0,0,6,0,15,-12,0,0,9};
		double[] array2 = {0,0,-3,0,0,6,0,0,-3,0,0,6};
		double[] array3 = {4,-1,19,0,-4.1,-8.1,-4,-1,-4,-8.1,-4.1,-8.1};
		double[] array4 = {50,0,-3,0,0,6,0,15,-12,0,0,9};

		processor(array1,array2,array3,array4);
	}

	public static int points(double x, double y){
		double result = Math.sqrt(x*x + y*y);

		if(result <= 3){
			return 100;
		}else if(result <= 6){
			return 80;
		}else if(result <= 9){
			return 60;
		}else if(result <= 12){
			return 40;
		}else if(result <= 15){
			return 20;
		}else{
			return 0;
		}
	}

	public static void processor(double[] one, double[] two, double[] three, double[] four){
		double[][] storage = new double[4][];

		storage[0] = one;
		storage[1] = two;
		storage[2] = three;
		storage[3] = four;

		int onePointCt = 0;
		int twoPointCt = 0;

		for(double[] darr : storage){
			for(int i = 0; i < 6; i+=2){
				onePointCt += points(darr[i], darr[i+1]);
			}
			for(int i = 6; i < 12; i+=2){
				twoPointCt += points(darr[i], darr[i+1]);
			}

			System.out.print(onePointCt + " ");
			System.out.print(twoPointCt + " ");
			if(onePointCt > twoPointCt){
				System.out.print(1);
			}else if(onePointCt < twoPointCt){
				System.out.print(2);
			}else{
				System.out.print("tie");
			}

			System.out.println();

			onePointCt = 0;
			twoPointCt = 0;
		}
	}
}