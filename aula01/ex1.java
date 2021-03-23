import java.util.Scanner;

public class ex1{
	
public static final Scanner sc = new Scanner(System.in);
	
public static void main(String[]args){
		System.out.printf("Introduce the operation with each number separated by a space (p.e.: 4 + 3)\nOperation: ");
        String tocalculate = sc.nextLine();
        calculator(tocalculate);
		
		}
		
static void calculator(String tocalculate){
        String[] splitedstring = tocalculate.split(" ");
        
        double num1 = Double.parseDouble(splitedstring[0]);
        double num2 = Double.parseDouble(splitedstring[2]);
        
        switch (splitedstring[1]) {
            case "+":
                System.out.print(num1+num2);
                break;
            case "-":
                System.out.print(num1-num2);
                break;
            case "*":
                System.out.print(num1*num2);
                break;
            case "/":
                System.out.print(num1/num2);
                break;
            default:
                System.err.print("Invalid Operation");
                break;
        }
    }
}
