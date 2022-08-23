package entidades;
//pacote entidades

public class Estabelecimento {
//classe Estabelecimento dentro do pacote Entidades

	//atributos da classe Estabelecimento 
	private String nome; //string pois nome é palavra 
	private String telefone; //string vai virar int depois (por ser um número)
	private String endereco; //string pois endereço é palavra 

		//getters - uso de encapsulamento para facilitar a utilização dessas variáveis em outras classes, permitindo o uso
		//apesar dos atributos serem privados 
		public String getNome() 
		{
			return nome;
		}
		
		public String getTelefone() 
		{
			return telefone;
		}
		public String getEndereco()
		{
			return endereco;
		}
		
		//setters - uso de encapsulamento para facilitar a utilização dessas variáveis em outras classes, permitindo o uso
		//apesar dos atributos serem privados 
		public void setNome(String nome) 
		{
			this.nome = nome; //uso do ponteiro this para chamar o construtor
		}
		
		public void setTelefone(String telefone) 
		{
			this.telefone = telefone; //uso do ponteiro this para chamar o construtor
		}
		
		public void setEndereco(String endereco)
		{
			this.endereco = endereco; //uso do ponteiro this para chamar o construtor
		}
}