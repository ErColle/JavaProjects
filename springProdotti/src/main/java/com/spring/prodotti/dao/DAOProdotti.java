package com.spring.prodotti.dao;

import com.spring.prodotti.entity.Prodotto;

public interface DAOProdotti {
	
	public boolean insert(Prodotto prodotto);
	
	public Prodotto selectById(int id);

}
