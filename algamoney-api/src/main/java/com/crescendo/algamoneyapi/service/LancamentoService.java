package com.crescendo.algamoneyapi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.crescendo.algamoneyapi.model.Lancamento;
import com.crescendo.algamoneyapi.model.Pessoa;
import com.crescendo.algamoneyapi.repository.LancamentoRepository;
import com.crescendo.algamoneyapi.repository.PessoaRepository;
import com.crescendo.algamoneyapi.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private LancamentoRepository lancamentoRepository;

	public Lancamento atualizar(Long codigo, Lancamento lancamento) {
		Lancamento lancamentoSalva = buscarPessoaPeloCodigo(codigo);
		BeanUtils.copyProperties(lancamento, lancamentoSalva, "codigo");
		return lancamentoRepository.save(lancamentoSalva);
	}
	
	public Lancamento salvar(Lancamento lancamento) {
		Pessoa pessoa = pessoaRepository.findById(lancamento.getPessoa().getCodigo()).orElse(null);
		if(pessoa == null || pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
		return lancamentoRepository.save(lancamento);
	}
	
	public Lancamento buscarPessoaPeloCodigo(Long codigo) {
		Lancamento lancamentoSalva = lancamentoRepository.findById(codigo).orElse(null);
		if(lancamentoSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return lancamentoSalva;
	}

}
