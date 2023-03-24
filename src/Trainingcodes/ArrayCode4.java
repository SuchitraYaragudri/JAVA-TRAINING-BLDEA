package Trainingcodes;
import java.util.Scanner;
public class ArrayCode4 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of movie_houses:");
		int mov_hou=sc.nextInt();
	    System.out.println("Enter the count of theators in each movie_house:");
	    int Thr=sc.nextInt();
	    System.out.println("Enter the count of screens in each theators of inside the movie_house:");
        int src=sc.nextInt();
	    int arr[][][]=new int[mov_hou][Thr][src];
	    
	    for(int i=0;i<arr.length;i++) {
	    System.out.println("Inside the movie_house no"+(i+1));
	    for(int j=0;j<arr[i].length;j++) {
	    	System.out.println("Inside the Theator no"+(j+1));
		    for(int k=0;k<arr[i][j].length;k++) {
          System.out.println("Inside the screen no"+(k+1));
            arr[i][j][k]=sc.nextInt();
	    }
	    }
	    }
	    System.out.println("________________");
	    for(int i=0;i<arr.length;i++) {
        System.out.println("Inside the movie_house no"+(i+1));
		    for(int j=0;j<arr[i].length;j++) {
		    	System.out.println("Inside the Theator no"+(j+1));
			    for(int k=0;k<arr[i][j].length;k++) {
	          System.out.println("The funds collected from screen no"+(k+1));
	          int fund=arr[i][j][k]*350;
	          System.out.println(fund);
	        }
	    }
		}
	    }
	}


	    