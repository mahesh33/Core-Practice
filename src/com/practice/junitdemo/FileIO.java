package com.practice.junitdemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public boolean writeToFile(String s) {

		try {
			FileWriter fw = new FileWriter("D:\\java IO\\JUnitDemo.txt");
			fw.write(s);
			fw.close();
		} catch (IOException e) {
			System.out.println("Sorry..couldn't find the file");
		}
		return true;

	}

	public String readFromFile() throws IOException {

		FileReader fr = new FileReader("D:\\java IO\\JUnitDemo.txt");
		char[] car = new char[100];
		int i;
		int j = 0;
		while ((i = fr.read()) != -1) {

			car[j] = (char) i;
			j++;
		}
		fr.close();
		String s = String.valueOf(car);
		String s1 = s.toString();
		return s1;

	}
}
