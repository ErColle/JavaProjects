package com.spring.prodotti.dao;

import java.util.HashMap;
import java.util.Map;

import javax.management.JMRuntimeException;

import org.springframework.stereotype.Repository;

import com.spring.prodotti.entity.Prodotto;

@Repository
public class DAOProdottiImpl implements DAOProdotti {
	
	private Map<Integer, Prodotto> mappa = new HashMap<Integer, Prodotto>();
	
	@Override
	public boolean insert(Prodotto prodotto) {
		if (mappa.containsKey(prodotto.getId())) 
			throw new RuntimeException("id gia presente");
		mappa.put(prodotto.getId(), prodotto);
		return true;
	}
	
	@Override
	public Prodotto selectById(int id) {
	Prodotto prodotto = mappa.get(id);
		if (prodotto == null)
			throw new JMRuntimeException("id inesistente");
		else return prodotto;
	}
	
	
}
