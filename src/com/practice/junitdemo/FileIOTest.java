package com.practice.junitdemo;

import java.io.IOException;
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class FileIOTest {

	static Scanner input;
	static FileIO fio;
	String word;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		fio = new FileIO();
		input = new Scanner(System.in);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

		input.close();
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Enter a word to write or read");
		word = input.nextLine();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWriteToFile() {
		Assert.assertEquals(true, fio.writeToFile(word));
	}

	@Test
	public void testReadFromFile() throws IOException {
		//fio.writeToFile(word);
		Assert.assertNotNull(fio.readFromFile());
	}

}
