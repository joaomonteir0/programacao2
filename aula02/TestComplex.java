import static java.lang.System.*;


public class TestComplex {
	private double re;
	private double im;
	
	public Complex(double real, double imag) {
    re = real;
    im = imag;
	}
	
	public static void main(String[] args) {
		
    Complex a = new Complex(5.0, 6.0);
	
    // Vamos usar métodos do objeto a
    System.out.printf("(%.2f+%.2fi)\n", a.real(), a.imag());
    System.out.println("  parte real = " + a.real());
    System.out.println("  parte imaginaria = " + a.imag());
    System.out.println("  modulo = " + a.abs());
    System.out.printf("  argumento = %.2f\n", a.arg());
	}	
  
	public double real() {   // real part
		return re;
	} 

	public double imag() {   // imaginary part
		return im;
	} 

	public double abs() {    // absolute value (modulus)
		return Math.sqrt(re * re + im * im);
	} 

	public double arg() {  // argument (aka angle or phase) between -pi and pi
		return Math.atan2(im, re);
	}
}

