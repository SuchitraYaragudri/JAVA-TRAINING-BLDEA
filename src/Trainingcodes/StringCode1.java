/* Different types of string method */
package Trainingcodes;
public class StringCode1 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="RajaRamMohanRoy";
     System.out.println(str.length());
     System.out.println(str.toUpperCase());
     System.out.println(str.toLowerCase());
     System.out.println(str.charAt(2));
     int a=10+str.charAt(2);
     System.out.println(a);
     System.out.println(str.indexOf('R'));
     System.out.println(str.indexOf('Z'));
     System.out.println(str.startsWith("Raja"));
     System.out.println(str.startsWith("Roja"));
     System.out.println(str.endsWith("Roy"));
     System.out.println(str.endsWith("Boy"));
     System.out.println(str.contains("Mohan"));
     System.out.println(str.contains("mohan"));
     System.out.println(str.contains("Rohan"));
}
}
