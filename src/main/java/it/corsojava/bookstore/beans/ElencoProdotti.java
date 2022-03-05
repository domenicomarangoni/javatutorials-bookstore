package it.corsojava.bookstore.beans;

import java.util.ArrayList;
import java.util.List;

public class ElencoProdotti {
	
	private List<List<Prodotto>> righe;
	private int maxCols=3;
	
	public ElencoProdotti() {
		this.righe=new ArrayList<List<Prodotto>>();
	}

	public List<List<Prodotto>> getRighe() {
		return righe;
	}

	public void setRighe(List<List<Prodotto>> righe) {
		this.righe = righe;
	}

	public int getMaxCols() {
		return maxCols;
	}

	public void setMaxCols(int maxCols) {
		this.maxCols = maxCols;
	}
	
	public void addProdotto(Prodotto p) {
		if(righe.size()==0) {
			addProductToNewRow(p);
		}else {
			List<Prodotto> prodotti = righe.get(righe.size()-1);
			if(prodotti.size()>=maxCols) {
				addProductToNewRow(p);
			}else {
				prodotti.add(p);
			}
		}
	}
	
	private void addProductToNewRow(Prodotto p) {
		List<Prodotto> prodotti=new ArrayList<Prodotto>();
		prodotti.add(p);
		righe.add(prodotti);
	}
	
}
