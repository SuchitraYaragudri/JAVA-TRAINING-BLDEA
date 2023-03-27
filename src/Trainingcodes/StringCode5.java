/*write a program to count total number of words in the given strings */
package Trainingcodes;
import java.util.Scanner;
public class StringCode5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String:");
	String sentence=sc.nextLine();
		int wordCount=0;
		for(int i=0;i<sentence.length()-1;i++) {
			if(sentence.charAt(i) == ' ' && Character.isLetter(sentence.charAt(i+1)) && (i > 0)) {  
                wordCount++;  
		
			}
	}
		wordCount++;
	System.out.println("wordCount="+wordCount);
}
}
