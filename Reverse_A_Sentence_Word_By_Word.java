// https://www.youtube.com/watch?v=Ajac_H8dFoM
import java.util.Scanner;
class Reverse_A_Sentence_Word_By_Word
{
	public static void main(String args[])
	{
		String str;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter String==>");
		str=s1.nextLine(); // use to input string
		String 	result="";

		String[] arr=str.split("\\s");
		// split method return array of string
		// we can use space also on the place of "\\s" for ex   String[] arr=str.split(" ");
		// we are reveresing the string using space

		for(int i=arr.length-1;i>=0;i--)
		{
			result=result+arr[i]+" "; // " " it is adding the space also with string
		}
		System.out.println(result); //result

	}
}