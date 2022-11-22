public class Quadratic {
	double a, b, c;
	double x = 0;
	double x1 = 0;
	double x2 = 0;

	public Quadratic(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double discriminant() {

		double discriminant = b * b - 4 * a * c;

		return discriminant;
	}

	public void findRootsOfTheEquation() {
		if (discriminant() > 0) {
			x1 = (-b - Math.sqrt(discriminant())) / (2 * a);
			x2 = (-b + Math.sqrt(discriminant())) / (2 * a);
			System.out.println("Roots of the equation: x1 = " + x1 + ", x2 = " + x2);
		} else if (discriminant() == 0) {
			x = -b / (2 * a);
			System.out.println("The equation has only one root: x = " + x);
		} else {
			System.out.println("The equation has no real roots");
		}
	}
}
