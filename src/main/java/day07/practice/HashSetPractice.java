package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetPractice {

	public static void convertHashSet(ArrayList<Integer> list) throws Exception {

		if (list == null) {
			throw new Exception("ArrayList cannot be null");
		}

		HashSet<Integer> set = new HashSet<Integer>(list);

		for (Integer elements : set) {
			System.out.print(elements + " ");

		}

	}

	public static boolean validateDuplicatemethod(ArrayList<Integer> list, HashSet<Integer> hashset) throws Exception {

		HashSet<Integer> set = new HashSet<>(list);

		if (!set.equals(hashset)) {
			throw new Exception("The array does not contain all unique elements.");

		}
		return true;

	}

	public static void main(String[] args) throws Exception {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(6);
		list.add(7);
		list.add(7);
		list.add(8);
		list.add(8);
		list.add(9);
		list.add(10);

		System.out.println("Array List : " + list);

		convertHashSet(list);

	}
}
