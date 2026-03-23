package com.spring.rubrica.service;

import java.util.List;

import com.spring.rubrica.Mapper;
import com.spring.rubrica.DAO.RubricaDAO;
import com.spring.rubrica.dto.PropAnnoDTO;
import com.spring.rubrica.dto.PropNomiNumTotDTO;
import com.spring.rubrica.dto.RubricaDTO;
import com.spring.rubrica.entity.Rubrica;

public class RubricaServiceImpl implements RubricheService{
	
	private RubricaDAO dao;

	@Override
	public boolean inserisciRubrica(RubricaDTO dto) {
		Rubrica rubrica = Mapper.daRubricaDTOaRubrica(dto);
		return dao.inserisci(rubrica);
	}

	@Override
	public RubricaDTO cercaPerId(int idRubrica) {
		Rubrica rubrica = dao.cercaPerId(idRubrica);
		return Mapper.daRubricaARubricaDTO(rubrica);
	}

	@Override
	public List<RubricaDTO> visualizzaRubriche() {
		return dao.visualizzaRubriche()
				.stream()
				.map(r -> Mapper.daRubricaARubricaDTO(r))
				.toList();
	}

	@Override
	public boolean cancellaRubrica(int idRubrica) {
		return dao.eliminaRubrica(idRubrica);
	}

	@Override
	public PropAnnoDTO visualizzaPropAnno(int idRubrica) {
		Rubrica rubrica = dao.cercaPerId(idRubrica);
		return new PropAnnoDTO(rubrica.getProprietario(), rubrica.getAnnoCreazione());
	}

	@Override
	public RubricaDTO modificaNomeProprietario(int idRubrica, String nome) {
		Rubrica rubrica = dao.cercaPerId(idRubrica);
		rubrica.setProprietario(nome);
		return Mapper.daRubricaARubricaDTO(rubrica);
		
	}

	@Override
	public RubricaDTO modificaAnnoCreazione(int idRubrica, int nuovoanno) {
		Rubrica rubrica = dao.cercaPerId(idRubrica);
		rubrica.setAnnoCreazione(nuovoanno);
		return Mapper.daRubricaARubricaDTO(rubrica);
	}

	@Override
	public PropNomiNumTotDTO visualizzaPropNumTot() {
		List<String> proprietari = dao.visualizzaRubriche()
				.stream()
				.map(r -> r.getProprietario())
				.toList();
		
		return new PropNomiNumTotDTO(proprietari)
	}

	@Override
	public PropAnnoDTO rubricaPiuVecchia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RubricaDTO> anniCreazioneAsc() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PropNomiNumTotDTO nomePropNumeroContatti(int idRubrica) {
		// TODO Auto-generated method stub
		return null;
	}

}
