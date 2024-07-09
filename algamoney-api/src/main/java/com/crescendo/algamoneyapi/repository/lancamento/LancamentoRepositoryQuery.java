package com.crescendo.algamoneyapi.repository.lancamento;

import java.util.List;

import com.crescendo.algamoneyapi.model.Lancamento;
import com.crescendo.algamoneyapi.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	
	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);

}
