import java.util.Scanner;
public class TelaInicialAlemao {

	Scanner input = new Scanner(System.in);
	
	public static void alemao() {
		
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
				orient.cadastrarA();
				break;
			case 2:
				orient.editarA();
				break;
				
			case 3:
				orient.ExcluirA();
				break;
			case 4:
				orient.visualizarA();
				break;
			case 5:
				orient.AlterarIdiomaA();
				break;
			}
			
			
		}while(opcao != 0);
	}
}
