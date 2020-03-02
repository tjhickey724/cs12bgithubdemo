package lesson18;

public class Point {
	private final static int DIMENSION = 2;
	private int counter = 0;
	private double x;
	private double y;
	//private double[] xy = new double[2];
	
	
	public Point(double x, double y) {
		System.out.println("case 1");
		this.x=x;
		this.y=y;
	}
	
	
	
	public Point() {
		this.x=0;
		this.y=0;
	}
	
	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
	
	public Point(double x) {
		this.x=x;
		this.y=0;
	}
	
	
	
	public double getX() {
		counter++;
		return this.x;
	}
	
	public double getY() {
		counter++;
		return this.y;
	}
	
	public void setX(double v) {
		this.x = v;
	}
	
	public void setY(double v) {
		this.y = v;
	}
	
	public void setLocation(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance(Point p) {
		double dx = this.x - p.x;
		double dy = this.y - p.y;
		return Math.sqrt(dx*dx + dy*dy);
		
	}
	
	public double distanceFromOrigin() {
		Point origin = new Point();
		return this.distance(origin);
	}
	
	public String toString() {
		return "Point(x=" + x + ",y=" + y + ")"; // Point(x=3,y=5)
	}
	
	public boolean equals(Object other) {
		if (other instanceof Point) {
		    Point otherPoint = (Point) other;  // tell Java, this is a Point!!! 
		    return this.x==otherPoint.x   &&   this.y==otherPoint.y; 
		    
		} else {
			return false;
		}
	}
	
    public static void translate(Point p, double dx, double dy) {
	   p.x += dx;
	   p.y += dy;
    }
   
   public Point translate(double dx, double dy) {
	   x += dx;
	   y += dy;
	   /*
	   this.x += dx;
	   this.y += dy;
	   */
	   return this;
   }
   
   // write the distance(p) instance method which returns the distance of p from this point.

}