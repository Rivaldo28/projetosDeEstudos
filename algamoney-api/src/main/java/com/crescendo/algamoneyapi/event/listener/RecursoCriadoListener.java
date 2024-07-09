package com.crescendo.algamoneyapi.event.listener;

import java.net.URI;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.crescendo.algamoneyapi.event.RecursosCriadoEvent;


@Component
public class RecursoCriadoListener implements ApplicationListener<RecursosCriadoEvent>{

	@Override
	public void onApplicationEvent(RecursosCriadoEvent recursosCriadoEvent) {
		HttpServletResponse response = recursosCriadoEvent.getResponse();
		Long codigo = recursosCriadoEvent.getCodigo();
		
		
		adicionarHeaderLocation(response, codigo);
		
	}

	private void adicionarHeaderLocation(HttpServletResponse response, Long codigo) {
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}").buildAndExpand(codigo).toUri();
		response.setHeader("Location", uri.toASCIIString());
	}

}
