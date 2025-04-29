import java.util.Scanner;
public class Orientacoes {
	
	Scanner input = new Scanner(System.in);
	
	
	public static int Identificacao = 0;

	private String[] titulo = new String[100];
	private String[] tipo = new String[100];
	private String[][] orientacao = new String[100][5];
	private int id = Identificacao + 1;
	
	public Orientacoes() {
		
		this.titulo[1] = "";
		this.tipo[1] = "";
		this.orientacao[1][1] = "";
		this.id = Identificacao + 1;
		
	}
	
	public Orientacoes (String titulo[],String tipo[],String orientacao[][],int id) {
		
		this.titulo = titulo;
		this.tipo = tipo;
		this.orientacao = orientacao;
		this.id = ++Identificacao;
		
	}

	public int getId() {
		return id = ++Identificacao;
	}

	public void setId(int id) {
		this.id = ++Identificacao;
	}

	public String[][] getOrientacao() {
		return orientacao;
	}

	public void setOrientacao(String[][] orientacao) {
		this.orientacao = orientacao;
	}

	public String[] getTipo() {
		return tipo;
	}

	public void setTipo(String[] tipo) {
		this.tipo = tipo;
	}

	public String[] getTitulo() {
		return titulo;
	}

	public void setTitulo(String[] titulo) {
		this.titulo = titulo;
	}
	
	public void cadastrar(){

		id = ++Identificacao;
		System.out.println("===================================================");
		System.out.println("                Tipos de Orientações               ");
		System.out.println("===================================================");
		System.out.println("1.Manual de Operação    2.Procedimento de Segurança");
		System.out.println("3.Manutenção e Reparos  4.Testes e Diagnóstico     ");
		System.out.println("5.Manual de Conduta     6.Operações Setoriais      ");
		System.out.println("===================================================");
		System.out.print("Escolha o tipo de orientação(numero):");
		int type = input.nextInt();
		switch(type) {
		case 1:
			this.tipo[id - 1] = "Manual de Operação";
			break;
		case 2:
			this.tipo[id - 1] = "Procedimento de Segurança";
			break;
		case 3:
			this.tipo[id - 1] = "Manutenção e Reparos";
			break;
		case 4:
			this.tipo[id - 1] = "Testes e Diagnóstico";
			break;
		case 5:
			this.tipo[id - 1] = "Manual de Conduta";
			break;
		case 6:
			this.tipo[id - 1] = "Operações Setoriais ";
			break;
		}
		input.nextLine();
		
		System.out.println("===================================================");
		System.out.print("Digite o titulo da Orientação:");
		this.titulo[id-1] = input.nextLine();
		System.out.println("===================================================");
		System.out.println("                   !ATENÇÃO! \nvocê terá que adicionar a orientação em todos os \nidiomas suportados (Alemão,Espanhol,Francês,Inglês,\nPortuguês-BR)");
		System.out.println("===================================================");
		System.out.println("Adicione a orientação em Alemão:");
		this.orientacao[id-1][0] = input.nextLine();
		System.out.println("===================================================");
		System.out.println("Adicione a orientação em Espanhol:");
		this.orientacao[id-1][1] = input.nextLine();
		System.out.println("===================================================");
		System.out.println("Adicione a orientação em Francês:");
		this.orientacao[id-1][2] = input.nextLine();
		System.out.println("===================================================");
		System.out.println("Adicione a orientação em Inglês:");
		this.orientacao[id-1][3] = input.nextLine();
		System.out.println("===================================================");
		System.out.println("Adicione a orientação em Português-BR:");
		this.orientacao[id-1][4] = input.nextLine();
		System.out.println("===================================================");
		System.out.println("             Cadastro realizado!");
		System.out.println("===================================================\n");
		
	}
	
