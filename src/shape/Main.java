package shape;

public class Main {

	public static void main(String[] args) {
		Shape s[] = new Shape[3];
		s[0] = new Circle(5);
		s[1] = new Rectangle(7, 5);
		s[2] = new Triangle(7, 5);

		for(Shape shape:s){
			System.out.println(shape);
			System.out.println(shape.getArea());
			System.out.println(shape.getCircume());
			System.out.println("-------------------");
		}
	}

}



