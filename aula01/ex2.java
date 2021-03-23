import java.util.Scanner;

public class ex2{
    
    public static final Scanner sc = new Scanner(System.in);

    // Minimum mark in any component
    public static final double MINIMAL_MARK = 6.5;

    public static void main (String[]args){
        
        // Get the marks from the user
        double atp1 = readInRange("ATP1? ", 0.0, 20.0);
        double ap1 = readInRange("AP1? ", 0.0, 20.0);
        double atp2 = readInRange("ATP2? ", 0.0, 20.0);
        double ap2 = readInRange("AP2? ", 0.0, 20.0);
        
        // Calculate each component
        double ctp = ctp(atp1,atp2);
        double cp = ctp(ap1,ap2);
        
        // Get the final mark
        int nf = nf(ctp,cp,MINIMAL_MARK);
        
        // check if the student passed
        boolean madeit = madeIt(nf);

        System.out.printf(" %7s %7s %7s %7s\n", "CTP", "CP", "NF", "APROV?");
        System.out.printf(" %7.1f %7.1f %7d %7s\n", ctp, cp, nf, madeit);
    }

    public static double readInRange(String prompt, double min, double max){
        assert min <= max : "max must be at least as large as min!";
        double mark; // Initializes the variable so the cicle ahead works
        System.out.print(prompt);
        
        // Cicle that gets a mark until it's correct
        do{
            mark = sc.nextDouble();
            if (!(mark < min || mark > max)) break;
            System.out.println("The number you inserted doesn't exist in the interval, [" + min + ";" + max + "], please repeat.");
        }while(mark < min || mark > max);
        
        return mark;
    }
    
    public static double ctp(double test1, double test2){
        return ((test1 + test2) / 2);
    }
    
    public static double cp(double test1, double test2){
        return (test1 * (2/7) + test2 * (5/7));
    }
    
    public static int nf(double cp, double ctp, double min){
        if (cp >= min && ctp >= min) return (int) Math.round(ctp * 0.3 + cp * 0.7);
        else return -66;
    }
    
    public static boolean madeIt(int nf){
        return (nf >= 10);
    }
}
