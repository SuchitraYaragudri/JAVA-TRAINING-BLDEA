/*Write a program to count total number of Vowels and consonant in the given string */
package Trainingcodes;
import java.util.Scanner;
public class StringCode4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String-1");
	String str1=sc.next();
	str1=str1.toLowerCase();
	int Vowel=0;
	int Cons=0;
	for(int i=0;i<str1.length()-1;i++) {
		if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||
				str1.charAt(i)=='u') {
			Vowel++;
		}
		else {
			Cons++;
			}
	}
	System.out.println("Vowel count="+Vowel);
	System.out.println("Consonant count="+Cons);
}
}
