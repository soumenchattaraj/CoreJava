/**
 * 
 */
package JavaString;

/**
 * @author SS
 * # dated : 19-July-2017
 * # removing repeated letters from a string.
 *
 */
public class RemovingRepetation {

	
	public static void main(String[] args) {
		
		String inputStr = "aaacbcddbeffe";
		int strLen = inputStr.length();
		String ans="";
		char ch;
		for(int i=0;i<strLen;i++)
		{
			ch=inputStr.charAt(i);
			 if(ch!=' ')
			 {
	          ans = ans + ch;
			  inputStr = inputStr.replace(ch,' ');
			 }
		}
		
		
		System.out.println(ans);

	}

}
