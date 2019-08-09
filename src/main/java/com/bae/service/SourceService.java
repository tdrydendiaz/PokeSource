package com.bae.service;

import org.springframework.http.ResponseEntity;

public interface SourceService {

	ResponseEntity<Object> findByName(String name);
	ResponseEntity<Object> findByNumber(String number);
	

}
