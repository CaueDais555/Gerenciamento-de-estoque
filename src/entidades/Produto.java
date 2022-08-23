package entidades;

public class Produto {
//classe Produto dentro do pacote Entidades
	
	//atributos da classe Produto
	private String nome;
	private double valor;
	private String identificacao;
	private int quantidade;
	private int index; //nome da variável para passar os valores de string para int

	//getters - uso de encapsulamento para facilitar a utilização dessas variáveis em outras classes, permitindo o uso
	//apesar dos atributos serem privados 
	public String getNome() 
	{
		return nome;
	}
	
	public String getIdentificacao() 
	{
		return identificacao;
	}
	
	public double getValor() 
	{
		return valor;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	//setters - uso de encapsulamento para facilitar a utilização dessas variáveis em outras classes, permitindo o uso
	//apesar dos atributos serem privados 
	public void setNome(String nome) 
	{
		this.nome = nome; //uso do ponteiro this para chamar o construtor
	}
	
	public void setIdentificacao(String identificacao) 
	{
		this.identificacao = identificacao; //uso do ponteiro this para chamar o construtor
	}

	public void setValor(double valor) 
	{
		this.valor = valor; //uso do ponteiro this para chamar o construtor
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade; //uso do ponteiro this para chamar o construtor
	}

	public void setIndex(int index){
		this.index = index; //uso do ponteiro this para chamar o construtor
	}
	
	public int getIndex(){
		return index; //uso do ponteiro this para chamar o construtor
	}
}