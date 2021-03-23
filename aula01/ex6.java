import java.util.Scanner;

public class ex6{
	
	
	
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[]args){
// Escreva um programa que implemente o jogo “Adivinha o numero!.
//~ Neste jogo, o programa escolhe um numero aleatorio no intervalo [0; 100]2
//~ e depois
//~ o utilizador tenta descobrir o numero escolhido. Após cada tentativa, o programa deve
//~ indicar se o número escolhido é maior, menor ou igual á tentativa feita. O jogo termina
//~ quando o utilizador acertar no numero correcto. A pontua¸c˜ao do jogador ´e o n´umero de
//~ tentativas

	
	//variaveis
	int number = (int) (Math.random() * 101);
	int attempt;
	int score = 0;
	
	//lobby
	System.out.print("Guess the number between 0 and 100!\n");
	
	//game
	while(true){
		attempt = sc.nextInt();
		
		if(attempt < number){
			System.out.println("Up");
			score=score+1;
		}
		if(attempt > number){
			System.out.print("Down");
			score=score+1;
		}
		if(attempt==number) break;
			
		}
	System.out.println("Congratulations! You won with "+score+" attempts!");
	
	}
}
