
import java.util.Scanner;

public class Helloooo {

	public static void main(String[] args) {
		System.out.println("Helloooooooo...");
		System.out.println("Qual a idade do Miguel?");
		
		String miguel = new String();
		int idade;
		
		do {
		
		Scanner s1 = new Scanner(System.in);
		idade = s1.nextInt();
		
		if (idade == 49){
			System.out.println("Acertaste!!!");
		}
		else if (idade < 49 ) {
			System.out.println("J� n�o sou t�o novo assim...");
		}
		
		else if (idade > 49 ) {
			System.out.println("N�o sou t�o velho...");
		}
		else 
			System.out.println("tenta outra vez......");
		}
		while (idade < 100 || idade > 0);
		System.out.println("ok bye bye!");
		
	}

}
