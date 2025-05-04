package com.practice.Java;

public class FindDuplicateChar {
	public void findDup() {
		String a = "Geetaa";
		int count=0;
		char c[]=a.toCharArray();
		
		for(int i=0;i<a.length();i++) {
			count=1;
			for(int j=i+1;j< a.length();j++) {
			if(c[i]==c[j] && c[i]!=' ') {
				count ++;
				c[j]=' ';
			}}
			if(count >1 && c[i]!=' ') {
				System.out.println(c[i] + " : "+count);
			}
		}
	}

	public void removeDup() {
		String s="Geetaa";
		int j=0;
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]!=c[j]) {
				j++;
				c[j]=c[i];
			}
		}
		for(int i=0;i<j+1;i++) {
			System.out.print(c[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindDuplicateChar v = new FindDuplicateChar();
		v.findDup();
		v.removeDup();
	}

}
