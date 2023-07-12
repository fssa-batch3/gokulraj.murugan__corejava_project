package day05.misc;

abstract class Shape { // create a class
	
	public abstract void draw(); // create a abstract 
}

class Rectangle2 extends Shape {
	
	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}
}

class Square extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a square");
	}
}

public class ShapeMultipleInhDemo {
	public static void main(String[] args) {
		Shape rec = new Rectangle2();
		Shape square = new Square();
		rec.draw();
		square.draw();
	}
}