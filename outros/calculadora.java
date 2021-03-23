import java.util.Scanner;

public class calculadora{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); 
		
		int a, b;
		char operator;
		while (sc.hasNext()) {
        if (sc.hasNextInt())
            b = sc.nextInt();
        else 
            operator = sc.next().charAt(0);
		}
	}
}
