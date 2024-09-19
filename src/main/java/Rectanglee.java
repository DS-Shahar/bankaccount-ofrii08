class Rectanglee {

	private int length;
	private int width;
	
	public int getlength() {
		return length;
	}
	public int getwidth() {
		return width;
	}


	public Rectanglee(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public void draw() {
		for(int i=0;i<length;i++) {
			for(int a=0;a<width;a++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
	public int calcArea() {
		return length*width;

	}
	public int calcPerimeter() {
		return length*2+width*2;
	}
	public int scale(int factor) {
		return factor*length + width*factor;
	}
	public String toString () {
		return width + length;
	}

}

