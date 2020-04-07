import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//On demande les opérandes à l'utilisateur (elles sont récupérée en STRING)
		String operande1 = Main.inputUser("Opérande 1 : ");
		String operande2 = Main.inputUser("Opérande 2 : ");
		
		//On transforme les opérande en int
		Integer op1 = Integer.parseInt(operande1);
		Integer op2 = Integer.parseInt(operande2);
		
		Calculs calcul = new Calculs(op1, op2);
		System.out.println("Démarrage des test...");
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
