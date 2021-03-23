import java.util.Scanner;
import java.io.*;

public class ex7{
	
	public static final Scanner sc  = new Scanner(System.in);
	
	public static void main(String[]args) throws FileNotFoundException{
		
		String[] arquivos = new String[2];
		System.out.print("No diretorio arquivostxt temos os seguintes ficheiros: \n");
		diretorio("arquivostxt/");
		System.out.print("Escreva o nome do ficheiro sob a forma 'arquivostxt/nome.txt' \nNome do arquivo a ser copiado (deve terminar em .txt)\n~> ");
		arquivos[0] = sc.nextLine();
		
		File fin = new File(arquivos[0]);	
	
		if (!fin.exists()) {
            System.out.println("ERRO: ficheiro " + arquivos[0] + " nao existe!");
            System.exit(2);
        }
        if (fin.isDirectory()) {
            System.out.println("Ficheiro " + arquivos[0] + " is a directory!");
	    diretorio(arquivos[0]);
            System.exit(3);
        }
        if (!fin.canRead()) {
            System.out.println("ERRO: ficheiro " + arquivos[0] + "nao pode ser lido!");
            System.exit(4);
        }
        System.out.println("Ficheiro válido!\n Introduzir o destino/nome.txt (destino = diretorio, nome=nome do ficheiro a ser criado)\n");
        System.out.print("Ficheiro de saida\n~> ");
		
		arquivos[1] = sc.nextLine();
		
		File fout = new File(arquivos[1]);
		
		Scanner scanLinhas = new Scanner(fin); // criar o scanner das linhas do ficheiro de entrada    
		int cont = 0;
        while(scanLinhas.hasNextLine()) {
            cont++;
            scanLinhas.nextLine();
        }
    
        String[] linhasCopiadas = new String[cont]; // cria array com tamanho do nº de linhas

        scanLinhas.close(); // fecha ficheiro
	        
		scanLinhas = new Scanner(fin);
        for(int i=0; i<cont;i++) {
            String s = scanLinhas.nextLine();
            linhasCopiadas[i] = s;
        }
        scanLinhas.close(); // fecha ficheiro
	
		PrintWriter pw = new PrintWriter(fout); // Para ESCREVER num ficheiro, associa-o, através do objeto File, com a classe PrintWriter

        // escreve array com as linhas no ficheiro de escrita
        for(int i = 0 ; i < cont ; i++) {
            pw.println(linhasCopiadas[i]);
        }
        pw.close(); // termina de imprimir as linhas no ficheiro novo
        
        System.out.printf("A copiar %d linhas de %s para o novo ficheiro %s \n ########## TEXTO ##########",cont,arquivos[0],arquivos[1]);
        for(int i=0; i<cont; i++){
			System.out.println(linhasCopiadas[i]);
		}
		System.out.printf("\n########### FIM ###########\nTodas as %d linhas foram copiadas!",cont); 
	}  	
	public static void diretorio(String nomeDir) { //diretório atual
        String[] lista;
        File fin1 = new File(nomeDir);
	if (fin1.isDirectory()){
	    lista = fin1.list();   // devolve array de strings com nomes ficheiro
	    for (String n : lista) {
		File f = new File(n);
		System.out.printf("%-30s %5s\n", n, f.isDirectory()? "DIR":f.length());
	    }
		}
	}
	
}
