package Questão2;

public class MyPoint {

	private int x;
	private int y;

	public MyPoint() {

		int x = 0;
		int y = 0;

	}

	public MyPoint(int x, int y) {

		this.x = x;

		this.y = y;

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public String toString() {
		return "MyPoint [x=" + x + ", y=" + y + "]";
	}

	public double distance(int x, int y) {
		double distance;
		distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
		return distance;

	}

	// Remover dublicação de codigo
	public double distance(MyPoint m) {

		return this.distance(m.getX(), m.getY());

	}

	public boolean equals(MyPoint m2) {
		boolean h = false;
		if (this.x == m2.x && m2 != null) {
			h = true;

		}
		return h;
	}

	public static void main(String[] args) {

		MyPoint m1 = new MyPoint();
		MyPoint m2 = new MyPoint();
		m1.setX(3);
		m1.setY(0);

		System.out.println(m1.distance(1, 5) + " " + m1.distance(m2));
		System.out.println(m1.equals(m2));
		System.out.println(m1.toString());
	}

}
