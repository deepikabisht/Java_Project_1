package java_project_1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_1 {
	
	//function for displaying files
	
	public static void listFile(String pathName1, String pathName2) throws IOException
	{
		
		 // Creating Array List
		
		ArrayList<File> list = new ArrayList<File>();          
		File directory = new File(pathName1);
		File[] flist = directory.listFiles();
		
		
		//get all the files
		
		for(int i=0;i<flist.length;i++)
		{
			File file=flist[i];
			if(file.isFile())
			{
				list.add(file);
			
			for(File f:list)
			{
				//display 
				
				System.out.println("File Name :"+f.getName()+ "   "+ "File Path : " +f);   
				File file1 = new File(pathName2);
				FileWriter fw = new FileWriter(pathName2,true);
				fw.write("Name of file : "+ f.getName()+" , ");
				fw.write("Path of the file: "+ f.getAbsolutePath());
				fw.write(10);
				fw.flush();
				fw.close();
				
				
			}
			}
			else if(file.isDirectory())
			{
				
				listFile(file.getAbsolutePath(),pathName2);
				
			}
						
		}
		
				
		}
		

	
	public static void main(String args[]) throws IOException
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the path : ");
		String path= sc.nextLine();
		
		File f1= new File(path);
		FileReader fr= null;
		
		try
		{
			fr=new FileReader(f1);
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		
		int c;
		String p1=" ";
		String p2=" ";
		
		while((c=fr.read())!=10)
		{
			p1=p1+(char)c;
		}
		System.out.println(p1);
		while((c=fr.read())!=-1)
		{
			p2=p2+(char)c;
		}
		System.out.println(p2);
		//calling function to display files
		
		listFile(p1.substring(0, p1.length()-1),p2); 
		
			
		
	}

}
