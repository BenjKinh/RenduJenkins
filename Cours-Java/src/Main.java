import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//On demande les op�randes � l'utilisateur (elles sont r�cup�r�e en STRING)
		String operande1 = Main.inputUser("Op�rande 1 : ");
		String operande2 = Main.inputUser("Op�rande 2 : ");
		
		//On transforme les op�rande en int
		Integer op1 = Integer.parseInt(operande1);
		Integer op2 = Integer.parseInt(operande2);
		
		Calculs calcul = new Calculs(op1, op2);
		System.out.println("D�marrage des test...");
		System.out.println(op1 + "+" + op2 + "=" + calcul.additionner());
		System.out.println(op1 + "-" + op2 + "=" + calcul.soustraire());
		System.out.println(op1 + "*" + op2 + "=" + calcul.multiplier());
		System.out.println(op1 + "/" + op2 + "=" + calcul.diviser());

	}

	public static String inputUser(String message) {
		 System.out.println(message);
		 String input = "";
	     Scanner scanner = new Scanner(System.in);
	     input = scanner.nextLine();
		 return input;
	}
}
