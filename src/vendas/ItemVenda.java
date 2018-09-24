package vendas;

import java.util.List;
import java.util.Scanner;

import persist.Persist;
import produto.CatalogoProduto;
import produto.Produto;

public class ItemVenda {
	
	private Produto produto;
	private int quantidade;
	private float subtotal;
	private CatalogoProduto catalogo;
	
	public ItemVenda(CatalogoProduto catalogo) {
		super();
		this.catalogo = catalogo;
	}

	public void criaItem(){
		
		System.out.println("ESCOLHA UM PRODUTO POR ID");
		Scanner leitor = new Scanner(System.in);
		this.catalogo.listaTodosProdutos();
		
		this.produto = catalogo.buscaProduto(leitor.nextInt());
		System.out.println("ESCOLHA A QUANTIDADE DE ITENS");
		this.quantidade = leitor.nextInt();
		this.subtotal = this.produto.getPreco() * this.quantidade;
		
	}
	
	public void mostraItemVenda(){
		System.out.println("------------ITEM----------------");
		this.produto.exibeProduto();
		System.out.println("Quantidade: " + this.quantidade);
		System.out.println("Sub-Total:" + this.subtotal);
		
	}
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	public CatalogoProduto getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(CatalogoProduto catalogo) {
		this.catalogo = catalogo;
	}
}
