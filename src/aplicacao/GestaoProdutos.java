// Gestão de Produtos - onde vamos colocar as informações sobre os Produtos

package aplicacao;

import entidades.Produto;
import entidades.Estoque;
import java.util.Scanner;
//import para podermos usar atributos da classe Produto, relacionamento de composição com a classe produto

public final class GestaoProdutos {
//classe GestaoProdutos dentro do pacote Aplicacao
	
	private static GestaoProdutos gestaoProdutos;

	public static GestaoProdutos getMenuProdutos(){ //metodo get para inicializar a gestão de produtos
		
		if (gestaoProdutos == null) {
            gestaoProdutos = new GestaoProdutos();
        }
        return gestaoProdutos;
		
	}
	
	public void runMenuProdutos(){ 
		
		int flag=1; //variável que armazena os resultados do menu
		Scanner sc = new Scanner(System.in); //para conseguir receber as respostas do usuário
		Estoque estoque = Estoque.getEstoque();
		Produto produto;
		
		while (flag == 1){ //criando um menu de opções para a gestão de produtos
			System.out.println("\nMENU DE OPÇÕES\n");
			System.out.println("1 - Cadastrar Produtos");
			System.out.println("2 - Alterar um Produto");
			System.out.println("3 - Excluir um Produto");
			System.out.println("4 - Listar Produtos");
			System.out.println("5 - Consultar Produto");
			System.out.println("6 - Retornar");
		
			System.out.print("Digite sua opção: "); //perguntando ao usuário a opção
			String op = sc.nextLine();
	
			System.out.println();

			switch (op) { //primeia opção - cadastrar um produto
		
			case "1":
	
				String resposta, resposta2; //variáveis para resposta
				System.out.println("Deseja cadastrar um produto(s/n)?");
				resposta = sc.nextLine();
				while(resposta.charAt(0)=='s') { //utilizando o while para o comando se repetir enquanto a resposta é sim
			
					produto = new Produto(); //inicializando 
			
					System.out.println("Poderia me informar o nome do produto?"); //pedindo as informações ao usuário
					produto.setNome(sc.nextLine()); 
			
					System.out.println("E qual a identificação do produto?");
					produto.setIdentificacao(sc.nextLine());
			
					System.out.println("Ótimo, qual o valor do produto?");
					produto.setValor(Double.parseDouble(sc.nextLine()));
			
					System.out.println("Qual é a quantidade adquirida do produto?");
					produto.setQuantidade(Integer.parseInt(sc.nextLine()));
			
					System.out.println("Produto -> " + produto.getNome()); //imprimindo as informações do usuário
					System.out.println("Valor -> " + produto.getValor());
					System.out.println("Identificação -> " + produto.getIdentificacao());
					System.out.println("Quantidade -> " + produto.getQuantidade());
			
					System.out.println();
					System.out.println("Esta correto? (s/n)"); //verificando se as informações são corretas
					resposta2 = sc.nextLine();
					if (resposta2.charAt(0)=='s') {
				
						estoque.setProduto(produto);  //para "guardar" as informações, adicionando +1 no index
						System.out.println("Produto["+estoque.getProduto(estoque.getNextIndex()-1).getIndex()+"] : "+produto.getNome()+" cadastrado com sucesso! ");
						System.out.println("Deseja cadastrar outro produto(s/n)?"); 
						resposta = sc.nextLine();				
					} else {
						System.out.println("pode reinserir novamente!");
					}
		
				}
		
				break;
		
			case "2": //para alterar um produto
				
				int flagAlteracao=0; //inicializando a variável de alteração 
				System.out.println("Digite o numero do produto que deseja alterar:"); //número na ordem em que foram adicionados: 0, 1, 2...
				int index = Integer.parseInt(sc.nextLine()); //parseInt para pegar o que era String e mudar para inteiro
				if (index >= 0 && index < estoque.getProdutos().size()){ //index armazenando esse "inteiro"
					produto = estoque.getProdutos().get(index);
					System.out.println("------------------------------");
					System.out.println("Index         : "+produto.getIndex());
					System.out.println("Nome          : "+produto.getNome());
					
					System.out.println("Poderia me informar o novo nome do produto? <Digite 'N' para permanecer o valor atual>");
					String novonome = sc.nextLine(); //para armazenar um possível novo nome
					if (novonome.charAt(0)!='N'){ //if como condição para verificar se o usuário quer alterar o nome ou permanecer o mesmo
						produto.setNome(novonome);
						flagAlteracao = 1;
					}
					System.out.println("Indetificação : "+produto.getIdentificacao());
					System.out.println("E qual a nova identificação do produto? <Digite 'N' para permanecer o valor atual>");
					String novaIdent = sc.nextLine(); //para armazenar uma possível nova identificação do produto
					if (novonome.charAt(0)!='N'){ //if como condição para verificar se o usuário quer alterar a identificação ou permanecer a mesma
						produto.setIdentificacao(novaIdent);
						flagAlteracao = 1;
					}
					
					System.out.println("Valor         : "+produto.getValor());
					System.out.println("Ótimo, qual o novo valor do produto? <Digite 'N' para permanecer o valor atual>");
					String novoValor = sc.nextLine(); //para armazenar um possível novo valor do produto
					if (novoValor.charAt(0)!='N'){ //if como condição para verificar se o usuário quer alterar o valor ou permanecer o mesmo
						produto.setValor(Double.parseDouble(novoValor));
						flagAlteracao = 1;
					}
					
					System.out.println("Quantidade    : "+produto.getQuantidade());
					System.out.println("Qual é a nova quantidade adquirida do produto? <Digite 'N' para permanecer o valor atual>");
					String novaQtde = sc.nextLine(); //para armazenar uma possível nova quantidade do produto
					if (novaQtde.charAt(0)!='N'){ //if como condição para verificar se o usuário quer alterar a quantidade ou permanecer a mesma
						produto.setQuantidade(Integer.parseInt(novaQtde));
						flagAlteracao = 1;
					}
					
					if (flagAlteracao == 1){ //alteração do produto
						estoque.changeProduto(produto);
						System.out.println("Produto alterado com sucesso!");
					}
					System.out.println("------------------------------");
					
					
				} else {
					System.out.println("Produto index "+index+" não encontrado!");
				}
			break;
		
			case "3": //para excluir um produto
				System.out.println("Digite o numero do produto que deseja excluir:");
				index = Integer.parseInt(sc.nextLine()); //mudando de String para Int
				if (index >= 0 && index < estoque.getProdutos().size()){
					produto = estoque.getProdutos().get(index);
					System.out.println("------------------------------");
					System.out.println("Index         : "+produto.getIndex());//informações do produto
					System.out.println("Nome          : "+produto.getNome());
					System.out.println("Indetificação : "+produto.getIdentificacao());
					System.out.println("Valor         : "+produto.getValor());
					System.out.println("Quantidade    : "+produto.getQuantidade());
					System.out.println("------------------------------");
					
					System.out.println("Confirma a exclusão? (s/n)");
					String conf = sc.nextLine();
					if (conf.charAt(0)=='s'){ //condição para verificar se o usuário realmete quer exluir
						estoque.excluirProduto(produto);
						System.out.println("Produto excluido com sucesso!");
					}
					
				} else {
					System.out.println("Produto index "+index+" não encontrado!");
				}
			
			break;
			
			case "4": //para mostrar os produtos cadastrados
				System.out.println("---- Produtos Cadastrados ----");
				for (int i = 0; i < estoque.getProdutos().size(); i++) {
					produto = estoque.getProdutos().get(i);
					System.out.println("Produto ["+produto.getIndex()+"] : "+produto.getNome());
				}
			break;
		
			case "5": //para consultar um produto
				System.out.println("Digite o numero do produto que deseja consultar:");
				index = Integer.parseInt(sc.nextLine());
				if (index >= 0 && index < estoque.getProdutos().size()){
					produto = estoque.getProdutos().get(index);
					System.out.println("------------------------------");
					System.out.println("Index         : "+produto.getIndex()); //informações sobre o produto
					System.out.println("Nome          : "+produto.getNome());
					System.out.println("Indetificação : "+produto.getIdentificacao());
					System.out.println("Valor         : "+produto.getValor());
					System.out.println("Quantidade    : "+produto.getQuantidade());
					System.out.println("------------------------------");
					
				} else {
					System.out.println("Produto index "+index+" não encontrado!");
				}
				
			break;
			
			case "6": //para retornar, flag = 0
			flag=0;
			break;
		}
	}
	}
}