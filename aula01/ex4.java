import java.util.Scanner;

public class ex4{
	public static final Scanner sc = new Scanner(System.in);
	public static void main(String[]args){
	while(true){
		System.out.print("Phrase -> ");
		String phrase = sc.nextLine();
		if("".equals(phrase)) break;
		
		System.out.println("Tradution: "+tradutor(phrase));
		}
	}
	static String tradutor(String phrase){
		String str = ((phrase.replaceAll("[Rr]","")).replace('l','u')).replace('L','U');
		
		return str;
		}
	}
