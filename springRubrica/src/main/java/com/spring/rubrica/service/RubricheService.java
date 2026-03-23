package com.spring.rubrica.service;

import java.util.List;

import com.spring.rubrica.dto.PropAnnoDTO;
import com.spring.rubrica.dto.PropNomiNumTotDTO;
import com.spring.rubrica.dto.RubricaDTO;

public interface RubricheService {
	public boolean inserisciRubrica(RubricaDTO dto);
	public RubricaDTO cercaPerId(int idRubrica);
	public List<RubricaDTO> visualizzaRubriche();
	public boolean cancellaRubrica(int idRubrica);
	public PropAnnoDTO visualizzaPropAnno(int idRubrica);
	public RubricaDTO modificaNomeProprietario(int idRubrica, String nome);
	public RubricaDTO modificaAnnoCreazione(int idRubrica, int nuovoanno );
	public PropNomiNumTotDTO visualizzaPropNumTot();
	public PropAnnoDTO rubricaPiuVecchia();
	public List<RubricaDTO> anniCreazioneAsc();
	public PropNomiNumTotDTO nomePropNumeroContatti(int idRubrica);
}
