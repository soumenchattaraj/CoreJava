package JavaSynchronizationTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeTest {

	public static void main(String[] args) {
		
		try 
		{
			ObjectInputStream isteam = new ObjectInputStream(new FileInputStream("D:/testSerialization1.txt"));
			ClassA a = (ClassA) isteam.readObject();
			
			System.out.println("file info:::"+a.id+"--"+a.name);
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
