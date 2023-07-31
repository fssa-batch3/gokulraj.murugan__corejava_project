package day08.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
	public static void main(String[] args) {
		String s = "Ram,Ram,Superman,Spider,hey,hello,Spider";

		Map<String, Integer> countMap = countRepetation(s);

		for (String element : countMap.keySet()) {

			Integer count = countMap.get(element);
			System.out.println(element + ": " + count);

		}

	}

	public static Map<String, Integer> countRepetation(String s) throws IllegalArgumentException {

		if (s == null || "".equals(s.trim())) {
			throw new IllegalArgumentException("A string cannot be null or empty");
		}

		String arr[] = s.split(",");
		HashMap<String, Integer> countMap = new HashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {

			if (countMap.get(arr[i]) == null) {
				countMap.put(arr[i], 1);
			} else {
				int count = countMap.get(arr[i]);
				count++;
				countMap.put(arr[i], count);

			}

		}
		return countMap;

	}
}