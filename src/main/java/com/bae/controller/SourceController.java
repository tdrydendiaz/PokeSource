package com.bae.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.service.SourceService;

@RestController
@RequestMapping("/source")
public class SourceController {

	@Autowired
	private SourceService service;
	
	@Autowired
	private JmsTemplate jmsTemplate;

	public SourceController() {
	}
	
	public SourceController(SourceService service, JmsTemplate jmsTemplate) {
		this.service = service;
		this.jmsTemplate = jmsTemplate;
	}
	
	@GetMapping("/PokeByNumber/{number}")
	public ResponseEntity<Object> findByNumber(@PathVariable String number) {
		return new ResponseEntity<>(service.findByNumber(number), HttpStatus.OK);
	}
	
	@GetMapping("/PokeByName/{name}")
	public ResponseEntity<Object> findByName(@PathVariable String name) {
		return new ResponseEntity<>(service.findByNumber(name), HttpStatus.OK);
	}
	
}
