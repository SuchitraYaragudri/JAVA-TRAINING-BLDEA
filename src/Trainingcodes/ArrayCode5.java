package Trainingcodes;
import java.util.Scanner;
public class ArrayCode5 {
public static int linearSearch(int arr[] ,int key) {
	for(int i=0;i<arr.length;i++) {
	if(arr[i]==key) {
		return(i+1);
	}
	}
return 0;
}
public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the array element to be searhed:");
               int key=sc.nextInt();
               int arr[]= {10,30,25,69,41,15,91,79,145,72,55,9};
               int res=linearSearch(arr,key);
               if(res>0) {
	            System.out.println("element found in posision"+(res));
               }
               else {
	           System.out.println("element not found");
	       }
	 }
 }
