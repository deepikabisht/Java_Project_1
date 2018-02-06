package java_project_1;

import java.io.*;
import java.util.Scanner;

public class Project_1 {
	
	public static void listFile(String directoryName)
	{
		File directory = new File(directoryName);
		
		//get all the files from directory
		File[] flist = directory.listFiles();
		for(File file:flist)
		{
			if(file.isFile())
			{
				System.out.println("File Name : "+file.getName()+" File Path :"+file.getAbsolutePath());
				
			}
			else if(file.isDirectory())
			{
				listFile(file.getAbsolutePath());
			}
		}
		
	}
	
	public static void main(String args[]) throws IOException
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the path : ");
		String path= sc.nextLine();
	
		File file = new File(path); 
		String directory = " ";
		String cs_file = " ";
		FileReader in = new FileReader(file);
		int c;
		while ((c=in.read())!=-10)
		{
			char ch= (char)c;
			directory = directory + ch;
		}
		
		
		
		
		
		
		
	}

}
