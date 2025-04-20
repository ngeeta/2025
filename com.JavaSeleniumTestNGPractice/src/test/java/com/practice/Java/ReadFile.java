package com.practice.Java;

import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {
public void usingfileReader() {
	//FileReader
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.println("The Buzz fizz No are :");
        for(int i=1;i<=num;i++){
        if(i%3==0 && i%5==0){
                    System.out.print("FizzBuzz");

        }
        else if(i%3==0){
                    System.out.print("fizz");

        }
        else if(i%5==0){
                    System.out.print("Buzz");

        }
        else{
        System.out.println(i);}
            System.out.print(","+" ");
        }
    }
	

}
