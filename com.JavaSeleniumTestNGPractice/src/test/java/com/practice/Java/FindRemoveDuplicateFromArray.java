package com.practice.Java;

import java.util.Arrays;

public class FindRemoveDuplicateFromArray {
	public void findDup() {
		int a[] = { 1, 2, 3, 3, 2, 4, 5, 2, 6, 9, 7, 7, 5, 8, 0, 0 };

		System.out.println("Original Array");
		for (int m : a) {
			System.out.print(m + ",");
		}
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] & a[i]!=' ') {
					count++;
					a[j] = ' ';
				}
			}
			if(count>1 && a[i]!=' ') {
				System.out.println(a[i] +" : "+count);
			}
		}
	}

	public void removeDup() {
		int a[] = { 1, 2, 3, 3, 2, 4, 5, 2, 6, 9, 7, 7, 5, 8, 0, 0 };

		Arrays.sort(a);
		System.out.println("Original Array");
		for (int m : a) {
			System.out.print(m + ",");
		}
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != a[j]) {
				j++;
				a[j] = a[i];
			}
		}
		System.out.println("after Removing duplicate");
		for (int i = 0; i < j + 1; i++) {
			System.out.print(a[i] + ",");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindRemoveDuplicateFromArray f = new FindRemoveDuplicateFromArray();
		
		f.findDup();
		f.removeDup();
	}

}
