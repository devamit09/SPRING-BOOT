package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repo.CurrencyExchangeRepository;

public class ProducerController {
	
	@Autowired
	private CurrencyExchangeRepository repository;

}
