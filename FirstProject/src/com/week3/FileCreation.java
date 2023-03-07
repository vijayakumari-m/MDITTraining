package com.week3;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) throws IOException {
		
		//Create instance for File class
		File newfile = new File("Testfile.txt");
		
		//createNewFile() returns boolean value, true - if the new file is created, false - if the file is already exist
		if(newfile.createNewFile()) {
			System.out.println("The new file is created");
		}
		else {
			System.out.println("The file already exists");
		}
		

	}

}
