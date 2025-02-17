package com.crescendo.algamoneyapi.event;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationEvent;

public class RecursosCriadoEvent extends ApplicationEvent{


	private static final long serialVersionUID = 1L;

	private HttpServletResponse response;
	private Long codigo;

	public RecursosCriadoEvent(Object source, HttpServletResponse response, Long codigo) {
		super(source);
		this.response = response;
		this.codigo = codigo;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public Long getCodigo() {
		return codigo;
	}
	

}
