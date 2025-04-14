package com.practice.Java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream  fs=new FileInputStream("src/test/resources/Config/URLConfig.properties");
Properties property=new Properties();
property.load(fs);
System.out.println(property.getProperty("herokuapp"));
	
	}

}
