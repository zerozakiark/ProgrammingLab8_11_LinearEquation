	
	/** 
	* @name : 李欣哲
	* @ID : U10216038
	*/
	
import java.util.Scanner;

public class ProgrammingLab8_11_LinearEquation {
	public static void main(String[] args){
		// new a scanner
		Scanner input = new Scanner(System.in); 
		
		// input the coefficient a, b, c, d, e and f
		System.out.println("Please input the coefficient a, b, c, d, e,and f: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int f = input.nextInt();
		
		// new a LinearEquation object, and initial with constructor
		LinearEquation equations = new LinearEquation(a, b, c, d, e, f);
		System.out.println();
	
		// if-loop to check (a * d - b * c)
		if(equations.isSolvable() == false)
			//a * d - b * c == 0 
			//report "The equation has no solution"
			System.out.println("The equation has no solution");
		else
			//a * d - b * c != 0 
			//display the result
			System.out.println("The solution of these equations : x = " 
				+ equations.getX() + " and " + " y = " 
				+ equations.getY());					
		}		
	}

class LinearEquation{
	//Private data fields a, b, c, d, e and f
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	//constructor with the arguments for a, b, c, d, e and f
	public LinearEquation(double newA, double newB, double newC, double newD, double newE, double newF){
		a = newA;
		b = newB;
		c = newC;
		d = newD;
		e = newE;
		f = newF;
	}

  	// get method for a
	double getA() {
		return a;
	}
	
	// get method for b
	double getB() {
		return b;
	}

	// get method for c
	double getC() {
		return c;
	}

	// get method for d
	double getD() {
		return d;
	}

	// get method for e
	double getE() {
		return e;
	}

	// get method for f
	double getF() {
		return f;
	}

	// A method named isSolvable() that return true if (a * d - b * c) is not 0 
	boolean isSolvable() {
		return a * d - b * c != 0.0D;
	}

	// method getX() that return the solution for the equation
	double getX() {
		double x = (e * d - b * f) / (a * d - b * c);
		return x;
	}

	// method getY() that return the solution for the equation
	double getY() {
		double y = (a * f - e * c) / (a * d - b * c);
		return y;
	}
}
