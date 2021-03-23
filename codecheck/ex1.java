import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   Reads a text file, line by line,
   counts the number of words per line,
   prints out each line of the poem,
   preceded by number of the number of words in that line.
*/
public class ex1
{
	
	public static void main(String[] args) throws FileNotFoundException
	{
    // Set up the input and output file names
	String inputFileName = "JackJill.txt";
    String outputFileName = "output.txt";
    File entryFile = new File(inputFileName);
    File finalFile = new File(outputFileName);
    
    // contar linhas
    Scanner scLinhas = new Scanner(entryFile);
    int contar = 0;
    while(scLinhas.hasNextLine()){
		scLinhas.nextLine();
		contar++;
		}
	// salvar cada linha num array de strings
	Scanner scTexto = new Scanner(entryFile);
	String[] linha = new String[contar];
	for(int i=0;i<contar;i++){
		linha[i] = scTexto.nextLine();
		}
	scTexto.close();
	// salvar as palavras de cada linha num array de strings e contá-las com .length
	for(int k=0;k<contar;k++){
		String[] palavras = linha[k].split(" ");
		System.out.println(palavras.length+"   "+linha[k]);
	}
	
	// printar num arquivo novo
	PrintWriter pw = new PrintWriter(finalFile);
	for(int j=0;j<contar;j++){
		pw.println(linha[j]);
		}
	pw.close();
	}

}
