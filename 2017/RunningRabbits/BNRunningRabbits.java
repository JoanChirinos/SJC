/*
slightly more complicated

processing the data is pretty simple, just plug n chug

noraSpdFind is the core of the code

because the unit of time that it takes them to get to the carrot is the same,
we can cancel the time variable

that leaves us with only the distance they each travel

we can use law of sines to solve this:

skyler dist / nora angle = nora dist / skyler angle

isolate nora's dist:

skyler dist * skyler angle / nora angle = nora dist

plug and chug

note that Math.sin() takes a radian value instead of degree, so we have to convert
*/

public class BNRunningRabbits{
	public static void main(String[] args){
		int[] array1 = {30,45,45};
		int[] array2 = {10,60,10};
		int[] array3 = {20,30,60};

		int[][] all = {array1, array2, array3};
		interpreter(3, all);
	}

	public static void interpreter(int numCases, int[][] cases){
		for(int i = 0; i < numCases; i++){
			System.out.println(noraSpdFind(cases[i][0], cases[i][1], cases[i][2]));
		}
	}

	public static double noraSpdFind(double skySpd, double skyAng, double norAng){
		return (skySpd * Math.sin(Math.toRadians(skyAng)) / Math.sin(Math.toRadians(norAng)));
	}
}