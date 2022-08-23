package entidades;
//pacote entidades

public class Cliente {
//classe Cliente dentro do pacote entidades 
	
	//atributos da classe Cliente
	private String nome; //string por ser palavra
	private int telefone; //int por ser número inteiro

	//construtor da classe Cliente
	public Cliente() {
		super();
		this.nome = nome; //uso do ponteiro this para poder chamar um construtor dentro de outro
		this.telefone = telefone;
	}
	
	//getters - uso de encapsulamento para facilitar a utilização dessas variáveis em outras classes, permitindo o uso
	//apesar dos atributos serem privados 
	public String getNome() 
	{
		return nome;
	}
	
	public int getTelefone() 
	{
		return telefone;
	}
	
	//setters - uso de encapsulamento para facilitar a utilização dessas variáveis em outras classes, permitindo o uso
	//apesar dos atributos serem privados
	public void setNome(String nome) 
	{
		this.nome = nome; //uso do ponteiro this para chamar o construtor
	}
	
	public void setTelefone(int telefone) 
	{
		this.telefone = telefone; //uso do ponteiro this para chamar o construtor
	}
	
}