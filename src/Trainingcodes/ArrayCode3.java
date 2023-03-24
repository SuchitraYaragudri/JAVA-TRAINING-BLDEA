package Trainingcodes;
import java.util.Scanner;
public class ArrayCode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the count of classes:");
int cls=sc.nextInt();
int arr[][]=new int[cls][];

for(int i=0;i<arr.length;i++) {
	System.out.println("Enter the students count inside class:"+(i+1));
	arr[i]=new int[sc.nextInt()];
}
for(int i=0;i<arr.length;i++) {
	System.out.println("Inside the class"+(i+1));
	for(int j=0;j<arr[i].length;j++) {
		System.out.println("enter the marks of student"+(j+1));
		arr[i][j]=sc.nextInt();
		}
}
System.out.println("_______________");
for(int i=0;i<arr.length;i++) {
	System.out.println("Inside the class"+(i+1));
	for(int j=0;j<arr[i].length;j++) {
		System.out.println("The marks of student"+(j+1)+"is:"+arr[i][j]);
	}
}
	}

}
