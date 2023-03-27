package Trainingcodes;
class Dog
{
	String name;
	int cost;
	int age;
	String color;
}
public class VariableExm1 {
public static void main(String[] args) {
	Dog d=new Dog();
	System.out.println(d.name);
	System.out.println(d.cost);
	System.out.println(d.age);
    System.out.println(d.color);
    d.name="Tommy";
    d.cost=3000;
    d.age=4;
    d.color="Black";
    System.out.println(d.name);
	System.out.println(d.cost);
	System.out.println(d.age);
    System.out.println(d.color);
}
}
