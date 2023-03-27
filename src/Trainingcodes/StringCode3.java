/* Write a program to compare the contents of two strings by ignoring the cases */
package Trainingcodes;
import java.util.Scanner;
public class StringCode3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String-1:");
	String str1=sc.next();
	System.out.println("Eter the String-2:");
	String str2=sc.next();
	if(str1.equalsIgnoreCase(str2)==true){
		System.out.println("Strings are Equal");
	}
	else {
		System.out.println("Strings are not Equal");
	}
}
}
