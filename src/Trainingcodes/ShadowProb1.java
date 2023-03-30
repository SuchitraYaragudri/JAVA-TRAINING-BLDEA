package Trainingcodes;
class Dog4 {
	private String name;
	private String color;
	private int cost;
	
	void setData(String name,String color,int cost) {
		name=name;
		color=color;
		cost=cost;
	}
	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
    }
}
public class ShadowProb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog4 d1=new Dog4();
d1.setData("tommy","Black",3000);
d1.getData();
	}
}
