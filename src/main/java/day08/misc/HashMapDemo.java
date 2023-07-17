package day08.misc;

import java.util.HashMap; //  HashMap is a class which implements Map Interface
import java.util.Map; // Map is a Interface
import java.util.TreeMap;

public class HashMapDemo {
	public static void main(String[] args) {
		
		String[] arr = {"Tanjiro" ,  "Luffy" , "Eren" , "Naruto" , "Zenitsu" , "Zenitsu" , "Luffy" , "Zenitsu" , "Naruto"};
		
		
		Map < String , Integer> countMap = new HashMap <String , Integer>();
		
		for(int i = 0; i < arr.length ; i++){
			
			if(countMap.get(arr[i]) == null) {
				
				countMap.put(arr[i], 1);
				
			}
			else {
				
				int count = countMap.get(arr[i]);
					count++;
					countMap.put(arr[i], count);
				
			}
			
		}
			
		System.out.println(countMap);
		
		Map < String , Integer> sortMap = new TreeMap <String , Integer>(countMap);
		
		System.out.println(sortMap);
		
		
	}
	
}
