//Aplicação - onde vamos colocar as informações do Estabelecimento e do Cliente do estabelecimento

package aplicacao;

import entidades.Estabelecimento;
import entidades.Produto;
import entidades.Cliente;
import entidades.Estoque;
import aplicacao.GestaoProdutos;

import java.util.Scanner;
//import para podermos usar atributos da classe Estabelecimento, relacionamento de associação com a classe estabelecimento

public class Aplicacao {
//classe Aplicação dentro do pacote aplicação
	
	
	public static void main(String[] args) {
	
	int flag=1; //variável que armazena os resultados do menu
	Scanner sc = new Scanner(System.in); //para conseguir receber as respostas do usuário
	
	//menu de opções 
	while (flag == 1){
		System.out.println("\nMENU DE OPÇÕES\n");
		System.out.println("1 - Gestão de usuários");
		System.out.println("2 - Gestão de produtos");
		System.out.println("3 - Gestão de clientes");
		System.out.println("4 - Sair");

		System.out.print("Digite sua opção: "); //pro usuário escolher qual opção do menu vai
		String op = sc.nextLine();
	
		System.out.println();

		switch (op) {
		case "1": //primeira opção - Informações sobre o Estabelecimento
	
			Estabelecimento estabelecimento = new Estabelecimento();
		
			System.out.println("Ola, poderia me informar o nome do estabelecimento?"); //pegando as informações do usuário
			estabelecimento.setNome(sc.nextLine());
		
			System.out.println("Ótimo, qual o telefone?");
			estabelecimento.setTelefone(sc.nextLine());
		
			System.out.println("E qual o endereço?");
			estabelecimento.setEndereco(sc.nextLine());
		
			System.out.println("Estabelecimento -> " + estabelecimento.getNome()); //imprimindo as informações do usuário
			System.out.println("Telefone -> " + estabelecimento.getTelefone());
			System.out.println("Endereco -> " + estabelecimento.getEndereco());
			break;
	
		case "2": //segunda opção - passa para os comandos da classe GestaoProdutos
			
			GestaoProdutos gp = GestaoProdutos.getMenuProdutos();
			gp.runMenuProdutos();
			
		break;
		
		case "3": //terceira opção - Informações sobre o Cliente do estabelecimento
		 
			Cliente cliente = new Cliente();
		
			System.out.println("Ola, poderia me informar o nome do cliente?"); //pega as informações do usuário
			cliente.setNome(sc.nextLine());
		
			System.out.println("Ótimo, qual o telefone do cliente?");
			cliente.setTelefone(sc.nextInt());
		
			System.out.println("Cliente -> " + cliente.getNome()); //imprime as informações do usuário
			System.out.println("Telefone -> " + cliente.getTelefone());
		
			break;
	
		case "4": //quarta opção 
			System.out.println("Tchau, até a próxima!"); //se despede :)
			flag=0;
			break;
		}
	}
	}
}