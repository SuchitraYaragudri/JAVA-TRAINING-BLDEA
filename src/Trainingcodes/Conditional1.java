package Trainingcodes;
import java.util.Scanner;
public class Conditional1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of age:");
		int age=sc.nextInt();
		if(age<18) {
			System.out.println("You are still a minar,Please grow up!!!");
		}
		else if(age>65) {
			System.out.println("you are a senior citizen,stop over expectations");
		}
		else {
			System.out.println("Congratulations you are in the list of most eligible grooms");
		}
	}

}
