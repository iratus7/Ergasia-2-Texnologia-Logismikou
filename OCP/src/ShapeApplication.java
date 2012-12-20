import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ShapeApplication extends JFrame{
	
	private Painter canvas;
	
	public ShapeApplication() {
		Square S1 = new Square(50, 50, 50);
		Circle C1 = new Circle(100, 100, 40);
		Circle C2 = new Circle(200, 100, 20);
		ArrayList shapes = new ArrayList();
		shapes.add(S1);
		shapes.add(C1);
		shapes.add(C2);

		canvas = new Painter(shapes);
		
		setContentPane(canvas);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ShapeApplication app1 = new ShapeApplication();
	}
}

class Painter extends JPanel{

	private ArrayList shapes;
	
	public Painter(ArrayList shapesToDraw) {
		shapes = shapesToDraw;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		for(int i=0; i<shapes.size(); i++)
		{
			Shape shape = (Shape)shapes.get(i);
			shape.draw(g);
			/*if(shapes.get(i).getClass().getName() == "Square")
			{
				Square s = (Square)shapes.get(i);
				g.drawRect(s.getTopLeftX(), 
                               s.getTopLeftY(), 
                               s.getWidth(), 
                               s.getWidth());
			}
			else if(shapes.get(i).getClass().getName() 
                          == "Circle")
			{
				Circle c = (Circle)shapes.get(i);
				g.drawArc(c.getCenterX()-c.getRadius(),
				          c.getCenterY()-c.getRadius(),
				          c.getRadius()*2,
				          c.getRadius()*2,
				          0, 
				          360);
			}*/
		}
	}
}


 abstract class Shape extends JComponent
{
	public abstract void draw(Graphics g);
	
}

class Square extends Shape {

	private int topLeftX;
	private int topLeftY;
	private int width;

	public Square(int x, int y, int itsWidth) {
		topLeftX = x;
		topLeftY = y;
		width = itsWidth;
	}
public void draw(Graphics g)
{
	g.drawRect(topLeftX,topLeftY,width,width );
}
	
	//public int getTopLeftX() { return topLeftX; }
	//public int getTopLeftY() { return topLeftY; }
	//public int getWidth() { return width; }

}

class Circle extends Shape {
	private int centerX;
	private int centerY;
	private int radius;
	
	public Circle(int x, int y, int itsRadius) {
		centerX = x;
		centerY = y;
		radius = itsRadius;
	}
	
	public void draw(Graphics g)
	{
		g.drawRect(centerX,centerY,radius,radius );
	}
	//public int getCenterX() { return centerX; }
	//public int getCenterY() { return centerY; }
	//public int getRadius() { return radius; }

}
