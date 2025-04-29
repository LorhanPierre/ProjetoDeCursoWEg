import java.util.Scanner;
public class AbrindoWegOne {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		new Interface();
		new TelaInicial();
		
		System.out.println("                WELCOME TO WegOne                  ");
		System.out.println("===================================================");
		System.out.println(">Pt-BR(Português Brasil)            >De(Deutsch)  ");
		System.out.println(">Es (Español)                       >Fr(Français)  ");
		System.out.println(">En-US(English USA)                                ");
		System.out.println("===================================================");
		System.out.print("Selecione seu idioma (use as abreviacoes):");
		String escolha = input.nextLine();
		System.out.println("===================================================\n");
		
		if(escolha.equalsIgnoreCase("Pt-BR")) {
			
			TelaInicial.portugues();
		}else if(escolha.equalsIgnoreCase("De")) {
			
			TelaInicialAlemao.alemao();
		}else if(escolha.equalsIgnoreCase("En-Us")) {
			
			TelaInicialIngles.ingles();
		}else if(escolha.equalsIgnoreCase("En")) {
			
			TelaInicialEspanhol.espanhol();
		}else if(escolha.equalsIgnoreCase("Fr")) {
			
			TelaInicialFrances.frances();
		}
	}

}
