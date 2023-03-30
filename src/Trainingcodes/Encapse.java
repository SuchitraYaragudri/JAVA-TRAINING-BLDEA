/* Example on Encapsulation */
package Trainingcodes;
class Dog5{
	private String name;
	private String color;
	private int cost;
	
	void setData(String a,String b,int c) {
		name=a;
		color=b;
		cost=c;
	}
	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
    }
}
public class Encapse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog5 d1=new Dog5();
d1.setData("tommy","Black",3000);
d1.getData();
	}
}

