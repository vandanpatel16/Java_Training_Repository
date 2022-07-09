/*JavaFilePermission class contains the permission related to a directory or file. All the permissions are related with path. The path can be of two types:
1) D:\\IO\\-: It indicates that the permission is associated with all sub directories and files recursively.
2) D:\\IO\\*: It indicates that the permission is associated with all directory and files within this directory excluding sub directories.*/


package com.java.ioandnio;

import java.io.FilePermission;
import java.security.PermissionCollection;

public class Assignment13_filepermission {

	public static void main(String[] args) {
		
		String path = "D:\\STS_4\\Java_Training\\Java_Assignment_27_06_2022_Day3\\src\\com\\java\\filepermission.txt";
		
		FilePermission file = new FilePermission("D:\\STS_4\\Java_Training\\Java_Assignment_27_06_2022_Day3\\src\\com\\java\\-","read");
		PermissionCollection permission = file.newPermissionCollection();
		permission.add(file);
		
		FilePermission file1 = new FilePermission(path, "Write");
		permission.add(file1);
		
		if (permission.implies(new FilePermission(path, "read,write"))) {
			System.out.println("Permission Granted: " + path);
		}
		else {
			System.out.println("Permission Rejected: " + path);
		}
	}

}
