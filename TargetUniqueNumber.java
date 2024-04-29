package proggrams;

import java.util.HashSet;
import java.util.Set;

public class TargetUniqueNumber {
	
   /*  public static int displayNumbers(int number) {
		//Duplicates are not allowed
    	 Set<Integer> integers = new HashSet<>();
		
		while(number > 0) {
			int integerVal = number%10;
			integers.add(integerVal);
			number = number/10;
		}
    	 return integers.size();
     }
	 public static void main(String[] args) {
      
		 int number = 12333349;
		 int display = displayNumbers(number);
		 System.out.println(display);
	}*/
	
	/*-------------------------------------------------------------------------*/
	
	/*public static int displayNumbers1(int number) {
		int seeen = 0;
		while(number>0) {
			int intigers = number %10;
			seeen |=(1<<intigers);
			number = number/10;
			System.out.println(seeen );
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int number = 121;
		int display1 = displayNumbers1(number);
	}*/
     
	public static int displayNumbers2(int number) {
		long display2 = String.valueOf(number).chars().distinct().count();
		System.out.println(display2);
		return (int) display2;
	}
	public static void main(String[] args) {
		int number = 64753;
		int digits = displayNumbers2(number);
		System.out.println(digits);
	}
}
