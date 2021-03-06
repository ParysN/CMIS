package Week1;

// Week 2 Discussion
// Parys Newman
// June 1, 2022 last modification
/* This program allows a user to enter product specifications
 * of an iPhone in the main method.
 */

public class iPhone {
	
	//attributes
	//instant variables
	private int type;
	private String color;
	
	//constructor
	public iPhone(int t, String c) {
		//setting values
		this.type = t;
		this.color = c;
	}
	
	//get methods
	public int getType() {
		return type;
	}
	public String getColor() {
		return color;
	}
	
	//set methods
	public void setType(int type) {
		this.type = type;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public void display() {
		System.out.println("iPhone [type = " + type + ", color = " + color + "]");
	}

public static void main(String[] args) {
		
		iPhone p1 = new iPhone(11, "Gold");
		p1.display();
		
		iPhone p2 = new iPhone(8, "Rose Gold");
		p2.display();
	}

}

