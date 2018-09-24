package vendas;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Venda {
	private List<ItemVenda> itensVenda = new ArrayList();
	private float valotTotal;
	private Date data;
	
	public void adicionarItemVenda(ItemVenda item){	
		itensVenda.add(item);
	}
	
	public void totalVenda(){
		for(ItemVenda itemVenda: this.itensVenda)
			this.valotTotal += itemVenda.getSubtotal();
			
	}
	
	public void detalheVenda(){
		System.out.println("------------------VENDA------------------");
		for(ItemVenda item: itensVenda)
			item.mostraItemVenda();
		System.out.println("\nValor Total: " + this.valotTotal + "\tData: " + this.data);
	}
	
	public List<ItemVenda> getItensVenda() {
		return itensVenda;
	}
	public void setItensVenda(List<ItemVenda> itensVenda) {
		this.itensVenda = itensVenda;
	}
	public float getValotTotal() {
		return valotTotal;
	}
	public void setValotTotal(float valotTotal) {
		this.valotTotal = valotTotal;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}

}
