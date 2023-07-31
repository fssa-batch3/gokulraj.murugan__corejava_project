package day09.practice;

import java.util.*;

public class SortedList {

	public static ArrayList<Integer> sortArrayList(ArrayList<Integer> list) {

		Collections.sort(list);

		return list;

	}

	public static boolean validateArrayList(ArrayList<Integer> list) throws IllegalArgumentException {

		if (list.equals(null)) {

			throw new IllegalArgumentException("ArrayList cannot be null or empty");

		}

		return true;
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Total Number of Number");
		int n = scan.nextInt();

		System.out.println("Enter the number");
		for (int i = 0; i < n; i++) {
			list.add(scan.nextInt());
		}

		ArrayList<Integer> result = SortedList.sortArrayList(list);

		System.out.println("After sorting :");
		for (int number : result) {
			System.out.print(number + " ");
		}
	}

}
