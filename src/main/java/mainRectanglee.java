import java.util.Scanner;
class mainRectanglee {
	public static Scanner reader = new Scanner (System.in);
    public static void main(String[] args) {
    	System.out.println("enter 2 length");
    int a1 = reader.nextInt(); 
    int a2 = reader.nextInt();
	System.out.println("enter 2 width");
int b1 = reader.nextInt(); 
int b2 = reader.nextInt();
    	Rectanglee rec1 = new Rectanglee(a1,b1);
    	Rectanglee rec2 = new Rectanglee(a2,b2);
rec1.draw();
System.out.println(" ");
rec2.draw();
System.out.println(rec1.scale(2));
System.out.println("the sum of the perimeters= " + rec1.calcPerimeter()+rec2.calcPerimeter());
System.out.println("the sum of the areas= " + rec1.calcArea()+rec2.calcArea());
/*זה כותב לי את שתי התוצאות בלי לחבר אותן אחת אל השניה*/
rec1.toString();
rec2.toString();

    }
    }
