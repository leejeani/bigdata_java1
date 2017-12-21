package graphic;

import shape.Circle;
import shape.Point;
import shape.Rectangle;
import shape.Shape;
import shape.Triangle;

public class Test {

	public static void main(String[] args) {
		Shape s[] = new Shape[4];
		s[0] = new Shape("red");
		s[1] = new Circle("blue", 5, new Point(3,4));
		//------------------------------------
		Point p[] = new Point[3];
		p[0] = new Point(4,5);
		p[1] = new Point(6,7);
		p[2] = new Point(8,9);
		s[2] = new Triangle(p);
		//-------------------------------------
		// Rectangle
		Point pp[] = new Point[4];
		pp[0] = new Point(4,5);
		pp[1] = new Point(6,7);
		pp[2] = new Point(8,9);
		pp[3] = new Point(4,10);
		s[3] = new Rectangle("green",pp);
		//------------------------------------
		for(Shape shape:s){
			shape.draw();
			System.out.println("----------------");
		}
		// circle 
		s[1].move(2,2);
		// Triangle
		s[2].move(3, 3);
		// Rectangle
		s[3].move(3, 3);
		for(Shape shape:s){
			shape.draw();
			System.out.println("----------------");
		}
		
	}

}









