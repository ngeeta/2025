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
	
	void regEx() {
		sum=0;
		
		String newA=a.replaceAll("[^0-9]", "");
		System.out.println(newA);
		for(int i=0;i<newA.length();i++) {
			sum=sum+Integer.parseInt(String.valueOf(newA.charAt(i)));
		}
		System.out.println("---Sum------");
		System.out.println(sum);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddNoFromString a=new AddNoFromString();
		a.isDigit();
		a.regEx();
	}

}
