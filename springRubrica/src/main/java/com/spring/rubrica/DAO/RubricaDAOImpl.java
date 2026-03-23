package com.spring.rubrica.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.spring.rubrica.entity.Rubrica;
import com.spring.rubrica.errori.IdNonEsisteException;

public class RubricaDAOImpl implements RubricaDAO{
	
	private Map<Integer, Rubrica> mappa = new HashMap<Integer, Rubrica>();

	@Override
	public boolean inserisci(Rubrica rubrica) {
		if (mappa.containsKey(rubrica.getId())) {
			return false;
		}
		mappa.put(rubrica.getId(), rubrica);
		return true;
	}

	@Override
	public Rubrica cercaPerId(int idRubrica) {
		Rubrica rubrica = mappa.get(idRubrica);
		if (rubrica == null ) {
			throw new IdNonEsisteException("Rubrica con id: " + idRubrica + " non trovato.");
		}
		return rubrica; 
	}

	@Override
	public List<Rubrica> visualizzaRubriche() {
		return new ArrayList<Rubrica>(mappa.values());
	}

	@Override
	public boolean eliminaRubrica(int idRubrica) {
		Rubrica rubrica = mappa.get(idRubrica);
		if (rubrica == null) {
			return false;
		}
		mappa.remove(idRubrica);
		return false;
	}

}
