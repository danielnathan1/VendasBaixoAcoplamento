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
		
		Produto produtoPadrao = new Produto();
		produtoPadrao.setId(1);
		produtoPadrao.setDescricao("feijao");
		produtoPadrao.setPreco(10);
		
		Produto produtoPadrao2 = new Produto();
		produtoPadrao2.setId(2);
		produtoPadrao2.setDescricao("arroz");
		produtoPadrao2.setPreco(6);
		
		CatalogoProduto catalogo = new CatalogoProduto();
		catalogo.produtos.add(produtoPadrao);
		catalogo.produtos.add(produtoPadrao2);
		
		TPDV tpdv = new TPDV();
		
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
				
				Venda venda = tpdv.iniciarVenda();
				
				while(tpdv.adicionaMaisItem()){
					ItemVenda itemVenda = new ItemVenda(catalogo);
					itemVenda.criaItem();
					venda.adicionarItemVenda(itemVenda);
				}
				venda.totalVenda();
				venda.detalheVenda();
				tpdv.vendas.add(venda);
				break;

			case "2":
				Produto produto1 = new Produto();
				produto1.criaProduto();
				catalogo.produtos.add(produto1);

			case "3":
				catalogo.listaTodosProdutos();

				break;
			case "4":
				tpdv.mostraVendas();
			default:
				System.out.println("ATE A PROXIMA xD");
				System.exit(0);
			}
		}
	}

}
