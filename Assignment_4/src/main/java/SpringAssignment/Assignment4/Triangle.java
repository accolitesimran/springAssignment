package SpringAssignment.Assignment4;

import org.springframework.stereotype.Component;

@Component
public class Triangle {
	private int side1;
	private int side2;
	private int side3;
	public int getSide1() {
		return side1;
	}
	public void setSide1(int side1) {
		this.side1 = side1;
	}
	public int getSide2() {
		return side2;
	}
	public void setSide2(int side2) {
		this.side2 = side2;
	}
	public int getSide3() {
		return side3;
	}
	public void setSide3(int side3) {
		this.side3 = side3;
	}
	public void getPerimeter() {
		int perimeter=this.side1+this.side2+this.side3;
		System.out.print("The perimter of this triangle is-: ");
		System.out.println(perimeter);
	}
	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
	}
}
