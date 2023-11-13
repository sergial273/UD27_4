package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IInvestigadorDAO;
import com.example.demo.dto.Investigador;

@Service
public class InvestigadorServiceImpl implements IInvestigadorService {
	
	@Autowired
	IInvestigadorDAO iInvestigadorDAO;

	@Override
	public List<Investigador> listarInvestigador() {
		return iInvestigadorDAO.findAll();
	}

	@Override
	public Investigador guardarInvestigador(Investigador curso) {
		return iInvestigadorDAO.save(curso);
	}

	@Override
	public Investigador InvestigadorXID(int id) {
		return iInvestigadorDAO.findById(id).get();
	}

	@Override
	public Investigador actualizarInvestigador(Investigador curso) {
		return iInvestigadorDAO.save(curso);
	}

	@Override
	public void eliminarInvestigador(int id) {
		iInvestigadorDAO.deleteById(id);
	}

}
