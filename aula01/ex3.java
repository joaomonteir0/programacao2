import java.util.Scanner;

public class ex3{
	
	public static final Scanner sc = new Scanner(System.in);
	public static void main(String[]args){
		int numero;
		numero = sc.nextInt();
		System.out.print("Is "+numero+" a prime number? "+verificar(numero));
		
		}
	public static boolean verificar(int numero){
		for(int i=2;i<numero;i++){
			if((numero%i)==0) return false;
			}
		return true;
		}	
	
	}
