package Questão2;

public class MyCircle {

	private MyPoint center;
	private int radius = 1;
	
	public MyCircle(int x, int y, int radius) {
		
		this.center = new MyPoint (x,y);
		this.radius = radius;

	}

	public MyCircle(MyPoint center, int radius) {
		
		this.center = center;

		this.radius = radius;
		
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;

	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public int getCenterX() {
		return center.getX();
	}

	public int getCenterY() {
		return center.getY();
	}

	public void setCenterXY(int x, int y) {
		center.setX (x);
		center.setY (y);
	}

	public double getArea() {
		
		double a;

		a = Math.PI * radius;

		return a;
	}

	
	  public String toString() { return "Circle x = " + center  + " , " +
	  "radius =  " + radius + " , " + "area:" + " " + getArea(); }
	 

	public boolean equals(MyCircle m1) {
		boolean h = false;
		if (m1 != null && this.radius == m1.radius && m1.center.equals(this.center)) {
			h = true;

		}
		return h;
	}

	public static void main(String[] args) {

		MyCircle m1 = new MyCircle(1, 2, 1);
		MyCircle m2 = new MyCircle(1, 2, 1);

		System.out.println(m1.getArea());
		System.out.println(m2.equals(m1));
		System.out.println(m2.toString());

		
	}

}
