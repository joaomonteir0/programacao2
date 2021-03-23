import java.util.*;
import java.io.*;

public class invertetexto{
	public static void main(String[]args) throws FileNotFoundException{
	String entryText = "JackJill.txt";
	String invertedText = "inverted.txt";
	File inputText = new File(entryText);
	File outputText = new File(invertedText);
	
	// contar linhas
	Scanner contar = new Scanner(inputText);
	int contagem=0;
	while(contar.hasNextLine()){
		contar.nextLine();
		contagem++;
		}
	System.out.println("Linhas: "+contagem);
	contar.close();
	
	
	// dividir as linhas
	Scanner lerTexto = new Scanner(inputText);
	String[] texto = new String[contagem];
	for(int i=0; i<texto.length;i++){
		texto[i] = lerTexto.nextLine();
		System.out.println(texto[i]);
		}
	lerTexto.close();
	
	System.out.println("\n\n\n"+texto[3]);
	System.out.println(texto[2]);
	System.out.println(texto[1]);
	System.out.println(texto[0]);
		
	}
}
