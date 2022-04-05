package Day14_io_streamsand_file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class SampleReadExmp {

	public static void main(String[] args) {
		File file1=new File("c:arraylist");
		int len=(int) file1.length();
		try(FileReader fr=new FileReader(file1))
		{
			int c;
			while((c=fr.read())!=-1)
			{
				System.out.print((char)c);
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