	public void visualizar() {
		
		System.out.println("===================================================");
		System.out.println("Digite o Id:");
		int buscarId = input.nextInt();
		System.out.println("===================================================");
		System.out.println("Id orientação: "+buscarId);
		System.out.println("Titulo: "+titulo[buscarId-1]);
		System.out.println("Tipo: "+tipo[buscarId-1]);
		System.out.println("Orientação: "+orientacao[buscarId-1][4]);
		System.out.println("===================================================\n");
		
	}
	
	
	public void editar() {
		
		System.out.println("===================================================");
		System.out.print("Digite o Id da Orientação que você quer atualizar:");
		int buscarId = input.nextInt();
		System.out.println("                       infos                       ");
		System.out.println("===================================================");
		System.out.println("Id orientação: "+buscarId);
		System.out.println("Titulo: "+titulo[buscarId-1]);
		System.out.println("Tipo: "+tipo[buscarId-1]);
		System.out.println("Orientação: "+orientacao[buscarId-1][4]);
		System.out.println("===================================================\n");
		
		System.out.println("                Opções de Atualização              ");
		System.out.println("===================================================");
		System.out.println("      1-Titulo                       2-Tipo        ");
		System.out.println("      3-Orientação                   4-Tudo        ");
		System.out.println("===================================================");
		System.out.print("Escolha a opção (digite o número):");
		int option = input.nextInt();
		System.out.println("===================================================");
		switch(option) {
		
		case 1:
			this.titulo[buscarId - 1] = null;
			input.nextLine();
			System.out.println("Digite o novo titulo:");
			String atualizacao = input.nextLine();
			this.titulo[buscarId - 1] = atualizacao;
			System.out.println("===================================================");
			System.out.println("               Atualizado com Sucesso!             ");
			System.out.println("===================================================\n");
			break;
			
			
		case 2: 
			this.tipo[buscarId - 1] = null;
			System.out.println("===================================================");
			System.out.println("                Tipos de Orientações               ");
			System.out.println("===================================================");
			System.out.println("1.Manual de Operação    2.Procedimento de Segurança");
			System.out.println("3.Manutenção e Reparos  4.Testes e Diagnóstico     ");
			System.out.println("5.Manual de Conduta     6.Operações Setoriais      ");
			System.out.println("===================================================");
			System.out.print("Escolha o tipo de orientação(numero):");
			int type = input.nextInt();
			switch(type) {
			case 1:
				this.tipo[buscarId - 1] = "Manual de Operação";
				break;
			case 2:
				this.tipo[buscarId - 1] = "Procedimento de Segurança";
				break;
			case 3:
				this.tipo[buscarId - 1] = "Manutenção e Reparos";
				break;
			case 4:
				this.tipo[buscarId - 1] = "Testes e Diagnóstico";
				break;
			case 5:
				this.tipo[buscarId - 1] = "Manual de Conduta";
				break;
			case 6:
				this.tipo[buscarId - 1] = "Operações Setoriais ";
				break;
			}
			System.out.println("===================================================");
			System.out.println("             Atualizado com Sucesso!                ");
			System.out.println("===================================================\n");
			break;
			
			
		case 3:
			this.orientacao[buscarId-1][0] = null;
			this.orientacao[buscarId-1][1] = null;
			this.orientacao[buscarId-1][2] = null;
			this.orientacao[buscarId-1][3] = null;
			this.orientacao[buscarId-1][4] = null;
			System.out.println("===================================================");
			System.out.println("                   !ATENÇÃO! \nvocê terá que adicionar a orientação em todos os \nidiomas suportados (Alemão,Espanhol,Francês,Inglês,\nPortuguês-BR)");
			input.nextLine();
			System.out.println("===================================================");
			System.out.println("Adicione a nova orientação em Alemão:");
			this.orientacao[buscarId-1][0] = input.nextLine();
			System.out.println("===================================================");
			System.out.println("Adicione a nova orientação em Espanhol:");
			this.orientacao[buscarId-1][1] = input.nextLine();
			System.out.println("===================================================");
			System.out.println("Adicione a nova orientação em Francês:");
			this.orientacao[buscarId-1][2] = input.nextLine();
			System.out.println("===================================================");
			System.out.println("Adicione a nova orientação em Inglês:");
			this.orientacao[buscarId-1][3] = input.nextLine();
			System.out.println("===================================================");
			System.out.println("Adicione a nova orientação em Português-BR:");
			this.orientacao[buscarId-1][4] = input.nextLine();
			System.out.println("===================================================");
			System.out.println("               Atualizado com Sucesso!             ");
			System.out.println("===================================================\n");
			break;
			
			
		case 4:
			input.nextLine();
			this.titulo[buscarId - 1] = null;
			this.tipo[buscarId - 1] = null;
			this.orientacao[buscarId-1][0] = null;
			this.orientacao[buscarId-1][1] = null;
			this.orientacao[buscarId-1][2] = null;
			this.orientacao[buscarId-1][3] = null;
			this.orientacao[buscarId-1][4] = null;
			System.out.println("===================================================");
			System.out.print("Digite o novo titulo da Orientação:");
			this.titulo[buscarId-1] = input.nextLine();
			System.out.println("===================================================");
			System.out.println("                Tipos de Orientações               ");
			System.out.println("===================================================");
			System.out.println("1.Manual de Operação    2.Procedimento de Segurança");
			System.out.println("3.Manutenção e Reparos  4.Testes e Diagnóstico     ");
			System.out.println("5.Manual de Conduta     6.Operações Setoriais      ");
			System.out.println("===================================================");
			System.out.print("Escolha o novo tipo de orientação(numero):");
			int tipo = input.nextInt();
			switch(tipo) {
			case 1:
				this.tipo[buscarId - 1] = "Manual de Operação";
				break;
			case 2:
				this.tipo[buscarId - 1] = "Procedimento de Segurança";
				break;
			case 3:
				this.tipo[buscarId - 1] = "Manutenção e Reparos";
				break;
			case 4:
				this.tipo[buscarId - 1] = "Testes e Diagnóstico";
				break;
			case 5:
				this.tipo[buscarId - 1] = "Manual de Conduta";
				break;
			case 6:
				this.tipo[buscarId - 1] = "Operações Setoriais ";
				break;
			}
			input.nextLine();
			System.out.println("===================================================");
			System.out.println("                   !ATENÇÃO! \nvocê terá que adicionar a orientação em todos os \nidiomas suportados (Alemão,Espanhol,Francês,Inglês,\nPortuguês-BR)");
			System.out.println("===================================================");
			System.out.println("Adicione a orientação em Alemão:");
			this.orientacao[buscarId-1][0] = input.nextLine();
			System.out.println("===================================================");
			System.out.println("Adicione a orientação em Espanhol:");
			this.orientacao[buscarId-1][1] = input.nextLine();
			System.out.println("===================================================");
			System.out.println("Adicione a orientação em Francês:");
			this.orientacao[buscarId-1][2] = input.nextLine();
			System.out.println("===================================================");
			System.out.println("Adicione a orientação em Inglês:");
			this.orientacao[buscarId-1][3] = input.nextLine();
			System.out.println("===================================================");
			System.out.println("Adicione a orientação em Português-BR:");
			this.orientacao[buscarId-1][4] = input.nextLine();
			System.out.println("===================================================");
			System.out.println("             Atualizado com Sucesso!                ");
			System.out.println("===================================================\n");
			break;
		
		}
		
	}
	
