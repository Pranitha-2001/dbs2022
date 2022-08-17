package interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

@FunctionalInterface
interface Addition {
	public int add(int x,int y) ;
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cities = Arrays.asList("Mumbai","Hyd","Banglore","Chennai","Mizoram");
        //cities.forEach(city->System.out.println(city.toUpperCase())); 
        List<String> filteredCities =cities.stream().filter(city->city.startsWith("M")).collect(Collectors.toList());
        filteredCities.forEach(city->System.out.println(city));
	}

}
