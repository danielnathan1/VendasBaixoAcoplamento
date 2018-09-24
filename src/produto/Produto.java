package produto;

import java.io.Serializable;
import java.util.Scanner;

public class Produto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String descricao;
	private float preco;
	
	public void criaProduto(){
		Scanner leitor = new Scanner(System.in);
		System.out.println("--------CADASTRO DE PRODUTO---------");
		System.out.println("\n\nDigite o id:");
		this.id = leitor.nextInt();
		System.out.println("\n\nDigite a descricao:");
		leitor = new Scanner(System.in);
		this.descricao = leitor.nextLine();
		System.out.println("\n\nDigite o preco:");
		this.preco = leitor.nextFloat();
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
