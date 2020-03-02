package lesson18;

public class PointDemo {

	public static void main(String[] args) {

	  Point p = new Point(2,3.0);

	  Point q = new Point();

	  Point r = new Point(2,3);
	  
	  Point s = new Point(r);
	  
	  Point t = new Point(2);
	  
	  System.out.println("t="+t);


	  if (p.equals(r)) {

	  System.out.println("yes!");

	  } else {

	  System.out.println("no!");

	  }

	  java.util.Scanner input = new java.util.Scanner(System.in);

	  System.out.println(p.equals(input));

	  System.out.println(p.equals(q));

	  System.out.printf("class is %s %n%n", p.getClass());

	  System.out.printf("hashcode is %s %n%n",p.hashCode());

	   

	  System.out.printf("p=%s q=%s %n", p,q);

	  p.translate( 3, 4).translate(1,1);

	  q.translate(-5, 2);
	  

	  

	  translate(p, 3, 4);

	  translate(q, -5, 2);

	  Point.translate(p, 3, 4);

	  Point.translate(q, -5, 2);

	  PointDemo.translate(p, 3, 4);

	  PointDemo.translate(q, -5, 2);

	 

	  System.out.printf("p=%s q=%s %n", p,q);
	  
	  double d = p.distance(q);
	  System.out.printf("The distance of p to q is %10.3f%n",d);

	   }

	   

	   public static void translate(Point p, double dx, double dy) {
		   p.setX(p.getX()+dx);
		   p.setY(p.getY()+dy);
	       //p.x += dx;
	       //p.y += dy;

	   }

	}