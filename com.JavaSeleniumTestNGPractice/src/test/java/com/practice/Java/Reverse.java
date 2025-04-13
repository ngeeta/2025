package com.practice.Java;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

public class Reverse {
	public void palindromeStringBuilder() {
		String s = "MadaM";
		StringBuilder sb = new StringBuilder(s).reverse();
		System.out.println(sb.toString());

		if (s.equals(sb.toString())) {
			System.out.println("Its palindrome ");
		} else {
			System.out.println("Not Plaindrome");
		}
	}

	public void palindromFor() {
		String a = "Geeta";
		String rev = "";
		for(int i=a.length()-1;i>=0;i--){
			rev=rev+a.charAt(i);
		}
		System.out.println(rev + " is reverse");
	}

	public void revInSamePlace() {
		String s = "My Name Is Geeta";
		System.out.println(s+"\n");
		String rev="";
		String []arr=s.split("\\s");
		for(int i=0;i<arr.length;i++) {
			for(int j=arr[i].length()-1;j>=0;j--) {
				rev=rev+arr[i].charAt(j);
			}
			rev=rev+" ";
		}
		System.out.println(rev);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse r = new Reverse();
		r.palindromeStringBuilder();
		r.palindromFor();
		System.out.println("------");
		r.revInSamePlace();
	}

}
