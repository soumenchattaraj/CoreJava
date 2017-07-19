package JavaSynchronizationTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeTest {

	public static void main(String[] args) {
		
		ClassA a = new ClassA(100,"Soumen");
		ClassB b = new ClassB(101,"Ashif"); //## shows an error message with exception
		
		try 
		{
			FileOutputStream fout = new FileOutputStream("D:/testSerialization1.txt");
			ObjectOutputStream ostream = new ObjectOutputStream(fout);
							   ostream.writeObject(a);
							   //ostream.flush();
							   ostream.close();
							   fout.close();
			System.out.println("*** success ***");
		} 
		catch (FileNotFoundException e)
		{
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
