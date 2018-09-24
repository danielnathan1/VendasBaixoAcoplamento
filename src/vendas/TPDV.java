package vendas;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TPDV {
	public List<Venda> vendas = new ArrayList<>();
	
	public Venda iniciarVenda(){
		Venda venda = new Venda();
		venda.setData(new Date(System.currentTimeMillis()));
		return venda;
	}
	
	public boolean adicionaMaisItem(){
		System.out.println("[1] - ADICIONAR ITEM");
		System.out.println("[-] - FINALIZAR COMPRA");
		Scanner leitor = new Scanner(System.in);
		String adicionaItem = leitor.nextLine();
		System.out.println(adicionaItem);
		
		if(adicionaItem.equals("1")){
			return true;
		}
		
		return false;
	}
	
	public void mostraVendas(){
		for(Venda venda: this.vendas){
			venda.detalheVenda();
		}
	}
}
