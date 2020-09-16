package w6;

public  class Circle{
	private int r;
	public  Circle(int _r) {
		r=_r;
	}
	
	public int getR() {
		return r;
	}

	public double getArea() {
		return r*r*Math.PI;
	}
	
	public double getAround() {
		return 2*Math.PI*r;
	}

	
}
