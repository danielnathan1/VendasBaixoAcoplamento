package produto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CatalogoProduto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	public List<Produto> produtos = new ArrayList();
	
	public void listaTodosProdutos(){
		for(Produto produto: this.produtos){
			produto.exibeProduto();
		}
	}
	
	public void listaProdutos(String nome){
		for(Produto produto: this.produtos){
			if(produto.getDescricao() == nome)
				produto.exibeProduto();
		}
	};
	
	public void listaProdutos(float precoMini, float precoMax){
		for(Produto produto: this.produtos){
			if(produto.getPreco() >= precoMini && produto.getPreco() <= precoMax)
				produto.exibeProduto();
		}
		
	}
	
	public Produto buscaProduto(int id){
		for(Produto produto: this.produtos){
			if(produto.getId() == id)
				return produto;
		}
		return null;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	};
}