	public void Excluir(){
		
			input.nextLine();
			System.out.println("===================================================");
			System.out.println("               Exclusão de Orientação              ");
			System.out.println("===================================================");
			System.out.print("Digite o Id da orientação:");
			int buscarId = input.nextInt();
			System.out.println("===================================================");
			System.out.println("Id orientação: "+buscarId);
			System.out.println("Titulo: "+titulo[buscarId-1]);
			System.out.println("Tipo: "+tipo[buscarId-1]);
			System.out.println("Orientação: "+orientacao[buscarId-1][4]);
			System.out.println("===================================================\n");
			System.out.println("Confirma a exclusão?\n>Sim\n>Não");
			System.out.println("===================================================\n");
			System.out.print(":");
			String escolha = input.nextLine();
			System.out.println("===================================================\n");
			if(escolha.equalsIgnoreCase("Não")) {
				System.out.println("                  Exclusão cancelada!");
				System.out.println("===================================================\n");
			}else if(escolha.equalsIgnoreCase("sim")) {
				
				this.titulo[buscarId - 1] = null;
				this.tipo[buscarId - 1] = null;
				this.orientacao[buscarId-1][0] = null;
				this.orientacao[buscarId-1][1] = null;
				this.orientacao[buscarId-1][2] = null;
				this.orientacao[buscarId-1][3] = null;
				this.orientacao[buscarId-1][4] = null;
				
				System.out.println("           Exclusão realizada com Sucesso!");
				System.out.println("===================================================\n");
			}
			
		
	}
	
