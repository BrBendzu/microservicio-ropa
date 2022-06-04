package com.example.microservicioropa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.microservicioropa.model.Ropa;
import com.example.microservicioropa.service.Ropaservice;

@Controller
@RequestMapping("/ropa/v1")
public class RopaController {
	
	@Autowired
	private Ropaservice service;
	
	
	@GetMapping(path = "/listar")
	public @ResponseBody List<Ropa>listar(){
		return service.listar();
	}

}
