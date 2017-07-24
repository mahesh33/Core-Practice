package com.practice.fileioserializationanddeserialization;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.practice.arraylistandcollectionsremoveandswap.StudentDetailsRemoveAndSwap;

public class ObjectSerialization {

	public static void main(String[] args) throws Exception, ClassNotFoundException {

		File file = new File("D:\\java IO\\SerilizationStudentDemo.txt");

		ArrayList<Student> students = new ArrayList<>();

		students.add(new Student("Ronald", 3.93));
		students.add(new Student("Tonny", 2.9));
		students.add(new Student("Kelly", 3.0));

		//Serialize the collection of students
		FileOutputStream fo = new FileOutputStream(file); //We can directly pass the file path instead of file
		ObjectOutputStream output = new ObjectOutputStream(fo);

		for (Student s : students) {
			output.writeObject(s);
		}

		System.out.println("Done successfully!!");
		// Always clean up after yourself
		output.close();
		fo.close();
		
		//Deserialize the file back into the collection
		FileInputStream fi = new FileInputStream(file);
		ObjectInputStream input = new ObjectInputStream(fi);
		
		ArrayList<Student> students2 = new ArrayList<>();
		
		/*
		 * When we read an object it returns an object back so, we need to cast that object
		 * or treat the object that i read as a student before we assign it to an object of type student.
		 * We need to explicitly cast the object.
		 */
		try {
			while(true){
				Student s = (Student)input.readObject();
				students2.add(s);
			}
		} catch (EOFException ex) {
			ex.printStackTrace();
		}
		
		for(Student s : students2){
			System.out.println(s);
		}
	}

}
