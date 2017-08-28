/**
 * 
 */
package File_IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author SS
 * # dated : 18-Jul-2017
 * # Info  : read a skip file and skip all the while reading file 2 and write into file 3 after skipping the words. 
 *
 */
public class SkipWords {

	
	public static void main(String[] args) {
		
			
			List<String> file1 = new ArrayList<String>();
			
			try {
				FileReader fr1 = new FileReader("D:/output/skipFile.txt");
				FileReader fr2 = new FileReader("D:/output/testFile2.txt");
				BufferedReader reader1 = new BufferedReader(fr1);
				BufferedReader reader2 = new BufferedReader(fr2);
				String str1;
				while((str1 = reader1.readLine())!=null)
				{
					String strArr[] = str1.split("\\s");
					for(String forStr : strArr)
					{
						if(!forStr.equals(" "))
						{
							file1.add(forStr);
						}
					}		   
				}
				String str2;
				int i=0,count=0;
				while((str2 = reader2.readLine())!=null)
				{
				
					String strArr[] = str2.split("\\s");
					for(String forStr : strArr)
					{
						count = 0 ;
						//System.out.println("here1");
						for(i=0;i<file1.size();i++)
						{
							//System.out.println("here2");
							if(file1.get(i).contains(forStr))
							{
								count=1;
							}
						}
						if(count==0)
						{
							//# print
							System.out.println(forStr);
						}
						else
						{
							//# skipped
						}
						
					}
						   
					
				}
				
				reader1.close();
				reader2.close();
				
			
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}		
}
