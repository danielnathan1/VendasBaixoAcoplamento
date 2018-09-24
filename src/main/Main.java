package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import persist.Persist;
import produto.CatalogoProduto;
import produto.Produto;
import vendas.ItemVenda;
import vendas.TPDV;
import vendas.Venda;

public class Main {

	public static void main(String[] args) {
		Persist persist = new Persist();
		
		Produto produto = new Produto(1, "aaaa", 10);
		Produto produto1 = new Produto(2, "asdsa", 20);
		
		List<Produto> produtos = new ArrayList();
		produtos.add(produto);
		produtos.add(produto1);
		produtos.add(produto);
		
		Venda venda = new Venda();
		
		TPDV tpdv = new TPDV();

		CatalogoProduto catalogo = new CatalogoProduto();
		catalogo.setProdutos(produtos);
		
		Scanner leitor = new Scanner(System.in);

		while (true) {
			System.out.println("-------TERMINAL DE VENDAS---------");
			System.out.println("[1] - REALIZAR VENDA");
			System.out.println("[2] - CADASTRAR PRODUTOS");
			System.out.println("[3] - LISTAR PRODUTOS");
			System.out.println("[3] - LISTAR VENDAS");
			System.out.println("[-] - SAIR ");
			
			String acao = leitor.nextLine();
			
			switch (acao) {
			case "1":
				venda = tpdv.iniciarVenda();
				
				while(tpdv.adicionaMaisItem()){
					ItemVenda itemVenda = new ItemVenda(catalogo);
					itemVenda.criaItem();
					venda.adicionarItemVenda(itemVenda);
				}
				venda.totalVenda();
				venda.detalheVenda();
				
				break;

			case "2":
				
				

			case "3":
				catalogo.listaTodosProdutos();

				break;
			default:
				System.out.println("ATE A PROXIMA xD");
				System.exit(0);
			}
		}
	}

}
