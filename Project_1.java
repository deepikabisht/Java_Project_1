package java_project_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
		String path= sc.nextLine();
		listFile(path);
		//File file = new File(path); 
		//FileWriter out = new FileWriter(file);
		
		
		
		
	}

}
