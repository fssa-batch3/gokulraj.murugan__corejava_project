package day09.practice;

import java.util.*;

public class SortedList {
	public static void sortArrayList(ArrayList<Integer> list) {
		Collections.sort(list);
		
		System.out.println("After sorting :");
		for(int number : list) {
			System.out.print(number + " ");
			
		}
	} 
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int  n = scan.nextInt();
		
		System.out.println("Enter the number in the list");
		for(int i = 0 ; i < n ; i++) {
			list.add(scan.nextInt());
		}
		
		
		SortedList.sortArrayList(list);
		
		
	}
	
}
