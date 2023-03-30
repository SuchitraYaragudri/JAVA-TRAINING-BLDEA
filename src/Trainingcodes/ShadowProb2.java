/*Program on Shadow problem using individual setters and getters */
package Trainingcodes;
class Tiger{
	private String name;
	private String color;
	private String contry;
	private int cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getContry() {
		return contry;
	}
	public void setContry(String contry) {
		this.contry = contry;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}
public class ShadowProb2 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
        Tiger t1=new Tiger();
        t1.setName("Ramu");
        t1.setColor("orange");
        t1.setContry("India");
        t1.setCost(8000);
        System.out.println(t1.getName());
        }
}
