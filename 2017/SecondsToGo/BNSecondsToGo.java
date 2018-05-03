/*
pretty simple concept

multiply hours by 3600

multiply seconds by 60

add

print formatted string
*/

public class BNSecondsToGo{
	public static void main(String[] args){
		System.out.println(formatter(seconds(1,10)));
	}

	public static int seconds(int hours, int minutes){
		return (hours * 3600 + minutes * 60);
	}

	public static String formatter(int seconds){
		return seconds + " seconds to go";
	}
}