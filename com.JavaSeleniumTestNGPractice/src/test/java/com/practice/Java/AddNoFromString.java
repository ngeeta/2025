package com.practice.Java;

public class AddNoFromString {

	String a="Hello123W4";
	int sum=0;
	void isDigit() {
	for(int i=0;i<a.length();i++) {
		if(Character.isDigit(a.charAt(i))) {
			sum=sum+Integer.parseInt(String.valueOf(a.charAt(i)));
		}
	}
	System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddNoFromString a=new AddNoFromString();
		a.isDigit();
	}

}
