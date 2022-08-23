package entidades;
//pacote entidades

import entidades.Produto;
// tem um relacionamento de associação com a classe Produto

import java.util.List;
import java.util.ArrayList;
//relacionamento de associoação com a classe produto 

public final class Estoque {
//classe Estoque dentro do pacote Entidades
	
	private static Estoque estoque;

	ArrayList<Produto> produtos; //para fazer uma lista com os produtos
	private int index = 0; //para passar de string para int
	
	//construtor da classe Estoque
	public Estoque() {

	}
	
	//getters
	public static Estoque getEstoque() { 
        if (estoque == null) {
            estoque = new Estoque();
        }
        return estoque;
    }

	public int getNextIndex(){ //index para passar de string pra int
		return index;
	}

	public Produto getProduto(int index) {
		return produtos.get(index);
	}
	
	public ArrayList<Produto> getProdutos(){ //para utilizar a lista
		return produtos;
	}

	//setters
	public void setProduto(Produto prod) {
		
		prod.setIndex(index); //incluindo mais produtos na lista do estoque
		if(produtos == null){
			produtos = new ArrayList<>(); 
		}
		produtos.add(prod);
		index = index + 1;
		
	}

	public void changeProduto(Produto prod) { //mudar o produto
		
		produtos.set(prod.getIndex(),prod);
		
	}
	
	public void excluirProduto(Produto prod) { //excluir o produto
		
		produtos.remove(prod.getIndex());
		
	}
}