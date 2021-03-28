import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//entrada de dados utilizando o objeto tipo Scanner
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Qual o seu nome ?: ");
		String x;		
		x = sc.next();
		System.out.println("Seu nome é: " + x);
		
		
		sc.close();

	}

}
