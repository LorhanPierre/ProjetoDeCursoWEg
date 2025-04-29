import java.util.Scanner;
public class TelaInicial {
	
	
	public static void portugues() {
		
	Orientacoes orient = new Orientacoes();
	Scanner input = new Scanner(System.in);
		
		int opcao;
	
	do {
		System.out.println("                 Bem vindo ao WegOne               ");
		System.out.println("===================================================");
		System.out.println("                         menu                      ");
		System.out.println("===================================================");
		System.out.println("opcoes:\n                                          ");
		System.out.println("1-Cadastrar Orientacoes        2-Editar Orientacoes");
		System.out.println("3-Excluir Orientacoes          4-Buscar Orientacoes");
		System.out.println("5-Mudar Idioma                 0-Sair              ");
		System.out.println("===================================================");
		System.out.println("Escolha opcao:");
		opcao = input.nextInt();
		
		switch(opcao) {
		
		case 1:
			orient.cadastrar();
			break;
		case 2:
			orient.editar();
			break;
			
		case 3:
			orient.Excluir();
			break;
		case 4:
			orient.visualizar();
			break;
		case 5:
			orient.AlterarIdioma();
			break;
		}
		
		
	}while(opcao != 0);
	}
}
