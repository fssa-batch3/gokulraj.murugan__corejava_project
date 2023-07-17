package day08.practice;

import java.util.Map;
import java.util.TreeMap;

public class HashMapPractice {
	public static void main(String[] args) {

		String[] name = { "Ram", "Ram", "Superman", "Spider", "hey", "hello", "hey", "Spider" };

		Map<String, Integer> countMap = new TreeMap<String, Integer>();

		for (int i = 0; i < name.length; i++) {
			if (countMap.get(name[i]) != null) {
				int count = countMap.get(name[i]);
				count++;
				countMap.put(name[i], count);

			} else {

				countMap.put(name[i], 1);

			}

		}

	System.out.println(countMap);

	}
}
