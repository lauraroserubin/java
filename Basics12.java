package laura;
class Shapes{
	public int area(int side) {
		System.out.println("square");
		return side*side;
		
	}
public int area(int l, int b){
	System.out.println("rectangle");
	return l*b;
}
public float area(float radius) {
	System.out.println("circle");
	return 3.14f*radius*radius;
}
}
public class Basics12{
	public static void main(String[]args) {
		Shapes Shape = new Shapes();
		int rectangleArea = Shape.area(5,4);
		System.out.println("Area of the rectangle:"+rectangleArea);
		int squareArea = Shape.area(4);
		System.out.println("Area of the square:"+squareArea);
		float circleArea =Shape.area(4f);
		System.out.println("Area of the circle:"+circleArea);
	}
}