	public void AlterarIdioma() {
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
	
	//==================================================================================================================
	//==================================================================================================================
	//=================================================================================================================
	//ALEMÃO
	
	
	public void cadastrarA(){

		id = ++Identificacao;
		System.out.println("===================================================");
		System.out.println("                Tipos de Orientações               ");
		System.out.println("===================================================");
		System.out.println("1.Manual de Operação    2.Procedimento de Segurança");
		System.out.println("3.Manutenção e Reparos  4.Testes e Diagnóstico     ");
		System.out.println("5.Manual de Conduta     6.Operações Setoriais      ");
		System.out.println("===================================================");
		System.out.print("Escolha o tipo de orientação(numero):");
		int type = input.nextInt();
		switch(type) {
		case 1:
			this.tipo[id - 1] = "Manual de Operação";
			break;
		case 2:
			this.tipo[id - 1] = "Procedimento de Segurança";
			break;
		case 3:
			this.tipo[id - 1] = "Manutenção e Reparos";
			break;
		case 4:
			this.tipo[id - 1] = "Testes e Diagnóstico";
			break;
		case 5:
			this.tipo[id - 1] = "Manual de Conduta";
			break;
		case 6:
			this.tipo[id - 1] = "Operações Setoriais ";
			break;
		}
		input.nextLine();
		
		System.out.println("===================================================");
		System.out.print("Digite o titulo da Orientação:");
		this.titulo[id-1] = input.nextLine();
		System.out.println("===================================================");
		System.out.println("                   !ATENÇÃO! \nvocê terá que adicionar a orientação em todos os \nidiomas suportados (Alemão,Espanhol,Francês,Inglês,\nPortuguês-BR)");
		System.out.println("===================================================");
		System.out.println("Adicione a orientação em Alemão:");
		this.orientacao[id-1][0] = input.nextLine();
		System.out.println("===================================================");
		System.out.println("Adicione a orientação em Espanhol:");
		this.orientacao[id-1][1] = input.nextLine();
		System.out.println("===================================================");
		System.out.println("Adicione a orientação em Francês:");
		this.orientacao[id-1][2] = input.nextLine();
		System.out.println("===================================================");
		System.out.println("Adicione a orientação em Inglês:");
		this.orientacao[id-1][3] = input.nextLine();
		System.out.println("===================================================");
		System.out.println("Adicione a orientação em Português-BR:");
		this.orientacao[id-1][4] = input.nextLine();
		System.out.println("===================================================");
		System.out.println("             Cadastro realizado!");
		System.out.println("===================================================\n");
		
	}
	
	public void visualizarA() {
		
		System.out.println("===================================================");
		System.out.println("Digite o Id:");
		int buscarId = input.nextInt();
		System.out.println("===================================================");
		System.out.println("Id orientação: "+buscarId);
		System.out.println("Titulo: "+titulo[buscarId-1]);
		System.out.println("Tipo: "+tipo[buscarId-1]);
		System.out.println("Orientação: "+orientacao[buscarId-1][0]);
		System.out.println("===================================================\n");
		
	}
	
	
	public void editarA() {
		
		System.out.println("===================================================");
		System.out.print("Digite o Id da Orientação que você quer atualizar:");
		int buscarId = input.nextInt();
		System.out.println("                       infos                       ");
		System.out.println("===================================================");
		System.out.println("Id orientação: "+buscarId);
		System.out.println("Titulo: "+titulo[buscarId-1]);
		System.out.println("Tipo: "+tipo[buscarId-1]);
		System.out.println("Orientação: "+orientacao[buscarId-1][0]);
		System.out.println("===================================================\n");
		
		System.out.println("                Opções de Atualização              ");
		System.out.println("===================================================");
		System.out.println("      1-Titulo                       2-Tipo        ");
		System.out.println("      3-Orientação                   4-Tudo        ");
		System.out.println("===================================================");
		System.out.print("Escolha a opção (digite o número):");
		int option = input.nextInt();
		System.out.println("===================================================");
		switch(option) {
		
		case 1:
			this.titulo[buscarId - 1] = null;
			input.nextLine();
			System.out.println("Digite o novo titulo:");
			String atualizacao = input.nextLine();
			this.titulo[buscarId - 1] = atualizacao;
			System.out.println("===================================================");
			System.out.println("               Atualizado com Sucesso!             ");
			System.out.println("===================================================\n");
			break;
			
			
		case 2: 
			this.tipo[buscarId - 1] = null;
			System.out.println("===================================================");
			System.out.println("                Tipos de Orientações               ");
			System.out.println("===================================================");
			System.out.println("1.Manual de Operação    2.Procedimento de Segurança");
			System.out.println("3.Manutenção e Reparos  4.Testes e Diagnóstico     ");
			System.out.println("5.Manual de Conduta     6.Operações Setoriais      ");
			System.out.println("===================================================");
			System.out.print("Escolha o tipo de orientação(numero):");
			int type = input.nextInt();
			switch(type) {
			case 1:
				this.tipo[buscarId - 1] = "Manual de Operação";
				break;
			case 2:
				this.tipo[buscarId - 1] = "Procedimento de Segurança";
				break;
			case 3:
				this.tipo[buscarId - 1] = "Manutenção e Reparos";
				break;
			case 4:
				this.tipo[buscarId - 1] = "Testes e Diagnóstico";
				break;
			case 5:
				this.tipo[buscarId - 1] = "Manual de Conduta";
				break;
			case 6:
				this.tipo[buscarId - 1] = "Operações Setoriais ";
				break;
			}
			System.out.println("===================================================");
			System.out.println("             Atualizado com Sucesso!                ");
			System.out.println("===================================================\n");
			break;
			
			
		case 3:
			this.orientacao[buscarId-1][0] = null;
			this.orientacao[buscarId-1][1] = null;
			this.orientacao[buscarId-1][2] = null;
			this.orientacao[buscarId-1][3] = null;
			this.orientacao[buscarId-1][4] = null;
			System.out.println("===================================================");
			System.out.println("                   !ATENÇÃO! \nvocê terá que adicionar a orientação em todos os \nidiomas suportados (Alemão,Espanhol,Francês,Inglês,\nPortuguês-BR)");
			input.nextLine();
			System.out.println("===================================================");
			System.out.println("Adicione a nova orientação em Alemão:");
			this.orientacao[buscarId-1][0] = input.nextLine();
			System.out.println("===================================================");
			System.out.println("Adicione a nova orientação em Espanhol:");
			this.orientacao[buscarId-1][1] = input.nextLine();
			System.out.println("===================================================");
			System.out.println("Adicione a nova orientação em Francês:");
			this.orientacao[buscarId-1][2] = input.nextLine();
			System.out.println("===================================================");
			System.out.println("Adicione a nova orientação em Inglês:");
			this.orientacao[buscarId-1][3] = input.nextLine();
			System.out.println("===================================================");
			System.out.println("Adicione a nova orientação em Português-BR:");
			this.orientacao[buscarId-1][4] = input.nextLine();
			System.out.println("===================================================");
			System.out.println("               Atualizado com Sucesso!             ");
			System.out.println("===================================================\n");
			break;
			
			
		case 4:
			input.nextLine();
			this.titulo[buscarId - 1] = null;
			this.tipo[buscarId - 1] = null;
			this.orientacao[buscarId-1][0] = null;
			this.orientacao[buscarId-1][1] = null;
			this.orientacao[buscarId-1][2] = null;
			this.orientacao[buscarId-1][3] = null;
			this.orientacao[buscarId-1][4] = null;
			System.out.println("===================================================");
			System.out.print("Digite o novo titulo da Orientação:");
			this.titulo[buscarId-1] = input.nextLine();
			System.out.println("===================================================");
			System.out.println("                Tipos de Orientações               ");
			System.out.println("===================================================");
			System.out.println("1.Manual de Operação    2.Procedimento de Segurança");
			System.out.println("3.Manutenção e Reparos  4.Testes e Diagnóstico     ");
			System.out.println("5.Manual de Conduta     6.Operações Setoriais      ");
			System.out.println("===================================================");
			System.out.print("Escolha o novo tipo de orientação(numero):");
			int tipo = input.nextInt();
			switch(tipo) {
			case 1:
				this.tipo[buscarId - 1] = "Manual de Operação";
				break;
			case 2:
				this.tipo[buscarId - 1] = "Procedimento de Segurança";
				break;
			case 3:
				this.tipo[buscarId - 1] = "Manutenção e Reparos";
				break;
			case 4:
				this.tipo[buscarId - 1] = "Testes e Diagnóstico";
				break;
			case 5:
				this.tipo[buscarId - 1] = "Manual de Conduta";
				break;
			case 6:
				this.tipo[buscarId - 1] = "Operações Setoriais ";
				break;
			}
			input.nextLine();
			System.out.println("===================================================");
			System.out.println("                   !ATENÇÃO! \nvocê terá que adicionar a orientação em todos os \nidiomas suportados (Alemão,Espanhol,Francês,Inglês,\nPortuguês-BR)");
			System.out.println("===================================================");
			System.out.println("Adicione a orientação em Alemão:");
			this.orientacao[buscarId-1][0] = input.nextLine();
			System.out.println("===================================================");
			System.out.println("Adicione a orientação em Espanhol:");
			this.orientacao[buscarId-1][1] = input.nextLine();
			System.out.println("===================================================");
			System.out.println("Adicione a orientação em Francês:");
			this.orientacao[buscarId-1][2] = input.nextLine();
			System.out.println("===================================================");
			System.out.println("Adicione a orientação em Inglês:");
			this.orientacao[buscarId-1][3] = input.nextLine();
			System.out.println("===================================================");
			System.out.println("Adicione a orientação em Português-BR:");
			this.orientacao[buscarId-1][4] = input.nextLine();
			System.out.println("===================================================");
			System.out.println("             Atualizado com Sucesso!                ");
			System.out.println("===================================================\n");
			break;
		
		}
		
	}
	
	public void ExcluirA(){
		
			System.out.println("===================================================");
			System.out.println("               Exclusão de Orientação              ");
			System.out.println("===================================================");
			System.out.print("Digite o Id da orientação:");
			int buscarId = input.nextInt();
			System.out.println("===================================================");
			System.out.println("Id orientação: "+buscarId);
			System.out.println("Titulo: "+titulo[buscarId-1]);
			System.out.println("Tipo: "+tipo[buscarId-1]);
			System.out.println("Orientação: "+orientacao[buscarId-1][0]);
			System.out.println("===================================================\n");
			System.out.println("Confirma a exclusão?\n>Sim\n>Não");
			System.out.println("===================================================\n");
			System.out.print(":");
			String escolha = input.nextLine();
			System.out.println("===================================================\n");
			if(escolha.equalsIgnoreCase("Não")) {
				System.out.println("                  Exclusão cancelada!");
				System.out.println("===================================================\n");
			}else if(escolha.equalsIgnoreCase("sim")) {
				
				this.titulo[buscarId - 1] = null;
				this.tipo[buscarId - 1] = null;
				this.orientacao[buscarId-1][0] = null;
				this.orientacao[buscarId-1][1] = null;
				this.orientacao[buscarId-1][2] = null;
				this.orientacao[buscarId-1][3] = null;
				this.orientacao[buscarId-1][4] = null;
				
				System.out.println("           Exclusão realizada com Sucesso!");
				System.out.println("===================================================\n");
			}
			
		
	}
	
	public void AlterarIdiomaA() {
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
	
	//==============================================================================
}
