package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class ToArrayList {
	public static void main(String[] args) {

		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		System.out.println(cityList);

		// Add logic to remove the duplicate Array and

		for(int i = 0 ; i < cityList.size() ;i++) {
			for(int j = i+1 ; j < cityList.size(); j++) {
				if(cityList.get(i) == cityList.get(j)) {
					cityList.remove(i);
				}
				
			}
				
		}

		System.out.println(cityList);

		// store the unique city name is an another ArrayList

		List<String> uniqueCity = new ArrayList<String>();

//		for(int i = 0 ; i < cityList.size() ;i++) {
//			for(int j = i ; j < cityList.size(); j++) {
//				if(cityList.get(i) != uniqueCity.get(j)) {
//					
//					uniqueCity.add("Unique City" + cityList.get(i));	
//					cityList.remove(i);
//				}
//				
//			}
//				
//		}

		for (String city : cityList) {
			if (uniqueCity.contains(city)) {
				continue;
			} else {

				uniqueCity.add(city);
			}
		}

		System.out.println(uniqueCity);

	}
}
