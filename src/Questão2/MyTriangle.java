package Questão2;

public class MyTriangle {

	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;

	MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {

		this.v1 = new MyPoint(x1, y1);
		this.v2 = new MyPoint(x2, y2);
		this.v3 = new MyPoint(x3, y3);

	}

	MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {

		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;

	}

	
	public double getPerimenter(){
		
		double p;
		
		p = v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
		
		return p;
	}
	
	
	public Boolean equals(MyTriangle t1) {
		boolean k = false; 

		if (t1 != null && t1.v1.equals(this.v1) && t1.v2.equals(this.v2) && t1.v3.equals(this.v3)) {

			k = true;
		}
		return k;
	
	
	}
	
	
	public String toString() {
		return "MyTriangle [v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
	}
	
	public static void main(String[] args) {
		
	MyTriangle t1 = new MyTriangle(1,5,10,15,20,25);
	MyTriangle t2 = new MyTriangle(5,5,5,5,5,5);

	
	System.out.println(t1.toString());
	System.out.println(t2.toString());
	System.out.println("Os triangulos sao iguais?" + " " + t2.equals(t1));
	System.out.println("O perimetro do triangulo é " + " " + t1.getPerimenter());
	
		
	}

	
}
