
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
			System.out.println("Já não sou tão novo assim...");
		}
		
		else if (idade > 49 ) {
			System.out.println("Não sou tão velho...");
		}
		else 
			System.out.println("tenta outra vez......");
		}
		while (idade < 100 || idade > 0);
		System.out.println("ok bye bye!");
		
	}

}
