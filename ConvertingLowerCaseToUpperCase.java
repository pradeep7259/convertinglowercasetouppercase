package proggrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingLowerCaseToUpperCase {
     
	public static void main(String[] args) {
		List<String> citiesName = Arrays.asList("bengaluru","chennai","mangaluru","delhi");
	/*1st type*/	/*System.out.println("citiesName :"+ citiesName);
		citiesName.replaceAll(city -> convertingLowertoUpper(city));
		System.out.println("citiesName :"+ citiesName);*/

  /*2nd type*/	citiesName.stream().map(city ->city.toUpperCase()).forEachOrdered(System.out::println);;
	}

	/*private static String convertingLowertoUpper(String city) {
		return city.substring(0,1).toUpperCase()+city.substring(1);
	}*/
	
}
