package produto;

import java.io.Serializable;

public class Produto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String descricao;
	private float preco;
	
	public Produto(int id, String descricao, float preco) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void exibeProduto(){
		System.out.println("\nID: " + this.id + "\tDescricao:" + this.descricao  + "\tPreco: R$:" + this.preco);
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}

}
