package com.practice.Java;

public class CountCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hello123.W4";
System.out.println("string Length = "+a.length());
String b="Geeta.Borkar.,Geeta.Borkar";
String newB=b.replaceAll("[.\\s,]", "");
System.out.println("B: string Length = "+newB.length());

int count =0;
for(int i=0;i<newB.length();i++) {
	if(newB.charAt(i)!=' ') {
		count++;
	}
}
System.out.println("count only character :"+count);

String word[]=b.split("[.\\s,]+");
System.out.println("No of words : "+word.length);
	}

}
