package com.spring.rubrica.DAO;

import java.util.List;

import com.spring.rubrica.entity.Rubrica;

public interface RubricaDAO {
	
	public boolean inserisci(Rubrica rubrica);
	
	public Rubrica cercaPerId(int idRubrica);
	
	public List<Rubrica> visualizzaRubriche();
	
	public boolean eliminaRubrica(int idRubrica);
}
